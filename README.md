# README #

### Capas de la aplicación ###

* Capa de presentación o vistas: Esta capa hace referencia a las interfaces de la aplicación ubicados en la carpeta res/layout. Aquí se tiene las siguientes interfaces:

	* Interfaz principal (activity_main) (portrait y landscape): Es la primera interfaz que se visualiza en la aplicación, en la cual el usuario podrá visualizar el listado de temas, y hacer búsquedas de manera online y offline. 

	* Interfaz de detalle de un tema (activity_detail): Esta interfaz permite al usuario visualizar el detalle de un tema en específico. Se construyó una para portrait y otra para landscape.
	
* Capa de negocio: En esta capa se encuentra toda la lógica del negocio de la aplicación. Esta capa conecta a la capa de persistencia o datos con la capa de presentación o vistas. Hacen parte de la capa de negocio las clases que están ubicadas en el paquete activity. En el paquete activity se encuentran: 

	* MainActivity: Contiene la lógica referente a la interfaz activity_main. Dentro de ésta se realiza la petición al endpoint que traen el listado de temas, los cuales son almacenados en caché para que la aplicación pueda ser utilizada también de manera offline. Estos procesos  son realizados con la ayuda de las siguientes clases: 

		- ConvertGson (paquete util): permite la serializacion y deserializacion de un objeto.
		- NetValidation (paquete util): permite validar si hay conexión a internet.
		- SaveInCache (paquete sotarge): permite el almacenamiento de los datos en el cache del dispositivo). 
		- AdapterThemes (paquete adapter): permite construir y dar manejo al listado de temas.
		- CircleAdapter(paquete util): permite dar forma circular a la imagen de cada item de la lista.
		
	* DetailActivity: Contiene la lógica referente a la interfaz activity_detail. Aquí se validan y fijan los datos en la interfaz de detalle. Hace uso de las clases:
		- DatFormat (paquete util): permite darle formato a la fecha.
		- ValidateString (paquete util): permite validar si un valor es nullo o vacío.
	 
* Capa de datos o persistencia: En esta capa se encuentran las clases que están en el paquete model, las cuales permiten fijar y obtener los datos de los temas, ya sea mapeando la respuesta desde el endpoint de la API o mapeando la información que se ha guardado en forma de json el dispositivo. Estas clases son:
    		- GeneralResponse
		- Data
		- Children
		- DataChildren

* Capa de red: Permite realizar la conexión con la API, aquí se encuentran la clase y la interfaz que están en el paquete res: 
		
    - ApiClient y ApiServiceClientInterface.

Por otro lado se encuentran también dentro del paquete util las clases:
  - Dialogs: manejo de dialogs de la app
  - Messages: manejo de mensajes
  - Util: para variables globales
