//contador de palavras em um map usando métodos de collections

import java.util.*;

public class ContarPalavras {
    public static void main(String[] args) {
        // Lista de palavras
        List<String> palavras = Arrays.asList(
            "java", "python", "java", "c++", "python", "java", "go"
        );

Map<String, Integer> contagem = new HashMap<>();

        // Contar a ocorrência de cada palavra
        for (String palavra : palavras) {
            contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
        }

        // Exibir o resultado
        for (Map.Entry<String, Integer> entrada : contagem.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}