/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diccionario;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        // Crear un diccionario Español-Inglés utilizando un HashMap
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("manzana", "apple");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        diccionario.put("sol", "sun");
        diccionario.put("amigo", "friend");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("jugar", "play");
        diccionario.put("comer", "eat");
        diccionario.put("trabajo", "work");
        diccionario.put("estudiar", "study");
        diccionario.put("música", "music");
        diccionario.put("tiempo", "time");
        diccionario.put("bienvenido", "welcome");
        diccionario.put("hermano", "brother");
        diccionario.put("comida", "food");
        diccionario.put("nadar", "swim");
        diccionario.put("cielo", "sky");

        // Escoger 5 palabras al azar en español
        String[] palabrasEspanol = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];

        for (int i = 0; i < 5; i++) {
            palabrasSeleccionadas[i] = palabrasEspanol[random.nextInt(palabrasEspanol.length)];
        }

        // Pedir al usuario que ingrese la traducción de las palabras
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("Por favor, ingresa la traducción al inglés de las siguientes palabras:");
        for (String palabra : palabrasSeleccionadas) {
            System.out.print(palabra + ": ");
            String respuestaUsuario = scanner.nextLine();
            String traduccionCorrecta = diccionario.get(palabra);

            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                respuestasCorrectas++;
            } else {
                respuestasIncorrectas++;
            }
        }

       
        System.out.println("\nRespuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
