package me.xtrm.openmedia.animemaster.service.mal

import me.xtrm.openmedia.animemaster.api.service.IService
import java.net.URL

/**
 * [IService] implementation for the [MyAnimeList](https://myanimelist.net/) website.
 *
 * @author xtrm
 * @since 0.1.0
 */
object MALService : IService {
    override val name: String = "MyAnimeList"
    override val url: URL = URL("https://myanimelist.net/")
}
