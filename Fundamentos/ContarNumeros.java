import java.util.*;

public class ContarNumeros {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(
            1, 2, 3, 2, 4, 1, 2, 5, 3, 1, 1
        );

Map<Integer, Integer> conteo = new HashMap<>();

        // Contar frequencia de cada número
        for (Integer numero : numeros) {
            conteo.put(numero, conteo.getOrDefault(numero, 0) + 1);
        }

        // Mostrar resultados
        for (Map.Entry<Integer, Integer> entrada : conteo.entrySet()) {
            System.out.println("Número: " + entrada.getKey() + ", Frequencia: " + entrada.getValue());
        }
    }
}