package me.xtrm.openmedia.animemaster.service.anilist

import me.xtrm.openmedia.animemaster.api.service.IService
import java.net.URL

/**
 * [IService] implementation for the [AniList](https://anilist.co/) website.
 *
 * @author xtrm
 * @since 0.1.0
 */
object AnilistService : IService {
    override val name: String = "AniList"
    override val url: URL = URL("https://anilist.co/")
}
