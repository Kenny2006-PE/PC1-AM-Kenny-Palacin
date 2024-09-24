
class Ejercicio01Kotlin {


    fun contarFrecuencia(palabra: String): Map<Char, Int> {
        // Mapa para almacenar la frecuencia de cada carácter
        val frecuencia: MutableMap<Char, Int> = mutableMapOf()

        // Iterar sobre cada carácter de la palabra
        for (caracter in palabra) {
            // Si el carácter ya está en el mapa, incrementar su frecuencia
            if (frecuencia.containsKey(caracter)) {
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                // Si el carácter no está en el mapa, agregarlo con frecuencia 1
                frecuencia[caracter] = 1
            }
        }
        // Retornar la frecuencia de cada letra de la palabra
        return frecuencia
    }
}

// Hacemos la clase de pruebas para probar el algoritmo
fun main() {
    // Creamos la instancia
    val ejercicio = Ejercicio01Kotlin()

    // En este campo definimos la palabra de la cual queremos ver su frecuencia
    val entrada = "Kenny Palacin"

    // Llamar al método contarFrecuencia y almacenar el resultado
    val resultado = ejercicio.contarFrecuencia(entrada)

    println(resultado)
}
