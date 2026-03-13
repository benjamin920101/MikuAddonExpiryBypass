/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.renderer.GuiRenderer
 *  meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WMinus
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WPlus
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.ItemListSetting
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.item.Item
 *  net.minecraft.registry.Registry
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtList
 *  net.minecraft.nbt.NbtString
 *  net.minecraft.nbt.NbtElement
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.registry.Registries
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIIIiiiiII;
import com.github.mikumiku.addon.mixinface.MySettings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.renderer.GuiRenderer;
import meteordevelopment.meteorclient.gui.screens.settings.ItemListSettingScreen;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.input.WTextBox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.gui.widgets.pressable.WMinus;
import meteordevelopment.meteorclient.gui.widgets.pressable.WPlus;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.nbt.NbtElement;
import net.minecraft.util.Identifier;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.registry.Registries;

public class iIIIiIiiiI
extends Setting<Map<String, List<class_1792>>> {
    public final Predicate<class_1792> IiIIiIiiiI;
    private final boolean ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void IiiiiiiIIi(Map map, AtomicReference atomicReference, GuiTheme guiTheme, WTable wTable, iIIIiIiiiI iIIIiIiiiI2) {
        void IiIIiIiiiI;
        ItemListSettingScreen IiIIiIiiiI2;
        void IiIIiIiiiI3;
        Map IiIIiIiiiI4 = wTable;
        Map IiIIiIiiiI5 = map;
        List list = (List)IiIIiIiiiI5.get(IiIIiIiiiI3.get());
        IiIIiIiiiI4 = new ItemListSetting(iIIIiiiiII.ALLATORIxDEMO("\u0006\u001c\n%<"), "Items for key '" + (String)IiIIiIiiiI3.get() + "'", list, arg_0 -> iIIIiIiiiI.ALLATORIxDEMO(IiIIiIiiiI5, (AtomicReference)IiIIiIiiiI3, (GuiTheme)IiIIiIiiiI2, (WTable)IiIIiIiiiI4, (iIIIiIiiiI)IiIIiIiiiI, arg_0), null, null, IiIIiIiiiI.IiIIiIiiiI, (4 ^ 5) != 0);
        IiIIiIiiiI2 = new ItemListSettingScreen((GuiTheme)IiIIiIiiiI2, (ItemListSetting)IiIIiIiiiI4);
        IiIIiIiiiI2.onClosed(() -> iIIIiIiiiI.ALLATORIxDEMO(IiIIiIiiiI5, (AtomicReference)IiIIiIiiiI3, (ItemListSetting)IiIIiIiiiI4));
        class_310.getInstance().setScreen((class_437)IiIIiIiiiI2);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(iIIIiIiiiI iIIIiIiiiI2, GuiTheme guiTheme, WTable wTable) {
        void IiIIiIiiiI;
        iIIIiIiiiI IiIIiIiiiI2 = wTable;
        iIIIiIiiiI IiIIiIiiiI3 = iIIIiIiiiI2;
        IiIIiIiiiI3.reset();
        iIIIiIiiiI.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WTable)IiIIiIiiiI2, IiIIiIiiiI3);
    }

    /*
     * WARNING - void declaration
     */
    public class_2487 save(class_2487 class_24872) {
        void IiIIiIiiiI;
        iIIIiIiiiI iIIIiIiiiI2 = iIIIiIiiiI3;
        class_2487 class_24873 = new class_2487();
        for (Map.Entry entry : ((Map)iIIIiIiiiI2.get()).entrySet()) {
            iIIIiIiiiI iIIIiIiiiI3 = new class_2499();
            for (class_1792 class_17922 : (List)entry.getValue()) {
                if (!iIIIiIiiiI2.ALLATORIxDEMO && iIIIiIiiiI2.IiIIiIiiiI != null && !iIIIiIiiiI2.IiIIiIiiiI.test(class_17922)) continue;
                iIIIiIiiiI3.add(class_2519.of((String)class_7923.ITEM.getId((Object)class_17922).toString()));
            }
            if (iIIIiIiiiI3.isEmpty()) continue;
            class_24873.put((String)entry.getKey(), (class_2520)iIIIiIiiiI3);
        }
        void v0 = IiIIiIiiiI;
        v0.put(MySettings.ALLATORIxDEMO("DKILS"), (class_2520)class_24873);
        return v0;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map object, AtomicReference atomicReference, GuiTheme guiTheme, WTable wTable, iIIIiIiiiI iIIIiIiiiI2, List list) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        Map IiIIiIiiiI4;
        void IiIIiIiiiI5;
        Map map = object;
        object = list;
        Map IiIIiIiiiI6 = map;
        IiIIiIiiiI6.put((String)IiIIiIiiiI5.get(), IiIIiIiiiI4);
        iIIIiIiiiI.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI3, (WTable)IiIIiIiiiI2, (iIIIiIiiiI)IiIIiIiiiI);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map object, AtomicReference atomicReference, GuiTheme guiTheme, WTable wTable, iIIIiIiiiI iIIIiIiiiI2) {
        Map IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        Map map = object;
        object = iIIIiIiiiI2;
        Map IiIIiIiiiI5 = map;
        IiIIiIiiiI5.remove(IiIIiIiiiI4.get());
        iIIIiIiiiI.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI3, (WTable)IiIIiIiiiI2, (iIIIiIiiiI)((Object)IiIIiIiiiI));
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(GuiTheme guiTheme, WTable wTable, iIIIiIiiiI iIIIiIiiiI2) {
        String string;
        WButton wButton;
        void IiIIiIiiiI;
        GuiTheme IiIIiIiiiI2 = wTable;
        GuiTheme IiIIiIiiiI3 = guiTheme;
        IiIIiIiiiI2.clear();
        Map map = (Map)IiIIiIiiiI.get();
        WButton wButton2 = wButton = map.keySet().iterator();
        while (wButton2.hasNext()) {
            string = (String)wButton.next();
            AtomicReference<String> atomicReference = new AtomicReference<String>(string);
            ((WTextBox)IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.textBox(atomicReference.get())).minWidth(100.0).expandX().widget()).actionOnUnfocused = () -> iIIIiIiiiI.ALLATORIxDEMO((WTextBox)IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.textBox(atomicReference.get())).minWidth(100.0).expandX().widget(), map, atomicReference);
            Object object = (List)map.get(atomicReference.get());
            WButton wButton3 = (WButton)IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.button(MySettings.ALLATORIxDEMO("Js}{ph"))).minWidth(100.0).expandX().widget();
            object = "(" + object.size() + " items)";
            IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.label((String)object)).expandX().widget();
            wButton3.action = () -> iIIIiIiiiI.IiiiiiiIIi(map, atomicReference, IiIIiIiiiI3, (WTable)IiIIiIiiiI2, (iIIIiIiiiI)IiIIiIiiiI);
            ((WMinus)IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.minus()).widget()).action = () -> iIIIiIiiiI.ALLATORIxDEMO(map, atomicReference, IiIIiIiiiI3, (WTable)IiIIiIiiiI2, (iIIIiIiiiI)IiIIiIiiiI);
            wButton2 = wButton;
            IiIIiIiiiI2.row();
        }
        if (!map.isEmpty()) {
            IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.horizontalSeparator()).expandX();
            IiIIiIiiiI2.row();
        }
        wButton = (WButton)IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.button(GuiRenderer.RESET)).widget();
        ((WButton)IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.button(GuiRenderer.RESET)).widget()).action = () -> iIIIiIiiiI.ALLATORIxDEMO((iIIIiIiiiI)IiIIiIiiiI, IiIIiIiiiI3, (WTable)IiIIiIiiiI2);
        string = (WPlus)IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.plus()).widget();
        ((WPlus)IiIIiIiiiI2.add((WWidget)IiIIiIiiiI3.plus()).widget()).action = () -> iIIIiIiiiI.ALLATORIxDEMO(map, IiIIiIiiiI3, (WTable)IiIIiIiiiI2, (iIIIiIiiiI)IiIIiIiiiI);
        IiIIiIiiiI2.row();
    }

    /*
     * WARNING - void declaration
     */
    public iIIIiIiiiI(String string, String string2, Map<String, List<class_1792>> map, Consumer<Map<String, List<class_1792>>> consumer, Consumer<Setting<Map<String, List<class_1792>>>> consumer2, IVisible iVisible, Predicate<class_1792> predicate, boolean bl) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        void IiIIiIiiiI6;
        void IiIIiIiiiI7;
        iIIIiIiiiI IiIIiIiiiI8;
        boolean bl2 = bl;
        iIIIiIiiiI iIIIiIiiiI2 = IiIIiIiiiI8 = this;
        super((String)IiIIiIiiiI7, (String)IiIIiIiiiI6, (Object)IiIIiIiiiI5, (Consumer)IiIIiIiiiI4, (Consumer)IiIIiIiiiI3, (IVisible)IiIIiIiiiI2);
        iIIIiIiiiI2.IiIIiIiiiI = IiIIiIiiiI;
        iIIIiIiiiI2.ALLATORIxDEMO = this;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(MySettings.ALLATORIxDEMO("eVp{F_\u0015OE^tn\u0005N\u0015\u8bcd\u66c6\u658d\u5205\u673a\u6598\u726f\u674e\uff6c"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(WTextBox wTextBox, Map map, AtomicReference atomicReference) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        WTextBox wTextBox2 = wTextBox;
        String IiIIiIiiiI3 = wTextBox2.get();
        if (IiIIiIiiiI2.containsKey(IiIIiIiiiI3) && !IiIIiIiiiI3.equals(IiIIiIiiiI.get())) {
            wTextBox2.set((String)IiIIiIiiiI.get());
            return;
        }
        List list = (List)IiIIiIiiiI2.remove(IiIIiIiiiI.get());
        Object object = IiIIiIiiiI3;
        IiIIiIiiiI.set(object);
        IiIIiIiiiI2.put(object, list);
    }

    public Iterable<class_2960> getIdentifierSuggestions() {
        return class_7923.ITEM.getIds();
    }

    public Map<String, List<class_1792>> ALLATORIxDEMO(class_2487 class_24872) {
        class_2487 IiIIiIiiiI;
        iIIIiIiiiI iIIIiIiiiI2 = iIIIiIiiiI3;
        ((Map)iIIIiIiiiI2.get()).clear();
        IiIIiIiiiI = IiiiIiiIII.ALLATORIxDEMO(IiIIiIiiiI, iIIIiiiiII.ALLATORIxDEMO("\u0019\t\u0003=*"));
        for (String string : IiIIiIiiiI.getKeys()) {
            ArrayList<iIIIiIiiiI> arrayList = new ArrayList<iIIIiIiiiI>();
            for (iIIIiIiiiI iIIIiIiiiI3 : IiIIiIiiiI.getList(string, 0x6E & 0x19)) {
                iIIIiIiiiI3 = (class_1792)class_7923.ITEM.get(class_2960.of((String)iIIIiIiiiI3.asString()));
                if (!iIIIiIiiiI2.ALLATORIxDEMO && iIIIiIiiiI2.IiIIiIiiiI != null && !iIIIiIiiiI2.IiIIiIiiiI.test((class_1792)iIIIiIiiiI3)) continue;
                arrayList.add(iIIIiIiiiI3);
            }
            if (arrayList.isEmpty()) continue;
            ((Map)iIIIiIiiiI2.get()).put(string, arrayList);
        }
        return (Map)iIIIiIiiiI2.get();
    }

    public Map<String, List<class_1792>> ALLATORIxDEMO(String string) {
        iIIIiIiiiI iIIIiIiiiI2 = object;
        Object object = string;
        iIIIiIiiiI IiIIiIiiiI = iIIIiIiiiI2;
        object = ((String)object).split(iIIIiiiiII.ALLATORIxDEMO("t"));
        LinkedHashMap<String, List<class_1792>> linkedHashMap = new LinkedHashMap<String, List<class_1792>>();
        try {
            int n = ((Object)object).length;
            for (int i = 2 & 5; i < n; ++i) {
                Object object2 = ((String)object[i]).split(MySettings.ALLATORIxDEMO("&"), 5 >> 1);
                if (((String[])object2).length != (1 ^ 3)) continue;
                object2 = object2[3 ^ 3].trim();
                String[] stringArray = object2[3 >> 1].split(iIIIiiiiII.ALLATORIxDEMO("c"));
                ArrayList<String> arrayList = new ArrayList<String>();
                int n2 = stringArray.length;
                int n3 = 3 ^ 3;
                while (n3 < n2) {
                    int n4;
                    String string2 = stringArray[n4];
                    if ((string2 = (class_1792)iIIIiIiiiI.parseId((class_2378)class_7923.ITEM, (String)string2.trim())) != null && (IiIIiIiiiI.IiIIiIiiiI == null || IiIIiIiiiI.IiIIiIiiiI.test((class_1792)string2))) {
                        arrayList.add(string2);
                    }
                    n3 = ++n4;
                }
                if (arrayList.isEmpty()) continue;
                linkedHashMap.put((String)object2, arrayList);
            }
        } catch (Exception this2) {
            // empty catch block
        }
        return linkedHashMap;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map map, GuiTheme guiTheme, WTable wTable, iIIIiIiiiI iIIIiIiiiI2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        Object IiIIiIiiiI3 = iIIIiIiiiI2;
        Map IiIIiIiiiI4 = map;
        IiIIiIiiiI4.put("", new ArrayList());
        iIIIiIiiiI.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI2, (WTable)IiIIiIiiiI, (iIIIiIiiiI)((Object)IiIIiIiiiI3));
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map map, AtomicReference atomicReference, ItemListSetting itemListSetting) {
        void IiIIiIiiiI;
        Map IiIIiIiiiI2 = itemListSetting;
        Map IiIIiIiiiI3 = map;
        IiIIiIiiiI3.put((String)IiIIiIiiiI.get(), (List)IiIIiIiiiI2.get());
    }

    public void resetImpl() {
        iIIIiIiiiI iIIIiIiiiI2;
        Iterator iterator;
        (iIIIiIiiiI2 = entry).value = new LinkedHashMap();
        Iterator iterator2 = iterator = ((Map)(iIIIiIiiiI2 = entry).defaultValue).entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = iterator.next();
            ((Map)iIIIiIiiiI2.value).put((String)entry.getKey(), new ArrayList((Collection)entry.getValue()));
            iterator2 = iterator;
        }
    }

    public boolean ALLATORIxDEMO(Map<String, List<class_1792>> object) {
        iIIIiIiiiI iIIIiIiiiI2 = object2;
        Object object2 = object;
        object = iIIIiIiiiI2;
        return (3 & 5) != 0;
    }
}

