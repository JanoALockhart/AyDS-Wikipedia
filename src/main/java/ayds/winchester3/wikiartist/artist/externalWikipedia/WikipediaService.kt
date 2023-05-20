package ayds.winchester3.wikiartist.artist.externalWikipedia

interface WikipediaService{
    fun getArtist(artistName: String): WikipediaArtist?
}