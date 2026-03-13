/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.screens.settings.RegistryListSettingScreen
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.client.resource.language.I18n
 *  net.minecraft.registry.Registry
 *  net.minecraft.village.VillagerProfession
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.IiiiIIiiIi;
import com.github.mikumiku.addon.iIIIIIIIiI;
import java.util.Collection;
import java.util.Date;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.screens.settings.RegistryListSettingScreen;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.registry.Registry;
import net.minecraft.village.VillagerProfession;
import net.minecraft.registry.Registries;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiiiIiiIi
extends RegistryListSettingScreen<class_3852> {
    public String ALLATORIxDEMO(class_3852 class_38522) {
        iIiiiIiiIi iIiiiIiiIi2 = iIiiiIiiIi3;
        iIiiiIiiIi iIiiiIiiIi3 = class_38522;
        iIiiiIiiIi IiIIiIiiiI = iIiiiIiiIi2;
        return iIiiiIiiIi3.comp_818();
    }

    /*
     * WARNING - void declaration
     */
    public boolean ALLATORIxDEMO(class_3852 class_38522) {
        void IiIIiIiiiI;
        iIiiiIiiIi iIiiiIiiIi2 = predicate;
        Predicate<class_3852> predicate = ((iIIIIIIIiI)iIiiiIiiIi2.setting).ALLATORIxDEMO;
        if (predicate != null && !predicate.test((class_3852)IiIIiIiiiI)) {
            return 5 >> 3;
        }
        if (IiIIiIiiiI != class_3852.NONE) {
            return 3 >> 1;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public iIiiiIiiIi(GuiTheme guiTheme, iIIIIIIIiI iIIIIIIIiI2) {
        void IiIIiIiiiI;
        iIiiiIiiIi iIiiiIiiIi2 = object;
        Object object = iIIIIIIIiI2;
        iIiiiIiiIi IiIIiIiiiI2 = iIiiiIiiIi2;
        Object object2 = object;
        super((GuiTheme)IiIIiIiiiI, IIiIIIiIii.ALLATORIxDEMO("\u904d\u62ea"), (Setting)object2, (Collection)object2.get(), (class_2378)class_7923.VILLAGER_PROFESSION);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiiIIiiIi.ALLATORIxDEMO("lF\u0019\u000bHH;xKIZY^\f;\u8bfa\u66cf\u659d\u520b\u672d\u65ab\u7245\u6717\uff2c"));
        }
    }

    public WWidget ALLATORIxDEMO(class_3852 class_38522) {
        iIiiiIiiIi iIiiiIiiIi2 = object;
        Object object = class_38522;
        iIiiiIiiIi IiIIiIiiiI = iIiiiIiiIi2;
        object = class_1074.translate((String)("entity.minecraft.villager." + object.comp_818()), (Object[])new Object[3 >> 2]);
        return IiIIiIiiiI.theme.label((String)object);
    }
}

