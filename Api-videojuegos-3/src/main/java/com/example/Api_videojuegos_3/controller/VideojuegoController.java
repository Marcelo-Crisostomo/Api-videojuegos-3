package com.example.Api_videojuegos_3.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//1 Protocolo http
@RestController

//url : me permite llegar a la direccion de la fruteria

//EndPoint:
//GET : Stock completo
//Put : Agregar una nueva furta
// Delete : borrar una fruta
//Patch : Actualizar


//2 anotación para definir una ruta base para nuestra API
@RequestMapping("/api/v1/videojuegos")
//Metodo publico
public class VideojuegoController {
    //3- E
    @GetMapping("/hola")
    public String saludo(){
        //4 retorno
        return " Bienvenidos a mi API de Videojuegos.....👍🤣😂🙌 ";
    }

    //5 Este metodo responde con un JSON
    @GetMapping("/top")
    public Videojuego obtenerVideojuegoTop(){
        //Creamos un nuevo juego y lo retornamos en JSON
        return new Videojuego("The Legend of Zelda: Breath of the Wild", "Nitendo Switch", 10);
    }

    //6 Clase interna para representar el videojuego
    static class Videojuego{
        //Atributo
        private String titulo;
        private String descripcion;
        private int puntuacion;

        //Constructor
        public Videojuego(String titulo, String descripcion, int puntuacion){
            this.titulo = titulo;
            this.descripcion = descripcion;
            this.puntuacion = puntuacion;
            }

        //Getters
        public String getTitulo(){
            return titulo;
        }

        public String getDescripcion(){
            return descripcion;
        }
        public int getPuntuacion(){
            return puntuacion;
        }
    }

}
