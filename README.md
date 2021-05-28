
# 3er Parcial App

Aplicacion mobile para el 3er proyecto de desarrollo basado en plataformas, el cual esta diseñado para consumir informacion directamente desde el servidor que se encuentra en (https://github.com/GAAARCIA/ProyectoDBP_3).


## Authors

- Norma Angélica García Martínez 329528
- José Daniel Hermosillo López 329694
- Jesús Martín Loera Esparza 319094
## Conocimientos Requeridos

 - [Android Studio](https://developer.android.com/studio)
 - [Volley](https://developer.android.com/training/volley?hl=es)
 - [Node](https://nodejs.org/es/)
 - [Ngrok](https://ngrok.com/)
  
## Feedback

Si tienes algun feedback, estariamos agradecidos que nos compartas tu punto de vista.
  
## Instalacion

Clona el repositorio con git clone de este proyecto

```bash 
  git clone https://github.com/GAAARCIA/ProyectoDBP3_App
```

Clona el repositorio del servidor.

```bash
    git clone https://github.com/GAAARCIA/ProyectoDBP_3
```

Para iniciar el servidor ingrese a la carpeta y ejecute app.js con node

```bash
    cd ProyectoDBP_3
    node app.js
```

Luego ingrese a localhost:8888 para comprobar el estado del servidor.

Para la app, abra android studio con la ruta 

```bash
    ./ProyectoDBP3_App
```

Un ultimo paso es utilizar ngrok para crear el servicio web
```bash
    ngrok http 8888
```

Por ultimo cambie en el proyecto app, en el archivo principal la ruta de ngrok para que se comunique la app con el server.


## Tecnologia utilizada

**Client:** Android sdk, Java, Volley.

**Server:** Node, Ngrok.

  
## License

[MIT](https://choosealicense.com/licenses/mit/)

  
