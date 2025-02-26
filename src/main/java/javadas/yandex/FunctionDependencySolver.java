package javadas.yandex;

import java.util.*;

public class FunctionDependencySolver {

    // Արտածելու համար պատասխանը
    private static List<String> result = new ArrayList<>();
    private static Map<String, List<String>> graph = new HashMap<>();
    private static Set<String> visited = new HashSet<>();
    private static Set<String> tempVisited = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N-ի արժեքը
        int N = scanner.nextInt();
        scanner.nextLine(); // Տողը վերցնելու համար

        // Գրաֆի կառուցում
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String functionName = parts[0];
            graph.putIfAbsent(functionName, new ArrayList<>());
            for (int j = 1; j < parts.length; j++) {
                graph.get(functionName).add(parts[j]);
            }
        }

        // Թոփոլոգիական դասակարգում
        for (String function : graph.keySet()) {
            if (!visited.contains(function)) {
                if (!dfs(function)) {
                    System.out.println("Cycle detected, no solution exists!");
                    return;
                }
            }
        }

        // Արտածում
        Collections.reverse(result);
        System.out.println(String.join(" ", result));
    }

    // DFS Ֆունկցիա
    private static boolean dfs(String function) {
        if (tempVisited.contains(function)) {
            // Պարբերականություն (cycle) հայտնաբերվել է
            return false;
        }
        if (visited.contains(function)) {
            return true;
        }

        tempVisited.add(function);

        for (String dependency : graph.get(function)) {
            if (!dfs(dependency)) {
                return false;
            }
        }

        tempVisited.remove(function);
        visited.add(function);
        result.add(function);

        return true;
    }
}
