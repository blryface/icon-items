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
import xyz.blurryface.iconitems.lang.LanguageProvider;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    private static final List<Item> toAdd = new ArrayList<>();

    // items to register
    public static final Item MODRINTH = registerSimpleItem("modrinth", "Modrinth"); // modrinth ITEM
    public static final Item CURSEFORGE = registerSimpleItem("curseforge", "Curseforge"); // curseforge ITEM
    public static final Item PRIDECRAFT = registerSimpleItem("pridecraft", "Pridecraft"); // pridecraft ITEM
    public static final Item CRSS = registerSimpleItem("crss", "Crss"); // crss ITEM
    public static final Item DRSS = registerSimpleItem("drss", "Drss"); // drss ITEM
    public static final Item TCF = registerSimpleItem("tcf", "Tcf"); // tcf ITEM
    public static final Item MINECRAFTJAVA = registerSimpleItem("minecraft_java", "Minecraft: Java"); // Java Minecraft ITEM
    public static final Item MINECRAFTBEDROCK = registerSimpleItem("minecraft_bedrock", "Minecraft: Bedrock"); // Bedrock Minecraft ITEM
    public static final Item DEVINREAL = registerSimpleItem("devin", "Devin"); // DEVIN ITEM
    public static final Item MAYAREAL = registerSimpleItem("maya", "Maya"); // MAYA ITEM
    public static final Item GITHUB = registerSimpleItem("github", "Github"); //Github item
    public static final Item ICONITEMS = registerSimpleItem("iconitems", "Icon Items"); //MOD ICON item
    public static final Item JADE = registerSimpleItem("jade", "Jade"); //Bribe to get approved in modrinth faster :troll:

    //0.2 items

    public static final Item PRISMLAUNCHER = registerSimpleItem("prismlauncher", "Prism Launcher"); //prism logo item
    public static final Item STEAM = registerSimpleItem("steam", "Steam"); //Steam logo
    public static final Item WHATSAPP = registerSimpleItem("whatsapp", "WhatsApp"); //Whatsapp logo

    //--- **WINDOWS** --- //
    public static final Item WINDOWS11 = registerSimpleItem("windows11", "Windows 11"); //win11 logo
    public static final Item WINDOWS10 = registerSimpleItem("windows10", "Windows 10"); //win10 logo
    public static final Item WINDOWS_VISTA = registerSimpleItem("windows_vista", "Windows Vista");
    public static final Item WINDOWS_XP = registerSimpleItem("windows_xp", "Windows XP");
    public static final Item WINDOWS_NT = registerSimpleItem("windows_nt", "Windows NT");
    //--- **WINDOWS** --- //

    //--- **LINUX** --- //
    public static final Item LINUX = registerSimpleItem("linux", "Linux"); //Tux
    public static final Item ARCH_LINUX = registerSimpleItem("arch_linux", "Arch Linux");
    public static final Item UBUNTU = registerSimpleItem("ubuntu", "Ubuntu");
    public static final Item MANJARO = registerSimpleItem("manjaro", "Manjaro");
    public static final Item GARUDA = registerSimpleItem("garuda", "Garuda");
    public static final Item ALPINE = registerSimpleItem("alpine", "Alpine Linux");
    //--- **LINUX** --- //

    public static final Item MACOS = registerSimpleItem("macos", "MacOS"); //Latest macOS icon

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {  //makes the item appear on the Creative Inventory
        toAdd.forEach(entries::add);
    }

    //For items that need no additional configuration
    private static Item registerSimpleItem(String path, String engishName) {
        return registerItem(path, engishName, new Item(new FabricItemSettings()));
    }

    // thing that makes items register + log thing
    private static Item registerItem(String path, String englishName, Item item) {
        var registered = Registry.register(Registries.ITEM, new Identifier(Iconitems.MOD_ID, path), item);
        toAdd.add(registered);
        LanguageProvider.EN_US.addTranslation(registered.getTranslationKey(), englishName);
        return registered;
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
