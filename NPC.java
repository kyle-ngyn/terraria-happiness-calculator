import java.util.ArrayList;
import java.util.HashMap;

public class NPC {
    private String name;
    private String biome;
    private ArrayList<String> neighbors;
    private HashMap<String, Double> preferences;

    public NPC(String n, String b) {
        name = n;
        biome = b;
        neighbors = new ArrayList<String>();
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

    public void removeNeighbor(int index) {
        neighbors.remove(index);
    }

    public void addPreference(String p, double d) {
        preferences.put(p, d);
    }

    public void removePreference(String p) {
        preferences.remove(p);
    }

    public int calcHappiness() {
        double happiness = 1.00;

        if (preferences.containsKey(biome)) {
            happiness *= preferences.get(biome);
        }
        if (neighbors.size() <= 2) {
            happiness *= 0.95;
        }
        else if (neighbors.size() > 3) {
            happiness *= 1.05;
        }
        for (HashMap.Entry<String, Double> entry : preferences.entrySet()) {
            if (neighbors.contains(entry.getKey())) {
                happiness *= entry.getValue();
            }
        }
        happiness *= 100;

        if (happiness < 75) {
            return 75;
        }
        return (int) Math.round(happiness);
    }

    public String toString() {
        return this.getName();
    }
}
