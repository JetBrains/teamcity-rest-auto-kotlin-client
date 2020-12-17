[![official JetBrains project](https://jb.gg/badges/official-plastic.svg)](https://confluence.jetbrains.com/display/ALL/JetBrains+on+GitHub)[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# TeamCity-Kotlin-REST-Client

A basic TeamCity REST API client written in Kotlin. Generated automatically with [swagger-codegen](https://github.com/swagger-api/swagger-codegen) and [TeamCity REST generator](https://github.com/JetBrains/teamcity-rest-codegen).

# Current issues

* Locator logic may require some rework, e.g. to explicitly use Locator classes inside of the methods and other locators and cast them to String


# Usage examples
```
import org.jetbrains.teamcity.rest.apis.BuildApi
import org.jetbrains.teamcity.rest.apis.BuildQueueApi
import org.jetbrains.teamcity.rest.infrastructure.ClientConfig
import org.jetbrains.teamcity.rest.models.Build
import org.jetbrains.teamcity.rest.models.BuildLocator
import org.jetbrains.teamcity.rest.models.BuildType

val clientConfig = ClientConfig.getTokenAuthConfig(
        "<your TeamCity instance URL>",
        "<your authentication token>"
)

// Define a locator
val locator = BuildLocator(
        id = <some build ID>
)

val buildApi = BuildApi(clientConfig)

// Find a build by using locator defined above
var build = buildApi.getBuild(locator.toString())
println(build)

// Access build agent
var agent = build6931.agent
println(agent)

val buildQueueApi = BuildQueueApi(clientConfig)

// Define a build stub
val buildStub = Build(
        buildType = BuildType(
                id = "<some build configuration ID>"
        )
)

// And start a new build
val queuedBuild = buildQueueApi.addBuildToQueue(buildStub)
println("Started new build: " + queuedBuild.id)

// Get a list of builds with locator specified to fetch 10 builds
val builds = buildApi.getAllBuilds(locator = "count:10")

// Builds is a PaginatedEntity, meaning it can be iterated as a simple iterator:
var iterator = builds.getIterator()
while (iterator.hasNext()) {
    println(iterator.next().id.toString() + " id, fetched with simple iterator")
}

// ...or as a paginated iterator:
var paginatedIterator = builds.getPaginatedIterator(clientConfig)
var count = 0

while (paginatedIterator.hasNext() && count < 100) { // precaution to not accidentally request every build available
    println(paginatedIterator.next().id.toString() + " id, fetched with paginated iterator")
    count++
}
```
