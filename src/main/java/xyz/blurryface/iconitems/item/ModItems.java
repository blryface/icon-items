package xyz.blurryface.iconitems.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.blurryface.iconitems.Iconitems;

public class ModItems {

    // items to register

    public static final Item MODRINTH = registerItem("modrinth", new Item(new FabricItemSettings())); // modrinth ITEM
    public static final Item CURSEFORGE = registerItem("curseforge", new Item(new FabricItemSettings())); // curseforge ITEM
    public static final Item PRIDECRAFT = registerItem("pridecraft", new Item(new FabricItemSettings())); // pridecraft ITEM
    public static final Item CRSS = registerItem("crss", new Item(new FabricItemSettings())); // crss ITEM
    public static final Item DRSS = registerItem("drss", new Item(new FabricItemSettings())); // drss ITEM
    public static final Item TCF = registerItem("tcf", new Item(new FabricItemSettings())); // tcf ITEM
    public static final Item MINECRAFTJAVA = registerItem("minecraft_java", new Item(new FabricItemSettings())); // Java Minecraft ITEM
    public static final Item MINECRAFTBEDROCK = registerItem("minecraft_bedrock", new Item(new FabricItemSettings())); // Bedrock Minecraft ITEM
    public static final Item DEVINREAL = registerItem("devin", new Item(new FabricItemSettings())); // DEVIN ITEM
    public static final Item MAYAREAL = registerItem("maya", new Item(new FabricItemSettings())); // MAYA ITEM
    public static final Item GITHUB = registerItem("github", new Item(new FabricItemSettings())); //Github item
    public static final Item ICONITEMS = registerItem("iconitems", new Item(new FabricItemSettings())); //MOD ICON item
    public static final Item JADE = registerItem("jade", new Item(new FabricItemSettings())); //Bribe to get approved in modrinth faster :troll:

    //0.2 items

    public static final Item PRISMLAUNCHER = registerItem("prismlauncher", new Item(new FabricItemSettings())); //prism logo item
    public static final Item STEAM = registerItem("steam", new Item(new FabricItemSettings())); //Steam logo
    public static final Item WHATSAPP = registerItem("whatsapp", new Item(new FabricItemSettings())); //Whatsapp logo
    public static final Item WINDOWS11 = registerItem("windows11", new Item(new FabricItemSettings())); //win11 logo
    public static final Item WINDOWS10 = registerItem("windows10", new Item(new FabricItemSettings())); //win10 logo
    public static final Item LINUX = registerItem("linux", new Item(new FabricItemSettings())); //Tux
    public static final Item MACOS = registerItem("macos", new Item(new FabricItemSettings())); //Latest macOS icon


    //modrinth staging items

    public static final Item STUFF = registerItem("stuff", new Item(new FabricItemSettings()));
    public static final Item IT_SUPPORT = registerItem("it_support", new Item(new FabricItemSettings()));
    public static final Item CAPITANSPARKLEZ = registerItem("CapitanSparklez", new Item(new FabricItemSettings()));
    public static final Item FELIXARGYLEWALLPAPERS_WALLPAPERCAVE = registerItem("felixargylewallpapers_wallpapercave", new Item(new FabricItemSettings()));

    // 10 message series
        //kuylar
    public static final Item KUYLAR_GAY_SEX = registerItem("kuylar_gay_sex", new Item(new FabricItemSettings()));
    public static final Item KUYLAR_YOU_HAVE_TO_ADD_IT_NOW = registerItem("kuylar_you_have_to_add_it_now", new Item(new FabricItemSettings()));
    public static final Item KUYLAR_NO = registerItem("kuylar_no", new Item(new FabricItemSettings()));
    public static final Item KIULAR_BOTH_OF_THEM = registerItem("kiular_both_of_them", new Item(new FabricItemSettings()));
    public static final Item KUYLAR_WITH_THE_REPLY = registerItem("kuylar_with_the_reply", new Item(new FabricItemSettings()));
    public static final Item FIVE_NIGHT_FREDDY = registerItem("five_night_freddy", new Item(new FabricItemSettings()));
    public static final Item KUYLAR_ADD_THAT_TOO = registerItem("kuylar_add_that_too", new Item(new FabricItemSettings()));
    public static final Item KUYLAR_YEAH_I_DO = registerItem("kuylar_yeah_i_do", new Item(new FabricItemSettings()));
    public static final Item KUYLAR_AND_IM_GONNA_FINISH_IT_WITH = registerItem("kuylar_and_im_gonna_finish_it_with", new Item(new FabricItemSettings()));
    public static final Item PLEADING_KUYLAR = registerItem("pleading_kuylar", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {  //makes the item appear on the Creative Inventory

        // staging items

        entries.add(STUFF);
        entries.add(IT_SUPPORT);
        entries.add(CAPITANSPARKLEZ);
        entries.add(FELIXARGYLEWALLPAPERS_WALLPAPERCAVE);
        entries.add(KUYLAR_GAY_SEX);
        entries.add(KUYLAR_YOU_HAVE_TO_ADD_IT_NOW);
        entries.add(KUYLAR_NO);
        entries.add(KIULAR_BOTH_OF_THEM);
        entries.add(KUYLAR_WITH_THE_REPLY);
        entries.add(FIVE_NIGHT_FREDDY);
        entries.add(KUYLAR_ADD_THAT_TOO);
        entries.add(KUYLAR_YEAH_I_DO);
        entries.add(KUYLAR_AND_IM_GONNA_FINISH_IT_WITH);
        entries.add(PLEADING_KUYLAR);

        // 0.1 items

        entries.add(MODRINTH);
        entries.add(CURSEFORGE);
        entries.add(PRIDECRAFT);
        entries.add(CRSS);
        entries.add(DRSS);
        entries.add(TCF);
        entries.add(MINECRAFTJAVA);
        entries.add(MINECRAFTBEDROCK);
        entries.add(DEVINREAL);
        entries.add(MAYAREAL);
        entries.add(GITHUB);
        entries.add(ICONITEMS);
        entries.add(JADE);

        //0.2 items

        entries.add(PRISMLAUNCHER);
        entries.add(STEAM);
        entries.add(WHATSAPP);
        entries.add(WINDOWS11);
        entries.add(WINDOWS10);
        entries.add(LINUX);
        entries.add(MACOS);

    }


    // thing that makes items register + log thing
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Iconitems.MOD_ID, name), item);
    }
    public static void registerModItems() {

        //Log messages and Ads

        Iconitems.LOGGER.info("Making items real :3");
        Iconitems.LOGGER.info("By the way, if you ever wanted to make your Minecraft more gay");
        Iconitems.LOGGER.info("Go download pridepack on https://pridecraft.gay/pridepack");
        Iconitems.LOGGER.info("  ");
        Iconitems.LOGGER.info("Running into performance issues?");
        Iconitems.LOGGER.info("Try Devin's Additive today!");
        Iconitems.LOGGER.info("https://modrinth.com/modpack/additive");


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }



}
