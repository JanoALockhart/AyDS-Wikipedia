package ayds.winchester3.wikiartist.artist.externalWikipedia.service

import ayds.winchester3.wikiartist.artist.externalWikipedia.WikipediaArtist
import ayds.winchester3.wikiartist.artist.externalWikipedia.WikipediaService
import retrofit2.Response

class WikipediaServiceImpl(
    private val wikipediaToArtistsResolver: WikipediaToArtistsResolver,
    private val wikipediaAPI : WikipediaAPI
) : WikipediaService {

    override fun getArtist(artistName: String): WikipediaArtist? {
        val callResponse = getArtistInfoFromAPI(artistName)
        return wikipediaToArtistsResolver.getArtistFromExternalData(callResponse.body(), artistName)
    }

    private fun getArtistInfoFromAPI(artistName: String?): Response<String?> =
        wikipediaAPI.getArtistInfo(artistName).execute()

}