package xyz.blurryface.iconitems.lang;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import xyz.blurryface.iconitems.datagen.IconitemsDataGen;

import java.util.HashMap;
import java.util.Map;

public class LanguageProvider {
    public final String lang;
    private final Map<String, String> translations = new HashMap<>();

    public static final LanguageProvider EN_US = new LanguageProvider("en_us");

    public LanguageProvider(String lang) {
        this.lang = lang;
        IconitemsDataGen.addLanguageProvider(this);
    }

    public void addTranslation(String key, String translated) {
        translations.put(key, translated);
    }

    public void generateTranslations(FabricLanguageProvider.TranslationBuilder builder) {
        translations.forEach(builder::add);
    }
}
