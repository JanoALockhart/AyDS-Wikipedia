package ayds.winchester3.wikiartist.artist.externalWikipedia

import ayds.winchester3.wikiartist.artist.externalWikipedia.service.*
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object WikipediaInjector {

    private const val BASE_URL_RETROFIT = "https://en.wikipedia.org/w/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL_RETROFIT)
        .addConverterFactory(ScalarsConverterFactory.create())
        .build()
    private val wikipediaAPI = retrofit.create(WikipediaAPI::class.java)
    private val wikipediaToArtistResolver: WikipediaToArtistsResolver = WikipediaToArtistsResolverImpl()

    val wikipediaService : WikipediaService = WikipediaServiceImpl(
            wikipediaToArtistResolver,
            wikipediaAPI
        )
}