# Terraria Happiness Calculator

A simple NPC happiness calculator for Terraria to be used in the terminal. You can manually add NPCs to any biome and see the happiness levels of all NPCs for your setup.

Realistically, the Goblin Tinkerer and the Nurse are the two most important NPCs to keep as happy as possible.

## Notes

* A HashMap allows for fast retrieval, but might be overkill for a small number of preferences due to memory overhead.
* A HashSet for preferences might improve efficiency for larger datasets.
* A database can be used to store preferences. This way, if Terraria updates NPC preferences, only the database needs to be updated.

## Changelog

* 9/6/2024: ArrayList changed to HashSet for faster add/remove operations. This is ideal because the order/index of the neighbors doesn't matter, and we don't want duplicates in the neighbors list anyway.
