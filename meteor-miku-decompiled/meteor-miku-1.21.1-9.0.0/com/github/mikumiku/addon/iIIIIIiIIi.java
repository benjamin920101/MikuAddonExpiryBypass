/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ItemListSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.screen.CraftingScreenHandler
 *  net.minecraft.item.Item
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.iiIiiIIiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ItemListSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.item.Item;

public class iIIIIIiIIi
extends iiiiIiIiii {
    private final Setting<Boolean> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private final Setting<List<class_1792>> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iIIIIIiIIi iIIIIIiIIi2 = iIIIIIiIIi3;
        iIIIIIiIIi iIIIIIiIIi3 = post;
        iIIIIIiIIi IiIIiIiiiI = iIIIIIiIIi2;
        if (IiIIiIiiiI.iiIIIIiIII.interactionManager == null) {
            return;
        }
        if (((List)IiIIiIiiiI.IiIIiIiiiI.get()).isEmpty()) {
            return;
        }
        if (!(IiIIiIiiiI.iiIIIIiIII.player.currentScreenHandler instanceof class_1714)) {
            return;
        }
        if (((Boolean)IiIIiIiiiI.IiIiIIIIiI.get()).booleanValue()) {
            IiIIiIiiiI.iiIIIIiIII.player.getInventory().updateItems();
        }
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }

    public iIIIIIiIIi() {
        iIIIIIiIIi iIIIIIiIIi2 = this;
        super(iiIiiIIiII.ALLATORIxDEMO("\u55fb\u5c67\u5464\u6253"), IiiIiIIIIi.ALLATORIxDEMO("\u81f4\u5299\u5416\u6221\u7257\u54d0"));
        iIIIIIiIIi2.iiiiiIIiiI = iIIIIIiIIi2.settings.getDefaultGroup();
        iIIIIIiIIi2.IiIIiIiiiI = iIIIIIiIIi2.iiiiiIIiiI.add((Setting)((ItemListSetting.Builder)((ItemListSetting.Builder)((ItemListSetting.Builder)new ItemListSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u7205\u5482"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u60c2\u899f\u81db\u5296\u5419\u620e\u76b5\u7277\u54f0\u5229\u8879"))).defaultValue(Arrays.asList(new class_1792[2 & 5]))).build());
        this.IiIiIIIIiI = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u967e\u4e6e\u5460\u6b26"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u5c03\u8be4\u960c\u6b73\u7277\u54f0\u6811\u4e3c\u5432\u6b74"))).defaultValue((Object)(3 >> 1))).build());
        this.ALLATORIxDEMO = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u5124\u908b\u5464\u6253"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u6bde\u6b3f\u5439\u620e\u6731\u5939\u53de\u80e3\u6541\u91d1\uff39mywWj\u7088\u51c5\uff18"))).defaultValue((Object)(3 >> 1))).build());
        this.iiIIIIiIII = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIiII.ALLATORIxDEMO("\u4e6e\u5f60\u7205\u5482"))).description(IiiIiIIIIi.ALLATORIxDEMO("\u81fb\u52b6\u4e13\u5f1d\u5439\u620e\u7258\u54df\uff39\u80d2\u5334\u7a44\u95e5\u4e13\u8d82\u65e8\u6738\u7516\uff18"))).defaultValue((Object)((3 & 5) != 0))).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIiII.ALLATORIxDEMO(";(Ne\u001f&l\u0016<\u0007-\u0017)Bl\u8b94\u6698\u65f3\u527c\u6763\u65fc\u722b\u6740\uff42"));
        }
    }
}

