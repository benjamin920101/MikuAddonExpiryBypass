/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  net.minecraft.util.math.BlockPos
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiIIIiIii;
import com.github.mikumiku.addon.iIiiiIiiII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MySettings;
import com.github.mikumiku.addon.modules.AutoSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.util.math.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iIIiiiIiII
extends iiiiIiIiii {
    private final SettingGroup iIiIiiIiiI;
    private final Setting<AutoSort.ClassificationMode> IIiiiiiiII;
    private final Map<String, List<String>> IIiiiIIIIi;
    private final Setting<Integer> IIIiIIIiII;
    private final Setting<Boolean> iiIiIiiiiI;
    private final SettingGroup IIiiIiiiII;
    private final Setting<AutoSort.SortPriority> IIIiIiiIIi;
    private int iiiIiIiIIi;
    private final Setting<Integer> iIiIiIiIii;
    private final Setting<Integer> iiiiiIIIii;
    private final Setting<Integer> iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private final Setting<Boolean> IiIIIIiiii;
    private final Setting<Integer> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    private final List<class_2338> iiIiIIiIIi;
    private int IIIIiIiiIi;
    private final Map<class_2338, iIiiiIiiII> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<Boolean> IiIIiIiiiI;
    private final Setting<Integer> ALLATORIxDEMO;

    public class_2338 ALLATORIxDEMO() {
        if (((Boolean)this.iiIiIiiiiI.get()).booleanValue() && this.iiIIIIiIII.player != null) {
            return this.iiIIIIiIII.player.getBlockPos();
        }
        return new class_2338(((Integer)this.iIIiiIIIII.get()).intValue(), ((Integer)this.IIIiIIIiII.get()).intValue(), ((Integer)this.iIIiIIiiII.get()).intValue());
    }

    public int IiiIIIIiiI() {
        return (Integer)this.IiiIIIiiIi.get();
    }

    public int IiiiiiiIIi() {
        return (Integer)this.ALLATORIxDEMO.get();
    }

    public boolean IiiIIIIiiI() {
        return (Boolean)this.IiIIIIiiii.get();
    }

    public iIIiiiIiII() {
        iIIiiiIiII iIIiiiIiII2 = this;
        super(iiiiIiIiii.IiIiIIIIiI, MySettings.ALLATORIxDEMO("\u515a\u7254\u54f4\u523c\u7c53e-9"), IIiIIIiIii.ALLATORIxDEMO("\u81e9\u52ec\u5c05\u720d\u54e2\u5242\u7c78\u5254\u7b92\u5b34\u4e0e"));
        iIIiiiIiII2.iiIIIIiIII = iIIiiiIiII2.settings.getDefaultGroup();
        iIIiiiIiII2.iiiiiIIiiI = iIIiiiIiII2.settings.createGroup(MySettings.ALLATORIxDEMO("\u7b99\u5b77\u8bdc\u7f03"));
        iIIiiiIiII2.iIiIiiIiiI = iIIiiiIiII2.settings.createGroup(IIiIIIiIii.ALLATORIxDEMO("\u5262\u7c58\u8bda\u7f4d"));
        iIIiiiIiII2.IIiiIiiiII = iIIiiiIiII2.settings.createGroup(MySettings.ALLATORIxDEMO("\u9af0\u7e80\u8bdc\u7f03"));
        iIIiiiIiII2.ALLATORIxDEMO = iIIiiiIiII2.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u5960\u7425\u9590\u96b7"))).description(MySettings.ALLATORIxDEMO("\u6bd5\u6b14\u593e\u7433\u76be\u95c1\u96ae\u65e3\u95ee\uff3dN|y~\uff13\uff6cY\u0005N[^^\u001a\u0015\u0007Q\u79bf"))).defaultValue((Object)(0x7E & 0x3D))).min(5 >> 2).max(0x3B79 & 0x46DE).sliderMin(0x77 & 0x1C).sliderMax(0x5EE & 0x7AD9).build());
        this.IiiIIiiiiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u818e\u528b\u544b\u750b"))).description(MySettings.ALLATORIxDEMO("\u8fb4\u5150\u4e2c\u757e\u65cb\u81df\u5292\u5407\u750f\u6a43\u573a"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.IiiIIIiiIi = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u6478\u7d01\u532e\u5fa7"))).description(MySettings.ALLATORIxDEMO("\u52b2\u6014\u6406\u7d42\u7bde\u5b65\u76be\u5378\u5fb9\u8336\u56ce\uff20\u659e\u5735\uff64"))).defaultValue((Object)(0x34 & 0x5F))).min(4 ^ 5).max(0x66 & 0x7D).sliderMin(--5).sliderMax(0x7F & 0x32).build());
        this.iIIiiIIIII = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u4e2e\u5fa7{\u5734\u6824"))).description(MySettings.ALLATORIxDEMO("\u7ba4\u5b4a\u6429\u7d18\u7691\u4e37\u5fd6B\u5730\u6868\uff3d\n\u4e08\u7394\u5b83\u5f69\u5265\u4f6a\u7f0c\uff64"))).defaultValue((Object)(2 & 5))).min(-30000000).max(30000000).sliderMin(0xFFFFFFBF & 0xFFFFFFDC).sliderMax(0x66 & 0x7D).build());
        this.IIIiIIIiII = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u4e2e\u5fa7z\u5734\u6824"))).description(MySettings.ALLATORIxDEMO("\u7ba4\u5b4a\u6429\u7d18\u7691\u4e37\u5fd6C\u5730\u6868\uff3d\n\u4e08\u7394\u5b83\u5f69\u5265\u4f6a\u7f0c\uff64"))).defaultValue((Object)(3 & 4))).min(0xFFFFFFC5 & 0xFFFFFFFA).max(0x17C8 & 0x6977).sliderMin(0xFFFFFFEC & 0xFFFFFFD3).sliderMax(0x197A & 0x67C5).build());
        this.iIIiIIiiII = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u4e2e\u5fa7y\u5734\u6824"))).description(MySettings.ALLATORIxDEMO("\u7ba4\u5b4a\u6429\u7d18\u7691\u4e37\u5fd6@\u5730\u6868\uff3d\n\u4e08\u7394\u5b83\u5f69\u5265\u4f6a\u7f0c\uff64"))).defaultValue((Object)(2 & 5))).min(-30000000).max(30000000).sliderMin(0xFFFFFFBD & 0xFFFFFFDE).sliderMax(0x6D & 0x76).build());
        this.iiIiIiiiiI = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u4f3b\u752b\u73cd\u5b95\u4f29\u7f4d"))).description(MySettings.ALLATORIxDEMO("\u4f6a\u7532\u73c9\u5bd9\u5f66\u5277\u4f7f\u7f53\u4f69\u4e00\u6434\u7d05\u4e4f\u5fae"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iIiIiIiIii = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u7f57\u5b5b\u6690\u6593\u9590\u96b7"))).description(MySettings.ALLATORIxDEMO("\u7b8b\u5b45\u7f09\u5b4d\u66ee\u65d0\u76eb\u95c1\u96ae\u65c4\u95c9\uff3dNAD\t\uff64"))).defaultValue((Object)(0x7AF9 & 0x75E))).min(0x66 & 0x7D).max(0x577A & 0x3FF5).sliderMin(0x3FCA & 0x40FD).sliderMax(0x77FF & 0xFD0).build());
        this.iIiiIiiiII = this.iIiIiiIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u661e\u80de\u5262\u7c58"))).description(MySettings.ALLATORIxDEMO("\u579a\u4ee1\u725c\u54fb\u5c6c\u601a\u8fee\u8876\u6652\u80da\u5264\u7c16"))).defaultValue((Object)(3 >> 1))).build());
        this.IIiiiiiiII = this.iIiIiiIiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u5262\u7c58\u6a45\u5f2c"))).description(MySettings.ALLATORIxDEMO("\u9033\u62db\u7254\u54f4\u523c\u7c53\u76a3\u6a43\u5f62"))).defaultValue((Object)AutoSort.ClassificationMode.IIIIiIiiIi)).build());
        this.IiIIiIiiiI = this.iIiIiiIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u5940\u7405\u527f\u9003\u720d\u54e2"))).description(MySettings.ALLATORIxDEMO("\u6640\u5413\u593e\u7434\u5226\u9015\u6a1b\u5f27\u76a3\u720b\u54ac"))).defaultValue((Object)(3 >> 2))).build());
        this.iiIIiiIiii = this.iIiIiiIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u5ffe\u7501m&w"))).description(MySettings.ALLATORIxDEMO("\u521c\u7c1b\u6599\u5fc8\u755f\u725b\u54fc\u76b1tjs\u6512\u6303"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iiiiiIIIii = this.IIiiIiiiII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u5311\u6b22\u5960\u7425\u6514\u91ec"))).description(MySettings.ALLATORIxDEMO("\u6bd5\u4e3fn\t\f^\u673a\u5928\u5939\u7433\u76be\u7241\u54e6\u6512\u91a2"))).defaultValue((Object)(0x48 & 0x3F))).min(3 >> 1).max(0x79 & 0x46).sliderMin(5 >> 2).sliderMax(0x2A & 0x75).build());
        this.IiIIIIiiii = this.IIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u8c67\u8bf6\u6a45\u5f2c"))).description(MySettings.ALLATORIxDEMO("\u6604\u7908\u8bdb\u7ef3\u76be\u8c2b\u8bf2\u4f83\u6002"))).defaultValue((Object)(5 >> 3))).build());
        this.IIIiIiiIIi = this.IIiiIiiiII.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIIIiIii.ALLATORIxDEMO("\u5205\u7c1f\u4f3b\u512c\u7e84"))).description(MySettings.ALLATORIxDEMO("\u725c\u54fb\u5234\u7c46\u76b1\u4f22\u5160\u7e80\u7b34\u7508"))).defaultValue((Object)AutoSort.SortPriority.IiIiIIIIiI)).build());
        iIIiiiIiII iIIiiiIiII3 = this;
        iIIiiiIiII3.iiIiIIiIIi = new ArrayList<class_2338>();
        iIIiiiIiII iIIiiiIiII4 = this;
        iIIiiiIiII3.IiIiIIIIiI = new LinkedHashMap<class_2338, iIiiiIiiII>();
        iIIiiiIiII iIIiiiIiII5 = this;
        iIIiiiIiII4.IIiiiIIIIi = new HashMap<String, List<String>>();
        this.iiiIiIiIIi = 2 & 5;
        this.IIIIiIiiIi = 3 & 4;
        this.ALLATORIxDEMO();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIIIiIii.ALLATORIxDEMO("\u0013hf%7fDV\u0014G%w!\"d\u8bf4\u6690\u6593\u5274\u6703\u65d4\u726b\u6748\uff22"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        String[] stringArray = new String[0x4F & 0x36];
        stringArray[3 & 4] = IIiIIIiIii.ALLATORIxDEMO(".mm!'q\u0005E\u0010\u00193l+g!m;S-`\u000fB\u001cF");
        stringArray[3 & 5] = MySettings.ALLATORIxDEMO("ryqxqzfuh4rauJNGgpuz\u007fky");
        stringArray[--2] = IIiIIIiIii.ALLATORIxDEMO("n-*f\u0007Q\u0005E09-q+m;S-`\u000fB\u001cF");
        stringArray[--3] = MySettings.ALLATORIxDEMO("\u007fyqu|osns)xg`xuJOGgpuz\u007fky");
        stringArray[--4] = IIiIIIiIii.ALLATORIxDEMO("c+k&gq%\"w^M\u0001W,f6j0f;S-`\u000fB\u001cF");
        stringArray[--5] = MySettings.ALLATORIxDEMO("}v~z~`iag&iny~AEGgpuz\u007fky");
        this.IIiiiIIIIi.put(MySettings.ALLATORIxDEMO("\u5df6\u516b"), Arrays.asList(stringArray));
        String[] stringArray2 = new String[0x7F & 7];
        stringArray2[3 >> 2] = MySettings.ALLATORIxDEMO("}vswkurzz;buKO}yFefqax");
        stringArray2[--1] = IIiIIIiIii.ALLATORIxDEMO(")-m\u0001@\u0016B\"w~p0l\nF\u001bp\u0013L\u0016G");
        stringArray2[1 ^ 3] = MySettings.ALLATORIxDEMO("p{fbpnoga MYwyFefqax");
        stringArray2[--3] = IIiIIIiIii.ALLATORIxDEMO("ij*!`\u0016B\u0002W~g-b)l\nG\u001bp\u0013L\u0016G");
        stringArray2[--4] = MySettings.ALLATORIxDEMO("\u007fyqu|osns)rku}\u007fVBlrFefqax");
        stringArray2[--5] = IIiIIIiIii.ALLATORIxDEMO("n-m!`\u0016B\"w^A\u000bT");
        stringArray2[0x7F & 6] = MySettings.ALLATORIxDEMO("en}ymst|P\u0011{eveb||k");
        this.IIiiiIIIIi.put(IIiIIIiIii.ALLATORIxDEMO("\u6b02\u564b"), Arrays.asList(stringArray2));
        String[] stringArray3 = new String[--5];
        stringArray3[2 & 5] = MySettings.ALLATORIxDEMO("qgopyVJ~c#eeq}y");
        stringArray3[--1] = IIiIIIiIii.ALLATORIxDEMO(")j*f'q\u0005E09\u0000J\u0016W");
        stringArray3[1 ^ 3] = MySettings.ALLATORIxDEMO("rt|mda}hu/yKIz{|eeq}y");
        stringArray3[--3] = IIiIIIiIii.ALLATORIxDEMO(")j\nF\u0007Q%e09+b\u000f|4o\u0005M\u000fP");
        stringArray3[--4] = MySettings.ALLATORIxDEMO("qgopyVJ~c#q}\u007f`o");
        this.IIiiiIIIIi.put(IIiIIIiIii.ALLATORIxDEMO("\u65dd\u5774"), Arrays.asList(stringArray3));
    }

    public boolean IiiiiiiIIi() {
        return (Boolean)this.IiIIiIiiiI.get();
    }

    public boolean ALLATORIxDEMO() {
        return (Boolean)this.iIiiIiiiII.get();
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        iIIiiiIiII iIIiiiIiII2 = string2;
        String string2 = string;
        iIIiiiIiII IiIIiIiiiI = iIIiiiIiII2;
        if (((Boolean)IiIIiIiiiI.IiIIIIiiii.get()).booleanValue()) {
            ChatUtils.info((String)("(AutoSort) " + (String)string2), (Object[])new Object[3 >> 2]);
        }
    }

    public Map<String, List<String>> IiiiiiiIIi() {
        return this.IIiiiIIIIi;
    }

    public Map<class_2338, iIiiiIiiII> ALLATORIxDEMO() {
        return this.IiIiIIIIiI;
    }

    public int ALLATORIxDEMO() {
        return (Integer)this.iIiIiIiIii.get();
    }

    public AutoSort.ClassificationMode ALLATORIxDEMO() {
        return (AutoSort.ClassificationMode)((Object)this.IIiiiiiiII.get());
    }
}

