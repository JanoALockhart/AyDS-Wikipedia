# AyDS-Wikipedia
## Obtencion de la instancia del servicio de Wikipedia
Inicializar el objeto WikipediaInjector y acceder al atributo wikipediaService, por ejemplo:  
val wikipediaService = WikipediaInjector.wikipediaService
  
## Metodo getArtist
El método getArtist recibe como parámetro un artistName de tipo String
y retorna un WikipediaArtist, en caso de que no se encuentre un artículo, devuelve null.
WikipediaArtist tiene el nombre del artista (name), el link a la URL de Wikipedia (WikipediaUrl)
y la descripción del artista.


