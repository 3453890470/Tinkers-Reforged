package mrthomas20121.tinkers_reforged.datagen;

import mrthomas20121.tinkers_reforged.TinkersReforged;
import mrthomas20121.tinkers_reforged.init.CastType;
import mrthomas20121.tinkers_reforged.init.*;
import mrthomas20121.tinkers_reforged.item.CastObject;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import org.apache.commons.lang3.StringUtils;
import slimeknights.mantle.registration.object.FluidObject;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

public class ReforgedLang extends LanguageProvider {

    public ReforgedLang(DataGenerator gen) {
        super(gen, TinkersReforged.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addGroup("Tinkers Reforged Items");
        add("pattern.tinkers_reforged.great_blade", "Great Blade Pattern");
        add("pattern.tinkers_reforged.large_round_plate", "Large Round Plate Pattern");
        addItem(TinkersReforgedItems.book, "Reforging Guide");
        addItem(TinkersReforgedItems.GREAT_BLADE, "Great Blade");
        addItem(TinkersReforgedItems.LARGE_ROUND_PLATE, "Large Round Plate");
        addItem(TinkersReforgedItems.FRYING_PAN, "Frying Pan");
        addItem(TinkersReforgedItems.GREATSWORD, "Greatsword");
        add("item.tinkers_reforged.frying_pan.description", "a weapon with burning and healing capabilities.");
        add("item.tinkers_reforged.great_sword.description", "a weapon with knockback");
        addBlock(TinkersReforgedBlocks.aluminum_block, "Aluminum Block");
        addBlock(TinkersReforgedBlocks.aluminum_ore, "Bauxite Ore");
        addBlock(TinkersReforgedBlocks.deepslate_aluminum_ore, "Deepslate Bauxite Ore");
        addItem(TinkersReforgedItems.aluminum_dust, "Aluminum Dust");
        addItem(TinkersReforgedItems.aluminum_ingot, "Aluminum Ingot");
        addItem(TinkersReforgedItems.aluminum_nugget, "Aluminum Nugget");
        addBlock(TinkersReforgedBlocks.duralumin_block, "Duralumin Block");
        addItem(TinkersReforgedItems.duralumin_dust, "Duralumin Dust");
        addItem(TinkersReforgedItems.duralumin_ingot, "Duralumin Ingot");
        addItem(TinkersReforgedItems.duralumin_nugget, "Duralumin Nugget");
        addBlock(TinkersReforgedBlocks.electrical_copper_block, "Electrical Copper Block");
        addItem(TinkersReforgedItems.electrical_copper_dust, "Electrical Copper Dust");
        addItem(TinkersReforgedItems.electrical_copper_ingot, "Electrical Copper Ingot");
        addItem(TinkersReforgedItems.electrical_copper_nugget, "Electrical Copper Nugget");
        addBlock(TinkersReforgedBlocks.lavium_block, "Lavium Block");
        addItem(TinkersReforgedItems.lavium_dust, "Lavium Dust");
        addItem(TinkersReforgedItems.lavium_ingot, "Lavium Ingot");
        addItem(TinkersReforgedItems.lavium_nugget, "Lavium Nugget");
        addBlock(TinkersReforgedBlocks.qivium_block, "Qivium Block");
        addItem(TinkersReforgedItems.qivium_dust, "Qivium Dust");
        addItem(TinkersReforgedItems.qivium_ingot, "Qivium Ingot");
        addItem(TinkersReforgedItems.qivium_nugget, "Qivium Nugget");
        addBlock(TinkersReforgedBlocks.gausum_block, "Gausum Block");
        addItem(TinkersReforgedItems.gausum_dust, "Gausum Dust");
        addItem(TinkersReforgedItems.gausum_ingot, "Gausum Ingot");
        addItem(TinkersReforgedItems.gausum_nugget, "Gausum Nugget");
        addBlock(TinkersReforgedBlocks.felsteel_block, "Felsteel Block");
        addItem(TinkersReforgedItems.felsteel_dust, "Felsteel Dust");
        addItem(TinkersReforgedItems.felsteel_ingot, "Felsteel Ingot");
        addItem(TinkersReforgedItems.kepu_ore, "Kepu Ore");
        addBlock(TinkersReforgedBlocks.kepu_block, "Kepu Block");
        addItem(TinkersReforgedItems.kepu_dust, "Kepu Dust");
        addItem(TinkersReforgedItems.kepu_ingot, "Kepu Ingot");
        addItem(TinkersReforgedItems.kepu_nugget, "Kepu Nugget");
        addBlock(TinkersReforgedBlocks.chorus_metal_block, "Chorus Metal Block");
        addItem(TinkersReforgedItems.chorus_metal_dust, "Chorus Metal Dust");
        addItem(TinkersReforgedItems.chorus_metal_ingot, "Chorus Metal Ingot");
        addItem(TinkersReforgedItems.chorus_metal_nugget, "Chorus Metal Nugget");
        addBlock(TinkersReforgedBlocks.durasteel_block, "Durasteel Block");
        addItem(TinkersReforgedItems.durasteel_dust, "Durasteel Dust");
        addItem(TinkersReforgedItems.durasteel_ingot, "Durasteel Ingot");
        addItem(TinkersReforgedItems.durasteel_nugget, "Durasteel Nugget");
        addBlock(TinkersReforgedBlocks.crusteel_block, "Crusteel Block");
        addItem(TinkersReforgedItems.crusteel_dust, "Crusteel Dust");
        addItem(TinkersReforgedItems.crusteel_ingot, "Crusteel Ingot");
        addItem(TinkersReforgedItems.crusteel_nugget, "Crusteel Nugget");
        addBlock(TinkersReforgedBlocks.wavy_block, "Wavy Block");
        addItem(TinkersReforgedItems.wavy_dust, "Wavy Dust");
        addItem(TinkersReforgedItems.wavy_ingot, "Wavy Ingot");
        addItem(TinkersReforgedItems.wavy_nugget, "Wavy Nugget");
        addBlock(TinkersReforgedBlocks.yokel_block, "Yokel Block");
        addItem(TinkersReforgedItems.yokel_dust, "Yokel Dust");
        addItem(TinkersReforgedItems.yokel_ingot, "Yokel Ingot");
        addItem(TinkersReforgedItems.yokel_nugget, "Yokel Nugget");
        addItem(TinkersReforgedItems.raw_aluminum, "Raw Bauxite");
        addItem(TinkersReforgedItems.raw_kepu, "Raw Kepu");
        addBlock(TinkersReforgedBlocks.raw_aluminum_block, "Raw Bauxite Block");
        addBlock(TinkersReforgedBlocks.raw_kepu_block, "Raw Kepu Block");

        addCast(TinkersReforgedItems.great_blade_cast);
        addCast(TinkersReforgedItems.large_round_plate_cast);

        addFluid(TinkersReforgedFluids.redstone, "Liquid Redstone");
        addFluid(TinkersReforgedFluids.duralumin, "Molten Duralumin");
        addFluid(TinkersReforgedFluids.electrical_copper, "Molten Electrical Copper");
        addFluid(TinkersReforgedFluids.lavium, "Molten Lavium");
        addFluid(TinkersReforgedFluids.qivium, "Molten Qivium");
        addFluid(TinkersReforgedFluids.blazing_copper, "Molten Blazing Copper");
        addFluid(TinkersReforgedFluids.gausum, "Molten Gausum");
        addFluid(TinkersReforgedFluids.lapis, "Molten Lapis");
        addFluid(TinkersReforgedFluids.felsteel, "Molten Felsteel");
        addFluid(TinkersReforgedFluids.kepu, "Molten Kepu");
        addFluid(TinkersReforgedFluids.chorus_metal, "Molten Chorus Metal");
        addFluid(TinkersReforgedFluids.chorus, "Molten Chorus");
        addFluid(TinkersReforgedFluids.shulker, "Molten Shulker");
        addFluid(TinkersReforgedFluids.kelp, "Molten Kelp");
        addFluid(TinkersReforgedFluids.durasteel, "Molten Durasteel");
        addFluid(TinkersReforgedFluids.crusteel, "Molten Crusteel");
        addFluid(TinkersReforgedFluids.wavy, "Molten Wavy");
        addFluid(TinkersReforgedFluids.yokel, "Molten Yokel");
        addFluid(TinkersReforgedFluids.proto_lava, "Molten Proto Lava");

        add(TinkersReforgedFluids.redstone.get().getBucket(), "Liquid Redstone Bucket");
        add(TinkersReforgedFluids.duralumin.get().getBucket(), "Molten Duralumin Bucket");
        add(TinkersReforgedFluids.electrical_copper.get().getBucket(), "Molten Electrical Copper Bucket");
        add(TinkersReforgedFluids.lavium.get().getBucket(), "Molten Lavium Bucket");
        add(TinkersReforgedFluids.qivium.get().getBucket(), "Molten Qivium Bucket");
        add(TinkersReforgedFluids.gausum.get().getBucket(), "Molten Gausum Bucket");
        add(TinkersReforgedFluids.lapis.get().getBucket(), "Molten Lapis Bucket");
        add(TinkersReforgedFluids.blazing_copper.get().getBucket(), "Molten Blazing Copper Bucket");
        add(TinkersReforgedFluids.felsteel.get().getBucket(), "Molten Felsteel Bucket");
        add(TinkersReforgedFluids.kepu.get().getBucket(), "Molten Kepu Bucket");
        add(TinkersReforgedFluids.chorus_metal.get().getBucket(), "Molten Chorus Metal Bucket");
        add(TinkersReforgedFluids.chorus.get().getBucket(), "Molten Chorus Bucket");
        add(TinkersReforgedFluids.shulker.get().getBucket(), "Molten Shulker Bucket");
        add(TinkersReforgedFluids.durasteel.get().getBucket(), "Molten Durasteel Bucket");
        add(TinkersReforgedFluids.kelp.get().getBucket(), "Molten Kelp Bucket");
        add(TinkersReforgedFluids.crusteel.get().getBucket(), "Molten Crusteel Bucket");
        add(TinkersReforgedFluids.wavy.get().getBucket(), "Molten Wavy Bucket");
        add(TinkersReforgedFluids.yokel.get().getBucket(), "Molten Yokel Bucket");
        add(TinkersReforgedFluids.proto_lava.get().getBucket(), "Molten Proto Lava Bucket");

        add("effect.tinkers_reforged.electro_web", "Electro Web");
        add("effect.tinkers_reforged.fungal", "Fungal");

        for(CastType type: CastType.values()) {
            Item item = TinkersReforgedItems.casts.get(type).get();
            add(item, String.format("%s Aluminum Cast", capitalize(type.name().toLowerCase())));
        }

        addMaterial(ReforgedMaterials.duralumin, "Duralumin", "One of the earliest types of age-hardenable aluminum alloys", "German metal");
        addMaterial(ReforgedMaterials.electrical_copper, "Electrical Copper", "It's not as electric as people think", "Copper that was Electrified");
        addMaterial(ReforgedMaterials.lavium, "Lavium", "Cobalt Alloy", "Strong Cobalt Alloy");
        addMaterial(ReforgedMaterials.qivium, "Qivium", "Cobalt Alloy", "Strong Cobalt Alloy");
        addMaterial(ReforgedMaterials.gausum, "Gausum", "Ancient Debris Alloy", "Strong Ancient Debris Alloy");
        addMaterial(ReforgedMaterials.felsteel, "Felsteel", "Ancient Debris Alloy", "From the depth of the nether");
        addMaterial(ReforgedMaterials.chorus_metal, "Chorus Metal", "Chorus and Shulker alloy", "Chorus and Shulker alloy");
        addMaterial(ReforgedMaterials.kepu, "Kepu", "Come from the depth of the end", "Infused End Ore");
        addMaterial(ReforgedMaterials.durasteel, "Durasteel", "Wait it's not an ore?", "Mix of Ender and Netherite");
        addMaterial(ReforgedMaterials.crusteel, "Crusteel", "Nether Crust", "Copper nether alloy");
        addMaterial(ReforgedMaterials.wavy, "Wavy", "This smell bad", "Mushroom material");
        addMaterial(ReforgedMaterials.yokel, "Yokel", "Finally a sea metal", "Kelp alloy");

        addModifier(TinkersReforgedModifiers.gausum_titanic_damage, "Titanic Damage", "that's a lot of damage!", "Deal more damage to enemy with more HP than you.");
        addModifier(TinkersReforgedModifiers.lavium_aridzone, "Arid Zone", "That's quite hot!", "Increase mining speed and damage in hot/arid area");
        addModifier(TinkersReforgedModifiers.duralumin_ultra_durable, "Ultra Durable", "Anyone need Duritos?", "Your tool last longer most of the time.");
        addModifier(TinkersReforgedModifiers.electrical_copper_electro_web, "Electro Web", "Shocking isn't it?", "Apply Electro Web to an entity after hit.");
        addModifier(TinkersReforgedModifiers.qivium_blazing_fire, "Burning Capacitor", "Overpowered!", "Repair the tool when you are on fire.");
        addModifier(TinkersReforgedModifiers.felsteel_fel_debris, "Fel Debris", "Watch out!", "Deal more damage to things in the nether but deal less damage to things in the end.");
        addModifier(TinkersReforgedModifiers.chorus_metal_levitating_blob, "Levitating Blob", "It's yours my friend!", "Spawn a Shulker blob on hit.");
        addModifier(TinkersReforgedModifiers.kepu_damage_lock, "Damage Lock", "No Damage?", "Your weapon can only do damage in the end.");
        addModifier(TinkersReforgedModifiers.cutting_edge, "Cutting Edge", "That's a lot of damage!", "Deal 10% more damage.");
        addModifier(TinkersReforgedModifiers.durasteel_adapting, "Adapting", "1up", "Each mob killed increase your stats by 0.1.");
        addModifier(TinkersReforgedModifiers.giant_cells, "Giant Cells", "Micro Friends", "Mine Faster the lower your Health are.");
        addModifier(TinkersReforgedModifiers.terra, "Terra", "Caught between a rock and a hard place.", "Mine stone blocks faster(controlled by a tag)");
        addModifier(TinkersReforgedModifiers.spore_shot, "Spore Shot", "MMM Mushrooms.", "Apply Fungal on it. Entity with fungal take 2% of their health as damage when hit.");

        add("modifier.tinkers_reforged.adapting.attack_damage", "Adapting damage");
        add("modifier.tinkers_reforged.adapting.mining_speed", "Adapting mining speed");
        add("modifier.tinkers_reforged.fel_debris.bonus", "Damage in the current dimension");
        add("modifier.tinkers_reforged.arid_zone.attack_damage", "Bonus damage in the current biome");
        add("modifier.tinkers_reforged.arid_zone.mining_speed", "Bonus mining speed in the current biome");
        add("modifier.tinkers_reforged.damage_lock.end_bonus", "Bonus Attack Damage in the end");
        add("modifier.tinkers_reforged.giant_cells.mining_speed", "Bonus mining speed");
        add("modifier.tinkers_reforged.adapting.cap", "You have reach the max bonus you can get with adapting");
    }

    public void addCast(CastObject object) {
        addItem(object.getGoldCast(), capitalize(object.getName().getPath()));
        addItem(object.getSandCast(), "Sand "+capitalize(object.getName().getPath()));
        addItem(object.getRedSandCast(), "Red Sand "+capitalize(object.getName().getPath()));
    }

    public void addMaterial(MaterialId material, String name, String flavour, String desc) {
        String id = material.getPath();
        add("material.tinkers_reforged." + id, name);
        if (!flavour.equals(""))
            add("material.tinkers_reforged." + id + ".flavor", flavour);
        if (!desc.equals(""))
            add("material.tinkers_reforged." + id + ".encyclopedia", desc);
    }

    public void addModifier(StaticModifier<Modifier> modifier, String name, String flavour, String desc) {
        String id = modifier.getId().getPath();
        add("modifier.tinkers_reforged." + id, name);
        add("modifier.tinkers_reforged." + id + ".flavor", flavour);
        add("modifier.tinkers_reforged." + id + ".description", desc);
    }

    public void addFluid(FluidObject<ForgeFlowingFluid> supplier, String name) {
        add(String.format("fluid.%s.%s", TinkersReforged.MOD_ID, supplier.getId().getPath().replace("_flowing", "")), name);
    }

    public void addGroup(String value) {
        add(String.format("itemGroup.%s", TinkersReforged.MOD_ID), value);
    }

    public String capitalize(String input) {
        if(input.contains("_")) {
            String[] split = input.split("_");
            StringBuilder output = new StringBuilder();
            for(String s : split) {
                output.append(StringUtils.capitalize(s));
                output.append(" ");
            }
            return output.toString().trim();
        }
        return StringUtils.capitalize(input);
    }
}
