import java.util.HashSet;
import java.util.HashMap;

public class NPC {
    private String name;
    private String biome;
    private HashSet<String> neighbors;
    private HashMap<String, Double> preferences;

    public NPC(String n, String b) {
        name = n;
        biome = b;
        neighbors = new HashSet<String>();
        preferences = new HashMap<String, Double>();
    }

    public String getName() {
        return name;
    }

    public String getBiome() {
        return biome;
    }

    public void setBiome(String b) {
        biome = b;
    }

    public void addNeighbor(String n) {
        neighbors.add(n);
    }

    public void removeNeighbor(String n) {
        neighbors.remove(n);
    }

    public void addPreference(String p, double d) {
        preferences.put(p, d);
    }

    public void removePreference(String p) {
        preferences.remove(p);
    }

    public int calcHappiness() {
        double happiness = 1.00;

        // Multiply by biome modifier if it exists.
        if (preferences.containsKey(biome)) {
            happiness *= preferences.get(biome);
        }

        // If an NPC has two or less neighbors, add a solitude bonus.
        if (neighbors.size() <= 2) {
            happiness *= 0.95;
        }
        // If an NPC has more than three neighbors, add a crowded penalty.
        else if (neighbors.size() > 3) {
            happiness *= 1.05;
        }
        // Loop through the HashMap and see if the NPC has a preference modifier for their current neighbors.
        // If so, multiply the current happiness modifier by that preference value.
        // for (HashMap.Entry<String, Double> entry : preferences.entrySet()) {
        //     if (neighbors.contains(entry.getKey())) {
        //         happiness *= entry.getValue();
        //     }
        // }
        for (String neighbor : neighbors) {
            if (preferences.containsKey(neighbor)) {
                happiness *= preferences.get(neighbor);
            }
        }
        happiness *= 100;

        // Happiness multiplier is capped at 75.
        if (happiness < 75) {
            return 75;
        }
        return (int) Math.round(happiness);
    }

    public String toString() {
        return this.getName();
    }
}
