package me.xtrm.openmedia.animemaster.api.service

import java.net.URL

/**
 * Represents an Anime/Manga service.
 *
 * @author xtrm
 * @since 0.1.0
 */
interface IService {
    /**
     * The service's name.
     */
    val name: String

    /**
     * The service's url.
     */
    val url: URL
}
