import java.util.*;

public class AgruparNomes {
    public static void main(String[] args) {
        // Lista de nomes
        List<String> nomes = Arrays.asList(
            "Ana", "Arthur", "Beatriz", "Bruno", "Carlos", "Clara", "Amanda"
        );

Map<Character, List<String>> nomesAgrupados = new HashMap<>();

        // Agrupar nomes por letra inicial
        for (String nome : nomes) {
            char letraInicial = nome.charAt(0);
            nomesAgrupados.putIfAbsent(letraInicial, new ArrayList<>());
            nomesAgrupados.get(letraInicial).add(nome);
        }

        // Exibir o resultado
        for (Map.Entry<Character, List<String>> entry : nomesAgrupados.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}