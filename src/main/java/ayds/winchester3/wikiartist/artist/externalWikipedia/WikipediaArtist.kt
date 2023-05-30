package ayds.winchester3.wikiartist.artist.externalWikipedia

const val WIKIPEDIA_LOGO_URL = "https://upload.wikimedia.org/wikipedia/commons/8/8c/Wikipedia-logo-v2-es.png"

data class WikipediaArtist(
    var name: String = "",
    var wikipediaURL: String,
    var description: String
)
