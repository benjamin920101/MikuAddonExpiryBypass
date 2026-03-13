/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BlockPosSetting$Builder
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringListSetting$Builder
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Block
 *  net.minecraft.block.ChestBlock
 *  net.minecraft.block.EnderChestBlock
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.block.TrappedChestBlock
 *  net.minecraft.block.BarrelBlock
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import com.github.mikumiku.addon.IiiIIIiiII;
import com.github.mikumiku.addon.iIIiIiiIIi;
import com.github.mikumiku.addon.iIIiiIIiii;
import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiIiiIIiII;
import com.github.mikumiku.addon.iiIiiiIiiI;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.sorter.ItemSorterModule;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockPosSetting;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringListSetting;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.TrappedChestBlock;
import net.minecraft.block.BarrelBlock;

public class IIIiIiiiIi
extends iiiiIiIiii {
    private final Setting<Integer> iIIIIiiiIi;
    private final Setting<Boolean> iiIIiiIiIi;
    private final SettingGroup IiiIIiIiIi;
    private final Setting<List<String>> iiiiIiiIIi;
    private List<String> iiIIiIiiIi;
    private final Setting<Integer> IiIiiiiIIi;
    private List<iIiIIiiIiI> iiIIiIiiII;
    private final Setting<Integer> IIiIiiIiIi;
    private final SettingGroup IIiIIiIIii;
    private int iIiiIiiiii;
    private class_2338 iIiIiiIiiI;
    private final Setting<String> IIiiiiiiII;
    public String IIiiiIIIIi;
    private long IIIiIIIiII;
    private final Setting<Integer> iiIiIiiiiI;
    private long IIiiIiiiII;
    private final Setting<class_2338> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private IiiIIIiiII iIiIiIiIii;
    private final Setting<Integer> iiiiiIIIii;
    private final Setting<Integer> iIIiIIiiII;
    private Map<String, List<class_1799>> IiiIIiiiiI;
    private final Setting<String> IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private final SettingGroup iiIIiiIiii;
    private int iIiiIiiiII;
    private iiIiiIIiII iIIiiIIIII;
    private ItemSorterModule.ProcessingState iiIiIIiIIi;
    private final Setting<Map<String, List<class_1792>>> IIIIiIiiIi;
    private long IiIiIIIIiI;
    private final Setting<Integer> iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private long ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1707 class_17072) {
        void IiIIiIiiiI;
        IIIiIiiiIi iIIiIiiiIi = this;
        if (iIIiIiiiIi.iiIIIIiIII.player == null) {
            return;
        }
        int n = IiIIiIiiiI.getInventory().size();
        int n2 = this = 3 & 4;
        while (n2 < n) {
            if (!IiIIiIiiiI.getInventory().getStack(this).isEmpty()) {
                InvUtils.shiftClick().slotId(this);
            }
            n2 = ++this;
        }
    }

    private /* synthetic */ void IIiiiIIiiI() {
        IIIiIiiiIi iIIiIiiiIi = object;
        if (iIIiIiiiIi.iiIIIIiIII.player == null || iIIiIiiiIi.iiIIIIiIII.player.currentScreenHandler == null) {
            return;
        }
        Object object = iIIiIiiiIi.iiIIIIiIII.player.currentScreenHandler;
        if (object instanceof class_1707) {
            class_1707 class_17072 = (class_1707)object;
            IIIiIiiiIi iIIiIiiiIi2 = iIIiIiiiIi;
            object = iIIiIiiiIi2.iiIIiIiiIi.get(iIIiIiiiIi2.iIiiIiiiii);
            iIIiIiiiIi.info("\u76ee\u6807\u5bb9\u5668\u5df2\u6253\u5f00\uff0c\u5bb9\u5668\u5927\u5c0f\uff1a" + class_17072.getInventory().size() + "\uff0c\u5f00\u59cb\u5b58\u50a8\u5206\u7c7b\uff1a" + (String)object, new Object[3 ^ 3]);
            if (iIIiIiiiIi.iIiIiiIiiI != null) {
                IIIiIiiiIi iIIiIiiiIi3 = iIIiIiiiIi;
                if (iIIiIiiiIi3.iIIiiIIIII.ALLATORIxDEMO(iIIiIiiiIi3.iIiIiiIiiI.getX(), iIIiIiiiIi.iIiIiiIiiI.getY(), iIIiIiiiIi.iIiIiiIiiI.getZ(), class_17072, (String)object)) {
                    iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u7be7\u5b73\u4e7b\u9001\u545e\u5b7b\u50fe\u5f70\u521b\u5225\u7c0d\uff0f\u8da5\u8fe4"), new Object[3 & 4]);
                    IIIiIiiiIi iIIiIiiiIi4 = iIIiIiiiIi;
                    iIIiIiiiIi4.iiIIIIiIII.player.closeHandledScreen();
                    iIIiIiiiIi4.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IiIIIIiiii);
                    return;
                }
            }
            IIIiIiiiIi iIIiIiiiIi5 = iIIiIiiiIi;
            iIIiIiiiIi5.ALLATORIxDEMO(class_17072, (String)object);
            iIIiIiiiIi5.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIIiIIiiII);
        }
    }

    private /* synthetic */ void iiiiiiiiIi() {
        IIIiIiiiIi iIIiIiiiIi = this;
        iIIiIiiiIi.info("\u6240\u6709\u7269\u54c1\u5206\u7c7b\u5b8c\u6210\uff0c\u7b49\u5f85 " + (Integer)iIIiIiiiIi.IIiIiiIiIi.get() / (0x53FF & 0x2FE8) + " \u79d2\u540e\u5f00\u59cb\u4e0b\u4e00\u8f6e", new Object[5 >> 3]);
        this.IiIiIIIIiI = System.currentTimeMillis() + (long)((Integer)this.IIiIiiIiIi.get()).intValue();
        this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIiiIiiiII);
    }

    private /* synthetic */ void IIiIiiIiiI() {
        IIIiIiiiIi iIIiIiiiIi;
        IIIiIiiiIi iIIiIiiiIi2 = iIIiIiiiIi = iIIiIiiiIi4;
        if (iIIiIiiiIi2.iIiiIiiiII >= iIIiIiiiIi2.iiIIiIiiII.size()) {
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiiiIIiiI);
            return;
        }
        IIIiIiiiIi iIIiIiiiIi3 = iIIiIiiiIi;
        IIIiIiiiIi iIIiIiiiIi4 = iIIiIiiiIi3.iiIIiIiiII.get(iIIiIiiiIi3.iIiiIiiiII).ALLATORIxDEMO();
        iIIiIiiiIi.info("\u6b63\u5728\u79fb\u52a8\u5230\u6e90\u7bb1\u5b50\uff1a" + iIIiIiiiIi4.toShortString(), new Object[3 ^ 3]);
        if (iiIIIIiiIi.ALLATORIxDEMO((class_2338)iIIiIiiiIi4, 3.0)) {
            iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u5da4\u5213\u8fe8\u6eb3\u7bc7\u5b53\u4f1b\u7f4d"), new Object[3 >> 2]);
            IIIiIiiiIi iIIiIiiiIi5 = iIIiIiiiIi;
            iIIiIiiiIi5.ALLATORIxDEMO(iIIiIiiiIi.iiIIiIiiII.get(iIIiIiiiIi5.iIiiIiiiII).ALLATORIxDEMO());
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiIIIIiIII);
        }
    }

    private /* synthetic */ void iIIIIIIiiI() {
        IIIiIiiiIi iIIiIiiiIi = list;
        if (!((Boolean)iIIiIiiiIi.IiiIIIiiIi.get()).booleanValue()) {
            IIIiIiiiIi iIIiIiiiIi2;
            iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u5f63\u5bff\u6a77\u5f2c\u5da4\u5150\u95bb\uff2f\u8fad\u5166\u72e0\u6022"), new Object[2 & 5]);
            List list = (List)iIIiIiiiIi.iiiiIiiIIi.get();
            if (list != null && !list.isEmpty()) {
                iIIiIiiiIi.info("\u5df2\u914d\u7f6e " + list.size() + " \u4e2a\u6e90\u7bb1\u5b50", new Object[3 ^ 3]);
                iIIiIiiiIi.info(iiIIIIiiIi.ALLATORIxDEMO("\u599e\u9731\u6da8\u5294\u66a2\u592e\u7be7\u5b6f\uff51\u8bc9\u7ebb\u7e93\u4eb8\u4e8b\uff60\u599b\u977b\u5f19\u59b0\u654d\u745d\uff15\u8b8c\u5711\u8be5\u7f57\u4e76\u514a\u95b6\u5f0c\u5b87\u6a18\u5f54"), new Object[3 & 4]);
                iIIiIiiiIi2 = iIIiIiiiIi;
            } else {
                iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u8b81\u53f0\u9578\u709a\u518d\u7bb2\u5b06\u6746\u6dad\u5283\u5266\u6eb3\u7bc7\u5b53\u5241\u884b"), new Object[3 & 4]);
                iIIiIiiiIi2 = iIIiIiiiIi;
            }
            iIIiIiiiIi2.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IiIiIIIIiI);
            return;
        }
    }

    private /* synthetic */ void IIIIiIIIII() {
        if (this.iiIIIIiIII.player == null || this.iiIIIIiIII.player.currentScreenHandler == this.iiIIIIiIII.player.playerScreenHandler) {
            this.info(iiIIIIiiIi.ALLATORIxDEMO("\u76b5\u683e\u7bea\u5b49\u5d89\u514a\u95b6"), new Object[3 >> 2]);
            this.IiiiiiiIIi();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1707 class_17072, String string) {
        IIIiIiiiIi iIIiIiiiIi = iIIiIiiiIi2;
        IIIiIiiiIi iIIiIiiiIi2 = class_17072;
        IIIiIiiiIi IiIIiIiiiI = iIIiIiiiIi;
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        int n = this = 0;
        while (true) {
            String string2;
            void IiIIiIiiiI2;
            if (n >= 36) break;
            class_1799 class_17992 = IiIIiIiiiI.iiIIIIiIII.player.getInventory().getStack(this);
            if (!class_17992.isEmpty() && IiIIiIiiiI2.equals(string2 = IiIIiIiiiI.iIiIiIiIii.IiiiiiiIIi(class_17992))) {
                IiIIiIiiiI.info("\u5b58\u50a8\u7269\u54c1\uff1a" + class_17992.getName().getString() + " \u5230\u5206\u7c7b\uff1a" + (String)IiIIiIiiiI2, new Object[2 & 5]);
                InvUtils.shiftClick().slot(this);
            }
            n = ++this;
        }
    }

    private /* synthetic */ List<iIiIIiiIiI> ALLATORIxDEMO() {
        return ((List)this.iiiiIiiIIi.get()).stream().map(IiIIiIiiiI -> iIiIIiiIiI.ALLATORIxDEMO(IiIIiIiiiI)).filter(IiIIiIiiiI -> {
            if (IiIIiIiiiI != null) {
                return (2 ^ 3) != 0;
            }
            return false;
        }).toList();
    }

    private /* synthetic */ void IIiiIiiIii() {
        this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IiIiIIIIiI);
    }

    public static void IIiIiIIIIi() {
        Settings settings = BaritoneAPI.getSettings();
        settings.allowBreak.value = (3 ^ 3) != 0;
        settings.allowPlace.value = 5 >> 3;
    }

    @Override
    public void onActivate() {
        IIIiIiiiIi iIIiIiiiIi = this;
        this.iIiIiIiIii = new IiiIIIiiII((Map)this.IIIIiIiiIi.get(), (Boolean)this.iiiIiIiIIi.get());
        IIIiIiiiIi iIIiIiiiIi2 = this;
        this.iIIiiIIIII = new iiIiiIIiII(this.ALLATORIxDEMO(), (Integer)this.iiiiiIIIii.get(), this.iIiIiIiIii);
        this.info(iIIiiIIiii.ALLATORIxDEMO("\u724a\u5497\u6557\u7450\u6a02\u5721\u5df1\u5479\u528b"), new Object[3 >> 2]);
        this.IiIiiiIIiI();
    }

    private /* synthetic */ void IIIIIIIiIi() {
        IIIiIiiiIi iIIiIiiiIi = iIiIIiiIiI2;
        if (iIIiIiiiIi.iiIiIIiIIi != ItemSorterModule.ProcessingState.IiIiIIIIiI) {
            IIIiIiiiIi iIIiIiiiIi2 = iIIiIiiiIi;
            iIIiIiiiIi2.error("\u5c1d\u8bd5\u5728\u975e\u7a7a\u95f2\u72b6\u6001\u4e0b\u5f00\u59cb\u5904\u7406\uff0c\u5f53\u524d\u72b6\u6001\uff1a" + String.valueOf((Object)iIIiIiiiIi2.iiIiIIiIIi) + "\uff0c\u5f3a\u5236\u91cd\u7f6e", new Object[3 >> 2]);
            iIIiIiiiIi.IiIiiiIIiI();
            return;
        }
        IIIiIiiiIi iIIiIiiiIi3 = iIIiIiiiIi;
        iIIiIiiiIi3.iiIIiIiiII.clear();
        iIIiIiiiIi.iIiiIiiiII = 3 >> 2;
        iIIiIiiiIi3.IiiIIiiiiI.clear();
        Iterator iterator = ((List)iIIiIiiiIi.iiiiIiiIIi.get()).iterator();
        while (iterator.hasNext()) {
            iIiIIiiIiI iIiIIiiIiI2 = iIiIIiiIiI.ALLATORIxDEMO((String)iterator.next());
            if (iIIiIiiiIi.iiIIiIiiII.contains(iIiIIiiIiI2) || iIiIIiiIiI2 == null) continue;
            iIIiIiiiIi.iiIIiIiiII.add(iIiIIiiIiI2);
        }
        if (iIIiIiiiIi.iiIIiIiiII.isEmpty()) {
            iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u6729\u911b\u7f4d\u6ec6\u7b92\u5b06\uff2f\u8d85\u8fc4\u5952\u7425"), new Object[3 ^ 3]);
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiIIiiIiii);
            return;
        }
        IIIiIiiiIi iIIiIiiiIi4 = iIIiIiiiIi;
        iIIiIiiiIi4.info("\u5f00\u59cb\u5904\u7406 " + iIIiIiiiIi4.iiIIiIiiII.size() + " \u4e2a\u6e90\u7bb1\u5b50", new Object[3 & 4]);
        iIIiIiiiIi.iIIIiIIIii();
    }

    private /* synthetic */ void IiIiiiIIii() {
        if (System.currentTimeMillis() >= this.ALLATORIxDEMO) {
            this.iiIiiiiiII();
        }
    }

    private /* synthetic */ void iiiiIIiIii() {
        long l = System.currentTimeMillis();
        if (l - this.IIiiIiiiII >= (long)((Integer)this.iIIIIiiiIi.get()).intValue() * 50L) {
            this.IIiiIiiiII = l;
            this.info(iiIIIIiiIi.ALLATORIxDEMO("\u5f39\u5990\u6589\u76df\u7250\u549a\u656d\u747d\u5451\u6744"), new Object[3 & 4]);
            this.IIIIIIIiIi();
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(ItemSorterModule.ProcessingState processingState) {
        IIIiIiiiIi IiIIiIiiiI;
        IIIiIiiiIi iIIiIiiiIi = object;
        Object object = processingState;
        IIIiIiiiIi iIIiIiiiIi2 = IiIIiIiiiI = iIIiIiiiIi;
        iIIiIiiiIi2.info("\u72b6\u6001\u53d8\u66f4\uff1a" + String.valueOf((Object)iIIiIiiiIi2.iiIiIIiIIi) + " \u2192 " + String.valueOf(object), new Object[5 >> 3]);
        IIIiIiiiIi iIIiIiiiIi3 = IiIIiIiiiI;
        iIIiIiiiIi3.iiIiIIiIIi = object;
        iIIiIiiiIi3.IIIiIIIiII = System.currentTimeMillis();
    }

    private /* synthetic */ boolean ALLATORIxDEMO(class_2248 class_22482) {
        IIIiIiiiIi iIIiIiiiIi = iIIiIiiiIi2;
        IIIiIiiiIi iIIiIiiiIi2 = class_22482;
        IIIiIiiiIi IiIIiIiiiI = iIIiIiiiIi;
        if (iIIiIiiiIi2 instanceof class_2281 || iIIiIiiiIi2 instanceof class_2480 || iIIiIiiiIi2 instanceof class_3708 || iIIiIiiiIi2 instanceof class_2336 || iIIiIiiiIi2 instanceof class_2531) {
            return true;
        }
        return false;
    }

    public IIIiIiiiIi() {
        IIIiIiiiIi iIIiIiiiIi = this;
        super(iiiiIiIiii.IiIiIIIIiI, iIIiiIIiii.ALLATORIxDEMO("\u0014l\u0002\u514b\u721f\u54c2\u5250\u7c58"), iiIIIIiiIi.ALLATORIxDEMO("\u8191\u52b1\u650f\u741f\u54f7\u523f\u7c20\u7ba8\u5b2b\u4e14\u76df\u7250\u549a\u303b\u7c20\u4f25\u94a7\u50b9\u517a"));
        iIIiIiiiIi.IIiIIiIIii = iIIiIiiiIi.settings.getDefaultGroup();
        iIIiIiiiIi.iiIIiiIiii = iIIiIiiiIi.settings.createGroup(iIIiiIIiii.ALLATORIxDEMO("\u7bc7\u5b53\u911b\u7f4d"));
        iIIiIiiiIi.iiIIIIiIII = iIIiIiiiIi.settings.createGroup(iiIIIIiiIi.ALLATORIxDEMO("\u521f\u7c00\u8b87\u7f35"));
        iIIiIiiiIi.IiiIIiIiIi = iIIiIiiiIi.settings.createGroup(iIIiiIIiii.ALLATORIxDEMO("\u6580\u95f7\u63f1\u5215"));
        iIIiIiiiIi.IIiiiiiiII = iIIiIiiiIi.IIiIIiIIii.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u5416\u7573\u5f0c\u5b87\u6a18\u5f54"))).description(iIIiiIIiii.ALLATORIxDEMO("\u547e\u750c\u5f04\u5b98\u6a57\u5f0c\uff7a\u9019\u8fb1\u4ea7\u4ec4\u7b92\u5b26\u6766\u81bc\u528b\u911b\u7f4d\u6ec6\u7b92\u5b26\u5214\u883e\u3021"))).defaultValue((Object)iiIIIIiiIi.ALLATORIxDEMO("\u7c20\u4f02\u9480\u50b9\u517a\u3026\u9746\u89ef\u51ca\u5934\u4e51\u4e15\u624b\u8038\u5945\u4e54\u675e\u725e\u7be4\uff35\u4e5b\u4e0e\u5961\u57b3\u7beb\u5b75\u4e94\u5ea1\uff5c\u7bcf\u5b4c\u91f1\u7506\u4e39\u4e71\u7252\u5498\u6233\u8042\u7564\u7a25\u303b{y\u0016q\u4e89\u673c\u7275\u7b80\u5385\u725d\uff5a\u7102\u5458\u81d5\u52f5\u6422\u7d7e\u5416\u56e8\u769d\u7bca\u5b49\uff77\u81f3\u52d3\u6507\u526b\u5411\u9079\u76bd\u7bea\u5b69\u9197\u622f\u805e\u7a63\u7bca\u5b69\u3059"))).build());
        this.IiiIIIiiIi = this.IIiIIiIIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5479\u750b\u5f63\u5bff\u6a77\u5f2c"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u5411\u7574\u5f6b\u5be0\u6a38\u5f74\uff15\u9061\u8fde\u4edf\u4eab\u7bea\u5b49\u671e\u81d3\u52f3\u9174\u7f35\u6ea9\u7bea\u5b49\u526c\u8851\u3059"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiiiiIIIii = this.IIiIIiIIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u7be7\u5b73\u646a\u7d21\u531c\u5fa7"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u6405\u7d59\u967d\u8f8a\u7ba8\u5b2b\u76bd\u5311\u5fbd\u8358\u56cd\uff53\u65a0\u572c\uff30\u3059"))).defaultValue((Object)(0x39 & 0x66))).min(0x1B & 0x6C).max(0x61E9 & 0x1EDE).sliderMin(0xC & 0x7B).sliderMax(0x38DB & 0x47EC).build());
        int n = 5 >> 3;
        this.IIIiIiiIIi = this.IIiIIiIIii.add((Setting)((BlockPosSetting.Builder)((BlockPosSetting.Builder)((BlockPosSetting.Builder)new BlockPosSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u4e5b\u5fc0\u5706\u6824"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u656d\u747d\u7ce2\u7ea4\u76bd\u4e76\u5fda\u572b\u683e\uff57\u7511\u4ed5\u8fed\u5685\u5495\u5b87\u8213\u3059"))).defaultValue((Object)new class_2338(n, 3 ^ 3, n))).build());
        this.iiiiIiiIIi = this.iiIIiiIiii.add((Setting)((StringListSetting.Builder)((StringListSetting.Builder)((StringListSetting.Builder)new StringListSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u6eb3\u7bc7\u5b53\u5241\u884b"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u4ef0\u8f85\u4ee5\u7bad\u5b49\u4e56\u53cf\u5181\u7270\u54ba\u8fe2\u8817\u521f\u7c00\u303b\u6574\u6338\u6da0\u5299\u5941\u4e33\u7bca\u5b69\u3059"))).defaultValue(new ArrayList())).build());
        this.iiIiIiiiiI = this.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u7f45\u5b7b\u6682\u65b3\u95a2\u96b7"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u7bca\u5b69\u7f48\u5b41\u668f\u6589\u76df\u65cf\u95af\u95cd\u96cf\uff11\u79a9\uff30\u3059"))).defaultValue((Object)(0x3B7D & 0x46DA))).min(--5).sliderMin(--5).sliderMax(0x1F71 & 0x77FE).build());
        this.iiiIiIiIIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u660c\u80fe\u5250\u7c58"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u5416\u7573\u57e3\u4ef5\u7250\u549a\u5c67\u607c\u76bd\u6621\u80e4\u527d\u7c42\u3059"))).defaultValue((Object)(--1 != 0))).build());
        this.IiIIiIiiiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u545e\u5e55\u98ea\u8271\u538e\u79ee"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u5c32\u545a\u7c44\u7234\u54ff\u76d8\u4e73\u5410\u9885\u8209\u7251\u6757\u521f\u7c00\u5209\u4e5b\u8d6e\uff73\u59bb\u7fd1\u6be2\u305a\u6dce\u5186\u5706\u7b32\uff30\u3059"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiIIiiIiIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u5250\u7998\u9632\u9b57\u723f\u54e2"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u5c1f\u963f\u9b6d\u7232\u54f8\u530e\u72d5\u525d\u7c62\u5b23\u5091\u3059"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IIIIiIiiIi = this.iiIIIIiIII.add((Setting)((iiIiiiIiiI)((Object)((iiIiiiIiiI)((Object)new iiIiiiIiiI().name(iIIiiIIiii.ALLATORIxDEMO("\u81c9\u5bec\u4e4a\u5250\u7c58")))).description(iiIIIIiiIi.ALLATORIxDEMO("\u4f63\u5151\u4f04\u7531\u8fa2\u91f5\u76df\u521f\u7c00\uff35\u6cfa\u6247\u526b\u5220\u81b1\u6209\u4e7b\u7c42\u3059")))).ALLATORIxDEMO(iIIiIiiIIi.ALLATORIxDEMO).ALLATORIxDEMO());
        this.IiIIIIiiii = this.iiIIIIiIII.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iIIiiIIiii.ALLATORIxDEMO("\u8bc6\u5fc5\u7f45\u5b7b"))).description(iiIIIIiiIi.ALLATORIxDEMO("\u8ba9\u5fbd\u7f2a\u5b03"))).defaultValue((Object)iIIiiIIiii.ALLATORIxDEMO("-^"))).visible(() -> 3 >> 2)).build());
        this.iIIIIiiiIi = this.IiiIIiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u591d\u747d\u95cd\u96cf"))).description(iIIiiIIiii.ALLATORIxDEMO("\u6b91\u8f45\u7232\u54ef\u652f\u7428\u4e1b\u95d1\u76d5\u65d2\u95e5\u9590\u96e2\uff0b\u0002j\u0015h\uff5a\u0011Fw?@=\u0003k\u0003G\u79d1\uff5f\u3021"))).defaultValue((Object)(0x6E7B & 0x13DC))).min(0x66 & 0x7D).max(0x37F7 & 0x5F78).sliderMin(0x7E & 0x65).sliderMax(0x777E & 0x1FF1).build());
        this.iIIiIIiiII = this.IiiIIiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u7bea\u5b49\u958f\u5ecf\u8f84"))).description(iIIiiIIiii.ALLATORIxDEMO("\u5972\u7405\u7be7\u5b73\u4e3d\u95f7\u76d2\u5ed5\u8f89\u65d5\u95a2\uff2b\u6b9d\u79d1\uff5f\u3021"))).defaultValue((Object)(0x76 & 0x6D))).min(0x73 & 0x3E).max(0x77D7 & 0xFF8).sliderMin(0x3B & 0x76).sliderMax(0xFF1 & 0x77DE).build());
        this.IiIiiiiIIi = this.IiiIIiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u525d\u7c62\u958f\u5ecf\u8f84"))).description(iIIiiIIiii.ALLATORIxDEMO("\u5b2e\u50ab\u4e7b\u540f\u5270\u7c78\u723f\u54e2\u4e3d\u95f7\u76d2\u5ed5\u8f89\u65d5\u95a2\uff2b\u6b9d\u79d1\uff5f\u3021"))).defaultValue((Object)(0x33FE & 0x4DF5))).min(0x76 & 0x6D).max(0x6FF8 & 0x1BBF).sliderMin(0x6E & 0x75).sliderMax(0x3BB8 & 0x4FFF).build());
        this.IIiIiiIiIi = this.IiiIIiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u8f35\u6b38\u958f\u5ecf\u8f84"))).description(iIIiiIIiii.ALLATORIxDEMO("\u5bdd\u6234\u4e11\u8f0a\u6502\u7405\u5478\uff0f\u5f76\u59c8\u4e5d\u4e23\u8f18\u524e\u76d2\u7b6a\u5fd3\u65d5\u95a2\uff2b\u6b9d\u79d1\uff5f\u3021"))).defaultValue((Object)(0x2FD3 & 0x57FC))).min(0x65 & 0x7E).max(60000).sliderMin(0x6E & 0x75).sliderMax(60000).build());
        this.iiiiiIIiiI = this.IiiIIiIiIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIIIIiiIi.ALLATORIxDEMO("\u72af\u607a\u8dbc\u65ad"))).description(iIIiiIIiii.ALLATORIxDEMO("\u5371\u4e3b\u72d2\u6077\u7687\u6776\u5924\u6211\u884f\u65a0\u95d7\uff7e\u79d1\uff5f\uff2f\u8dd3\u65d5\u5458\u81c9\u52de\u91ce\u7f38\u3021"))).defaultValue((Object)(0x78 & 0x7F))).min(0x3E & 0x5F).max(0x117F & 0x6FAC).sliderMin(0x3F & 0x5E).sliderMax(0x196C & 0x67BF).build());
        IIIiIiiiIi iIIiIiiiIi2 = this;
        IIIiIiiiIi iIIiIiiiIi3 = this;
        IIIiIiiiIi iIIiIiiiIi4 = this;
        IIIiIiiiIi iIIiIiiiIi5 = this;
        this.iiIiIIiIIi = ItemSorterModule.ProcessingState.IiIiIIIIiI;
        IIIiIiiiIi iIIiIiiiIi6 = this;
        iIIiIiiiIi6.iiIIiIiiII = new ArrayList<iIiIIiiIiI>();
        iIIiIiiiIi5.iIiiIiiiII = 3 ^ 3;
        iIIiIiiiIi5.IIIiIIIiII = 0L;
        iIIiIiiiIi4.IIiiIiiiII = 0L;
        iIIiIiiiIi4.ALLATORIxDEMO = 0L;
        iIIiIiiiIi3.IiIiIIIIiI = 0L;
        iIIiIiiiIi3.iIiIiiIiiI = null;
        IIIiIiiiIi iIIiIiiiIi7 = this;
        iIIiIiiiIi3.IiiIIiiiiI = new ConcurrentHashMap<String, List<class_1799>>();
        IIIiIiiiIi iIIiIiiiIi8 = this;
        iIIiIiiiIi7.iiIIiIiiIi = new ArrayList<String>();
        iIIiIiiiIi2.iIiiIiiiii = 3 >> 2;
        iIIiIiiiIi2.IIiiiIIIIi = "";
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIIiiIi.ALLATORIxDEMO("n0\u001b}j\u001e9\u000ei\u001fX/|Z\u0019\u8bac\u66cd\u65eb\u5209\u675b\u65a9\u7233\u6715\uff5a"));
        }
    }

    private /* synthetic */ void iiIiiiiIIi() {
        if (this.iiIIIIiIII.player == null || this.iiIIIIiIII.player.currentScreenHandler == this.iiIIIIiIII.player.playerScreenHandler) {
            this.info(iIIiiIIiii.ALLATORIxDEMO("\u6ec6\u7b92\u5b26\u5df1\u5125\u95ce"), new Object[2 & 5]);
            this.iIIiiiIiiI();
            return;
        }
        this.iiIIIIiIII.player.closeHandledScreen();
        this.IIIiIIIiII = System.currentTimeMillis();
        this.info(iiIIIIiiIi.ALLATORIxDEMO("\u6b38\u5711\u5128\u95f4\u6eeb\u7b88\u5b0b"), new Object[5 >> 3]);
    }

    public void onDeactivate() {
        this.info(iiIIIIiiIi.ALLATORIxDEMO("\u7232\u54f8\u652f\u743f\u6a7a\u574e\u5d89\u5065\u7573"), new Object[5 >> 3]);
        this.IiIiiiIIiI();
    }

    private /* synthetic */ void IiiIiIiIiI() {
        IIIiIiiiIi iIIiIiiiIi;
        IIIiIiiiIi iIIiIiiiIi2 = iIIiIiiiIi = object;
        if (iIIiIiiiIi2.iIiiIiiiii >= iIIiIiiiIi2.iiIIiIiiIi.size()) {
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiIIiiIiii);
            return;
        }
        IIIiIiiiIi iIIiIiiiIi3 = iIIiIiiiIi;
        Object object = iIIiIiiiIi3.iiIIiIiiIi.get(iIIiIiiiIi3.iIiiIiiiii);
        iIiIIiiIiI iIiIIiiIiI2 = iIIiIiiiIi.iIIiiIIIII.ALLATORIxDEMO((String)object);
        if (iIiIIiiIiI2 == null) {
            iIIiIiiiIi.info("\u5206\u7c7b " + (String)object + " \u627e\u4e0d\u5230\u5408\u9002\u7684\u5b58\u50a8\u7bb1\u5b50\uff0c\u8df3\u8fc7", new Object[3 & 4]);
            iIIiIiiiIi.IiiiiiiIIi();
            return;
        }
        iIIiIiiiIi.info("\u6b63\u5728\u79fb\u52a8\u5230\u76ee\u6807\u7bb1\u5b50\uff1a" + String.valueOf(iIiIIiiIiI2) + " \u7528\u4e8e\u5206\u7c7b\uff1a" + (String)object, new Object[3 & 4]);
        iIiIIiiIiI iIiIIiiIiI3 = iIiIIiiIiI2;
        object = new class_2338(iIiIIiiIiI3.iiiiiIIiiI, iIiIIiiIiI3.ALLATORIxDEMO, iIiIIiiIiI2.iiIIIIiIII);
        if (iiIIIIiiIi.ALLATORIxDEMO((class_2338)object, 3.0)) {
            iIIiIiiiIi.info(iiIIIIiiIi.ALLATORIxDEMO("\u5da9\u5209\u8fe5\u76d7\u685c\u7ba8\u5b2b\u4f74\u7f35"), new Object[3 & 4]);
            IIIiIiiiIi iIIiIiiiIi4 = iIIiIiiiIi;
            iIIiIiiiIi4.iIiIiiIiiI = object;
            iIIiIiiiIi4.ALLATORIxDEMO(iIiIIiiIiI2.ALLATORIxDEMO());
            iIIiIiiiIi4.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIIIiIiiIi);
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        IIIiIiiiIi iIIiIiiiIi = iIIiIiiiIi2;
        IIIiIiiiIi iIIiIiiiIi2 = class_23382;
        IIIiIiiiIi IiIIiIiiiI = iIIiIiiiIi;
        if (IiIIiIiiiI.iiIIIIiIII.interactionManager == null || IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        iiiIIIIiiI.ALLATORIxDEMO((class_2338)iIIiIiiiIi2, class_2350.UP, --1 != 0, class_1268.MAIN_HAND, BaritoneUtil.SwingSide.iiIIIIiIII);
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        IIIiIiiiIi iIIiIiiiIi = iIIiIiiiIi2;
        if (iIIiIiiiIi.iiIIIIiIII.player == null) {
            return 3 >> 2;
        }
        IIIiIiiiIi iIIiIiiiIi2 = (class_2338)iIIiIiiiIi.IIIiIiiIIi.get();
        return iIIiIiiiIi.iiIIIIiIII.player.getBlockPos().isWithinDistance((class_2382)new class_2338((int)((double)iIIiIiiiIi2.getX() + 0.5), (int)((double)iIIiIiiiIi2.getY() + 0.5), (int)((double)iIIiIiiiIi2.getZ() + 0.5)), 200.0);
    }

    private /* synthetic */ void iIIIiIIIii() {
        IIIiIiiiIi iIIiIiiiIi;
        IIIiIiiiIi iIIiIiiiIi2 = iIIiIiiiIi = iIIiIiiiIi4;
        if (iIIiIiiiIi2.iIiiIiiiII >= iIIiIiiiIi2.iiIIiIiiII.size()) {
            iIIiIiiiIi.info(iiIIIIiiIi.ALLATORIxDEMO("\u6259\u6772\u6ea9\u7bea\u5b49\u597f\u743f\u5bd7\u6229\uff57\u5f39\u5990\u7270\u54ba\u523f\u7c20"), new Object[3 ^ 3]);
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiiiIIiiI);
            return;
        }
        if (iIIiIiiiIi.iiIIIIiIII.player != null) {
            int n = iIIiIiiiIi.ALLATORIxDEMO();
            if (n < --2) {
                iIIiIiiiIi.info("\u73a9\u5bb6\u5e93\u5b58\u7a7a\u95f4\u4e0d\u8db3\uff08\u5269\u4f59" + n + "\u4e2a\u7a7a\u4f4d\uff09\uff0c\u9700\u8981\u5148\u6574\u7406\u5e93\u5b58", new Object[3 >> 2]);
                iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiiiIIiiI);
                return;
            }
            iIIiIiiiIi.info("\u73a9\u5bb6\u5e93\u5b58\u5269\u4f59" + n + "\u4e2a\u7a7a\u4f4d\uff0c\u7ee7\u7eed\u5904\u7406\u6e90\u7bb1\u5b50", new Object[3 & 4]);
        }
        IIIiIiiiIi iIIiIiiiIi3 = iIIiIiiiIi;
        IIIiIiiiIi iIIiIiiiIi4 = iIIiIiiiIi3.iiIIiIiiII.get(iIIiIiiiIi3.iIiiIiiiII).ALLATORIxDEMO();
        IIIiIiiiIi iIIiIiiiIi5 = iIIiIiiiIi;
        iIIiIiiiIi5.info("\u5904\u7406\u7bb1\u5b50 " + (iIIiIiiiIi.iIiiIiiiII + (4 ^ 5)) + "/" + iIIiIiiiIi5.iiIIiIiiII.size() + " \u5750\u6807\uff1a" + iIIiIiiiIi4.toShortString(), new Object[2 & 5]);
        if (iIIiIiiiIi.iiIIIIiIII.player != null && iIIiIiiiIi.iiIIIIiIII.player.currentScreenHandler != iIIiIiiiIi.iiIIIIiIII.player.playerScreenHandler) {
            IIIiIiiiIi iIIiIiiiIi6 = iIIiIiiiIi;
            iIIiIiiiIi6.iiIIIIiIII.player.closeHandledScreen();
            iIIiIiiiIi6.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiIiIiIIi);
            return;
        }
        iIIiIiiiIi.iIiIiiIiiI = iIIiIiiiIi4;
        iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iIIiiIIIII);
    }

    private /* synthetic */ void iIiiIIiiIi() {
        if (System.currentTimeMillis() >= this.IiIiIIIIiI) {
            this.info(iIIiiIIiii.ALLATORIxDEMO("\u7b4a\u5fd3\u7ef0\u6729\uff0f\u919b\u7f4d\u72e0\u6022\u676c\u51e5\u5971\u4e08\u4e56\u8f4d"), new Object[2 & 5]);
            this.IiIiiiIIiI();
        }
    }

    private /* synthetic */ void IIIIIIiIii() {
        Object object = string;
        if (((IIIiIiiiIi)object).ALLATORIxDEMO()) {
            IIIiIiiiIi iIIiIiiiIi = object;
            String string = iIIiIiiiIi.iiIIiIiiIi.get(iIIiIiiiIi.iIiiIiiiii);
            ((IIIiIiiiIi)object).info("\u5206\u7c7b " + (String)string + " \u7684\u7269\u54c1\u5b58\u50a8\u5b8c\u6210", new Object[3 & 4]);
            if (((IIIiIiiiIi)object).iiIIIIiIII.player != null) {
                ((IIIiIiiiIi)object).iiIIIIiIII.player.closeHandledScreen();
            }
            ((IIIiIiiiIi)object).ALLATORIxDEMO(ItemSorterModule.ProcessingState.IiIIIIiiii);
        }
    }

    private /* synthetic */ void iIIiIIiIii() {
        int n;
        IIIiIiiiIi iIIiIiiiIi;
        block12: {
            int this222;
            int n2;
            int n3;
            iIIiIiiiIi = iIIiIiiiIi2;
            IIIiIiiiIi iIIiIiiiIi2 = iIIiIiiiIi.iiIIIIiIII.player.currentScreenHandler;
            if (!(iIIiIiiiIi2 instanceof class_1707)) {
                iIIiIiiiIi.info(iiIIIIiiIi.ALLATORIxDEMO("\u5bc2\u5651\u5da9\u516a\u9596\uff35\u7ebc\u7ed4\u595f\u743f\u4e50\u4e19\u4e51\u7b88\u5b0b"), new Object[5 >> 3]);
                iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiIiIiIIi);
                return;
            }
            class_1707 class_17072 = (class_1707)iIIiIiiiIi2;
            int this222 = 1;
            int n4 = 5 >> 3;
            int n5 = n3 = 2 & 5;
            while (n5 < class_17072.getInventory().size()) {
                class_1799 class_17992 = class_17072.getInventory().getStack(n3);
                if (!class_17992.isEmpty()) {
                    this222 = 2 & 5;
                    n4 += class_17992.getCount();
                }
                n5 = ++n3;
            }
            if (this222 != 0) {
                iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u5bef\u564b\u5d84\u7a79\uff5a\u5152\u6386\u53f5\u4ed0\u4e68\u523b\u7687\u723f\u54e2"), new Object[2 & 5]);
                iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiIiIiIIi);
                return;
            }
            n3 = 0;
            int n6 = n2 = 3 & 4;
            while (n6 < class_17072.getInventory().size()) {
                class_1799 this222 = class_17072.getInventory().getStack(n2);
                if (!this222.isEmpty()) {
                    if (iIIiIiiiIi.iiIIIIiIII.player.getInventory().getEmptySlot() == -4 >> 2) {
                        iIIiIiiiIi.info(iiIIIIiiIi.ALLATORIxDEMO("\u73d2\u5b8f\u5ec8\u5b41\u5d89\u6ed8\uff57\u65d9\u6c8e\u7ede\u7eb6\u63c9\u53ad\u7250\u549a"), new Object[3 ^ 3]);
                        iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiIiIiIIi);
                        return;
                    }
                    InvUtils.shiftClick().slotId(n2);
                    n3 += this222.getCount();
                }
                n6 = ++n2;
            }
            if (n3 > 0) {
                iIIiIiiiIi.info("\u672c\u6b21\u63d0\u53d6\u4e86 " + n3 + " \u4e2a\u7269\u54c1", new Object[3 >> 2]);
            }
            n2 = 1;
            int n7 = this222 = 3 & 4;
            while (n7 < class_17072.getInventory().size()) {
                if (!class_17072.getInventory().getStack(this222).isEmpty()) {
                    n = n2 = 3 ^ 3;
                    break block12;
                }
                n7 = ++this222;
            }
            n = n2;
        }
        if (n != 0) {
            iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u6216\u672a\u723f\u54e2\u63a6\u53d5\u5bda\u6233"), new Object[5 >> 3]);
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiIiIiIIi);
            return;
        }
        if (System.currentTimeMillis() - iIIiIiiiIi.IIIiIIIiII > 10000L) {
            iIIiIiiiIi.error(iiIIIIiiIi.ALLATORIxDEMO("\u7270\u54ba\u63e9\u538d\u8d9c\u658d\uff35\u53b4\u80c4\u6752\u7250\u549a\u65f9\u6cae\u63e9\u538d"), new Object[2 & 5]);
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiIiIiIIi);
        }
    }

    private /* synthetic */ void IiIiiiIIiI() {
        IIIiIiiiIi iIIiIiiiIi;
        IIIiIiiiIi iIIiIiiiIi2 = this;
        iIIiIiiiIi2.info("\u91cd\u7f6e\u7269\u54c1\u6574\u7406\u72b6\u6001\u673a\uff08\u5f53\u524d\u72b6\u6001\uff1a" + String.valueOf((Object)iIIiIiiiIi2.iiIiIIiIIi) + "\uff09", new Object[2 & 5]);
        IIIiIiiiIi iIIiIiiiIi3 = this;
        if (((Boolean)this.IiiIIIiiIi.get()).booleanValue()) {
            iIIiIiiiIi3.iiIiIIiIIi = ItemSorterModule.ProcessingState.ALLATORIxDEMO;
            this.info(iiIIIIiiIi.ALLATORIxDEMO("\u8fa5\u5179\u5f0c\u5b87\u6a38\u5f74\uff15\u8b8c\u9023\u8f9c\u4ebd\u4ee9\u7b88\u5b0b\u675c\u9116\u7f57\u6ecb\u7ba8\u5b2b\u522e\u8833"), new Object[3 >> 2]);
            iIIiIiiiIi = this;
        } else {
            iIIiIiiiIi3.iiIiIIiIIi = ItemSorterModule.ProcessingState.IiIiIIIIiI;
            iIIiIiiiIi = this;
        }
        iIIiIiiiIi.iiIIiIiiII.clear();
        IIIiIiiiIi iIIiIiiiIi4 = this;
        IIIiIiiiIi iIIiIiiiIi5 = this;
        iIIiIiiiIi5.iIiiIiiiII = 5 >> 3;
        iIIiIiiiIi5.IiiIIiiiiI.clear();
        iIIiIiiiIi5.iiIIiIiiIi.clear();
        iIIiIiiiIi4.iIiiIiiiii = 5 >> 3;
        iIIiIiiiIi4.ALLATORIxDEMO = 0L;
        this.IiIiIIIIiI = 0L;
        this.iIiIiiIiiI = null;
        if (this.iiIIIIiIII.player != null && this.iiIIIIiIII.player.currentScreenHandler instanceof class_1707) {
            this.iiIIIIiIII.player.closeHandledScreen();
        }
    }

    private /* synthetic */ void IiiiiiiiII() {
        IIIiIiiiIi iIIiIiiiIi = iIIiIiiiIi2;
        if (iIIiIiiiIi.iiIIIIiIII.player == null || iIIiIiiiIi.iiIIIIiIII.player.currentScreenHandler == null) {
            return;
        }
        class_1703 class_17032 = iIIiIiiiIi.iiIIIIiIII.player.currentScreenHandler;
        if (class_17032 instanceof class_1707) {
            IIIiIiiiIi iIIiIiiiIi2 = (class_1707)class_17032;
            iIIiIiiiIi.info("\u6e90\u7bb1\u5b50\u5df2\u6253\u5f00\uff0c\u5bb9\u5668\u5927\u5c0f\uff1a" + iIIiIiiiIi2.getInventory().size(), new Object[5 >> 3]);
            IIIiIiiiIi iIIiIiiiIi3 = iIIiIiiiIi;
            iIIiIiiiIi3.ALLATORIxDEMO((class_1707)iIIiIiiiIi2);
            iIIiIiiiIi3.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IiiIIiiiiI);
        }
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        IIIiIiiiIi iIIiIiiiIi = this;
        if (iIIiIiiiIi.iiIIIIiIII.player == null) {
            return 2 & 5;
        }
        int n = 0;
        int n2 = this = 2 & 5;
        while (true) {
            if (n2 >= 36) break;
            if (iIIiIiiiIi.iiIIIIiIII.player.getInventory().getStack(this).isEmpty()) {
                ++n;
            }
            n2 = ++this;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public void info(String string, Object ... objectArray) {
        void IiIIiIiiiI;
        IIIiIiiiIi iIIiIiiiIi = string2;
        String string2 = string;
        IIIiIiiiIi IiIIiIiiiI2 = iIIiIiiiIi;
        if (IiIIiIiiiI2.IIiiiIIIIi.equals(string2)) {
            return;
        }
        String string3 = string2;
        super.info(string3, (Object[])IiIIiIiiiI);
        IiIIiIiiiI2.IIiiiIIIIi = string3;
    }

    private /* synthetic */ void iIIiiiIiiI() {
        IIIiIiiiIi iIIiIiiiIi = this;
        iIIiIiiiIi.iIiiIiiiII += 4 ^ 5;
        if (iIIiIiiiIi.iIiiIiiiII >= this.iiIIiIiiII.size()) {
            this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiiiIIiiI);
            return;
        }
        this.ALLATORIxDEMO = System.currentTimeMillis() + (long)((Integer)this.iIIiIIiiII.get()).intValue();
        this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiIiIIiIIi);
    }

    private /* synthetic */ void iiIiiiiiII() {
        IIIiIiiiIi iIIiIiiiIi;
        IIIiIiiiIi iIIiIiiiIi2 = iIIiIiiiIi = string;
        if (iIIiIiiiIi2.iIiiIiiiii >= iIIiIiiiIi2.iiIIiIiiIi.size()) {
            iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u6216\u672a\u5250\u7c58\u5972\u7405\u5bda\u6233"), new Object[5 >> 3]);
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiIIiiIiii);
            return;
        }
        IIIiIiiiIi iIIiIiiiIi3 = iIIiIiiiIi;
        String string = iIIiIiiiIi3.iiIIiIiiIi.get(iIIiIiiiIi3.iIiiIiiiii);
        Object object = iIIiIiiiIi.IiiIIiiiiI.get(string);
        IIIiIiiiIi iIIiIiiiIi4 = iIIiIiiiIi;
        iIIiIiiiIi4.info("\u5904\u7406\u5206\u7c7b " + (iIIiIiiiIi.iIiiIiiiii + --1) + "/" + iIIiIiiiIi4.iiIIiIiiIi.size() + "\uff1a" + (String)string + "\uff08" + object.size() + " \u4e2a\u7269\u54c1\uff09", new Object[5 >> 3]);
        object = iIIiIiiiIi.iIIiiIIIII.ALLATORIxDEMO(string);
        if (object == null) {
            iIIiIiiiIi.info("\u5206\u7c7b " + (String)string + " \u627e\u4e0d\u5230\u5408\u9002\u7684\u5b58\u50a8\u7bb1\u5b50\uff0c\u8df3\u8fc7", new Object[3 & 4]);
            iIIiIiiiIi.IiiiiiiIIi();
            return;
        }
        iIIiIiiiIi.info("\u4e3a\u5206\u7c7b " + (String)string + " \u627e\u5230\u76ee\u6807\u7bb1\u5b50\uff1a" + String.valueOf(object), new Object[3 ^ 3]);
        iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.IIIiIiiIIi);
    }

    private /* synthetic */ void IiiIIIIiiI() {
        if (System.currentTimeMillis() >= this.ALLATORIxDEMO) {
            this.iIIIiIIIii();
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2248 class_22482) {
        void IiIIiIiiiI;
        String IiIIiIiiiI2;
        IIIiIiiiIi iIIiIiiiIi = arrayList;
        String string = iIiIIiiIiI.ALLATORIxDEMO((class_2338)IiIIiIiiiI2).ALLATORIxDEMO();
        ArrayList arrayList = new ArrayList((Collection)iIIiIiiiIi.iiiiIiiIIi.get());
        if (arrayList.contains(string)) {
            iIIiIiiiIi.info("\u7bb1\u5b50 " + String.valueOf(IiIIiIiiiI2) + " \u5df2\u5728\u6e90\u7bb1\u5b50\u5217\u8868\u4e2d", new Object[2 & 5]);
            return;
        }
        arrayList.add(string);
        iIIiIiiiIi.iiiiIiiIIi.set((Object)arrayList);
        IiIIiIiiiI2 = IiIIiIiiiI.getName().getString();
        iIIiIiiiIi.info("\u5df2\u6dfb\u52a0 " + IiIIiIiiiI2 + " \u5230\u6e90\u7bb1\u5b50\u5217\u8868\uff1a" + string, new Object[5 >> 3]);
        iIIiIiiiIi.info("\u5f53\u524d\u6e90\u7bb1\u5b50\u6570\u91cf\uff1a" + arrayList.size(), new Object[3 ^ 3]);
        if (arrayList.size() >= 3 >> 1) {
            iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u5dd6\u915c\u7f0a\u6ee6\u7bb2\u5b26\uff0f\u5399\u4ee6\u577e\u8b9d\u7f18\u4e2e\u5125\u95ce\u5f43\u5bdf\u6a77\u5f2c\u5f76\u59c8\u6522\u7425"), new Object[3 & 4]);
            iIIiIiiiIi.info(iiIIIIiiIi.ALLATORIxDEMO("\u622f\u7ebc\u7ed4\u6da0\u5299\u66af\u5903\u6eeb\u7b88\u5b0b"), new Object[3 ^ 3]);
        }
    }

    private /* synthetic */ boolean ALLATORIxDEMO() {
        boolean bl;
        try {
            Thread.sleep(100L);
            bl = true;
        } catch (InterruptedException interruptedException) {
            return --1 != 0;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IIIiIiiiIi iIIiIiiiIi = iIIiIiiiIi2;
        IIIiIiiiIi iIIiIiiiIi2 = post;
        IIIiIiiiIi IiIIiIiiiI = iIIiIiiiIi;
        if (!IiIIiIiiiI.IiiiiiiIIi()) {
            return;
        }
        IIIiIiiiIi iIIiIiiiIi3 = IiIIiIiiiI;
        iIIiIiiiIi3.iIIiiIIIII.ALLATORIxDEMO();
        if (iIIiIiiiIi3.iiIiIIiIIi != ItemSorterModule.ProcessingState.ALLATORIxDEMO && IiIIiIiiiI.iiIiIIiIIi != ItemSorterModule.ProcessingState.IiIiIIIIiI && System.currentTimeMillis() - IiIIiIiiiI.IIIiIIIiII > (long)((Integer)IiIIiIiiiI.iiiiiIIiiI.get()).intValue() * 1000L) {
            IIIiIiiiIi iIIiIiiiIi4 = IiIIiIiiiI;
            iIIiIiiiIi4.error("\u72b6\u6001 " + String.valueOf((Object)iIIiIiiiIi4.iiIiIIiIIi) + " \u8d85\u65f6\uff0c\u6b63\u5728\u91cd\u7f6e...", new Object[3 ^ 3]);
            IiIIiIiiiI.IiIiiiIIiI();
            return;
        }
        switch (IiIIiIiiiI.iiIiIIiIIi.ordinal()) {
            case 0: {
                IiIIiIiiiI.iIIIIIIiiI();
                return;
            }
            case 1: {
                IiIIiIiiiI.iiiiIIiIii();
                return;
            }
            case 2: {
                IiIIiIiiiI.IIiiIiiIii();
                return;
            }
            case 3: {
                IiIIiIiiiI.IIiIiiIiiI();
                return;
            }
            case 4: {
                IiIIiIiiiI.IiiiiiiiII();
                return;
            }
            case 5: {
                IiIIiIiiiI.iIIiIIiIii();
                return;
            }
            case 6: {
                IiIIiIiiiI.iiIiiiiIIi();
                return;
            }
            case 7: {
                IiIIiIiiiI.IiiIIIIiiI();
                return;
            }
            case 8: {
                IiIIiIiiiI.ALLATORIxDEMO();
                return;
            }
            case 9: {
                IiIIiIiiiI.IiiIiIiIiI();
                return;
            }
            case 10: {
                IiIIiIiiiI.IIiiiIIiiI();
                return;
            }
            case 11: {
                IiIIiIiiiI.IIIIIIiIii();
                return;
            }
            case 12: {
                IiIIiIiiiI.IIIIiIIIII();
                return;
            }
            case 13: {
                IiIIiIiiiI.IiIiiiIIii();
                return;
            }
            case 14: {
                IiIIiIiiiI.iiiiiiiiIi();
                return;
            }
            case 15: {
                IiIIiIiiiI.iIiiIIiiIi();
                return;
            }
        }
    }

    private /* synthetic */ void IiiiiiiIIi() {
        IIIiIiiiIi iIIiIiiiIi = this;
        iIIiIiiiIi.iIiiIiiiii += 4 ^ 5;
        if (iIIiIiiiIi.iIiiIiiiii >= this.iiIIiIiiIi.size()) {
            this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiIIiiIiii);
            return;
        }
        this.ALLATORIxDEMO = System.currentTimeMillis() + (long)((Integer)this.IiIiiiiIIi.get()).intValue();
        this.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiiiiIIIii);
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractBlockEvent interactBlockEvent) {
        void IiIIiIiiiI;
        IIIiIiiiIi iIIiIiiiIi = iIIiIiiiIi2;
        if (iIIiIiiiIi.iiIiIIiIIi != ItemSorterModule.ProcessingState.ALLATORIxDEMO) {
            return;
        }
        IIIiIiiiIi iIIiIiiiIi2 = IiIIiIiiiI.result.getBlockPos();
        IIIiIiiiIi iIIiIiiiIi3 = iIIiIiiiIi;
        class_2248 class_22482 = iIIiIiiiIi3.iiIIIIiIII.world.getBlockState((class_2338)iIIiIiiiIi2).getBlock();
        if (iIIiIiiiIi3.ALLATORIxDEMO(class_22482)) {
            iIIiIiiiIi.ALLATORIxDEMO((class_2338)iIIiIiiiIi2, class_22482);
            IiIIiIiiiI.cancel();
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        int n;
        IIIiIiiiIi iIIiIiiiIi = iIIiIiiiIi3;
        iIIiIiiiIi.info(iIIiiIIiii.ALLATORIxDEMO("\u5f76\u59c8\u5250\u7c58\u73ff\u5b95\u5ec5\u5b7b\u4e5b\u7687\u723f\u54e2"), new Object[3 & 4]);
        IIIiIiiiIi iIIiIiiiIi2 = iIIiIiiiIi;
        iIIiIiiiIi.IiiIIiiiiI.clear();
        iIIiIiiiIi2.iiIIiIiiIi.clear();
        iIIiIiiiIi2.iIiiIiiiii = 2 & 5;
        if (iIIiIiiiIi2.iiIIIIiIII.player == null) {
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiIIiiIiii);
            return;
        }
        int n2 = n = 9;
        while (true) {
            if (n2 >= 36) break;
            IIIiIiiiIi iIIiIiiiIi3 = iIIiIiiiIi.iiIIIIiIII.player.getInventory().getStack(n);
            if (!iIIiIiiiIi3.isEmpty()) {
                IIIiIiiiIi iIIiIiiiIi4 = iIIiIiiiIi;
                String string = iIIiIiiiIi4.iIiIiIiIii.IiiiiiiIIi((class_1799)iIIiIiiiIi3);
                iIIiIiiiIi4.IiiIIiiiiI.computeIfAbsent(string, IiIIiIiiiI -> new ArrayList()).add(iIIiIiiiIi3);
                iIIiIiiiIi.info("\u7269\u54c1 " + iIIiIiiiIi3.getName().getString() + " \u5206\u7c7b\u4e3a\uff1a" + string, new Object[3 >> 2]);
            }
            n2 = ++n;
        }
        if (iIIiIiiiIi.IiiIIiiiiI.isEmpty()) {
            iIIiIiiiIi.info(iiIIIIiiIi.ALLATORIxDEMO("\u6c98\u6752\u7250\u549a\u9719\u89fa\u523f\u7c20"), new Object[3 & 4]);
            iIIiIiiiIi.ALLATORIxDEMO(ItemSorterModule.ProcessingState.iiIIiiIiii);
            return;
        }
        IIIiIiiiIi iIIiIiiiIi5 = iIIiIiiiIi;
        IIIiIiiiIi iIIiIiiiIi6 = iIIiIiiiIi;
        iIIiIiiiIi5.iiIIiIiiIi.addAll(iIIiIiiiIi6.IiiIIiiiiI.keySet());
        iIIiIiiiIi5.info("\u5171\u5206\u7c7b\u51fa " + iIIiIiiiIi6.iiIIiIiiIi.size() + " \u4e2a\u7c7b\u522b\uff1a" + String.join((CharSequence)iIIiiIIiii.ALLATORIxDEMO("z\u0003"), iIIiIiiiIi.iiIIiIiiIi), new Object[2 & 5]);
        iIIiIiiiIi.iiIiiiiiII();
    }
}

