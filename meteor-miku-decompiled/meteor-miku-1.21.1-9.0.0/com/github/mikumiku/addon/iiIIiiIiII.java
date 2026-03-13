/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render3DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.player.PlayerEntity
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiIIiIII;
import com.github.mikumiku.addon.IiiIIIiiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.AutoSM;
import java.util.Date;
import java.util.Random;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.player.PlayerEntity;

public class iiIIiiIiII
extends iiiiIiIiii {
    public final Setting<Boolean> IiiIIIiiIi;
    private final Random iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private final Setting<AutoSM.MoanMode> iIIiiIIIII;
    public static final /* synthetic */ boolean iiIiIIiIIi;
    private static final String[] IIIIiIiiIi;
    private final Setting<Double> IiIiIIIIiI;
    private double iiiiiIIiiI;
    private int iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private static final String[] ALLATORIxDEMO;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void ALLATORIxDEMO() {
        iiIIiiIiII iiIIiiIiII2 = this;
        class_1657 class_16572 = iiIIiiIiII2.ALLATORIxDEMO();
        if (class_16572 == null) {
            return;
        }
        String string = class_16572.getName().getString();
        switch (((AutoSM.MoanMode)((Object)iiIIiiIiII2.iIIiiIIIII.get())).ordinal()) {
            case 1: {
                int n = iiIIiiIiII2.iiIIiiIiii.nextInt(2 & 5, IIIIiIiiIi.length - (2 ^ 3));
                if (n == iiIIiiIiII2.iiIIIIiIII) {
                    n = n < IIIIiIiiIi.length - (5 >> 2) ? n + (3 & 5) : 0;
                }
                iiIIiiIiII2.iiIIIIiIII = n;
                ChatUtils.sendPlayerMsg((String)IIIIiIiiIi[n].replace(IiIiIIiIII.ALLATORIxDEMO("\u001aX"), string));
                return;
            }
            case 0: {
                int n = iiIIiiIiII2.iiIIiiIiii.nextInt(2 & 5, ALLATORIxDEMO.length - --1);
                if (n == iiIIiiIiII2.iiIIIIiIII) {
                    n = n < ALLATORIxDEMO.length - --1 ? n + (4 ^ 5) : 0;
                }
                iiIIiiIiII2.iiIIIIiIII = n;
                ChatUtils.sendPlayerMsg((String)ALLATORIxDEMO[n].replace(IiiIIIiiII.IiiiiiiIIi("\bF"), string));
                return;
            }
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render3DEvent render3DEvent) {
        iiIIiiIiII iiIIiiIiII2 = iiIIiiIiII3;
        iiIIiiIiII iiIIiiIiII3 = render3DEvent;
        iiIIiiIiII IiIIiIiiiI = iiIIiiIiII2;
        IiIIiIiiiI.iiiiiIIiiI = Math.min((Double)IiIIiIiiiI.IiIiIIIIiI.get(), IiIIiIiiiI.iiiiiIIiiI + ((Render3DEvent)iiIIiiIiII3).frameTime);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiIIiiIiII IiIIiIiiiI;
        iiIIiiIiII iiIIiiIiII2 = iiIIiiIiII3;
        iiIIiiIiII iiIIiiIiII3 = pre;
        iiIIiiIiII iiIIiiIiII4 = IiIIiIiiiI = iiIIiiIiII2;
        iiIIiiIiII4.iiiiiIIiiI += 1.0;
        if (iiIIiiIiII4.iiIIIIiIII.player != null && IiIIiIiiiI.iiIIIIiIII.world != null && IiIIiIiiiI.iiiiiIIiiI >= (Double)IiIIiIiiiI.IiIiIIIIiI.get()) {
            IiIIiIiiiI.ALLATORIxDEMO();
            IiIIiIiiiI.iiiiiIIiiI = 0.0;
        }
    }

    private /* synthetic */ class_1657 ALLATORIxDEMO() {
        iiIIiiIiII iiIIiiIiII2 = iiIIiiIiII4;
        if (!(iiIiIIiIIi || iiIIiiIiII2.iiIIIIiIII.player != null && iiIIiiIiII2.iiIIIIiIII.world != null)) {
            throw new AssertionError();
        }
        iiIIiiIiII iiIIiiIiII3 = null;
        float f = -1.0f;
        if (!iiIIiiIiII2.iiIIIIiIII.world.getPlayers().isEmpty()) {
            for (iiIIiiIiII iiIIiiIiII4 : iiIIiiIiII2.iiIIIIiIII.world.getPlayers()) {
                if (iiIIiiIiII4 == iiIIiiIiII2.iiIIIIiIII.player || ((Boolean)iiIIiiIiII2.IiIIiIiiiI.get()).booleanValue() && Friends.get().isFriend((class_1657)iiIIiiIiII4) || iiIIiiIiII3 != null && !(iiIIiiIiII2.iiIIIIiIII.player.getPos().distanceTo(iiIIiiIiII4.getPos()) < (double)f)) continue;
                iiIIiiIiII3 = iiIIiiIiII4;
                f = (float)iiIIiiIiII2.iiIIIIiIII.player.getPos().distanceTo(iiIIiiIiII4.getPos());
            }
        }
        return iiIIiiIiII3;
    }

    public iiIIiiIiII() {
        iiIIiiIiII iiIIiiIiII2 = this;
        super(IiiIIIiiII.IiiiiiiIIi("\u81fc\u52a6\u7962\u4ee0"), IiIiIIiIII.ALLATORIxDEMO("\u81f5\u52a3\u5be6\u670b\u8fee\u76af\u4ea5\u8bff\u7901\u4e8f\u76bb\u8bf6"));
        iiIIiiIiII2.iIiiIiiiII = iiIIiiIiII2.settings.getDefaultGroup();
        iiIIiiIiII2.iIIiiIIIII = iiIIiiIiII2.iIiiIiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u6d9e\u6061\u6a7d\u5f4b"))).description(IiIiIIiIII.ALLATORIxDEMO("\u901e\u62b1\u539d\u9016\u54e9\u79df\u7c7d\u5799\u7682\u53e9\u8bc0\u301a\u6a2d\u5f57\u9045\u62f6\uff11\u6524\u65b2\u53cf\u8be6\u001f\u0004?\u53dc\u65a6\u53fb\u8bf2\u000b0+\u6dc8\u5423\u96b0\u6711"))).defaultValue((Object)AutoSM.MoanMode.ALLATORIxDEMO)).build());
        this.IiiIIIiiIi = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u81e4\u52f4\u8bb0"))).description(IiIiIIiIII.ALLATORIxDEMO("\u81d5\u5283\u8bcb\u3029"))).defaultValue((Object)(--1 != 0))).build());
        this.IiIIiIiiiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u5feb\u756b\u5921\u538f"))).description(IiIiIIiIII.ALLATORIxDEMO("\u4e32\u4f31\u5be6\u5976\u53f4\u5f2b\u8f59\u3029"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IiIiIIIIiI = this.iIiiIiiiII.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(IiiIIIiiII.IiiiiiiIIi("\u5eaa\u8f9b"))).description(IiIiIIiIII.ALLATORIxDEMO("\u4e0f\u6b3e\u5470\u5400\u768f\u95cb\u96bf?\u007fVHT\u3029"))).defaultValue(100.0).min(1.0).sliderRange(1.0, 1000.0).build());
        this.iiiiiIIiiI = 0.0;
        iiIIiiIiII iiIIiiIiII3 = this;
        iiIIiiIiII3.iiIIiiIiii = new Random();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIIIiiII.IiiiiiiIIi("[\u007fnrXV+f[WJG;g+\u8be4\u66f8\u65a4\u523b\u6713\u65a6\u7246\u6770\uff45"));
        }
    }

    static {
        iiIiIIiIIi = !iiIIiiIiII.class.desiredAssertionStatus() ? 4 ^ 5 : 0;
        String[] stringArray = new String[0x1F & 0x73];
        stringArray[3 ^ 3] = IiIiIIiIII.ALLATORIxDEMO("\u7212\u5192\u72eb\u4e3f\u7092\u5e4d\u623a");
        stringArray[2 ^ 3] = IiiIIIiiII.IiiiiiiIIi("\u5186\u6de2\u70b5\uff15\u7232\u519e\u6de7\u4e0e\u70e5\uff45");
        stringArray[5 >> 1] = IiIiIIiIII.ALLATORIxDEMO("\u5976\u7202\uff2a\u7226\u768f\u5915\u590c\u4eb9\uff2a");
        stringArray[--3] = IiiIIIiiII.IiiiiiiIIi("\u621a\u7222\u4f6c\u7690\u592c\u5c5f6+/\uff45");
        stringArray[--4] = IiIiIIiIII.ALLATORIxDEMO("\u7226\u5723\u622e\u5c2f\u51e5\u676e\u5272\u5200\u5063\uff2a");
        stringArray[--5] = IiiIIIiiII.IiiiiiiIIi("\u4f6c\u4e2e\u4e8d\u6202\u787a\u523e\u4e51\u8808");
        stringArray[0x76 & 0xF] = IiIiIIiIII.ALLATORIxDEMO("\u60ec\u6281\u620e\u83c1\u828e\u64ba\u5938\u541c\u001f\u000eL\uff34");
        stringArray[0x6F & 0x17] = IiiIIIiiII.IiiiiiiIIi("\u6207\u723f\u4f3c\u727d");
        stringArray[0x4B & 0x3C] = IiIiIIiIII.ALLATORIxDEMO("\u64e6\u522f\u621a\u83f5\u829a\u5f3f\u829a");
        stringArray[0x2D & 0x5B] = IiiIIIiiII.IiiiiiiIIi("6\u007f4\u8d8e\u7222\u6207\u768a\u8396\u82f5");
        stringArray[0x3E & 0x4B] = IiIiIIiIII.ALLATORIxDEMO("\u622e\u7503\u7d18\u81df\u769b\u83c1\u82ae\u8ba2\u001f\u000el+\u7202\u521b\u4e32\u8867");
        stringArray[0x3F & 0x4B] = IiiIIIiiII.IiiiiiiIIi("\u7232\u7697\u592b\u5c58\u53c3\u7c84\u53de\u5914\u6c1d\uff45");
        stringArray[0x2D & 0x5E] = IiIiIIiIII.ALLATORIxDEMO("\u6c7d\u4f4b\u7537\u5c36\u5157\u52b0\u64f2\u623a");
        stringArray[0x2F & 0x5D] = IiiIIIiiII.IiiiiiiIIi("\u6210\u6636.3x3\u7688\u4e07\u5c55\u5a0b\u53c1\u7cb0\u58aa\uff45");
        stringArray[0xF & 0x7E] = IiIiIIiIII.ALLATORIxDEMO("\u6c69\u4f5f\u62a1\u6ec5\u70e0\u769b\u6c4a\u5c3b\u8ff0\u620e\u670b\u6dce\u592f\u7206\uff2a");
        stringArray[0xF & 0x7F] = IiiIIIiiII.IiiiiiiIIi("\u6210\u7228.3x3\u5724\u6205\u4f58\u5196\u7692\u6111\u8995\uff45");
        stringArray[0x39 & 0x56] = IiIiIIiIII.ALLATORIxDEMO("\u000eL\u000b\u4e1f\u7700\u522f\u621a\u5c7e\u808a\u5c2e\u7867\u520f\u4e26\u8873\uff2a");
        stringArray[0x5B & 0x35] = IiiIIIiiII.IiiiiiiIIi("$j.\u726f\u5220\u7222\u72ec\u72f4\u5e79\u6202\u7692\u83c4\u82ed\uff45");
        stringArray[0x7A & 0x17] = IiIiIIiIII.ALLATORIxDEMO("\u4f4b\u5c2e\u4e06\u80e2\u6281\u673f\u5425\u4e1f\u53ee\u8bcb\u51d1\u675a\u543c");
        IIIIiIiiIi = stringArray;
        String[] stringArray2 = new String[0x13 & 0x7C];
        stringArray2[3 ^ 3] = IiiIIIiiII.IiiiiiiIIi("\u4e5a\u4e42\u5427\u8bce\uff1a\u8ba7\u7265\u7279");
        stringArray2[--1] = IiIiIIiIII.ALLATORIxDEMO("\u801e\u5b5b\u671f\u723a\u5e4d\u4f4b\u5c5e\u7737\u001f\u000eL\uff2a");
        stringArray2[5 >> 1] = IiiIIIiiII.IiiiiiiIIi("\u6286\u4f74\u83c1\u82a2\u7338\u7ed7\u7265\uff45");
        stringArray2[--3] = IiIiIIiIII.ALLATORIxDEMO("\u673f\u721a\u4f5f\u8880\u620e\u64c6\u522f\u6d4a\u5272\u6c1f\u769b\u683c\u5b6f\u000b\u001aX");
        stringArray2[--4] = IiiIIIiiII.IiiiiiiIIi("\u50d9\u4e21\u4e45\u72db\u4e14\u683c\u7eca\u722f\u821a\u526c\u5ed1");
        stringArray2[--5] = IiIiIIiIII.ALLATORIxDEMO("\u8fcc\u677a\u9a9a\u4e35\u7212\u769b\u5bbd\u4f26\u000b\u001aX");
        stringArray2[0x7E & 7] = IiiIIIiiII.IiiiiiiIIi("\u6746\u7230\u4f79\u5425\u7756\u621a\u7718\u774c\u6205\u768f\u6824\u5b46.y7");
        stringArray2[0x37 & 0x4F] = IiIiIIiIII.ALLATORIxDEMO("\u000el+\u88b4\u621a\u5e4d\u76af\u65e9\u5012\u53d0\u721a\u520f\u722d");
        stringArray2[0x1D & 0x6A] = IiiIIIiiII.IiiiiiiIIi(".`,\u7690\u83c1\u82a2\u7d31\u523e\u725a\uff45");
        stringArray2[0x7D & 0xB] = IiIiIIiIII.ALLATORIxDEMO("\u000el+\u6337\u64c6\u76bb\u65dd\u5006\u7714\u50f0\u4e01\u4e69\u72fc");
        stringArray2[0x1A & 0x6F] = IiiIIIiiII.IiiiiiiIIi("\u6716\u723a\u4f73\u9a9d\u573c\u621a\u4e19\u9774\u6263\u5c1d\u80e5");
        stringArray2[0x2B & 0x5F] = IiIiIIiIII.ALLATORIxDEMO("\u000el+\u6337\u5e79\u76bb\u65dd\u5006\u5a0c\u55a7\u5fbc\u8d03\u595d");
        stringArray2[0x4D & 0x3E] = IiiIIIiiII.IiiiiiiIIi("3x3\u6623\u593d\u4e00\u7b3f\u4e16\u7cb0\u58aa\uff45");
        stringArray2[0x3F & 0x4D] = IiIiIIiIII.ALLATORIxDEMO("\u000el+\u6c27\u8fd7\u995a\u6e1f\u775f\u7b42\u7206\u76af\u5b89\u4f32");
        stringArray2[0x4F & 0x3E] = IiiIIIiiII.IiiiiiiIIi("\u6b89\u6b20\u7712\u523e6.`,\u6205\u90f6\u787f\u5f81\u50c1\u77af\u5970");
        stringArray2[0x7F & 0xF] = IiIiIIiIII.ALLATORIxDEMO("\u4f4b\u5c2e\u4e06\u80e2\u6281\u673f\u5425\u4e1f\u53ee\u8bcb\u51d1\u675a\u543c");
        ALLATORIxDEMO = stringArray2;
    }
}

