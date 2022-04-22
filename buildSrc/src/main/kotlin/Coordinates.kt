object Coordinates {
    const val NAME = "animemaster"
    const val DESC = "Anime Master is a Kotlin library to help you manage your anime management services."
    const val VENDOR = "OpenMedia Technologies"

    const val GIT_HOST = "github.com"
    const val REPO_ID = "openmedia-technologies/$NAME"

    const val GROUP = "me.xtrm.openmedia"
    const val VERSION = "0.1.0"
}

object Pom {
    val licenses = arrayOf(
        License("ISC License", "https://opensource.org/licenses/ISC")
    )
    val developers = arrayOf(
        Developer("xtrm")
    )
}

data class License(val name: String, val url: String, val distribution: String = "repo")
data class Developer(val id: String, val name: String = id)
