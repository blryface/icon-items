package xyz.blurryface.iconitems;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.blurryface.iconitems.item.ModItems;

public class Iconitems implements ModInitializer {
	public static final String MOD_ID = "iconitems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
