/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.WindowScreen
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.utils.misc.Names
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.registry.Registry
 *  net.minecraft.util.Identifier
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.tag.EnchantmentTags
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.IIiiIiiiii;
import com.github.mikumiku.addon.IiIiIiIiII;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIIiiIIIii;
import com.github.mikumiku.addon.iIiIIIiiiI;
import java.util.ArrayList;
import java.util.Date;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.WindowScreen;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.input.WTextBox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.utils.misc.Names;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.EnchantmentTags;

public class IiiIiIiIii
extends WindowScreen {
    private final GuiTheme iiiiiIIiiI;
    private final IiIiIiIiII iiIIIIiIII;
    private final boolean IiIIiIiiiI;
    private String ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WTable wTable) {
        class_6880 class_68804;
        ArrayList<class_6880> arrayList;
        Object object;
        IiiIiIiIii iiiIiIiIii = object;
        if (MeteorClient.mc.world == null) {
            return;
        }
        class_2378<class_1887> class_23782 = IiiiIiiIII.ALLATORIxDEMO();
        ArrayList<class_6880> arrayList2 = new ArrayList<class_6880>();
        class_2378<class_1887> class_23783 = class_23782;
        if (iiiIiIiIii.IiIIiIiiiI) {
            object = class_23783.iterateEntries(class_9636.TRADEABLE);
            object.forEach(arrayList2::add);
            arrayList = arrayList2;
        } else {
            object = class_23783.getIndexedEntries().iterator();
            Object object2 = object;
            while (object2.hasNext()) {
                class_68804 = (class_6880)object.next();
                object2 = object;
                arrayList2.add(class_68804);
            }
            arrayList = arrayList2;
        }
        object = arrayList.stream().sorted((class_68802, class_68803) -> {
            class_6880 IiIIiIiiiI = class_68803;
            class_6880 IiIIiIiiiI2 = class_68802;
            return Names.get((class_6880)IiIIiIiiiI2).compareToIgnoreCase(Names.get((class_6880)IiIIiIiiiI));
        }).toList().iterator();
        Object object3 = object;
        while (object3.hasNext()) {
            void IiIIiIiiiI;
            class_68804 = (class_6880)object.next();
            if (!iiiIiIiIii.ALLATORIxDEMO.isEmpty() && !Names.get((class_6880)class_68804).toLowerCase().startsWith(iiiIiIiIii.ALLATORIxDEMO.toLowerCase())) {
                object3 = object;
                continue;
            }
            IiIIiIiiiI.add((WWidget)iiiIiIiIii.iiiiiIIiiI.label(Names.get((class_6880)class_68804))).expandCellX();
            ((WButton)IiIIiIiiiI.add((WWidget)iiiIiIiIii.iiiiiIIiiI.button((String)IIIIiiiIIi.ALLATORIxDEMO((String)"\u9051\u62da"))).widget()).action = () -> {
                void IiIIiIiiiI;
                IiiIiIiIii iiiIiIiIii = iiiIiIiIii2;
                IiiIiIiIii iiiIiIiIii2 = class_68804;
                IiiIiIiIii IiIIiIiiiI2 = iiiIiIiIii;
                IiIIiIiiiI2.iiIIIIiIII.ALLATORIxDEMO(new iIIiiIIIii(IiIIiIiiiI.getId((Object)((class_1887)iiiIiIiIii2.comp_349())), ((class_1887)iiiIiIiIii2.comp_349()).getMaxLevel(), IIiiIiiiii.ALLATORIxDEMO((class_6880<class_1887>)iiiIiIiIii2), (2 ^ 3) != 0));
                IiIIiIiiiI2.close();
            };
            object3 = object;
            IiIIiIiiiI.row();
        }
    }

    public void initWidgets() {
        IiiIiIiIii iiiIiIiIii;
        IiiIiIiIii iiiIiIiIii2 = iiiIiIiIii = iiiIiIiIii6;
        WTable wTable = iiiIiIiIii2.iiiiiIIiiI.table();
        iiiIiIiIii2.iiiiiIIiiI.table().minWidth = 400.0;
        IiiIiIiIii iiiIiIiIii3 = iiiIiIiIii;
        IiiIiIiIii iiiIiIiIii4 = iiiIiIiIii6 = (WTextBox)iiiIiIiIii3.add((WWidget)iiiIiIiIii2.iiiiiIIiiI.textBox(iiiIiIiIii3.ALLATORIxDEMO, iIiIIIiiiI.ALLATORIxDEMO("\u645a\u7d15"))).minWidth(400.0).expandX().widget();
        iiiIiIiIii6.setFocused(--1 != 0);
        iiiIiIiIii4.setCursorMax();
        ((WTextBox)iiiIiIiIii4).action = () -> iiiIiIiIii.ALLATORIxDEMO((WTextBox)iiiIiIiIii4, wTable);
        IiiIiIiIii iiiIiIiIii5 = iiiIiIiIii;
        IiiIiIiIii iiiIiIiIii6 = (WHorizontalList)iiiIiIiIii5.add((WWidget)iiiIiIiIii5.iiiiiIIiiI.horizontalList()).expandX().widget();
        WTextBox wTextBox = (WTextBox)iiiIiIiIii6.add((WWidget)iiiIiIiIii.iiiiiIIiiI.textBox("", IIIIiiiIIi.ALLATORIxDEMO("\u81d9\u5bc2\u4e7a"))).expandX().expandWidgetX().widget();
        ((WButton)iiiIiIiIii6.add((WWidget)iiiIiIiIii.iiiiiIIiiI.button((String)iIiIIIiiiI.ALLATORIxDEMO((String)"\u904f\u62de"))).widget()).action = () -> {
            IiiIiIiIii iiiIiIiIii = iiiIiIiIii2;
            IiiIiIiIii iiiIiIiIii2 = wTextBox;
            IiiIiIiIii IiIIiIiiiI = iiiIiIiIii;
            if (iiiIiIiIii2.get().isEmpty()) {
                return;
            }
            if ((iiiIiIiIii2 = class_2960.tryParse((String)iiiIiIiIii2.get())) == null) {
                return;
            }
            IiiIiIiIii iiiIiIiIii3 = IiIIiIiiiI;
            iiiIiIiIii3.iiIIIIiIII.ALLATORIxDEMO(new iIIiiIIIii((class_2960)iiiIiIiIii2, 3 & 4, 3 & 4, --1 != 0));
            iiiIiIiIii3.close();
        };
        iiiIiIiIii.add((WWidget)wTable);
        iiiIiIiIii.ALLATORIxDEMO(wTable);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WTextBox wTextBox, WTable wTable) {
        void IiIIiIiiiI;
        IiiIiIiIii iiiIiIiIii = iiiIiIiIii2;
        IiiIiIiIii iiiIiIiIii2 = wTable;
        IiiIiIiIii IiIIiIiiiI2 = iiiIiIiIii;
        IiiIiIiIii iiiIiIiIii3 = iiiIiIiIii2;
        IiIIiIiiiI2.ALLATORIxDEMO = IiIIiIiiiI.get().trim();
        iiiIiIiIii3.clear();
        IiIIiIiiiI2.ALLATORIxDEMO((WTable)iiiIiIiIii3);
    }

    /*
     * WARNING - void declaration
     */
    public IiiIiIiIii(GuiTheme guiTheme, boolean bl, IiIiIiIiII iiIiIiIiII) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IiiIiIiIii IiIIiIiiiI3;
        IiiIiIiIii iiiIiIiIii = iiiIiIiIii2;
        IiiIiIiIii iiiIiIiIii2 = guiTheme;
        IiiIiIiIii iiiIiIiIii3 = IiIIiIiiiI3 = iiiIiIiIii;
        IiiIiIiIii iiiIiIiIii4 = IiIIiIiiiI3;
        super((GuiTheme)iiiIiIiIii2, iIiIIIiiiI.ALLATORIxDEMO("\u904f\u62de\u9602\u9b63"));
        iiiIiIiIii4.ALLATORIxDEMO = "";
        iiiIiIiIii4.iiiiiIIiiI = iiiIiIiIii2;
        iiiIiIiIii3.iiIIIIiIII = IiIIiIiiiI2;
        iiiIiIiIii3.IiIIiIiiiI = IiIIiIiiiI;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIIiiiIIi.ALLATORIxDEMO("\u000fXz\u0015\u000bvxF(W\u0019g=\u0012X\u8be4\u66ac\u6583\u5248\u6713\u65e8\u727b\u6774\uff32"));
        }
    }
}

