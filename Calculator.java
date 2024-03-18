public class Calculator {
    public static void main(String[] args) {
        final double love = 0.88;
        final double like = 0.94;
        final double dislike = 1.06;
        final double hate = 1.12;

        // Pre-Hardmode NPCs

        NPC Guide = new NPC("Guide", "");
        Guide.addPreference("Forest", like);
        Guide.addPreference("Ocean", dislike);
        Guide.addPreference("Princess", like);
        Guide.addPreference("Clothier", like);
        Guide.addPreference("Zoologist", like);
        Guide.addPreference("Steampunker", dislike);
        Guide.addPreference("Painter", hate);

        NPC Merchant = new NPC("Merchant", "");
        Merchant.addPreference("Forest", like);
        Merchant.addPreference("Desert", dislike);
        Merchant.addPreference("Princess", like);
        Merchant.addPreference("Golfer", like);
        Merchant.addPreference("Nurse", like);
        Merchant.addPreference("Tax Collector", dislike);
        Merchant.addPreference("Angler", hate);

        NPC Nurse = new NPC("Nurse", "");
        Nurse.addPreference("Hallow", like);
        Nurse.addPreference("Snow", dislike);
        Nurse.addPreference("Arms Dealer", love);
        Nurse.addPreference("Princess", like);
        Nurse.addPreference("Wizard", like);
        Nurse.addPreference("Party Girl", dislike);
        Nurse.addPreference("Dryad", dislike);
        Nurse.addPreference("Zoologist", hate);

        NPC Demolitionist = new NPC("Demolitionist", "");
        Demolitionist.addPreference("Underground", like);
        Demolitionist.addPreference("Cavern", like);
        Demolitionist.addPreference("Underworld", like);
        Demolitionist.addPreference("Ocean", dislike);
        Demolitionist.addPreference("Tavernkeep", love);
        Demolitionist.addPreference("Princess", like);
        Demolitionist.addPreference("Mechanic", like);
        Demolitionist.addPreference("Goblin Tinkerer", dislike);
        Demolitionist.addPreference("Arms Dealer", dislike);

        NPC DyeTrader = new NPC("Dye Trader", "");
        DyeTrader.addPreference("Desert", like);
        DyeTrader.addPreference("Forest", dislike);
        DyeTrader.addPreference("Princess", like);
        DyeTrader.addPreference("Arms Dealer", like);
        DyeTrader.addPreference("Painter", like);
        DyeTrader.addPreference("Steampunker", dislike);
        DyeTrader.addPreference("Pirate", hate);

        NPC Angler = new NPC("Angler", "");
        Angler.addPreference("Ocean", like);
        Angler.addPreference("Desert", dislike);
        Angler.addPreference("Princess", like);
        Angler.addPreference("Party Girl", like);
        Angler.addPreference("Demolitionist", like);
        Angler.addPreference("Tax Collector", like);
        Angler.addPreference("Tavernkeep", hate);

        NPC Zoologist = new NPC("Zoologist", "");
        Zoologist.addPreference("Forest", like);
        Zoologist.addPreference("Desert", dislike);
        Zoologist.addPreference("Witch Doctor", love);
        Zoologist.addPreference("Princess", like);
        Zoologist.addPreference("Golfer", like);
        Zoologist.addPreference("Angler", dislike);
        Zoologist.addPreference("Arms Dealer", hate);

        NPC Dryad = new NPC("Dryad", "");
        Dryad.addPreference("Jungle", like);
        Dryad.addPreference("Desert", dislike);
        Dryad.addPreference("Princess", like);
        Dryad.addPreference("Witch Doctor", like);
        Dryad.addPreference("Truffle", like);
        Dryad.addPreference("Angler", dislike);
        Dryad.addPreference("Golfer", hate);

        NPC Painter = new NPC("Painter", "");
        Painter.addPreference("Jungle", like);
        Painter.addPreference("Forest", dislike);
        Painter.addPreference("Dryad", love);
        Painter.addPreference("Princess", like);
        Painter.addPreference("Party Girl", like);
        Painter.addPreference("Cyborg", dislike);
        Painter.addPreference("Truffle", dislike);

        NPC Golfer = new NPC("Golfer", "");
        Golfer.addPreference("Forest", like);
        Golfer.addPreference("Underground", dislike);
        Golfer.addPreference("Cavern", dislike);
        Golfer.addPreference("Underworld", dislike);
        Golfer.addPreference("Angler", love);
        Golfer.addPreference("Princess", like);
        Golfer.addPreference("Painter", like);
        Golfer.addPreference("Zoologist", like);
        Golfer.addPreference("Pirate", dislike);
        Golfer.addPreference("Merchant", hate);

        NPC ArmsDealer = new NPC("Arms Dealer", "");
        ArmsDealer.addPreference("Desert", like);
        ArmsDealer.addPreference("Snow", dislike);
        ArmsDealer.addPreference("Nurse", love);
        ArmsDealer.addPreference("Princess", like);
        ArmsDealer.addPreference("Steampunker", like);
        ArmsDealer.addPreference("Golfer", dislike);
        ArmsDealer.addPreference("Demolitionist", hate);

        NPC Tavernkeep = new NPC("Tavernkeep", "");
        Tavernkeep.addPreference("Hallow", like);
        Tavernkeep.addPreference("Snow", dislike);
        Tavernkeep.addPreference("Demolitionist", love);
        Tavernkeep.addPreference("Princess", like);
        Tavernkeep.addPreference("Goblin Tinkerer", like);
        Tavernkeep.addPreference("Guide", dislike);
        Tavernkeep.addPreference("Dye Trader", hate);

        NPC Stylist = new NPC("Stylist", "");
        Stylist.addPreference("Ocean", like);
        Stylist.addPreference("Snow", dislike);
        Stylist.addPreference("Dye Trader", love);
        Stylist.addPreference("Princess", like);
        Stylist.addPreference("Pirate", like);
        Stylist.addPreference("Tavernkeep", dislike);
        Stylist.addPreference("Goblin Tinkerer", hate);

        NPC GoblinTinkerer = new NPC("Goblin Tinkerer", "");
        GoblinTinkerer.addPreference("Underground", like);
        GoblinTinkerer.addPreference("Cavern", like);
        GoblinTinkerer.addPreference("Underworld", like);
        GoblinTinkerer.addPreference("Jungle", dislike);
        GoblinTinkerer.addPreference("Mechanic", love);
        GoblinTinkerer.addPreference("Princess", like);
        GoblinTinkerer.addPreference("Dye Trader", like);
        GoblinTinkerer.addPreference("Clothier", dislike);
        GoblinTinkerer.addPreference("Stylist", hate);

        NPC WitchDoctor = new NPC("Witch Doctor", "");
        WitchDoctor.addPreference("Jungle", like);
        WitchDoctor.addPreference("Hallow", dislike);
        WitchDoctor.addPreference("Princess", like);
        WitchDoctor.addPreference("Dryad", like);
        WitchDoctor.addPreference("Guide", like);
        WitchDoctor.addPreference("Nurse", dislike);
        WitchDoctor.addPreference("Truffle", hate);

        NPC Clothier = new NPC("Clothier", "");
        Clothier.addPreference("Underground", like);
        Clothier.addPreference("Cavern", like);
        Clothier.addPreference("Underworld", like);
        Clothier.addPreference("Hallow", dislike);
        Clothier.addPreference("Truffle", love);
        Clothier.addPreference("Princess", like);
        Clothier.addPreference("Tax Collector", like);
        Clothier.addPreference("Nurse", dislike);
        Clothier.addPreference("Mechanic", hate);

        NPC Mechanic = new NPC("Mechanic", "");
        Mechanic.addPreference("Snow", like);
        Mechanic.addPreference("Underground", dislike);
        Mechanic.addPreference("Cavern", dislike);
        Mechanic.addPreference("Underworld", dislike);
        Mechanic.addPreference("Goblin Tinkerer", love);
        Mechanic.addPreference("Princess", like);
        Mechanic.addPreference("Cyborg", like);
        Mechanic.addPreference("Arms Dealer", dislike);
        Mechanic.addPreference("Clothier", hate);

        NPC PartyGirl = new NPC("Party Girl", "");
        PartyGirl.addPreference("Hallow", like);
        PartyGirl.addPreference("Underground", dislike);
        PartyGirl.addPreference("Cavern", dislike);
        PartyGirl.addPreference("Underworld", dislike);
        PartyGirl.addPreference("Wizard", love);
        PartyGirl.addPreference("Zoologist", love);
        PartyGirl.addPreference("Princess", like);
        PartyGirl.addPreference("Stylist", like);
        PartyGirl.addPreference("Merchant", dislike);
        PartyGirl.addPreference("Tax Collector", hate);

        // Hardmode NPCs

        NPC Wizard = new NPC("Wizard", "");
        Wizard.addPreference("Hallow", like);
        Wizard.addPreference("Ocean", dislike);
        Wizard.addPreference("Golfer", love);
        Wizard.addPreference("Princess", like);
        Wizard.addPreference("Merchant", like);
        Wizard.addPreference("Witch Doctor", dislike);
        Wizard.addPreference("Cyborg", hate);

        NPC TaxCollector = new NPC("Tax Collector", "");
        TaxCollector.addPreference("Snow", like);
        TaxCollector.addPreference("Hallow", dislike);
        TaxCollector.addPreference("Merchant", love);
        TaxCollector.addPreference("Princess", like);
        TaxCollector.addPreference("Party Girl", like);
        TaxCollector.addPreference("Demolitionist", dislike);
        TaxCollector.addPreference("Mechanic", dislike);
        TaxCollector.addPreference("Santa Claus", hate);

        System.out.println("Terraria Happiness Calculator\n"
                            + "Updated 3/18/2024\n"
                            + "Data from https://terraria.wiki.gg/wiki/NPCs#Happiness\n\n"
                            + "Notes:\n"
                            + "* Assumes that all NPCs in the same biome are neighbors and within 25 tiles of each other.\n"
                            + "* Happiness is calculated when an NPC's chat window is opened, lower is better.\n"
                            + "* A happiness multiplier of 85 or lower is required for pylons to be available for purchase.\n"
                            + "* Town pets do not affect happiness, but can contribute to pylon placement requirements.\n");
        System.out.println("Calculated happiness: " + Guide.calcHappiness());
        System.out.println("Expected happiness: " + Math.round(1.00 * 0.95 * 0.94 * 100));
    }
}
