/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.renderer.GuiRenderer
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox$Renderer
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WMinus
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WPlus
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtString
 *  net.minecraft.nbt.NbtElement
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIiiIi;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiIiiIIiIi;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.renderer.GuiRenderer;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.input.WTextBox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.gui.widgets.pressable.WMinus;
import meteordevelopment.meteorclient.gui.widgets.pressable.WPlus;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtString;
import net.minecraft.nbt.NbtElement;

public class IIiiIiIIIi
extends Setting<Map<String, String>> {
    public final Class<? extends WTextBox.Renderer> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(GuiTheme guiTheme, WTable wTable, IIiiIiIIIi iIiiIiIIIi) {
        String string;
        WButton wButton;
        void IiIIiIiiiI;
        GuiTheme IiIIiIiiiI3 = wTable;
        GuiTheme IiIIiIiiiI4 = guiTheme;
        IiIIiIiiiI3.clear();
        Map map = (Map)IiIIiIiiiI.get();
        WButton wButton2 = wButton = map.keySet().iterator();
        while (wButton2.hasNext()) {
            string = (String)wButton.next();
            AtomicReference<String> atomicReference = new AtomicReference<String>(string);
            ((WTextBox)IiIIiIiiiI3.add((WWidget)IiIIiIiiiI4.textBox(atomicReference.get())).minWidth(150.0).expandX().widget()).actionOnUnfocused = () -> IIiiIiIIIi.ALLATORIxDEMO((WTextBox)IiIIiIiiiI3.add((WWidget)IiIIiIiiiI4.textBox(atomicReference.get())).minWidth(150.0).expandX().widget(), map, atomicReference);
            WTextBox wTextBox = (WTextBox)IiIIiIiiiI3.add((WWidget)IiIIiIiiiI4.textBox((String)map.get(atomicReference.get()), (IiIIiIiiiI2, c) -> {
                char IiIIiIiiiI2 = c;
                String IiIIiIiiiI3 = IiIIiIiiiI2;
                return --1 != 0;
            }, IiIIiIiiiI.ALLATORIxDEMO)).minWidth(150.0).expandX().widget();
            wTextBox.actionOnUnfocused = () -> {
                void IiIIiIiiiI;
                Map IiIIiIiiiI2 = wTextBox;
                Map IiIIiIiiiI3 = map;
                IiIIiIiiiI3.replace((String)IiIIiIiiiI.get(), IiIIiIiiiI2.get());
            };
            ((WMinus)IiIIiIiiiI3.add((WWidget)IiIIiIiiiI4.minus()).widget()).action = () -> IIiiIiIIIi.ALLATORIxDEMO(map, atomicReference, IiIIiIiiiI4, (WTable)IiIIiIiiiI3, (IIiiIiIIIi)IiIIiIiiiI);
            wButton2 = wButton;
            IiIIiIiiiI3.row();
        }
        if (!map.isEmpty()) {
            IiIIiIiiiI3.add((WWidget)IiIIiIiiiI4.horizontalSeparator()).expandX();
            IiIIiIiiiI3.row();
        }
        wButton = (WButton)IiIIiIiiiI3.add((WWidget)IiIIiIiiiI4.button(GuiRenderer.RESET)).widget();
        ((WButton)IiIIiIiiiI3.add((WWidget)IiIIiIiiiI4.button(GuiRenderer.RESET)).widget()).action = () -> IIiiIiIIIi.ALLATORIxDEMO((IIiiIiIIIi)IiIIiIiiiI, IiIIiIiiiI4, (WTable)IiIIiIiiiI3);
        string = (WPlus)IiIIiIiiiI3.add((WWidget)IiIIiIiiiI4.plus()).widget();
        ((WPlus)IiIIiIiiiI3.add((WWidget)IiIIiIiiiI4.plus()).widget()).action = () -> IIiiIiIIIi.ALLATORIxDEMO(map, IiIIiIiiiI4, (WTable)IiIIiIiiiI3, (IIiiIiIIIi)IiIIiIiiiI);
        IiIIiIiiiI3.row();
    }

    /*
     * WARNING - void declaration
     */
    public IIiiIiIIIi(String string, String string2, Map<String, String> map, Consumer<Map<String, String>> consumer, Consumer<Setting<Map<String, String>>> consumer2, IVisible iVisible, Class<? extends WTextBox.Renderer> clazz) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        void IiIIiIiiiI6;
        IIiiIiIIIi iIiiIiIIIi = object;
        Object object = clazz;
        IIiiIiIIIi IiIIiIiiiI7 = iIiiIiIIIi;
        super((String)IiIIiIiiiI6, (String)IiIIiIiiiI5, (Object)IiIIiIiiiI4, (Consumer)IiIIiIiiiI3, (Consumer)IiIIiIiiiI2, (IVisible)IiIIiIiiiI);
        IiIIiIiiiI7.ALLATORIxDEMO = object;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIiIi.ALLATORIxDEMO("\u0017H\u0002e4AgQ7@\u0006pWpG\u8bf3\u6694\u65b3\u5257\u6704\u65ca\u7251\u671c\uff52"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map object, AtomicReference atomicReference, GuiTheme guiTheme, WTable wTable, IIiiIiIIIi iIiiIiIIIi) {
        Map IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        Map map = object;
        object = iIiiIiIIIi;
        Map IiIIiIiiiI5 = map;
        IiIIiIiiiI5.remove(IiIIiIiiiI4.get());
        IIiiIiIIIi.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI3, (WTable)IiIIiIiiiI2, (IIiiIiIIIi)((Object)IiIIiIiiiI));
    }

    public Map<String, String> ALLATORIxDEMO(class_2487 class_24872) {
        class_2487 IiIIiIiiiI;
        IIiiIiIIIi iIiiIiIIIi = iterator;
        ((Map)iIiiIiIIIi.get()).clear();
        IiIIiIiiiI = IiiiIiiIII.ALLATORIxDEMO(IiIIiIiiiI, IiIiiIiiIi.ALLATORIxDEMO("&\u0016\u001b"));
        Iterator iterator = IiIIiIiiiI.getKeys().iterator();
        Object object = iterator;
        while (object.hasNext()) {
            String string;
            String string2 = string = (String)iterator.next();
            ((Map)iIiiIiIIIi.get()).put(string2, IiIIiIiiiI.getString(string2));
            object = iterator;
        }
        return (Map)iIiiIiIIIi.get();
    }

    public Map<String, String> ALLATORIxDEMO(String string) {
        IIiiIiIIIi iIiiIiIIIi = object;
        Object object = string;
        IIiiIiIIIi IiIIiIiiiI = iIiiIiIIIi;
        object = ((String)object).split(IiIiiIiiIi.ALLATORIxDEMO("G"));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>(((Object)object).length / (5 >> 1));
        try {
            Object object2 = null;
            for (int i = 2 & 5; i < ((Object)object).length; ++i) {
                if (i % (1 ^ 3) == 0) {
                    object2 = object[i];
                    continue;
                }
                linkedHashMap.put((String)object2, (String)object[i]);
            }
        } catch (Exception exception) {
            // empty catch block
        }
        return linkedHashMap;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(IIiiIiIIIi iIiiIiIIIi, GuiTheme guiTheme, WTable wTable) {
        void IiIIiIiiiI;
        IIiiIiIIIi IiIIiIiiiI2 = wTable;
        IIiiIiIIIi IiIIiIiiiI3 = iIiiIiIIIi;
        IiIIiIiiiI3.reset();
        IIiiIiIIIi.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WTable)IiIIiIiiiI2, IiIIiIiiiI3);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(WTextBox wTextBox, Map map, AtomicReference atomicReference) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        WTextBox wTextBox2 = wTextBox;
        Object IiIIiIiiiI3 = wTextBox2.get();
        if (IiIIiIiiiI2.containsKey(IiIIiIiiiI3)) {
            wTextBox2.set((String)IiIIiIiiiI.get());
            return;
        }
        String string = (String)IiIIiIiiiI2.remove(IiIIiIiiiI.get());
        Object object = IiIIiIiiiI3;
        IiIIiIiiiI.set(object);
        IiIIiIiiiI2.put(object, string);
    }

    /*
     * WARNING - void declaration
     */
    public class_2487 save(class_2487 class_24872) {
        void IiIIiIiiiI;
        Iterator iterator;
        IIiiIiIIIi iIiiIiIIIi = object;
        class_2487 class_24873 = new class_2487();
        Iterator iterator2 = iterator = ((Map)iIiiIiIIIi.get()).keySet().iterator();
        while (iterator2.hasNext()) {
            Object object = (String)iterator.next();
            class_24873.put((String)object, (class_2520)class_2519.of((String)((String)((Map)iIiiIiIIIi.get()).get(object))));
            iterator2 = iterator;
        }
        void v1 = IiIIiIiiiI;
        v1.put(iiIiiIIiIi.ALLATORIxDEMO("v\nx"), (class_2520)class_24873);
        return v1;
    }

    public void resetImpl() {
        IIiiIiIIIi iIiiIiIIIi = this;
        this.value = new LinkedHashMap((Map)this.defaultValue);
    }

    public boolean ALLATORIxDEMO(Map<String, String> object) {
        IIiiIiIIIi iIiiIiIIIi = object2;
        Object object2 = object;
        object = iIiiIiIIIi;
        return (3 & 5) != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map map, GuiTheme guiTheme, WTable wTable, IIiiIiIIIi iIiiIiIIIi) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        Object IiIIiIiiiI3 = iIiiIiIIIi;
        Map IiIIiIiiiI4 = map;
        IiIIiIiiiI4.put("", "");
        IIiiIiIIIi.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI2, (WTable)IiIIiIiiiI, (IIiiIiIIIi)((Object)IiIIiIiiiI3));
    }
}

