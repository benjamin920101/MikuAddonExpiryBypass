/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.entity.player.InteractEntityEvent
 *  meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.widgets.WWidget
 *  meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList
 *  meteordevelopment.meteorclient.gui.widgets.containers.WSection
 *  meteordevelopment.meteorclient.gui.widgets.containers.WTable
 *  meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList
 *  meteordevelopment.meteorclient.gui.widgets.input.WDropdown
 *  meteordevelopment.meteorclient.gui.widgets.input.WIntEdit
 *  meteordevelopment.meteorclient.gui.widgets.input.WTextBox
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WButton
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox
 *  meteordevelopment.meteorclient.gui.widgets.pressable.WMinus
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.SoundEventListSetting$Builder
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.misc.Names
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.passive.VillagerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.ProjectileUtil
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.enchantment.Enchantment
 *  net.minecraft.enchantment.EnchantmentHelper
 *  net.minecraft.village.TradeOfferList
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.registry.Registry
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtList
 *  net.minecraft.nbt.NbtElement
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.entry.RegistryEntry$Reference
 *  net.minecraft.registry.RegistryKeys
 *  net.minecraft.registry.tag.EnchantmentTags
 *  org.apache.commons.io.FilenameUtils
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiiiIIi;
import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.IIiIiIiiIi;
import com.github.mikumiku.addon.IiiIiIiIii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIIiiIIIii;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.modules.VillagerRoller;
import it.unimi.dsi.fastutil.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ObjectIntImmutablePair;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.entity.player.InteractEntityEvent;
import meteordevelopment.meteorclient.events.entity.player.StartBreakingBlockEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList;
import meteordevelopment.meteorclient.gui.widgets.containers.WSection;
import meteordevelopment.meteorclient.gui.widgets.containers.WTable;
import meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList;
import meteordevelopment.meteorclient.gui.widgets.input.WDropdown;
import meteordevelopment.meteorclient.gui.widgets.input.WIntEdit;
import meteordevelopment.meteorclient.gui.widgets.input.WTextBox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox;
import meteordevelopment.meteorclient.gui.widgets.pressable.WMinus;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.SoundEventListSetting;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.misc.Names;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.village.TradeOfferList;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtElement;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.EnchantmentTags;
import org.apache.commons.io.FilenameUtils;

