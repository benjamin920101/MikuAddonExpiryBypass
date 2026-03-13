/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.DoubleSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.misc.input.Input
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIIIii;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiIiIII;
import com.github.mikumiku.addon.iiIiiiiIii;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.Date;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.DoubleSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.misc.input.Input;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.packet.Packet;
import net.minecraft.util.Identifier;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIiiIiiiIi
extends iiiiIiIiii {
    private class_2338 iiiIiIiIIi;
    private final class_2960 iIiIiIiIii = class_2960.of((String)iiIiiiiIii.ALLATORIxDEMO("{A7F+VnT7\u0018a"), (String)iiIiiiiIii.ALLATORIxDEMO("P&|\u0017Q1\u0014e\u000b.J/Qr\u0017.\u001ds"));
    private float iiiiiIIIii;
    private final Setting<Boolean> iIIiIIiiII;
    private final Setting<Double> IiiIIiiiiI;
    private final Setting<Boolean> IiIIIIiiii;
    private final class_2960 IiiIIIiiIi = class_2960.of((String)iiIiiiiIii.ALLATORIxDEMO("{A7F+VnT7\u0018a"), (String)iiIiiiiIii.ALLATORIxDEMO("P&|\u0017Q1\u0014e\u000b.J/Qq\u0017.\u001ds"));
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<Integer> iIiiIiiiII;
    private int iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final SettingGroup IiIiIIIIiI = this.settings.getDefaultGroup();
    private final Setting<Boolean> iiiiiIIiiI;
    private IIiIIIIIii iiIIIIiIII;
    private boolean IiIIiIiiiI;
    private boolean ALLATORIxDEMO;

    public iIiiIiiiIi() {
        super(iiIiiiiIii.ALLATORIxDEMO("\u976a\u4e8a\u8f1f\u571c"), iiIiiiiIii.ALLATORIxDEMO("\u6089\u5437\u6256\u672d\u4ef9\u76a7\u70ef\u9153\u6588\u8f55\u6516\u67ef\uff15"));
        this.IiiIIiiiiI = this.IiIiIIIIiI.add((Setting)((DoubleSetting.Builder)((DoubleSetting.Builder)new DoubleSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u65f2\u8f32\u89a1\u5eb2"))).description(iiIiiiiIii.ALLATORIxDEMO("\u6b8c\u0005\u007fG(\u65e8\u8f28\u76a0\u8991\u5e9f\uff56\u5ed5\uff1d"))).defaultValue(35.0).min(-360.0).max(360.0).sliderMin(-180.0).sliderMax(180.0).build());
        this.iIiiIiiiII = this.IiIiIIIIiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u5e85\u8fcb"))).description(iiIiiiiIii.ALLATORIxDEMO("\u528c\u4f1f\u4e4f\u9597\u76a0\u5eb5\u8fae\u65e0\u95d0\uff4b\u5376\u4f09\uff3e7P=\u0018\uff1d"))).defaultValue((Object)(3 >> 2))).sliderRange(3 & 4, 0x3E & 0x55).build());
        this.iiiiiIIiiI = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u79b8\u5291\u65a8\u66f1\u5048"))).description(iiIiiiiIii.ALLATORIxDEMO("\u5f77\u73ea\u5b95\u79bf\u528c\u65b5\u66bb\u5002\u65b8\u8f78"))).defaultValue((Object)(3 >> 1))).build());
        this.iIIiIIiiII = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u4e9b\u53a2\u5311"))).description(iiIiiiiIii.ALLATORIxDEMO("\u53ce\u5452\u6729\u52e2\u566c\u53b2\u9025\u6588\u8f1d\u5313\uff28\u5be1\u6214\u7aab\u738d\u5bf5\u6724\u544f\u4e7e\u53cc"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.IiIIIIiiii = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u6356\u625f"))).description(iiIiiiiIii.ALLATORIxDEMO("\u540b\u756b\u9ae1\u9041\u6356\u625f"))).defaultValue((Object)(3 >> 1))).build());
        this.iiIiIIiIIi = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u9ae1\u9041\u8e01\u8d63"))).description(iiIiiiiIii.ALLATORIxDEMO("\u544c\u750c\u9a9b\u906e\u8e64\u8d53\u52eb\u4f7f\uff48\u58ba\u52e3\u89ff\u8997\u653b\u6788"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiIIiiIiii = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u7092\u9129\u720a\u655c"))).description(iiIiiiiIii.ALLATORIxDEMO("\u5439\u750c\u98de\u5935\u76c0\u708f\u9134\u63e9\u7964\u4f92\u607b"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IIIIiIiiIi = this.IiIiIIIIiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiiiIii.ALLATORIxDEMO("\u6607\u7964\u72c5\u6015"))).description(iiIiiiiIii.ALLATORIxDEMO("\u5759\u805c\u590d\u4e6e\u661d\u797e\u65ef\u8f2f\u728f\u605f\u4f92\u607b"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        iIiiIiiiIi iIiiIiiiIi2 = this;
        this.iiiiiIIIii = 0.0f;
        this.iiiIiIiIIi = null;
        this.ALLATORIxDEMO = 3 >> 2;
        iIiiIiiiIi2.iIIiiIIIII = this.ALLATORIxDEMO;
        iIiiIiiiIi2.IiIIiIiiiI = 5 >> 3;
        iIiiIiiiIi2.iiIIIIiIII = iIiIiIiIII.ALLATORIxDEMO();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIiiiiIii.ALLATORIxDEMO("T\u000fA\"W&\u00046t\u0007E7\u00147\u0004\u8bb4\u66d7\u65f4\u5214\u6743\u6589\u7216\u675f\uff15"));
        }
    }

    @Override
    public void onActivate() {
        iIiiIiiiIi iIiiIiiiIi2 = this;
        super.onActivate();
        iIiiIiiiIi2.iiiiiIIIii = ((class_310)iIiiIiiiIi2.iiIIIIiIII).player.getYaw();
        this.iiiIiIiIIi = ((class_310)iIiiIiiiIi2.iiIIIIiIII).player.getBlockPos();
        this.ALLATORIxDEMO = 3 & 5;
        this.IiIIiIiiiI = ((class_310)this.iiIIIIiIII).player.isSneaking();
        this.iIIiiIIIII = 3 >> 2;
        if (((Boolean)this.IIIIiIiiIi.get()).booleanValue()) {
            if (((Boolean)this.iiIIiiIiii.get()).booleanValue()) {
                iiiiIiiiII.ALLATORIxDEMO(iiIiiiiIii.ALLATORIxDEMO("\ud87f\udf1b\u274b\u0004\u9710\u4ef6\u8f29\u572b\u6a65\u5f03\u5444\u5286\uff48\u51ff\u5959\u60ee\u5405\u627b\u6755\u4e96\uff4a\u0019\u2776\ud814\udf50"));
                iiiiIiiiII.ALLATORIxDEMO(iiIiiiiIii.ALLATORIxDEMO("\ud831\udd4e\u000e\u4f29\u5c08\u6671\u514c\u5779\u673b\u970f\u76a8\u4e9f\uff38~\ud815\udd6a"));
                iiiiIiiiII.ALLATORIxDEMO("\ud83d\udcab \u65cb\u8f6c\u89d2\u5ea6: " + String.valueOf(this.IiiIIiiiiI.get()) + "\u00b0/tick \ud83d\udcab");
                iiiiIiiiII.ALLATORIxDEMO("\u26a1 \u79fb\u52a8\u6682\u505c: " + ((Boolean)this.iiiiiIIiiI.get() != false ? iiIiiiiIii.ALLATORIxDEMO("\u5407\u7567") : iiIiiiiIii.ALLATORIxDEMO("\u79a9\u7567")) + " \u26a1");
                iiiiIiiiII.ALLATORIxDEMO("\ud83d\udce1 \u4ec5\u53d1\u5305\u6a21\u5f0f: " + ((Boolean)this.iIIiIIiiII.get() != false ? iiIiiiiIii.ALLATORIxDEMO("\u5414\u7574\uff24\u96db\u5f5b\u6595\u8f44\uff46") : iiIiiiiIii.ALLATORIxDEMO("\u79ba\u7574\uff24\u53a4\u89f8\u6595\u8f44\uff46")) + " \ud83d\udce1");
                iiiiIiiiII.ALLATORIxDEMO("\ud83e\udd98 \u9ad8\u901f\u8e72\u8d77: " + ((Boolean)this.iiIiIIiIIi.get() != false ? iiIiiiiIii.ALLATORIxDEMO("\u5414\u7574\uff24\u8dce\u7e9e\u6516\u67b4\uff46") : iiIiiiiIii.ALLATORIxDEMO("\u79a9\u7567")) + " \ud83e\udd98");
                return;
            }
            iiiiIiiiII.ALLATORIxDEMO(iiIiiiiIii.ALLATORIxDEMO("\ud85f\udf3bc\u9771\u4e91\u8f4f\u574c\u6a2d\u5f64\u5401\u52e1\uff38\u5198\u5923\u6089\u547d\u621c\u6725\u4ef1\uff38~\ud814\udf50"));
            iiiiIiiiII.ALLATORIxDEMO("\u65cb\u8f6c\u89d2\u5ea6: " + String.valueOf(this.IiiIIiiiiI.get()) + "\u00b0/tick");
            iiiiIiiiII.ALLATORIxDEMO("\u79fb\u52a8\u6682\u505c: " + ((Boolean)this.iiiiiIIiiI.get() != false ? iiIiiiiIii.ALLATORIxDEMO("\u5407\u7567") : iiIiiiiIii.ALLATORIxDEMO("\u79a9\u7567")));
            iiiiIiiiII.ALLATORIxDEMO("\u4ec5\u53d1\u5305\u6a21\u5f0f: " + ((Boolean)this.iIIiIIiiII.get() != false ? iiIiiiiIii.ALLATORIxDEMO("\u5407\u7567") : iiIiiiiIii.ALLATORIxDEMO("\u79a9\u7567")));
            iiiiIiiiII.ALLATORIxDEMO("\u9ad8\u901f\u8e72\u8d77: " + ((Boolean)this.iiIiIIiIIi.get() != false ? iiIiiiiIii.ALLATORIxDEMO("\u5407\u7567") : iiIiiiiIii.ALLATORIxDEMO("\u79a9\u7567")));
        }
    }

    public boolean ALLATORIxDEMO() {
        iIiiIiiiIi iIiiIiiiIi2 = this;
        boolean bl = Input.isPressed((class_304)((class_310)iIiiIiiiIi2.iiIIIIiIII).options.forwardKey) || Input.isPressed((class_304)((class_310)iIiiIiiiIi2.iiIIIIiIII).options.backKey) || Input.isPressed((class_304)((class_310)iIiiIiiiIi2.iiIIIIiIII).options.leftKey) || Input.isPressed((class_304)((class_310)iIiiIiiiIi2.iiIIIIiIII).options.rightKey) || Input.isPressed((class_304)((class_310)iIiiIiiiIi2.iiIIIIiIII).options.jumpKey) || Input.isPressed((class_304)((class_310)iIiiIiiiIi2.iiIIIIiIII).options.sneakKey);
        iIiiIiiiIi iIiiIiiiIi3 = iIiiIiiiIi2;
        class_2338 class_23382 = ((class_310)iIiiIiiiIi3.iiIIIIiIII).player.getBlockPos();
        int n = iIiiIiiiIi3.iiiIiIiIIi != null && !class_23382.equals((Object)iIiiIiiiIi2.iiiIiIiIIi) ? 3 & 5 : 0;
        if (bl || n != 0) {
            return true;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iIiiIiiiIi iIiiIiiiIi2 = iIiiIiiiIi3;
        iIiiIiiiIi iIiiIiiiIi3 = pre;
        iIiiIiiiIi IiIIiIiiiI = iIiiIiiiIi2;
        if (((class_310)IiIIiIiiiI.iiIIIIiIII).player == null || ((class_310)IiIIiIiiiI.iiIIIIiIII).world == null) {
            return;
        }
        boolean this22 = false;
        if (((Boolean)IiIIiIiiiI.iiiiiIIiiI.get()).booleanValue()) {
            this22 = IiIIiIiiiI.ALLATORIxDEMO();
        }
        if (this22) {
            if (IiIIiIiiiI.ALLATORIxDEMO) {
                IiIIiIiiiI.ALLATORIxDEMO = 2 & 5;
                if (((Boolean)IiIIiIiiiI.IIIIiIiiIi.get()).booleanValue()) {
                    iiiiIiiiII.ALLATORIxDEMO(iiIiiiiIii.ALLATORIxDEMO("\u2380\ufe0bC\u68f5\u6d19\u5239\u7995\u52a0\uff63\u6682\u503b\u65c9\u8f09"));
                }
            }
            IiIIiIiiiI.iiiIiIiIIi = ((class_310)IiIIiIiiiI.iiIIIIiIII).player.getBlockPos();
            return;
        }
        if (!IiIIiIiiiI.ALLATORIxDEMO) {
            IiIIiIiiiI.ALLATORIxDEMO = --1;
            if (((Boolean)IiIIiIiiiI.IIIIiIiiIi.get()).booleanValue()) {
                iiiiIiiiII.ALLATORIxDEMO(iiIiiiiIii.ALLATORIxDEMO("\u25d3\ufe10X\u6066\u596e\u65fe\u8f3e\uff05\u7e89\u7ee5\u60a5\u5446\u4f70\u4eb8\uff64"));
            }
        }
        iIiiIiiiIi iIiiIiiiIi4 = IiIIiIiiiI;
        if (iIiiIiiiIi4.iiIIIIiIII.ALLATORIxDEMO(((Integer)iIiiIiiiIi4.iIiiIiiiII.get()).intValue())) {
            iIiiIiiiIi iIiiIiiiIi5 = IiIIiIiiiI;
            iIiiIiiiIi5.IiiIIIIiiI();
            if (((Boolean)iIiiIiiiIi5.IiIIIIiiii.get()).booleanValue()) {
                IiIIiIiiiI.ALLATORIxDEMO();
            }
            if (((Boolean)IiIIiIiiiI.iiIiIIiIIi.get()).booleanValue()) {
                IiIIiIiiiI.IiiiiiiIIi();
            }
            iIiiIiiiIi iIiiIiiiIi6 = IiIIiIiiiI;
            iIiiIiiiIi6.iIIiiIIIII += 3 >> 1;
            iIiiIiiiIi6.iiIiiiiiII();
            if (((Boolean)iIiiIiiiIi6.IIIIiIiiIi.get()).booleanValue()) {
                if (IiIIiIiiiI.iIIiiIIIII % (0x64 & 0x7F) == 0) {
                    if (((Boolean)IiIIiIiiiI.iiIIiiIiii.get()).booleanValue()) {
                        String[] stringArray = new String[--5];
                        stringArray[3 ^ 3] = "\ud83c\udf2a\ufe0f \u65cb\u98ce\u9753\u4ed4\uff01\u5df2\u8f6c " + IiIIiIiiiI.iIIiiIIIII + " tick\uff01 \ud83c\udf2a\ufe0f";
                        stringArray[5 >> 2] = "\u2b50 \u95ea\u8000\u767b\u573a\uff01\u8f6c\u4e86 " + IiIIiIiiiI.iIIiiIIIII + " \u5708\uff01 \u2b50";
                        stringArray[--2] = "\ud83c\udfad \u5168\u573a\u7126\u70b9\uff01" + IiIIiIiiiI.iIIiiIIIII + " tick\u7684\u7cbe\u5f69\u8868\u6f14\uff01 \ud83c\udfad";
                        stringArray[--3] = "\ud83d\ude80 \u8d85\u7ea7\u65cb\u8f6c\uff01" + IiIIiIiiiI.iIIiiIIIII + " tick\u60ca\u5446\u4f17\u4eba\uff01 \ud83d\ude80";
                        stringArray[--4] = "\ud83d\udc8e \u94bb\u77f3\u7ea7\u65cb\u8f6c\uff01" + IiIIiIiiiI.iIIiiIIIII + " tick\u5b8c\u7f8e\u6f14\u51fa\uff01 \ud83d\udc8e";
                        String[] this22 = stringArray;
                        Object[] objectArray = new Object[3 >> 1];
                        objectArray[3 ^ 3] = Float.valueOf(IiIIiIiiiI.iiiiiIIIii);
                        iiiiIiiiII.ALLATORIxDEMO(this22[IiIIiIiiiI.iIIiiIIIII / (0x67 & 0x7C) % this22.length] + " \u671d\u5411: " + String.format(iiIiiiiIii.ALLATORIxDEMO("J.Vd\u00d5"), objectArray));
                        return;
                    }
                    Object[] objectArray = new Object[2 ^ 3];
                    objectArray[3 >> 2] = Float.valueOf(IiIIiIiiiI.iiiiiIIIii);
                    iiiiIiiiII.ALLATORIxDEMO("\ud83d\udd04 \u5df2\u65cb\u8f6c " + IiIIiIiiiI.iIIiiIIIII + " tick\uff0c\u5f53\u524d\u671d\u5411: " + String.format(iiIiiiiIii.ALLATORIxDEMO("J.Vd\u00d5"), objectArray));
                }
            }
        }
    }

    private /* synthetic */ void iiIiiiiiII() {
        iIiiIiiiIi iIiiIiiiIi2 = string;
        if (!((Boolean)iIiiIiiiIi2.IIIIiIiiIi.get()).booleanValue() || !((Boolean)iIiiIiiiIi2.iiIIiiIiii.get()).booleanValue()) {
            return;
        }
        String string = (Boolean)iIiiIiiiIi2.iIIiIIiiII.get() != false ? iiIiiiiIii.ALLATORIxDEMO("\uff2c\u96d3\u5f66\u6a42\u5f0b\uff6a") : iiIiiiiIii.ALLATORIxDEMO("\uff2c\u53ac\u89c5\u6a42\u5f0b\uff6a");
        if (iIiiIiiiIi2.iIIiiIIIII == (0x79F8 & 0x76F)) {
            iiiiIiiiII.ALLATORIxDEMO("\ud83c\udf89 \u606d\u559c\uff01\u5b8c\u6210\u4e00\u6574\u5708\u65cb\u8f6c\uff08360\u00b0\uff09\uff01\u4f60\u5c31\u662f\u65cb\u8f6c\u4e4b\u738b\uff01" + (String)string + " \ud83c\udf89");
            return;
        }
        if (iIiiIiiiIi2.iIIiiIIIII == (0x1ADC & 0x67F3)) {
            iiiiIiiiII.ALLATORIxDEMO("\ud83c\udfc6 \u53cc\u5708\u8fbe\u6210\uff01720\u00b0\u7684\u5b8c\u7f8e\u8868\u6f14\uff01\u89c2\u4f17\u4e3a\u4f60\u75af\u72c2\uff01" + (String)string + " \ud83c\udfc6");
            return;
        }
        if (iIiiIiiiIi2.iIIiiIIIII == (0x17F9 & 0x6BEE)) {
            iiiiIiiiII.ALLATORIxDEMO("\ud83d\udcaf \u5343tick\u91cc\u7a0b\u7891\uff01\u4f60\u7684\u65cb\u8f6c\u6280\u5de7\u5df2\u7ecf\u7089\u706b\u7eaf\u9752\uff01" + (String)string + " \ud83d\udcaf");
            return;
        }
        if (iIiiIiiiIi2.iIIiiIIIII == (0x478C & 0x3F7B)) {
            iiiiIiiiII.ALLATORIxDEMO("\ud83c\udf1f \u4e94\u5708\u6210\u5c31\u89e3\u9501\uff011800\u00b0\u7684\u534e\u4e3d\u6f14\u51fa\uff01" + (String)string + " \ud83c\udf1f");
            return;
        }
        if (iIiiIiiiIi2.iIIiiIIIII % (0x27F8 & 0x5BEF) == 0) {
            if (iIiiIiiiIi2.iIIiiIIIII > (0x43EB & 0x3FFC)) {
                iiiiIiiiII.ALLATORIxDEMO("\ud83d\ude80 " + iIiiIiiiIi2.iIIiiIIIII / (0x3FFF & 0x43E8) + "K\u91cc\u7a0b\u7891\u8fbe\u6210\uff01\u4f60\u5c31\u662f\u6c38\u52a8\u673a\u9753\u4ed4\uff01" + (String)string + " \ud83d\ude80");
            }
        }
    }

    private /* synthetic */ void IiiIIIIiiI() {
        iIiiIiiiIi iIiiIiiiIi2 = this;
        float f = ((Double)iIiiIiiiIi2.IiiIIiiiiI.get()).floatValue();
        iIiiIiiiIi iIiiIiiiIi3 = iIiiIiiiIi2;
        iIiiIiiiIi iIiiIiiiIi4 = iIiiIiiiIi3;
        iIiiIiiiIi3.iiiiiIIIii += f;
        while (iIiiIiiiIi4.iiiiiIIIii > 180.0f) {
            iIiiIiiiIi iIiiIiiiIi5 = iIiiIiiiIi2;
            iIiiIiiiIi4 = iIiiIiiiIi5;
            iIiiIiiiIi5.iiiiiIIIii -= 360.0f;
        }
        iIiiIiiiIi iIiiIiiiIi6 = iIiiIiiiIi2;
        while (iIiiIiiiIi6.iiiiiIIIii < -180.0f) {
            iIiiIiiiIi iIiiIiiiIi7 = iIiiIiiiIi2;
            iIiiIiiiIi6 = iIiiIiiiIi7;
            iIiiIiiiIi7.iiiiiIIIii += 360.0f;
        }
        if (!((Boolean)iIiiIiiiIi2.iIIiIIiiII.get()).booleanValue()) {
            ((class_310)iIiiIiiiIi2.iiIIIIiIII).player.setYaw(iIiiIiiiIi2.iiiiiIIIii);
        }
        iIiiIiiiIi iIiiIiiiIi8 = iIiiIiiiIi2;
        ((class_310)iIiiIiiiIi2.iiIIIIiIII).player.networkHandler.sendPacket((class_2596)IiiiIiiIII.ALLATORIxDEMO(iIiiIiiiIi8.iiiiiIIIii, ((class_310)iIiiIiiiIi8.iiIIIIiIII).player.getPitch(), ((class_310)iIiiIiiiIi2.iiIIIIiIII).player.isOnGround()));
    }

    private /* synthetic */ void IiiiiiiIIi() {
        if (((class_310)this.iiIIIIiIII).player == null) {
            return;
        }
        this.IiIIiIiiiI = !this.IiIIiIiiiI ? 3 & 5 : 0;
        ((class_310)this.iiIIIIiIII).player.setSneaking(this.IiIIiIiiiI);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (((class_310)this.iiIIIIiIII).player == null) {
            return;
        }
        iiiIIIIiiI.ALLATORIxDEMO(((Double)this.IiiIIiiiiI.get()).floatValue() > 0.0f ? class_1268.MAIN_HAND : class_1268.OFF_HAND, BaritoneUtil.SwingSide.iiIIIIiIII);
    }

    public String ALLATORIxDEMO() {
        Object object = object2;
        if (!object.isActive()) {
            return iiIiiiiIii.ALLATORIxDEMO("\u9701\u4edd\u8f02\u5700U \u674d\u542d\u754d");
        }
        Object object2 = ((iIiiIiiiIi)object).ALLATORIxDEMO ? iiIiiiiIii.ALLATORIxDEMO("\u65ac\u8f6e\u4e48") : iiIiiiiIii.ALLATORIxDEMO("\u66e5\u505e\u4e48");
        String string = (Boolean)((iIiiIiiiIi)object).iIIiIIiiII.get() != false ? iiIiiiiIii.ALLATORIxDEMO("\u9692\u5f07") : iiIiiiiIii.ALLATORIxDEMO("\u53ed\u89a4");
        String string2 = (Boolean)((iIiiIiiiIi)object).iiIiIIiIIi.get() != false ? iiIiiiiIii.ALLATORIxDEMO("\u8e70\u8d12") : "";
        Object[] objectArray = new Object[--4];
        objectArray[3 >> 2] = object2;
        objectArray[--1] = string;
        objectArray[1 ^ 3] = Float.valueOf(((iIiiIiiiIi)object).iiiiiIIIii);
        objectArray[--3] = ((iIiiIiiiIi)object).iIIiiIIIII;
        object2 = String.format(iiIiiiiIii.ALLATORIxDEMO("\u9777\u4e97\u8f48\u574b\u001ec!\u0010\u0004k)\u0018(F}F\u89de\u5ecd#^'K.\u001e\u00b4CIr]\u0007k\u0004:G'\u0001"), objectArray);
        if (!string2.isEmpty()) {
            object2 = (String)object2 + " | " + string2;
        }
        return object2;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        iIiiIiiiIi iIiiIiiiIi2 = iIiiIiiiIi3;
        iIiiIiiiIi iIiiIiiiIi3 = render2DEvent;
        iIiiIiiiIi IiIIiIiiiI = iIiiIiiiIi2;
        if (!Utils.isLoading() && IiIIiIiiiI.isActive()) {
        }
    }

    public void onDeactivate() {
        if (((Boolean)this.IIIIiIiiIi.get()).booleanValue()) {
            iiiiIiiiII.ALLATORIxDEMO(iiIiiiiIii.ALLATORIxDEMO("\ud877\udf83i\u976a\u4e8a\u8f48\u574b\u7ee8\u6703\uff20\u6154\u8c1b\u899c\u8d67\uff4e"));
            iiiiIiiiII.ALLATORIxDEMO("\u603b\u5171\u65cb\u8f6c\u4e86 " + this.iIIiiIIIII + " \u4e2atick");
        }
        this.ALLATORIxDEMO = 2 & 5;
        this.iIIiiIIIII = this.ALLATORIxDEMO;
    }
}

