/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.renderer.ShapeMode
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.ColorSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.utils.entity.EntityUtils
 *  meteordevelopment.meteorclient.utils.entity.SortPriority
 *  meteordevelopment.meteorclient.utils.entity.Target
 *  meteordevelopment.meteorclient.utils.entity.TargetUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.player.Rotations
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.render.color.SettingColor
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Items
 *  net.minecraft.world.GameMode
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiIiIiii;
import com.github.mikumiku.addon.IIIiiiIIii;
import com.github.mikumiku.addon.IIiIiIiiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.ColorSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.entity.EntityUtils;
import meteordevelopment.meteorclient.utils.entity.SortPriority;
import meteordevelopment.meteorclient.utils.entity.Target;
import meteordevelopment.meteorclient.utils.entity.TargetUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.player.Rotations;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.world.GameMode;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;

public class iIiiiiiIII
extends iiiiIiIiii {
    private final Setting<SortPriority> IiiIIIiiIi;
    private final List<class_1297> iiIIiiIiii;
    private final Setting<SettingColor> iIiiIiiiII;
    private final Setting<SettingColor> iIIiiIIIII;
    private final Setting<Double> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final SettingGroup IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private final Setting<ShapeMode> iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    public void onDeactivate() {
        this.iiIIiiIiii.clear();
    }

    public String getInfoString() {
        if (!this.iiIIiiIiii.isEmpty()) {
            return EntityUtils.getName((class_1297)this.iiIIiiIiii.getFirst());
        }
        return null;
    }

    public iIiiiiiIII() {
        iIiiiiiIII iIiiiiiIII2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, IIiIiIiiII.ALLATORIxDEMO("\u97dd\u7fa5\u8fb8\u4eda"), IIIiiiIIii.ALLATORIxDEMO("\u97b1\u7fc6\u8f9e\u4ef3"));
        iIiiiiiIII2.IiIiIIIIiI = iIiiiiiIII2.settings.getDefaultGroup();
        iIiiiiiIII2.iiiiiIIiiI = iIiiiiiIII2.settings.createGroup(IIiIiIiiII.ALLATORIxDEMO("\u6e77\u67b3\u8bfb\u7f0e"));
        iIiiiiiIII iIiiiiiIII3 = this;
        iIiiiiiIII2.iiIIiiIiii = new ArrayList<class_1297>();
        iIiiiiiIII2.IiiIIIiiIi = iIiiiiiIII2.IiIiIIIIiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIiiiIIii.ALLATORIxDEMO("\u76f0\u682e\u4f1b\u512b\u7eee"))).description(IIiIiIiiII.ALLATORIxDEMO("\u5f54\u68a5\u6d0b\u5275\u597a\u4e4f\u650c\u4edf\u65b6\uff69\u6349\u4f30\u798d\u981f\u5ecf\u4f5d\u5128\u9544\u5bfa\u76ab\u6867"))).defaultValue((Object)SortPriority.LowestDistance)).build());
        this.iiIiIIiIIi = this.IiIiIIIIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IIIiiiIIii.ALLATORIxDEMO("\u68e9\u6d48\u8360\u56bd"))).description(IIiIiIiiII.ALLATORIxDEMO("\u538a\u9541\u5bff\u650c\u4edf\u76c4\u6745\u5947\u8d98\u79db\u8346\u5694"))).defaultValue(50.0).range(0.0, 192.0).build());
        this.IiIIiIiiiI = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiiiIIii.ALLATORIxDEMO("\u4ef1\u964e\u7a53\u4e2e\u768d\u684e"))).description(IIiIiIiiII.ALLATORIxDEMO("\u538f\u5bb9\u5961\u4ece\u7a1f\u4e6d\u76e1\u76ae\u6862\u8f9b\u8809\u68a0\u6d0e\u4e6e\u9544\u5bfa"))).defaultValue((Object)(5 >> 2))).build());
        this.ALLATORIxDEMO = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiiiIIii.ALLATORIxDEMO("\u961b\u6b61\u845e\u5779"))).description(IIiIiIiiII.ALLATORIxDEMO("\u546f\u754d\u544e\uff69\u8992\u8217\u5768\u6202\u880c\u675a\u9594\u4e48\u4f7a\u89a3\u5750"))).defaultValue((Object)(--1 != 0))).build());
        this.IIIIiIiiIi = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIIiiiIIii.ALLATORIxDEMO("\u5406\u752b\u6e51\u679a"))).description(IIiIiIiiII.ALLATORIxDEMO("\u666f\u5443\u5768\u5c2a\u5e15\u4e6f\u6e72\u67b6\u9541\u5bdf\u768e\u6842\u76e4\u6842\u8ba6"))).defaultValue((Object)(3 >> 1))).build());
        this.iiIIIIiIII = this.iiiiiIIiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIIiiiIIii.ALLATORIxDEMO("\u6e1b\u67d0\u6a42\u5f46"))).description(IIiIiIiiII.ALLATORIxDEMO("\u51f5\u5bf8\u76a9\u6825\u6800\u8ba3\u76c4\u667b\u795a\u65dc\u5f4f\uff6d\u7eff\u6823`J`\u580e\u5105eOe\u53ac\u9188\uff69"))).defaultValue((Object)ShapeMode.Both)).visible(() -> this.IIIIiIiiIi.get())).build());
        this.iIiiIiiiII = this.iiiiiIIiiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIIiiiIIii.ALLATORIxDEMO("\u5842\u5146\u98ff\u823b"))).description(IIiIiIiiII.ALLATORIxDEMO("\u76ae\u6862\u537a\u57ba\u76c4\u582e\u5125\u90ad\u5266\u98d9\u8212"))).defaultValue(new SettingColor(0x64A5 & 0x1BFA, 3 ^ 3, 0x71F5 & 0xEEB, 0x6B & 0x37)).visible(() -> ((ShapeMode)this.iiIIIIiIII.get()).sides())).build());
        int n = 0x43FF & 0x3CFF;
        this.iIIiiIIIII = this.iiiiiIIiiI.add((Setting)((ColorSetting.Builder)((ColorSetting.Builder)((ColorSetting.Builder)new ColorSetting.Builder().name(IIIiiiIIii.ALLATORIxDEMO("\u8f47\u5ed0\u98ff\u823b"))).description(IIiIiIiiII.ALLATORIxDEMO("\u768b\u6847\u8f2b\u5eb3\u7efa\u76e4\u98d9\u8212"))).defaultValue(new SettingColor(n, 0x2DFF & 0x52FF, n, 0x3E & 0x73)).visible(() -> {
            if (((Boolean)this.IIIIiIiiIi.get()).booleanValue() && ((ShapeMode)this.iiIIIIiIII.get()).lines()) {
                return 3 >> 1;
            }
            return false;
        })).build());
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIiiiIIii.ALLATORIxDEMO("drQ\u007fG{4KdZuJ\u0004j\u0014\u8be9\u66c7\u65a9\u5204\u671e\u6599\u724b\u674f\uff48"));
        }
    }

    @Override
    public void onActivate() {
        iIiiiiiIII iIiiiiiIII2 = this;
        iIiiiiiIII2.iiIIiiIiii.clear();
        TargetUtils.getList(iIiiiiiIII2.iiIIiiIiii, class_12972 -> {
            iIiiiiiIII iIiiiiiIII2 = iIiiiiiIII3;
            iIiiiiiIII iIiiiiiIII3 = class_12972;
            iIiiiiiIII IiIIiIiiiI = iIiiiiiIII2;
            if (iIiiiiiIII3 instanceof class_1657) {
                class_1657 class_16572 = (class_1657)iIiiiiiIII3;
                if (Friends.get().isFriend(class_16572)) {
                    return (3 ^ 3) != 0;
                }
                if (iIiiiiiIII3 == IiIIiIiiiI.iiIIIIiIII.player) {
                    return (2 & 5) != 0;
                }
                iIiiiiiIII3 = iIiiiiiIII3.getBoundingBox();
                return PlayerUtils.isWithin((double)class_3532.clamp((double)IiIIiIiiiI.iiIIIIiIII.player.getX(), (double)((class_238)iIiiiiiIII3).minX, (double)((class_238)iIiiiiiIII3).maxX), (double)class_3532.clamp((double)IiIIiIiiiI.iiIIIIiIII.player.getY(), (double)((class_238)iIiiiiiIII3).minY, (double)((class_238)iIiiiiiIII3).maxY), (double)class_3532.clamp((double)IiIIiIiiiI.iiIIIIiIII.player.getZ(), (double)((class_238)iIiiiiiIII3).minZ, (double)((class_238)iIiiiiiIII3).maxZ), (double)((Double)IiIIiIiiiI.iiIiIIiIIi.get()));
            }
            return false;
        }, (SortPriority)((SortPriority)this.IiiIIIiiIi.get()), (int)(--1));
        IIIiIiIiii.ALLATORIxDEMO(class_1802.FIREWORK_ROCKET);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iIiiiiiIII iIiiiiiIII2 = iIiiiiiIII3;
        if (iIiiiiiIII2.iiIIIIiIII.player.isAlive() && PlayerUtils.getGameMode() != class_1934.SPECTATOR) {
            iIiiiiiIII iIiiiiiIII3;
            if (iIiiiiiIII2.iiIIiiIiii.isEmpty()) {
                return;
            }
            if (!((Boolean)iIiiiiiIII2.IiIIiIiiiI.get()).booleanValue() || !iIiiiiiIII2.iiIIIIiIII.player.isOnGround()) {
                iIiiiiiIII3 = iIiiiiiIII2.iiIIiiIiii.getFirst();
                if (!((Boolean)iIiiiiiIII2.ALLATORIxDEMO.get()).booleanValue() || !iIiiiiiIII3.isOnGround()) {
                    MeteorClient.mc.player.setYaw((float)Rotations.getYaw((class_1297)iIiiiiiIII3));
                }
                MeteorClient.mc.player.setPitch(iIiiiiiIII3.isOnGround() && (Boolean)iIiiiiiIII2.ALLATORIxDEMO.get() != false ? -90.0f : (float)Rotations.getPitch((class_1297)iIiiiiiIII3, (Target)Target.Body));
            }
            try {
                iIiiiiiIII3 = iIiiiiiIII2.iiIIiiIiii.getFirst();
                if (iIiiiiiIII2.iiIIiiIiii.getFirst() != null) {
                    class_238 IiIIiIiiiI;
                    void v0 = IiIIiIiiiI;
                    double d = class_3532.lerp((double)IiIIiIiiiI.tickDelta, (double)((class_1297)iIiiiiiIII3).lastRenderX, (double)iIiiiiiIII3.getX()) - iIiiiiiIII3.getX();
                    double d2 = class_3532.lerp((double)v0.tickDelta, (double)((class_1297)iIiiiiiIII3).lastRenderY, (double)iIiiiiiIII3.getY()) - iIiiiiiIII3.getY();
                    double d3 = class_3532.lerp((double)v0.tickDelta, (double)((class_1297)iIiiiiiIII3).lastRenderZ, (double)iIiiiiiIII3.getZ()) - iIiiiiiIII3.getZ();
                    IiIIiIiiiI = iIiiiiiIII3.getBoundingBox();
                    v0.renderer.box(d + IiIIiIiiiI.minX, d2 + IiIIiIiiiI.minY, d3 + IiIIiIiiiI.minZ, d + IiIIiIiiiI.maxX, d2 + IiIIiIiiiI.maxY, d3 + IiIIiIiiiI.maxZ, (Color)iIiiiiiIII2.iIiiIiiiII.get(), (Color)iIiiiiiIII2.iIIiiIIIII.get(), (ShapeMode)iIiiiiiIII2.iiIIIIiIII.get(), 2 & 5);
                    return;
                }
            } catch (Exception this_) {
                // empty catch block
            }
        }
    }
}

