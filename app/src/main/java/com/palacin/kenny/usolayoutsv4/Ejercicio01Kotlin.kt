package com.palacin.kenny.usolayoutsv4

class Ejercicio01Kotlin {
    fun contarFrecuencia(palabra: String): Map<Char, Int> {
        // Mapa mutable para almacenar la frecuencia de cada carácter
        val frecuencia = mutableMapOf<Char, Int>()

        // Iteramos sobre cada carácter de la palabra
        for (caracter in palabra) {
            // Si el carácter ya está en el mapa, incrementamos su valor en 1
            if (frecuencia.containsKey(caracter)) {
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                // Si el carácter no está en el mapa, lo agregamos con un valor inicial de 1
                frecuencia[caracter] = 1
            }
        }

        // Devolvemos el mapa con las frecuencias
        return frecuencia
    }
}