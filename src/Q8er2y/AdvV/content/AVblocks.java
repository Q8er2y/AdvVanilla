package AdvancedVanilla.content;

import AdvancedVanilla.content.blocks.*;;

public class AdvancedVanillaBlocks {
    public static void load(){
        AdvancedVanillaEnvironmentBlocks.load();
        AdvancedVanillaDefenceBlocks.load();
        AdvancedVanillaStorageBlocks.load();
        AdvancedVanillaProductionBlocks.load();
        AdvancedVanillaDistributionBlocks.load();
        AdvancedVanillaPowerBlocks.load();
        AdvancedVanillaCraftingBlocks.load();
    }
}
