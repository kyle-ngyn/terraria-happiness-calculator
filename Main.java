class Main {
    public static void main(String args[]) {
        final double love = 0.88;
        final double like = 0.94;
        final double dislike = 1.06;
        final double hate = 1.12;

        NPC Guide = new NPC("Guide", "Forest");
        Guide.addPreference("Forest", like);
        Guide.addPreference("Ocean", dislike);
        Guide.addPreference("Princess", like);
        Guide.addPreference("Clothier", like);
        Guide.addPreference("Zoologist", like);
        Guide.addPreference("Steampunker", dislike);
        Guide.addPreference("Painter", hate);

        System.out.println("Terraria Happiness Calculator v1.0.0\n"
                            + "Updated 3/16/2024\n\n"
                            + "Notes:\n"
                            + "Assumes that all NPCs in the same biome are neighbors and within 25 tiles of each other.\n"
                            + "* Lower is better.\n"
                            + "* A happiness multiplier of 85% or lower is required for pylons to be available for purchase.\n"
                            + "* Town pets do not affect happiness, but can contribute to pylon placement requirements.\n");
        System.out.println("Calculated happiness: " + Guide.calcHappiness() + "%");
        System.out.println("Expected happiness: " + Math.round(1.00 * 0.95 * 0.94 * 100) + "%");
    }
}