public class IIiiIiiiii
extends iiiiIiIiii {
    private VillagerRoller.State IiIiiIIiiI;
    private final Setting<Boolean> iIIIIiiiii;
    private final Setting<Boolean> IiIiIIIiiI;
    private long iIIIIiiiIi;
    private final Setting<Boolean> iiIIiiIiIi;
    private final Setting<Boolean> IiiIIiIiIi;
    private final Setting<Integer> iiiiIiiIIi;
    private final Setting<Boolean> iiIIiIiiIi;
    private final Setting<Boolean> IiIiiiiIIi;
    private final Setting<Boolean> iiIIiIiiII;
    private final Setting<Boolean> IIiIiiIiIi;
    private final Setting<Boolean> IIiIIiIIii;
    private final Setting<Boolean> iIiiIiiiii;
    private class_2338 iIiIiiIiiI;
    private static final Path IIiiiiiiII = MeteorClient.FOLDER.toPath().resolve(IIIIiiiIIi.ALLATORIxDEMO("\u000eZ\u0014\u007f9T=A\n\\4_=A"));
    private final Setting<Boolean> IIiiiIIIIi;
    private final Setting<Boolean> IIIiIIIiII;
    private long iiIiIiiiiI;
    private final SettingGroup IIiiIiiiII;
    private final Setting<Double> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private final SettingGroup iIiIiIiIii;
    private final Setting<Boolean> iiiiiIIIii;
    private final Setting<Boolean> iIIiIIiiII;
    private class_2248 IiiIIiiiiI;
    private final SettingGroup IiIIIIiiii;
    private final Setting<List<class_3414>> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private long iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Integer> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Double> iiiiiIIiiI;
    private class_1646 iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private final List<iIIiiIIIii> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractEntityEvent interactEntityEvent) {
        void IiIIiIiiiI;
        IIiiIiiiii iIiiIiiiii = iIiiIiiiii2;
        if (iIiiIiiiii.IiIiiIIiiI != VillagerRoller.State.iIIiiIIIII) {
            return;
        }
        IIiiIiiiii iIiiIiiiii2 = IiIIiIiiiI.entity;
        if (!(iIiiIiiiii2 instanceof class_1646)) {
            return;
        }
        class_1646 class_16462 = (class_1646)iIiiIiiiii2;
        iIiiIiiiii.iiIIIIiIII = class_16462;
        iIiiIiiiii.IiIiiIIiiI = VillagerRoller.State.IiIiIIIIiI;
        if (((Boolean)iIiiIiiiii.iiIIiiIiIi.get()).booleanValue()) {
            iiiiIiiiII.ALLATORIxDEMO(IIiIIIiIii.ALLATORIxDEMO("L\u000f#\u5f44\u5234"));
        }
        IiIIiIiiiI.cancel();
    }

    /*
     * WARNING - void declaration
     */
    public WWidget getWidget(GuiTheme guiTheme) {
        void IiIIiIiiiI;
        IIiiIiiiii iIiiIiiiii = this;
        IIiiIiiiii iIiiIiiiii2 = this = IiIIiIiiiI.verticalList();
        iIiiIiiiii.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)iIiiIiiiii2);
        return iIiiIiiiii2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WVerticalList wVerticalList, GuiTheme guiTheme, iIIiiIIIii iIIiiIIIii2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiiIiiiii iIiiIiiiii = iIIiiIIIii3;
        iIIiiIIIii iIIiiIIIii3 = iIIiiIIIii2;
        IIiiIiiiii IiIIiIiiiI3 = iIiiIiiiii;
        iIIiiIIIii iIIiiIIIii4 = iIIiiIIIii3;
        iIIiiIIIii3.ALLATORIxDEMO = 4 ^ 5;
        iIIiiIIIii4.iiiiiIIiiI = 0x4D & 0x72;
        iIIiiIIIii4.iiIIIIiIII = 2 ^ 3;
        IiIIiIiiiI3.ALLATORIxDEMO.add(iIIiiIIIii3);
        IiIIiIiiiI2.clear();
        IiIIiIiiiI3.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)IiIIiIiiiI2);
    }

    private static /* synthetic */ void IiiiiiiIIi(iIIiiIIIii iIIiiIIIii2, class_6880.class_6883 class_68832) {
        iIIiiIIIii IiIIiIiiiI = class_68832;
        iIIiiIIIii IiIIiIiiiI2 = iIIiiIIIii2;
        IiIIiIiiiI2.iiiiiIIiiI = IIiiIiiiii.ALLATORIxDEMO((class_6880<class_1887>)IiIIiIiiiI);
    }

    private static /* synthetic */ void IiiiiiiIIi(iIIiiIIIii iIIiiIIIii2, WIntEdit wIntEdit) {
        iIIiiIIIii IiIIiIiiiI = wIntEdit;
        iIIiiIIIii IiIIiIiiiI2 = iIIiiIIIii2;
        IiIIiIiiiI2.iiiiiIIiiI = IiIIiIiiiI.get();
    }

    private static /* synthetic */ void ALLATORIxDEMO(iIIiiIIIii iIIiiIIIii2, WCheckbox wCheckbox) {
        iIIiiIIIii IiIIiIiiiI = wCheckbox;
        iIIiiIIIii IiIIiIiiiI2 = iIIiiIIIii2;
        IiIIiIiiiI2.iiIIIIiIII = ((WCheckbox)IiIIiIiiiI).checked;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(WVerticalList wVerticalList, Optional optional, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        IIiiIiiiii iIiiIiiiii = iIIiiIIIii2;
        IiIIiIiiiI3.clear();
        if (IiIIiIiiiI2.isPresent()) {
            Iterator<iIIiiIIIii> iterator;
            Iterator<iIIiiIIIii> iterator2 = iterator = iIiiIiiiii.ALLATORIxDEMO.iterator();
            while (iterator2.hasNext()) {
                iIIiiIIIii iIIiiIIIii2 = iterator.next();
                ((class_2378)IiIIiIiiiI2.get()).getEntry(iIIiiIIIii2.IiIIiIiiiI).ifPresent(class_68832 -> {
                    iIIiiIIIii IiIIiIiiiI = class_68832;
                    iIIiiIIIii IiIIiIiiiI2 = iIIiiIIIii2;
                    IiIIiIiiiI2.iiiiiIIiiI = IIiiIiiiii.ALLATORIxDEMO((class_6880<class_1887>)IiIIiIiiiI);
                });
                iterator2 = iterator;
            }
        }
        iIiiIiiiii.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)IiIIiIiiiI3);
    }

    private /* synthetic */ void ALLATORIxDEMO(class_3943 class_39432) {
        IIiiIiiiii iIiiIiiiii = iIiiIiiiii2;
        IIiiIiiiii iIiiIiiiii2 = class_39432;
        IIiiIiiiii IiIIiIiiiI = iIiiIiiiii;
        IiIIiIiiiI.ALLATORIxDEMO(iIiiIiiiii2.getOffers());
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(PacketEvent.Receive receive) {
        IIiiIiiiii iIiiIiiiii = iIiiIiiiii2;
        IIiiIiiiii iIiiIiiiii2 = receive;
        IIiiIiiiii IiIIiIiiiI = iIiiIiiiii;
        if (IiIIiIiiiI.IiIiiIIiiI != VillagerRoller.State.iiIIIIiIII) {
            return;
        }
        class_2596 class_25962 = ((PacketEvent.Receive)iIiiIiiiii2).packet;
        if (!(class_25962 instanceof class_3943)) {
            return;
        }
        iIiiIiiiii2 = (class_3943)class_25962;
        IiIIiIiiiI.iiIIIIiIII.executeSync(() -> IiIIiIiiiI.ALLATORIxDEMO((class_3943)iIiiIiiiii2));
    }

    @Override
    public void onActivate() {
        IIiiIiiiii iIiiIiiiii = this;
        super.onActivate();
        if (iIiiIiiiii.toggleOnBindRelease) {
            this.toggleOnBindRelease = 3 & 4;
            if (((Boolean)this.iiIIiiIiIi.get()).booleanValue()) {
                this.warning(IIIIiiiIIi.ALLATORIxDEMO("\u4f4f\u769b\u206d\u6359\u9515\u919f\u6500\u65a3\u5239\u633c\u202d\u8be1\u7f5a\u4e25\u0000\nf\u001d\uff1f\u6249\u5dc1\u7e97\u5e1d\u4f18\u5160\u95b5\u4eb5\uff54\u7732\u5fcf\u4f53\u63ca\u67d6\u95b6\u98ab"), new Object[3 >> 2]);
            }
        }
        this.IiIiiIIiiI = VillagerRoller.State.IiIIiIiiiI;
        if (((Boolean)this.iiIIiiIiIi.get()).booleanValue()) {
            this.info(IIiIIIiIii.ALLATORIxDEMO("\u6518\u51bf\u4f63\u60b7\u8982\u5273\u7687\u8bf6\u53f3\u65fd\u5754"), new Object[5 >> 3]);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WDropdown wDropdown, WVerticalList wVerticalList, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        IIiiIiiiii iIiiIiiiii = iIiiIiiiii2;
        IIiiIiiiii iIiiIiiiii2 = wVerticalList;
        IIiiIiiiii IiIIiIiiiI2 = iIiiIiiiii;
        if (IIiIiIiiIi.ALLATORIxDEMO(new File(new File(MeteorClient.FOLDER, IIIIiiiIIi.ALLATORIxDEMO("\u000eZ\u0014\u007f9T=A\n\\4_=A")), (String)IiIIiIiiiI.get() + ".nbt"), IiIIiIiiiI2.ALLATORIxDEMO, string -> {
            String IiIIiIiiiI = string;
            IIiiIiiiii IiIIiIiiiI2 = IiIIiIiiiI2;
            IiIIiIiiiI2.error(IiIIiIiiiI, new Object[5 >> 3]);
        })) {
            void IiIIiIiiiI3;
            IIiiIiiiii iIiiIiiiii3 = IiIIiIiiiI2;
            iIiiIiiiii2.clear();
            iIiiIiiiii3.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI3, (WVerticalList)iIiiIiiiii2);
            iIiiIiiiii3.info(IIiIIIiIii.ALLATORIxDEMO("\u52e4\u8f7e\u6254\u529c"), new Object[2 & 5]);
            return;
        }
        IiIIiIiiiI2.error(IIIIiiiIIi.ALLATORIxDEMO("\u5293\u8f25\u65b4\u4eae\u5902\u8d7d\u3031"), new Object[3 ^ 3]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiiII(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiiIiiiii iIiiIiiiii = this;
        IiIIiIiiiI2.clear();
        for (iIIiiIIIii iIIiiIIIii2 : iIiiIiiiii.ALLATORIxDEMO) {
            if (iIIiiIIIii2.iiiiiIIiiI >= (0x6F & 0x50)) continue;
            iIIiiIIIii2.iiiiiIIiiI += 2 ^ 3;
        }
        iIiiIiiiii.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)IiIIiIiiiI2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IIiiIiiiii iIiiIiiiii = object;
        Object object = pre;
        IIiiIiiiii IiIIiIiiiI = iIiiIiiiii;
        switch (IiIIiIiiiI.IiIiiIIiiI.ordinal()) {
            case 3: {
                if (((Boolean)IiIIiIiiiI.iIIIIiiiii.get()).booleanValue()) {
                    IiIIiIiiiI.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2846(class_2846.class_2847.STOP_DESTROY_BLOCK, IiIIiIiiiI.iIiIiiIiiI, class_2350.DOWN));
                }
                if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState(IiIIiIiiiI.iIiIiiIiiI) == class_2246.AIR.getDefaultState()) {
                    IiIIiIiiiI.IiIiiIIiiI = VillagerRoller.State.iIiiIiiiII;
                    return;
                }
                if (((Boolean)IiIIiIiiiI.iIIIIiiiii.get()).booleanValue()) break;
                if (BlockUtils.breakBlock((class_2338)IiIIiIiiiI.iIiIiiIiiI, (4 ^ 5) != 0)) break;
                IiIIiIiiiI.error(IIiIIIiIii.ALLATORIxDEMO("\u65a4\u6cd6\u7870\u574c\u6343\u5b99\u65fd\u5754"), new Object[3 & 4]);
                IiIIiIiiiI.toggle();
                return;
            }
            case 4: {
                if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState(IiIIiIiiiI.iIiIiiIiiI).isOf(class_2246.LECTERN)) {
                    if (((Boolean)IiIIiIiiiI.IIiiiIIIIi.get()).booleanValue()) {
                        IiIIiIiiiI.info(IIIIiiiIIi.ALLATORIxDEMO("\u526f\u53e5\u65e1\u5764\u634e\u63ab\u88f3\u6497\u9558\uff2c"), new Object[3 & 4]);
                    }
                    IiIIiIiiiI.IiIiiIIiiI = VillagerRoller.State.IiIiIIIIiI;
                    return;
                }
                if (!IiiiIiiIII.ALLATORIxDEMO(IiIIiIiiiI.iiIIIIiIII.getVillagerData())) break;
                IiIIiIiiiI.IiIiiIIiiI = VillagerRoller.State.iiIiIIiIIi;
                return;
            }
            case 5: {
                int this_ = IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI.IiiIIiiiiI.asItem());
                if (this_ == -4 >> 2) {
                    IiIIiIiiiI.ALLATORIxDEMO(IIiIIIiIii.ALLATORIxDEMO("\u8088\u5306\u4e69\u6729\u623a\u5233\u8bf6\u53f3"));
                    return;
                }
            }
            if (!iiiIIIIiiI.IiiiiiiIIi(IiIIiIiiiI.iIiIiiIiiI, 3 >> 1)) {
                IiIIiIiiiI.ALLATORIxDEMO(IIIIiiiIIi.ALLATORIxDEMO("\u8bd6\u4f15\u7f5d\u65b8\u6ce6\u6566\u7f5d\u8bea\u53c3"));
                return;
            }
            IIiiIiiiii iIiiIiiiii2 = IiIIiIiiiI;
            if (!iiiIIIIiiI.ALLATORIxDEMO(iIiiIiiiii2.iIiIiiIiiI, iIiiIiiiii2.IiiIIiiiiI.asItem())) {
                IiIIiIiiiI.ALLATORIxDEMO(IIiIIIiIii.ALLATORIxDEMO("\u657a\u7f6d\u8bf6\u53f3\u5975\u8d26"));
                return;
            }
            IiIIiIiiiI.IiIiiIIiiI = VillagerRoller.State.IIIIiIiiIi;
            if ((Integer)IiIIiIiiiI.iiIiIIiIIi.get() <= 0) break;
            IiIIiIiiiI.iIiiIiiiII = System.currentTimeMillis();
            return;
            case 6: {
                if ((Integer)IiIIiIiiiI.iiIiIIiIIi.get() > 0 && IiIIiIiiiI.iIiiIiiiII + (long)((Integer)IiIIiIiiiI.iiIiIIiIIi.get()).intValue() <= System.currentTimeMillis()) {
                    if (((Boolean)IiIIiIiiiI.IIiIIiIIii.get()).booleanValue()) {
                        IiIIiIiiiI.info(IIIIiiiIIi.ALLATORIxDEMO("\u6762\u6c69\u6739\u5770\u6334\u5bc2\u65c5\u95ac\u51b6\u63fd\u53e4\u8014\u4e29"), new Object[3 ^ 3]);
                    }
                    IiIIiIiiiI.IiIiiIIiiI = VillagerRoller.State.IiIiIIIIiI;
                    return;
                }
                if (IiIIiIiiiI.iiIIIIiIII.world.getBlockState(IiIIiIiiiI.iIiIiiIiiI) == class_2246.AIR.getDefaultState()) {
                    if (((Boolean)IiIIiIiiiI.IIiiiIIIIi.get()).booleanValue()) {
                        IiIIiIiiiI.info(IIiIIIiIii.ALLATORIxDEMO("\u8bf6\u53f3\u657a\u7f6d\u88cf\u672e\u52e5\u566b\u64e0\u9503\uff4c\u53ce\u4f18\u5f09\uff5b\uff0a"), new Object[3 ^ 3]);
                    }
                    IiIIiIiiiI.IiIiiIIiiI = VillagerRoller.State.iiIiIIiIIi;
                    return;
                }
                if (!IiIIiIiiiI.iiIIIIiIII.world.getBlockState(IiIIiIiiiI.iIiIiiIiiI).isOf(class_2246.LECTERN)) {
                    if (((Boolean)IiIIiIiiiI.IIiiiIIIIi.get()).booleanValue()) {
                        IiIIiIiiiI.info(IIIIiiiIIi.ALLATORIxDEMO("\u6566\u7f5d\u4ede\u952a\u8bb7\u76b7\u65e1\u5764\uff47\uff32"), new Object[3 ^ 3]);
                    }
                    IiIIiIiiiI.IiIiiIIiiI = VillagerRoller.State.IiIiIIIIiI;
                    return;
                }
                if (IiiiIiiIII.ALLATORIxDEMO(IiIIiIiiiI.iiIIIIiIII.getVillagerData())) break;
                IiIIiIiiiI.IiIiiIIiiI = VillagerRoller.State.iiIIIIiIII;
                IiIIiIiiiI.ALLATORIxDEMO();
                return;
            }
            case 7: {
                object = (Integer)IiIIiIiiiI.iiiiIiiIIi.get();
                if ((Integer)object <= 0) break;
                if (IiIIiIiiiI.iIIIIiiiIi < (long)((Integer)object).intValue()) {
                    ++IiIIiIiiiI.iIIIIiiiIi;
                    return;
                }
                if (((Boolean)IiIIiIiiiI.iiiiiIIIii.get()).booleanValue()) {
                    IiIIiIiiiI.info(IIiIIIiIii.ALLATORIxDEMO("\u5395\u9002\u53a2\u4e03\u4e6e\u4ea7\u4ed6\u6573\u632a\u5306"), new Object[3 & 4]);
                }
                IiIIiIiiiI.ALLATORIxDEMO();
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iIIiiiIiiI(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        IIiiIiiiii iIiiIiiiii = iIiiIiiiii2;
        IIiiIiiiii iIiiIiiiii2 = wVerticalList;
        IIiiIiiiii IiIIiIiiiI2 = iIiiIiiiii;
        iIiiIiiiii2.clear();
        IIiiIiiiii iIiiIiiiii3 = IiIIiIiiiI2;
        iIiiIiiiii3.ALLATORIxDEMO.clear();
        iIiiIiiiii3.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)iIiiIiiiii2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WVerticalList wVerticalList, iIIiiIIIii iIIiiIIIii2, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiiIiiiii iIiiIiiiii = iIiiIiiiii2;
        IIiiIiiiii iIiiIiiiii2 = wVerticalList;
        IIiiIiiiii IiIIiIiiiI3 = iIiiIiiiii;
        iIiiIiiiii2.clear();
        IiIIiIiiiI3.ALLATORIxDEMO.remove(IiIIiIiiiI2);
        IiIIiIiiiI3.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)iIiiIiiiii2);
    }

    public String getInfoString() {
        return this.IiIiiIIiiI.toString();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(GuiTheme guiTheme, int n, WVerticalList wVerticalList) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiiIiiiii iIiiIiiiii = iIiiIiiiii2;
        IIiiIiiiii iIiiIiiiii2 = guiTheme;
        IIiiIiiiii IiIIiIiiiI3 = iIiiIiiiii;
        IiIIiIiiiI3.iiIIIIiIII.setScreen((class_437)new IiiIiIiIii((GuiTheme)iIiiIiiiii2, (Boolean)IiIIiIiiiI3.IiIiIIIIiI.get(), arg_0 -> IiIIiIiiiI3.ALLATORIxDEMO((int)IiIIiIiiiI2, (WVerticalList)IiIIiIiiiI, (GuiTheme)iIiiIiiiii2, arg_0)));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void iiIiiiiiII(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiiIiiiii iIiiIiiiii = this;
        IiIIiIiiiI2.clear();
        Object object = this = iIiiIiiiii.ALLATORIxDEMO.iterator();
        while (object.hasNext()) {
            ((iIIiiIIIii)this.next()).iiIIIIiIII = 3 & 4;
            object = this;
        }
        iIiiIiiiii.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)IiIIiIiiiI2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WTextBox wTextBox, WVerticalList wVerticalList, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        IIiiIiiiii iIiiIiiiii;
        void IiIIiIiiiI2;
        IIiiIiiiii IiIIiIiiiI3;
        IIiiIiiiii iIiiIiiiii2 = iIiiIiiiii3;
        IIiiIiiiii iIiiIiiiii3 = wVerticalList;
        IIiiIiiiii iIiiIiiiii4 = IiIIiIiiiI3 = iIiiIiiiii2;
        if (IIiIiIiiIi.IiiiiiiIIi(new File(new File(MeteorClient.FOLDER, IIiIIIiIii.ALLATORIxDEMO("\u0012j\bO%d!q\u0016l(o!q")), IiIIiIiiiI2.get() + ".nbt"), IiIIiIiiiI3.ALLATORIxDEMO, string -> {
            String IiIIiIiiiI = string;
            IIiiIiiiii IiIIiIiiiI2 = IiIIiIiiiI3;
            IiIIiIiiiI2.error(IiIIiIiiiI, new Object[3 ^ 3]);
        })) {
            iIiiIiiiii4.info(IIIIiiiIIi.ALLATORIxDEMO("\u4f85\u5b6b\u6248\u52ac"), new Object[3 ^ 3]);
            iIiiIiiiii = iIiiIiiiii3;
        } else {
            iIiiIiiiii4.error(IIiIIIiIii.ALLATORIxDEMO("\u4f99\u5b5b\u5975\u8d26"), new Object[3 & 4]);
            iIiiIiiiii = iIiiIiiiii3;
        }
        iIiiIiiiii.clear();
        IiIIiIiiiI3.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)iIiiIiiiii3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiIIIIiiI(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiiIiiiii iIiiIiiiii = this;
        IiIIiIiiiI2.clear();
        Object object = this = iIiiIiiiii.ALLATORIxDEMO.iterator();
        while (object.hasNext()) {
            ((iIIiiIIIii)this.next()).iiiiiIIiiI = 2 & 5;
            object = this;
        }
        iIiiIiiiii.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)IiIIiIiiiI2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiiIiiiii iIiiIiiiii = this;
        IiIIiIiiiI2.clear();
        for (iIIiiIIIii iIIiiIIIii2 : iIiiIiiiii.ALLATORIxDEMO) {
            if (iIIiiIIIii2.iiiiiIIiiI <= 0) continue;
            iIIiiIIIii2.iiiiiIIiiI -= 4 ^ 5;
        }
        iIiiIiiiii.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)IiIIiIiiiI2);
    }

    public Module fromTag(class_2487 class_24872) {
        IIiiIiiiii IiIIiIiiiI;
        IIiiIiiiii iIiiIiiiii = object;
        Object object = class_24872;
        IIiiIiiiii iIiiIiiiii2 = IiIIiIiiiI = iIiiIiiiii;
        super.fromTag((class_2487)object);
        if (((Boolean)iIiiIiiiii2.iIIiIIiiII.get()).booleanValue()) {
            class_2499 class_24992 = IiiiIiiIII.ALLATORIxDEMO((class_2487)object, IIiIIIiIii.ALLATORIxDEMO("q+o(j*d"));
            IiIIiIiiiI.ALLATORIxDEMO.clear();
            Object object2 = object = class_24992.iterator();
            while (object2.hasNext()) {
                class_2520 class_25202 = (class_2520)object.next();
                if (class_25202.getType() != (0x2A & 0x5F)) {
                    IiIIiIiiiI.info(IIIIiiiIIi.ALLATORIxDEMO("\u65d3\u6510\u76b7\u524f\u885b\u511b\u7d13"), new Object[2 & 5]);
                    object2 = object;
                    continue;
                }
                IiIIiIiiiI.ALLATORIxDEMO.add(new iIIiiIIIii().ALLATORIxDEMO((class_2487)class_25202));
                object2 = object;
            }
        }
        return IiIIiIiiiI;
    }

    public Map<String, Integer> ALLATORIxDEMO() {
        IIiiIiiiii iIiiIiiiii = object;
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        if (iIiiIiiiii.iiIIIIiIII.world == null) {
            return hashMap;
        }
        Object object = iIiiIiiiii.iiIIIIiIII.world.getRegistryManager().getOptional(class_7924.ENCHANTMENT);
        if (((Optional)object).isEmpty()) {
            return hashMap;
        }
        Iterator iterator = object = ((class_2378)((Optional)object).get()).getEntrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            String string = ((class_5321)entry.getKey()).getValue().toString();
            int n = ((class_1887)entry.getValue()).getMaxLevel();
            iterator = object;
            hashMap.put(string, n);
        }
        return hashMap;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(WVerticalList wVerticalList, GuiTheme guiTheme) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIiiIiiiii iIiiIiiiii = this;
        IiIIiIiiiI2.clear();
        Object object = this = iIiiIiiiii.ALLATORIxDEMO.iterator();
        while (object.hasNext()) {
            int cfr_ignored_0 = 4 ^ 5;
            boolean cfr_ignored_1 = ((iIIiiIIIii)this.next()).iiIIIIiIII;
            ((iIIiiIIIii)this.next()).iiIIIIiIII = ((iIIiiIIIii)this.next()).iiIIIIiIII;
            object = this;
        }
        iIiiIiiiii.ALLATORIxDEMO((GuiTheme)IiIIiIiiiI, (WVerticalList)IiIIiIiiiI2);
    }

    public class_2487 toTag() {
        IIiiIiiiii iIiiIiiiii;
        IIiiIiiiii iIiiIiiiii2 = iIiiIiiiii = this;
        class_2487 class_24872 = super.toTag();
        if (((Boolean)iIiiIiiiii2.iIIiIIiiII.get()).booleanValue()) {
            class_2499 class_24992 = new class_2499();
            Object object = this = iIiiIiiiii.ALLATORIxDEMO.iterator();
            while (object.hasNext()) {
                iIIiiIIIii iIIiiIIIii2 = (iIIiiIIIii)this.next();
                object = this;
                class_24992.add((Object)iIIiiIIIii2.toTag());
            }
            class_24872.put(IIIIiiiIIi.ALLATORIxDEMO("A7_4Z6T"), (class_2520)class_24992);
        }
        return class_24872;
    }

    public List<Pair<class_6880<class_1887>, Integer>> ALLATORIxDEMO(class_1799 class_17992) {
        IIiiIiiiii iIiiIiiiii = object;
        Object object = class_17992;
        IIiiIiiiii IiIIiIiiiI = iIiiIiiiii;
        ArrayList<Pair<class_6880<class_1887>, Integer>> arrayList = new ArrayList<Pair<class_6880<class_1887>, Integer>>();
        Object object2 = object = class_1890.getEnchantments((class_1799)object).getEnchantmentEntries().iterator();
        while (object2.hasNext()) {
            Object2IntMap.Entry entry = (Object2IntMap.Entry)object.next();
            arrayList.add(ObjectIntImmutablePair.of((class_6880)entry.getKey(), entry.getIntValue()));
            object2 = object;
        }
        return arrayList;
    }

    public void ALLATORIxDEMO() {
        IIiiIiiiii iIiiIiiiii = iIiiIiiiii3;
        if (((Boolean)iIiiIiiiii.iiIIiIiiII.get()).booleanValue() && iIiiIiiiii.iiIIIIiIII.currentScreen != null) {
            if (((Boolean)iIiiIiiiii.IIIIiIiiIi.get()).booleanValue()) {
                iIiiIiiiii.info(IIiIIIiIii.ALLATORIxDEMO("\u5273\u53d5\u5d96\u66a1\u5018\uff0f\u4e4a\u6752\u6c55\u4ea7\u4ed6\u4ee6\u7ea3\u7eee"), new Object[2 & 5]);
                return;
            }
        } else {
            IIiiIiiiii iIiiIiiiii2 = iIiiIiiiii;
            IIiiIiiiii iIiiIiiiii3 = iIiiIiiiii2.iiIIIIiIII.player.getEyePos();
            class_243 class_2432 = iIiiIiiiii2.iiIIIIiIII.getEyePos();
            iIiiIiiiii3 = class_1675.raycast((class_1297)iIiiIiiiii2.iiIIIIiIII.player, (class_243)iIiiIiiiii3, (class_243)class_2432, (class_238)iIiiIiiiii.iiIIIIiIII.getBoundingBox(), class_1297::canHit, (double)iIiiIiiiii3.squaredDistanceTo(class_2432));
            IIiiIiiiii iIiiIiiiii4 = iIiiIiiiii;
            if (iIiiIiiiii3 == null) {
                iIiiIiiiii4.iiIIIIiIII.interactionManager.interactEntity((class_1657)iIiiIiiiii.iiIIIIiIII.player, (class_1297)iIiiIiiiii.iiIIIIiIII, class_1268.MAIN_HAND);
                iIiiIiiiii.iIIIIiiiIi = 0L;
                return;
            }
            if (!iIiiIiiiii4.iiIIIIiIII.interactionManager.interactEntityAtLocation((class_1657)iIiiIiiiii.iiIIIIiIII.player, (class_1297)iIiiIiiiii.iiIIIIiIII, (class_3966)iIiiIiiiii3, class_1268.MAIN_HAND).isAccepted()) {
                iIiiIiiiii.iiIIIIiIII.interactionManager.interactEntity((class_1657)iIiiIiiiii.iiIIIIiIII.player, (class_1297)iIiiIiiiii.iiIIIIiIII, class_1268.MAIN_HAND);
                iIiiIiiiii.iIIIIiiiIi = 0L;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(GuiTheme guiTheme, WVerticalList wVerticalList) {
        void IiIIiIiiiI;
        IIiiIiiiii iIiiIiiiii = iIiiIiiiii2;
        IIiiIiiiii iIiiIiiiii2 = guiTheme;
        IIiiIiiiii IiIIiIiiiI2 = iIiiIiiiii;
        IiIIiIiiiI2.iiIIIIiIII.setScreen((class_437)new IiiIiIiIii((GuiTheme)iIiiIiiiii2, (Boolean)IiIIiIiiiI2.IiIiIIIIiI.get(), arg_0 -> IiIIiIiiiI2.ALLATORIxDEMO((WVerticalList)IiIIiIiiiI, (GuiTheme)iIiiIiiiii2, arg_0)));
    }

    /*
     * Exception decompiling
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

