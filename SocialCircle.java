package javaprograms;
import java.util.*;

public class SocialCircle {
    private Map<String, List<String>> graph;

    // Constructor name must match class name
    public SocialCircle(Map<String, List<String>> graph) {
        this.graph = graph;
    }

    public List<String> findSocialCircle(String person) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        dfs(person, visited, result);
        return result;
    }

    private void dfs(String person, Set<String> visited, List<String> result) {
        if (!graph.containsKey(person) || visited.contains(person)) return;
        visited.add(person);
        result.add(person);
        for (String friend : graph.get(person)) {
            dfs(friend, visited, result);
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> graph = Map.of(
            "Alice", List.of("Bob", "Claire"),
            "Bob", List.of("Alice", "Dennis"),
            "Claire", List.of("Alice"),
            "Dennis", List.of("Bob"),
            "Eve", List.of("Frank"),
            "Frank", List.of("Eve")
        );

        SocialCircle sc = new SocialCircle(graph);
        System.out.println(sc.findSocialCircle("Alice"));  // [Alice, Bob, Claire, Dennis]
        System.out.println(sc.findSocialCircle("Eve"));    // [Eve, Frank]
    }
}
