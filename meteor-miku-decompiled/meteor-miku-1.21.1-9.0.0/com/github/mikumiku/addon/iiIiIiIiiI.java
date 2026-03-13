/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.meteor.KeyEvent
 *  meteordevelopment.meteorclient.events.packets.PacketEvent$Receive
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.KeybindSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.movement.Blink
 *  meteordevelopment.meteorclient.utils.misc.Keybind
 *  meteordevelopment.meteorclient.utils.misc.input.KeyAction
 *  meteordevelopment.meteorclient.utils.player.InvUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.text.Text
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.block.ShapeContext
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IiIIiIIIIi;
import com.github.mikumiku.addon.IiiiIIiiiI;
import com.github.mikumiku.addon.iIiIiIiIIi;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiIiiIIiII;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.SurroundPlus2;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import meteordevelopment.meteorclient.events.meteor.KeyEvent;
import meteordevelopment.meteorclient.events.packets.PacketEvent;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.KeybindSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.Blink;
import meteordevelopment.meteorclient.utils.misc.Keybind;
import meteordevelopment.meteorclient.utils.misc.input.KeyAction;
import meteordevelopment.meteorclient.utils.player.InvUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.text.Text;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.block.ShapeContext;

public class iiIiIiIiiI
extends iiiiIiIiii {
    private final Setting<Keybind> iiIIiIiiII;
    private final SettingGroup IIiIiiIiIi;
    private final Setting<Boolean> IIiIIiIIii;
    private final Setting<SurroundPlus2.SurroundType> iIiiIiiiii;
    private final IiIIiIIIIi iIiIiiIiiI;
    private final Setting<Boolean> IIiiiiiiII;
    private final Setting<Integer> IIiiiIIIIi;
    private final Setting<SurroundPlus2.SurroundType> IIIiIIIiII;
    private final Setting<Boolean> iiIiIiiiiI;
    private final Setting<Keybind> IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final Setting<SettingColor> iiiIiIiIIi;
    private final Setting<Integer> iIiIiIiIii;
    private final Setting<Integer> iiiiiIIIii;
    private final Setting<Boolean> iIIiIIiiII;
    private boolean IiiIIiiiiI;
    public boolean IiIIIIiiii;
    private final Setting<SettingColor> IiiIIIiiIi;
    private final SettingGroup iiIIiiIiii;
    private List<class_2338> iIiiIiiiII;
    private final SettingGroup iIIiiIIIII;
    private final List<class_2338> iiIiIIiIIi;
    private final Setting<Integer> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final IiIIiIIIIi iiIIIIiIII;
    private final Setting<ShapeMode> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(Setting<Boolean> setting, String string, String string2, String string3) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        boolean bl;
        Setting<Boolean> setting2 = setting3;
        Setting<Boolean> setting3 = setting;
        Setting<Boolean> IiIIiIiiiI4 = setting2;
        boolean bl2 = bl = !((Boolean)setting3.get()).booleanValue() ? --1 != 0 : false;
        setting3.set((Object)bl2);
        setting3 = bl2 ? IiIIiIiiiI3 : IiIIiIiiiI2;
        IiIIiIiiiI4.info(class_2561.of((String)((String)IiIIiIiiiI + setting3)));
    }

    public iiIiIiIiiI() {
        iiIiIiIiiI iiIiIiIiiI2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iiIiiIIIiI.ALLATORIxDEMO("\u56d1\u814c.]"), iiIiiIIiII.ALLATORIxDEMO("\u4f15\u756d\u65d2\u5713\u5fc0\u901b\u5369\u88ba\u8186\u5db2\u76c8\u73ea\u8ddf\uff4f\u5183\u5c72\u6c58\u6635\u724a\u70db\u904c\u6253\u76e8\u4f67\u5bff\u3061"));
        iiIiIiIiiI2.iiIIiiIiii = iiIiIiIiiI2.settings.createGroup(iiIiiIIIiI.ALLATORIxDEMO("\u903f\u757e\u8bbb\u7f18"));
        iiIiIiIiiI2.iIIiiIIIII = iiIiIiIiiI2.settings.createGroup(iiIiiIIiII.ALLATORIxDEMO("\u7858\u570c\u8bf2\u7f0d"));
        iiIiIiIiiI2.IIiIiiIiIi = iiIiIiIiiI2.settings.getDefaultGroup();
        iiIiIiIiiI2.IIIiIiiIIi = iiIiIiIiiI2.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u97ce\u7fe0\u65a0\u5176\u959b"))).description(iiIiiIIiII.ALLATORIxDEMO("\u5f3f\u73ea\u5bfa\u88a6\u596b\u97db\u7f89\u6595\u511f\u95ae\u5698\u8159\u6a6d\u5f6c"))).defaultValue((Object)(--1 != 0))).build());
        this.IiIiIIIIiI = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u7d0e\u98d4\u67b9\u65a0\u5176\u959b"))).description(iiIiiIIiII.ALLATORIxDEMO("\u5f30\u73c5\u5bf5\u9893\u754b\u7d47\u98c1\u67d0\u6595\u511f\u95ae\u5698\u8159\u6a6d\u5f6c"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiiiIIiiI = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u540a\u757e\u56f1\u816c"))).description(iiIiiIIiII.ALLATORIxDEMO("\u5463\u754b\u65d5\u5714\u5698\u8159\u6a6d\u5f6c"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IIiiIiiiII = this.iiIIiiIiii.add((Setting)((KeybindSetting.Builder)((KeybindSetting.Builder)((KeybindSetting.Builder)new KeybindSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u56a2\u813f\u5fbd\u6372\u9558"))).description(iiIiiIIiII.ALLATORIxDEMO("\u526b\u6321\u56b8\u8179\u6a4d\u5f4c\u76e8\u5fa8\u633b\u954d"))).defaultValue((Object)Keybind.none())).build());
        this.iIiiIiiiii = this.iiIIiiIiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u56d1\u814c\u7c7e\u57fd"))).description(iiIiiIIiII.ALLATORIxDEMO("\u906a\u6285\u56b7\u8176\u76c7\u7c37\u57e8"))).defaultValue((Object)SurroundPlus2.SurroundType.iiIIIIiIII)).build());
        this.iiiiiIIIii = this.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u651b\u7f38\u5ef3\u8fa9"))).description(iiIiiIIiII.ALLATORIxDEMO("\u65da\u573b\u657d\u7f22\u76e7\u5e9a\u8f9c\uff64\u6ba8\u799e\uff6a"))).defaultValue((Object)(0x7A & 0x37))).sliderRange(5 >> 3, 0x31F4 & 0x4FFF).build());
        this.IIiiiIIIIi = this.iiIIiiIiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6bea\u6b77\u651b\u7f38\u6575\u91b9"))).description(iiIiiIIiII.ALLATORIxDEMO("\u6b8c\u6b6d\u655d\u7f02\u76c7\u65d5\u5714\u653c\u91ac"))).sliderRange(4 ^ 5, 0x78 & 0xF).defaultValue((Object)(3 & 5))).build());
        this.iiIiIiiiiI = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u4f3d\u511e\u5e90\u909e"))).description(iiIiiIIiII.ALLATORIxDEMO("\u4f54\u512b\u6552\u7f2d\u8176\u4e48\u65f5\u5734"))).defaultValue((Object)(3 >> 2))).build());
        this.IIiiiiiiII = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u9853\u90be\u56f1\u816c"))).description(iiIiiIIiII.ALLATORIxDEMO("\u576b\u5978\u9815\u6d97\u52e3\u5698\u8159\u65f5\u5734"))).defaultValue((Object)(5 >> 3))).build());
        this.IIiIIiIIii = this.iiIIiiIiii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u4e93\u9873\u909e"))).description(iiIiiIIiII.ALLATORIxDEMO("\u53a9\u6572\u7f0d\u981a\u90ab\u5698\u8159\u65f5\u5734"))).defaultValue((Object)((2 & 5) != 0))).visible(() -> this.IIiiiiiiII.get())).build());
        this.ALLATORIxDEMO = this.iIIiiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u7811\u5719\u6c31\u6600"))).description(iiIiiIIiII.ALLATORIxDEMO("\u81a9\u52e4\u7857\u5723\u9678\u78c1\u5697\u8176\u76c7\u6747\u5f32\u6c78\u6615"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiIIiIiiII = this.iIIiiIIIII.add((Setting)((KeybindSetting.Builder)((KeybindSetting.Builder)((KeybindSetting.Builder)new KeybindSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u7842\u576a\u6c62\u6653\u5fbd\u6372\u9558"))).description(iiIiiIIiII.ALLATORIxDEMO("\u524b\u6301\u8186\u52eb\u7878\u572c\u6c58\u6635\u76e8\u5fa8\u633b\u954d"))).defaultValue((Object)Keybind.none())).build());
        this.iIiIiIiIii = this.iIIiiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u7811\u5719\u5ef3\u8fa9"))).description(iiIiiIIiII.ALLATORIxDEMO("\u7877\u5703\u6748\u5f1d\u6c77\u663a\u76e7\u5e9a\u8f9c\uff64\u6ba8\u799e\uff6a"))).defaultValue((Object)(0x7A & 0x37))).sliderRange(3 ^ 3, 0x7BFC & 0x7EB).build());
        this.IIIIiIiiIi = this.iIIiiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u7b6c\u5fd3\u523e\u6506"))).description(iiIiiIIiII.ALLATORIxDEMO("\u7b0a\u5fc9\u6748\u5f1d\u6c77\u661a\u76c7\u5277\u6513"))).defaultValue((Object)(--5))).sliderRange(3 >> 2, --5).build());
        this.IIIiIIIiII = this.iIIiiIIIII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u7811\u5719\u7c7e\u57fd"))).description(iiIiiIIiII.ALLATORIxDEMO("\u904a\u62a5\u7857\u5723\u6c77\u661a\u76c7\u7c37\u57e8"))).defaultValue((Object)SurroundPlus2.SurroundType.iiIIIIiIII)).build());
        this.iIIiIIiiII = this.IIiIiiIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6e37\u67a5"))).description(iiIiiIIiII.ALLATORIxDEMO("\u6663\u5445\u6e5e\u6790\u5698\u8159\u65f5\u5734"))).defaultValue((Object)(5 >> 3))).build());
        this.IiIIiIiiiI = this.IIiIiiIiIi.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u5f47\u72e0\u6a24\u5f79"))).description(iiIiiIIiII.ALLATORIxDEMO("\u6e71\u67bf\u76c7\u5f2e\u72d5"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.iIIiIIiiII.get())).build());
        int n = 3 >> 2;
        this.iiiIiIiIIi = this.IIiIiiIiIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u51e3\u5951\u4f82\u9734\u9899\u8204"))).description(iiIiiIIiII.ALLATORIxDEMO("\u51a5\u596b\u657d\u7f22\u65da\u573b\u76c7\u4fcb\u9721\u98d0\u8211"))).defaultValue(new SettingColor(n, 0x58EF & 0x27DC, n, 0x3A & 0x4F)).build());
        int n2 = 3 & 4;
        this.IiiIIIiiIi = this.IIiIiiIiIi.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u51e3\u5951\u7e9a\u6737\u9899\u8204"))).description(iiIiiIIiII.ALLATORIxDEMO("\u51a5\u596b\u657d\u7f22\u65da\u573b\u76c7\u7ed3\u6722\u98d0\u8211"))).defaultValue(new SettingColor(n2, 0x1CD & 0x7EFE, n2, 0x73FF & 0xCFF)).build());
        iiIiIiIiiI iiIiIiIiiI3 = this;
        iiIiIiIiiI iiIiIiIiiI4 = this;
        iiIiIiIiiI iiIiIiIiiI5 = this;
        iiIiIiIiiI5.iiIiIIiIIi = new ArrayList<class_2338>();
        iiIiIiIiiI iiIiIiIiiI6 = this;
        iiIiIiIiiI4.iIiiIiiiII = new ArrayList<class_2338>();
        iiIiIiIiiI iiIiIiIiiI7 = this;
        iiIiIiIiiI6.iIiIiiIiiI = new IiIIiIIIIi();
        iiIiIiIiiI iiIiIiIiiI8 = this;
        iiIiIiIiiI4.iiIIIIiIII = new IiIIiIIIIi();
        iiIiIiIiiI3.IiIIIIiiii = 3 >> 2;
        iiIiIiIiiI3.IiiIIiiiiI = 3 ^ 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiIIIiI.ALLATORIxDEMO("r=\u0007pV3\u0005#u\u0012D\"`W\u0005\u8ba1\u66f1\u65c6\u5215\u6756\u6595\u721e\u6729\uff77"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(KeyEvent keyEvent) {
        void IiIIiIiiiI;
        iiIiIiIiiI iiIiIiIiiI2 = iiIiIiIiiI3;
        if (IiIIiIiiiI.action != KeyAction.Press) {
            return;
        }
        Keybind keybind = (Keybind)iiIiIiIiiI2.iiIIiIiiII.get();
        iiIiIiIiiI iiIiIiIiiI3 = (Keybind)iiIiIiIiiI2.IIiiIiiiII.get();
        if (keybind != Keybind.none() && IiIIiIiiiI.key == keybind.getValue()) {
            iiIiIiIiiI iiIiIiIiiI4 = iiIiIiIiiI2;
            iiIiIiIiiI4.ALLATORIxDEMO(iiIiIiIiiI4.ALLATORIxDEMO, iiIiiIIIiI.ALLATORIxDEMO("\u5682\u813f}.\u819c\u528d\u7862\u576a\u6c62\u6673\uff6c"), iiIiiIIiII.ALLATORIxDEMO("\u5db1\u5463\u754b"), iiIiiIIIiI.ALLATORIxDEMO("\u5da4\u7984\u755e"));
            return;
        }
        if (iiIiIiIiiI3 != Keybind.none() && IiIIiIiiiI.key == iiIiIiIiiI3.getValue()) {
            iiIiIiIiiI iiIiIiIiiI5 = iiIiIiIiiI2;
            iiIiIiIiiI5.ALLATORIxDEMO(iiIiIiIiiI5.iiiiiIIiiI, iiIiiIIiII.ALLATORIxDEMO("\u56b7\u8156HG\u65fa\u573b\u56b7\u8156\uff79"), iiIiiIIIiI.ALLATORIxDEMO("\u5da4\u542a\u755e"), iiIiiIIiII.ALLATORIxDEMO("\u5db1\u79cd\u754b"));
        }
    }

    private /* synthetic */ boolean IiiiiiiIIi(class_2338 class_23382) {
        iiIiIiIiiI IiIIiIiiiI;
        iiIiIiIiiI iiIiIiIiiI2 = iiIiIiIiiI3;
        iiIiIiIiiI iiIiIiIiiI3 = class_23382;
        iiIiIiIiiI iiIiIiIiiI4 = IiIIiIiiiI = iiIiIiIiiI2;
        return iiIiIiIiiI4.ALLATORIxDEMO((SurroundPlus2.SurroundType)((Object)iiIiIiIiiI4.IIIiIIIiII.get())).contains(iiIiIiIiiI3);
    }

    @Override
    public void onActivate() {
        if (!this.iiIiIIiIIi.isEmpty()) {
            this.iiIiIIiIIi.clear();
        }
        this.iIiIiiIiiI.ALLATORIxDEMO();
        this.iiIIIIiIII.ALLATORIxDEMO();
        this.IiiIIiiiiI = 3 >> 2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, class_2248 class_22482) {
        void IiIIiIiiiI;
        iiIiIiIiiI iiIiIiIiiI2 = iiIiIiIiiI3;
        iiIiIiIiiI iiIiIiIiiI3 = class_23382;
        iiIiIiIiiI IiIIiIiiiI2 = iiIiIiIiiI2;
        if (!IiIIiIiiiI2.iiIiIIiIIi.contains(iiIiIiIiiI3) && ((class_310)IiIIiIiiiI2.iiIIIIiIII).world.getBlockState((class_2338)iiIiIiIiiI3).isReplaceable() && ((class_310)IiIIiIiiiI2.iiIIIIiIII).world.canPlace(IiIIiIiiiI.getDefaultState(), (class_2338)iiIiIiIiiI3, class_3726.absent())) {
            if (iiiIIIIiiI.IiiiiiiIIi((class_2338)iiIiIiIiiI3, --1 != 0)) {
                if (IiIIiIiiiI2.iIiiIiiiii.get() == SurroundPlus2.SurroundType.IiIIiIiiiI || IiIIiIiiiI2.iIiiIiiiii.get() == SurroundPlus2.SurroundType.iiiiiIIiiI) {
                    int n = 2 & 5;
                    if (((class_310)IiIIiIiiiI2.iiIIIIiIII).world.getBlockState(iiIiIiIiiI3.add(n, -4 >> 2, n)).getBlock().getName().getString().equals(iiIiiIIIiI.ALLATORIxDEMO("7l\u0004"))) {
                        return;
                    }
                }
                IiIIiIiiiI2.iiIiIIiIIi.add((class_2338)iiIiIiIiiI3);
            }
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiIiIiIiiI iiIiIiIiiI6;
        iiIiIiIiiI iiIiIiIiiI2 = iiIiIiIiiI6;
        if (!Modules.get().isActive(Blink.class)) {
            int n;
            int n2;
            if (((Boolean)iiIiIiIiiI2.IiIiIIIIiI.get()).booleanValue()) {
                iiIiIiIiiI2.IiiIIiiiiI = ((class_310)iiIiIiIiiI2.iiIIIIiIII).player.getActiveItem().getItem() == class_1802.CHORUS_FRUIT ? --1 : 0;
            }
            if (!iiIiIiIiiI2.IiIIIIiiii) {
                iiIiIiIiiI2.info(class_2561.of((String)iiIiiIIiII.ALLATORIxDEMO("\u6a62\u573b\u5db1\u5463\u52cb")));
                iiIiIiIiiI2.IiIIIIiiii = --1;
            }
            if (((Boolean)iiIiIiIiiI2.iiiiiIIiiI.get()).booleanValue()) {
                if (((class_310)iiIiIiIiiI2.iiIIIIiIII).player.getInventory().getStack(0x27 & 0x7E).getItem() == class_1802.ELYTRA && ((Boolean)iiIiIiIiiI2.IIIiIiiIIi.get()).booleanValue()) {
                    iiIiIiIiiI2.iiiiiIIiiI.set((Object)((2 & 5) != 0));
                    iiIiIiIiiI2.info(class_2561.of((String)iiIiiIIIiI.ALLATORIxDEMO("\u68e5\u6d1d\u5235\u97ee\u7fe0\uff5a\u81ef\u52de\u5156\u95bb\u56d1\u814c\u6a24\u5f79")));
                }
            }
            int IiIIiIiiiI = IIIiIiIiii.ALLATORIxDEMO(class_1802.OBSIDIAN);
            if (IiIIiIiiiI == -4 >> 2) {
                iiIiIiIiiI2.iiIiIIiIIi.clear();
                return;
            }
            iiIiIiIiiI iiIiIiIiiI3 = iiIiIiIiiI2;
            iiIiIiIiiI3.ALLATORIxDEMO(class_2246.OBSIDIAN);
            if (iiIiIiIiiI3.iiIiIIiIIi.contains(((class_310)iiIiIiIiiI2.iiIIIIiIII).player.getBlockPos().down()) && ((Boolean)iiIiIiIiiI2.iiIiIiiiiI.get()).booleanValue()) {
                IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI);
                boolean bl = 2 ^ 3;
                iiiIIIIiiI.ALLATORIxDEMO(((class_310)iiIiIiIiiI2.iiIIIIiIII).player.getBlockPos().down(), bl, bl, bl);
                IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI);
            }
            iiIiIiIiiI iiIiIiIiiI4 = iiIiIiIiiI2;
            if (iiIiIiIiiI4.iIiIiiIiiI.ALLATORIxDEMO((long)((Integer)iiIiIiIiiI4.iiiiiIIIii.get()).intValue()) && iiIiIiIiiI2.iiIiIIiIIi.size() > 0) {
                n2 = Math.min((Integer)iiIiIiIiiI2.IIiiiIIIIi.get(), iiIiIiIiiI2.iiIiIIiIIi.size());
                int n3 = n = 3 & 4;
                while (n3 < n2) {
                    IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI);
                    boolean bl = 2 ^ 3;
                    iiiIIIIiiI.ALLATORIxDEMO(iiIiIiIiiI2.iiIiIIiIIi.get(n), bl, bl, bl);
                    IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI);
                    iiIiIiIiiI2.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2815(((class_310)iiIiIiIiiI2.iiIIIIiIII).player.currentScreenHandler.syncId));
                    n3 = ++n;
                }
                iiIiIiIiiI2.iIiIiiIiiI.ALLATORIxDEMO();
            }
            if (iiIiIiIiiI2.iIiiIiiiII.size() > 0) {
                iiIiIiIiiI iiIiIiIiiI5 = iiIiIiIiiI2;
                if (iiIiIiIiiI5.iIiIiiIiiI.ALLATORIxDEMO((long)((Integer)iiIiIiIiiI5.iiiiiIIIii.get()).intValue())) {
                    if (IiIIiIiiiI != -4 >> 2) {
                        iiIiIiIiiI2.iIiiIiiiII = iiIiIiIiiI2.iIiiIiiiII.stream().filter(class_23382 -> {
                            iiIiIiIiiI iiIiIiIiiI2 = iiIiIiIiiI3;
                            iiIiIiIiiI iiIiIiIiiI3 = class_23382;
                            iiIiIiIiiI IiIIiIiiiI = iiIiIiIiiI2;
                            if (((class_310)IiIIiIiiiI.iiIIIIiIII).world.getBlockState((class_2338)iiIiIiIiiI3).getBlock().asItem() == class_1802.AIR) {
                                if (iiiIIIIiiI.IiiiiiiIIi((class_2338)iiIiIiIiiI3, (2 ^ 3) != 0) && PlayerUtils.distanceTo((class_2338)iiIiIiIiiI3) <= 4.0) {
                                    return --1 != 0;
                                }
                            }
                            return false;
                        }).collect(Collectors.toList());
                        n2 = Math.min((Integer)iiIiIiIiiI2.IIiiiIIIIi.get(), iiIiIiIiiI2.iIiiIiiiII.size());
                        int n4 = n = 3 & 4;
                        while (n4 < n2) {
                            iiIiIiIiiI this_ = iiIiIiIiiI2.iIiiIiiiII.get(n);
                            if (((class_310)iiIiIiIiiI2.iiIIIIiIII).world.getBlockState((class_2338)this_).isReplaceable() && ((class_310)iiIiIiIiiI2.iiIIIIiIII).world.canPlace(class_2246.OBSIDIAN.getDefaultState(), (class_2338)this_, class_3726.absent())) {
                                int n5 = !(iiIIIIiiIi.ALLATORIxDEMO(this_.down(), class_2246.OBSIDIAN) || iiIIIIiiIi.ALLATORIxDEMO(this_.east(), class_2246.CRYING_OBSIDIAN) || iiIIIIiiIi.ALLATORIxDEMO(this_.west(), class_2246.BEDROCK) || iiIIIIiiIi.ALLATORIxDEMO(this_.south(), class_2246.ENDER_CHEST) || iiIIIIiiIi.ALLATORIxDEMO(this_.north(), class_2246.ANVIL)) ? --1 : 0;
                                if (n5 != 0) {
                                    IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI);
                                    boolean bl = 2 ^ 3;
                                    iiiIIIIiiI.ALLATORIxDEMO((class_2338)this_, bl, bl, bl);
                                    IIIiIiIiii.ALLATORIxDEMO(IiIIiIiiiI);
                                    iiIiIiIiiI2.iiIIIIiIII.getNetworkHandler().sendPacket((class_2596)new class_2815(((class_310)iiIiIiIiiI2.iiIIIIiIII).player.currentScreenHandler.syncId));
                                }
                            }
                            n4 = ++n;
                        }
                    }
                }
            }
        }
    }

    @EventHandler
    public void ALLATORIxDEMO(PacketEvent.Receive receive) {
        iiIiIiIiiI iiIiIiIiiI2 = iiIiIiIiiI3;
        iiIiIiIiiI iiIiIiIiiI3 = receive;
        iiIiIiIiiI IiIIiIiiiI = iiIiIiIiiI2;
        if (((PacketEvent.Receive)iiIiIiIiiI3).packet instanceof class_2708 && ((Boolean)IiIIiIiiiI.IiIiIIIIiI.get()).booleanValue() && IiIIiIiiiI.IiiIIiiiiI && ((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue()) {
            iiIiIiIiiI iiIiIiIiiI4 = IiIIiIiiiI;
            iiIiIiIiiI4.iiiiiIIiiI.set((Object)(5 >> 3));
            iiIiIiIiiI4.info(iiIiiIIiII.ALLATORIxDEMO("\u68a3\u6d27\u5273\u6741\u52c2\u5604\u4f63\u904d\uff6f\u511f\u95ae\u5698\u8159\u6a6d\u5f6c"), new Object[3 ^ 3]);
        }
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

