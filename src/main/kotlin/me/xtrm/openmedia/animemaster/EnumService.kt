package me.xtrm.openmedia.animemaster

import me.xtrm.openmedia.animemaster.api.service.IService
import me.xtrm.openmedia.animemaster.service.anilist.AnilistService
import me.xtrm.openmedia.animemaster.service.mal.MALService

/**
 * Enum of different [IService]s.
 *
 * @author xtrm
 * @since 0.1.0
 */
enum class EnumService(
    val service: IService,
) {
    /**
     * The AniList service.
     */
    ANILIST(AnilistService),

    /**
     * The MyAnimeList service.
     */
    MAL(MALService),
}
