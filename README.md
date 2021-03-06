# animemaster [![Build][badge-github-ci]][project-gradle-ci] [![Maven Central][badge-mvnc]][project-mvnc]

**Anime Master** is a Kotlin library to help you manage your anime management services.

It provides API clients to connect and fetch data from multiple services, as well as an abstraction layer, allowing
you to use multiple services at a time.

**Supported Services**:

|   Service   | Fetching | Login | Management | Recommendations |
|:-----------:|:--------:|:-----:|:----------:|:---------------:|
|   AniList   |    ❌     |   ❌   |     ❌      |        ❌        |
| MyAnimeList |    ❌     |   ❌   |     ❌      |        ❌        |

# importing

you can import [animemaster][project-url] from [maven central][mvnc] just by adding it to your dependencies:

## gradle

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("me.xtrm.openmedia:animemaster:{VERSION}")
}
```

## maven

```xml

<dependency>
    <groupId>me.xtrm.openmedia</groupId>
    <artifactId>animemaster</artifactId>
    <version>{VERSION}</version>
</dependency>
```

# troubleshooting

if you ever encounter any problem **related to this project**, you can [open an issue][new-issue] describing what the
problem is. please, be as precise as you can, so that we can help you asap. we are most likely to close the issue if it
is not related to our work.

# contributing

you can contribute by [forking the repository][fork], making your changes and [creating a new pull request][new-pr]
describing what you changed, why and how.

# licensing

this project is under the [ISC license][project-license].


<!-- Links -->

[jvm]: https://adoptium.net "adoptium website"

[kotlin]: https://kotlinlang.org "kotlin website"

[rust]: https://rust-lang.org "rust website"

[mvnc]: https://repo1.maven.org/maven2/ "maven central website"

<!-- Project Links -->

[project-url]: https://github.com/openmedia-technologies/animemaster "project github repository"

[fork]: https://github.com/openmedia-technologies/animemaster/fork "fork this repository"

[new-pr]: https://github.com/openmedia-technologies/animemaster/pulls/new "create a new pull request"

[new-issue]: https://github.com/openmedia-technologies/animemaster/issues/new "create a new issue"

[project-mvnc]: https://maven-badges.herokuapp.com/maven-central/fr.stardustenterprises/animemaster "maven central repository"

[project-gradle-ci]: https://github.com/openmedia-technologies/animemaster/actions/workflows/gradle-ci.yml "gradle ci workflow"

[project-license]: https://github.com/openmedia-technologies/animemaster/blob/trunk/LICENSE "LICENSE source file"

<!-- Badges -->

[badge-mvnc]: https://maven-badges.herokuapp.com/maven-central/fr.stardustenterprises/animemaster/badge.svg "maven central badge"

[badge-github-ci]: https://github.com/openmedia-technologies/animemaster/actions/workflows/build.yml/badge.svg?branch=trunk "github actions badge"
