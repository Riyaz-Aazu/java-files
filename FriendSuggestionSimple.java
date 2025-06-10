package javaprograms;

import java.util.*;

public class FriendSuggestionSimple {
    public static void main(String[] args) {
        Map<String, List<String>> network = new HashMap<>();

        network.put("Alice", Arrays.asList("Bob", "Charlie"));
        network.put("Bob", Arrays.asList("Alice", "David", "Eve"));
        network.put("Charlie", Arrays.asList("Alice"));
        network.put("David", Arrays.asList("Bob"));
        network.put("Eve", Arrays.asList("Bob"));

        String person = "Alice";
        int maxSuggestions = 3;

        Set<String> directFriends = new HashSet<>(network.getOrDefault(person, new ArrayList<>()));
        Map<String, Integer> mutualCount = new HashMap<>();

        for (String friend : directFriends) {
            for (String fof : network.getOrDefault(friend, new ArrayList<>())) {
                if (!fof.equals(person) && !directFriends.contains(fof)) {
                    mutualCount.put(fof, mutualCount.getOrDefault(fof, 0) + 1);
                }
            }
        }

        List<String> suggestions = new ArrayList<>(mutualCount.keySet());
        suggestions.sort((a, b) -> {
            int cmp = Integer.compare(mutualCount.get(b), mutualCount.get(a));
            return cmp != 0 ? cmp : a.compareTo(b);
        });

        System.out.println("Friend suggestions for " + person + ":");
        for (int i = 0; i < Math.min(maxSuggestions, suggestions.size()); i++) {
            String name = suggestions.get(i);
            System.out.println(name + " (" + mutualCount.get(name) + " mutual friends)");
        }
    }
}
