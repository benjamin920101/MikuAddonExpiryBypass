/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.orbit.EventHandler
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iiIiiIIIiI;
import com.github.mikumiku.addon.iiiIIiIIii;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MagicMix;
import com.github.mikumiku.addon.modules.FakeCoordinates;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.orbit.EventHandler;

public class iiIiiiIIII
extends iiiiIiIiii {
    private double IiiiiIIIIi;
    private final Setting<Boolean> iiIiIiIiiI;
    private boolean IiiIiIIIiI;
    private final Setting<Boolean> IiIiiIIiii;
    private boolean iIiIiIIiiI;
    private final Setting<Boolean> IIIiIIiiIi;
    private final Setting<FakeCoordinates.ObfuscationMode> IiIiiIIiiI;
    private final Setting<Integer> iIIIIiiiii;
    private final Setting<Boolean> IiIiIIIiiI;
    public static double iIIIIiiiIi;
    private final SettingGroup iiIIiiIiIi;
    public static double IiiIIiIiIi;
    private final Setting<Boolean> iiiiIiiIIi;
    private final Setting<Integer> iiIIiIiiIi;
    private final Setting<Boolean> IiIiiiiIIi;
    private final Setting<Boolean> iiIIiIiiII;
    private final Setting<Integer> IIiIiiIiIi;
    private int IIiIIiIIii;
    private final Setting<Integer> iIiiIiiiii;
    private long iIiIiiIiiI;
    private final Setting<Integer> IIiiiiiiII;
    private final Setting<Boolean> IIiiiIIIIi;
    public static double IIIiIIIiII;
    private double iiIiIiiiiI;
    private final Setting<Integer> IIiiIiiiII;
    private final Setting<Boolean> IIIiIiiIIi;
    private final Setting<Boolean> iiiIiIiIIi;
    private final SettingGroup iIiIiIiIii;
    private final Setting<Boolean> iiiiiIIIii;
    private final Setting<Integer> iIIiIIiiII;
    public static double IiiIIiiiiI;
    private final Setting<Integer> IiIIIIiiii;
    private int IiiIIIiiIi;
    private final Setting<Integer> iiIIiiIiii;
    private final Setting<String> iIiiIiiiII;
    private final Setting<Boolean> iIIiiIIIII;
    private final Setting<Integer> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private final SettingGroup iiIIIIiIII;
    private final Setting<String> IiIIiIiiiI;
    private final Random ALLATORIxDEMO;

    private static /* synthetic */ void IiiiiiiIIi(String IiIIiIiiiI) {
    }

    public void onDeactivate() {
        iiIiiiIIII iiIiiiIIII2 = this;
        iiIiiiIIII iiIiiiIIII3 = this;
        super.onDeactivate();
        MagicMix.x = 0.0;
        MagicMix.z = 0.0;
        iIIIIiiiIi = 0.0;
        IIIiIIIiII = 0.0;
        iiIiiiIIII3.IIiIIiIIii = 3 >> 2;
        iiIiiiIIII3.IiiIIIiiIi = 5 >> 3;
        iiIiiiIIII2.IiiiiIIIIi = 0.0;
        iiIiiiIIII2.iiIiIiiiiI = 0.0;
    }

    private /* synthetic */ void IiiiiiiIIi() {
        if (this.iiIIIIiIII.player == null || this.iiIIIIiIII.player.getMainHandStack() != null) {
            // empty if block
        }
    }

    private /* synthetic */ void iIIiiiIiiI(double IiIIiIiiiI, double IiIIiIiiiI2) {
        double d;
        double d2 = IiIIiIiiiI;
        double d3 = IiIIiIiiiI2;
        IiIIiIiiiI = Math.sqrt(d2 * d2 + d3 * d3);
        if (d < (double)((Integer)this.iIIIIiiiii.get() * (0x7F & 0x10))) {
            if (!((Boolean)this.iIIiiIIIII.get()).booleanValue()) {
                Object[] objectArray = new Object[--2];
                objectArray[2 & 5] = IiIIiIiiiI / 16.0;
                objectArray[2 ^ 3] = this.iIIIIiiiii.get();
                this.warning(iiiIIiIIii.ALLATORIxDEMO("\u8df8\u79fb\u51df\u757f\u70bc\u594a\u8fd4@-E+qC@9@ $\fl\u0005\u65a0\u6cf0\u4f1f\u752d\u56ba\u5bbf\u500f\u79de\u6a41\u5f0a"), objectArray);
            }
            iiIiiiIIII iiIiiiIIII2 = this;
            iiIiiiIIII2.IIiIIiIIii = iiIiiiIIII2.ALLATORIxDEMO.nextInt(100000, 999999);
            iiIiiiIIII2.IiiIIIiiIi = iiIiiiIIII2.ALLATORIxDEMO.nextInt(100000, 999999);
            return;
        }
        if (((Boolean)this.IiIiIIIIiI.get()).booleanValue() && this.IiIiiiIIiI()) {
            this.IIiIIiIIii = (Integer)this.IIiIiiIiIi.get() / (0x13 & 0x7C) / (0x68 & 0x1F);
            this.IiiIIIiiIi = (Integer)this.IIiiiiiiII.get() / (0x71 & 0x1E) / (0x4F & 0x38);
            return;
        }
        this.IIiIIiIIii = (Integer)this.IIiIiiIiIi.get() / (0x3D & 0x52);
        this.IiiIIIiiIi = (Integer)this.IIiiiiiiII.get() / (0x1F & 0x70);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        if (((Boolean)this.iiiiIiiIIi.get()).booleanValue()) {
            // empty if block
        }
        if (((Boolean)this.IiIiiIIiii.get()).booleanValue()) {
            this.IiiiiiiIIi();
        }
    }

    private /* synthetic */ boolean IiIiiiIIiI() {
        if (this.iiIIIIiIII.world == null) {
            return (3 ^ 3) != 0;
        }
        return this.iiIIIIiIII.world.getRegistryKey().getValue().getPath().equals(iiIiiIIIiI.ALLATORIxDEMO("Q>`)k\u0013q\u001e`\u0004"));
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void iiIiiiiiII(double IiIIiIiiiI, double IiIIiIiiiI2) {
        switch (((FakeCoordinates.ObfuscationMode)((Object)this.IiIiiIIiiI.get())).ordinal()) {
            case 0: {
                this.IiiiiiiIIi(IiIIiIiiiI, IiIIiIiiiI2);
                return;
            }
            case 1: {
                this.iIIiiiIiiI(IiIIiIiiiI, IiIIiIiiiI2);
                return;
            }
            case 2: {
                this.ALLATORIxDEMO(IiIIiIiiiI, IiIIiIiiiI2);
                return;
            }
        }
    }

    public iiIiiiIIII() {
        iiIiiiIIII iiIiiiIIII2 = this;
        super(iiiiIiIiii.IiIiIIIIiI, iiIiiIIIiI.ALLATORIxDEMO("\u5031\u5755\u6871"), iiiIIiIIii.ALLATORIxDEMO("\u907a\u8fc2\u500f\u79de\u54cc\u6dd2\u6d86\u6555\u630e\u5300\u6705\u9695\u85af\u4f65\u76e4\u771a\u5b8b\u5720\u6847\u4f68\u7f29\u000e`\u90d8\u6672\u5290\u6016\u76f6"));
        iiIiiiIIII2.iiiiiIIiiI = iiIiiiIIII2.settings.getDefaultGroup();
        iiIiiiIIII2.iIiIiIiIii = iiIiiiIIII2.settings.createGroup(iiIiiIIIiI.ALLATORIxDEMO("\u504a\u798d\u8bbb\u7f18"));
        iiIiiiIIII2.iiIIIIiIII = iiIiiiIIII2.settings.createGroup(iiiIIiIIii.ALLATORIxDEMO("\u4f80\u629c\u8ba9\u7f1c"));
        iiIiiiIIII2.iiIIiiIiIi = iiIiiiIIII2.settings.createGroup(iiIiiIIIiI.ALLATORIxDEMO("\u9add\u7ed1\u900c\u980f"));
        iiIiiiIIII2.IiIIiIiiiI = iiIiiiIIII2.iiiiiIIiiI.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u81aa\u5bbf\u4e14\u6a19\u5740\u547f"))).description(iiIiiIIIiI.ALLATORIxDEMO("\u9637\u6b14\u7a7a\u5e58"))).defaultValue((Object)iiiIIiIIii.ALLATORIxDEMO("\u507f\u5747\u6875"))).onChanged(IiIIiIiiiI -> iiIiiiIIII.IiiiiiiIIi(IiIIiIiiiI))).build());
        this.IiIiiIIiiI = this.iiiiiIIiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6df2\u6db0\u6a24\u5f79"))).description(iiiIIiIIii.ALLATORIxDEMO("\u902c\u62ae\u5772\u6847\u6dd2\u6d9b\u76bc\u65ae\u5f7d"))).defaultValue((Object)FakeCoordinates.ObfuscationMode.IiIIiIiiiI)).build());
        this.iIIiiIIIII = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u76f1\u64db\u6a24\u5f79"))).description(iiiIIiIIii.ALLATORIxDEMO("\u542a\u7548\u65f3\u5c5d\u91ca\u9627\u6b12\u7a3f\u5e0bg\u4e2f\u8fd3\u51df\u4ea6\u4f6d\u4ff6\u601d"))).defaultValue((Object)(3 >> 2))).build());
        this.IiIiiiiIIi = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6559\u6304\u5c79\u5735\u5688"))).description(iiiIIiIIii.ALLATORIxDEMO("\u650a\u635c\u5c37\u5727\u568c"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.iiiIiIiIIi = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6579\u6304\u001bl\u0018l\u001ep\u0012"))).description(iiiIIiIIii.ALLATORIxDEMO("\u650a\u6346O)K4Pb\u0016"))).defaultValue((Object)(--1 != 0))).build());
        this.IIIIiIiiIi = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u650a\u6357r\u0019w\u001aa\u001bd\u0006"))).description(iiiIIiIIii.ALLATORIxDEMO("\u6538\u6373"))).defaultValue((Object)((2 ^ 3) != 0))).build());
        this.IIiiiIIIIi = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u9a89\u8bb7\u9148\u7f18"))).description(iiiIIiIIii.ALLATORIxDEMO("\u542a\u753d\u6586\u9acc\u8be4\u6db0\u6de4\u8bfe\u7f4b\u6672\u541e\u6b74\u781c"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiIIiIiiIi = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u968a\u674c\u6705\u5c79\u81ef\u8edd\u8dd8\u79cd"))).description(iiiIIiIIii.ALLATORIxDEMO("\u968a\u675a\u504a\u799b\u65f3\u4e6e\u771a\u5b8b\u5720\u6847\u76a1\u6747\u5c2d\u8d9d\u799e\uff55\u5302\u5740\uff7b"))).defaultValue((Object)100000)).min(3 & 4).sliderMax(1000000).visible(() -> {
            if (this.IiIiiIIiiI.get() == FakeCoordinates.ObfuscationMode.IiIIiIiiiI) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.iiIIiiIiii = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u96d9\u673f\u6776\u5c0a\u518c\u751a\u70cf\u8dd8\u79cd"))).description(iiiIIiIIii.ALLATORIxDEMO("\u96ef\u673f\u502f\u79fe\u6596\u4e0b\u51ef\u756f\u70f9\u76a1\u6747\u5c2d\u8d9d\u799e\uff55\u5302\u5740\uff7b"))).defaultValue((Object)100000)).min(5 >> 3).sliderMax(1000000).visible(() -> {
            if (this.IiIiiIIiiI.get() == FakeCoordinates.ObfuscationMode.IiIIiIiiiI) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.iiIiIIiIIi = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u96d9\u673f\u6776\u5922\u518c\u751a\u70cf\u8dd8\u79cd"))).description(iiiIIiIIii.ALLATORIxDEMO("\u96ef\u673f\u502f\u79fe\u6596\u4e0b\u51ef\u756f\u70f9\u76a1\u6747\u5905\u8d9d\u799e\uff55\u5302\u5740\uff7b"))).defaultValue((Object)29000000)).min(3 ^ 3).sliderMax(29999999).visible(() -> {
            if (this.IiIiiIIiiI.get() == FakeCoordinates.ObfuscationMode.IiIIiIiiiI) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.IIiIiiIiIi = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u568c\u5b9f\u5039\u79fe."))).description(iiiIIiIIii.ALLATORIxDEMO("M\u8f04\u76c4\u56df\u5bdd\u506d\u79bb\u91ea\uff55\u5302\u5740\uff7b"))).defaultValue((Object)(3 >> 2))).sliderMin(-29999999).sliderMax(29999999).visible(() -> {
            if (this.IiIiiIIiiI.get() == FakeCoordinates.ObfuscationMode.iiIIIIiIII) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.IIiiiiiiII = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u568c\u5b9f\u5039\u79fe,"))).description(iiiIIiIIii.ALLATORIxDEMO("O\u8f04\u76c4\u56df\u5bdd\u506d\u79bb\u91ea\uff55\u5302\u5740\uff7b"))).defaultValue((Object)(3 & 4))).sliderMin(-29999999).sliderMax(29999999).visible(() -> {
            if (this.IiIiiIIiiI.get() == FakeCoordinates.ObfuscationMode.iiIIIIiIII) {
                return (3 & 5) != 0;
            }
            return false;
        })).build());
        this.IiIiIIIIiI = this.iIiIiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u4e0e\u753a\u5755\u6871\u8f69\u6314"))).description(iiiIIiIIii.ALLATORIxDEMO("\u5758\u4e4b\u7569\u81ad\u528a\u8c43\u6551\u5012\u79c3\u6bc3\u4ff9"))).defaultValue((Object)(3 >> 1))).visible(() -> {
            if (this.IiIiiIIiiI.get() == FakeCoordinates.ObfuscationMode.iiIIIIiIII) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.iIIIIiiiii = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6776\u5c0a\u518c\u751a\u70cf\u8dd8\u79cd"))).description(iiiIIiIIii.ALLATORIxDEMO("\u773a\u5bde\u5775\u6847\u8df8\u79db\u51ff\u757f\u70bc\u76e4\u6705\u5c6f\u8dd8\u79ae\uff7c\u5466\u523c\u65ea\u5f22\u8f9e\u6380\uff55\u5302\u5740\uff7b"))).defaultValue((Object)100000)).min(2 & 5).sliderMax(1000000).visible(() -> {
            if (this.IiIiiIIiiI.get() == FakeCoordinates.ObfuscationMode.iiIIIIiIII) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.IIiiIiiiII = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6371\u5b9f\u4f3b\u7f6b."))).description(iiiIIiIIii.ALLATORIxDEMO("\u5c66\u73ac\u5ba3\u664e\u797a\u570d\u6b23z\u5710\u6822\uff55\u5302\u5740\uff7b"))).defaultValue((Object)(3 & 4))).sliderMin(-29999999).sliderMax(29999999).visible(() -> {
            if (this.IiIiiIIiiI.get() == FakeCoordinates.ObfuscationMode.IiIiIIIIiI) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.iIIiIIiiII = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6371\u5b9f\u4f3b\u7f6b,"))).description(iiiIIiIIii.ALLATORIxDEMO("\u5c66\u73ac\u5ba3\u664e\u797a\u570d\u6b23x\u5710\u6822\uff55\u5302\u5740\uff7b"))).defaultValue((Object)(3 & 4))).sliderMin(-29999999).sliderMax(29999999).visible(() -> {
            if (this.IiIiiIIiiI.get() == FakeCoordinates.ObfuscationMode.IiIiIIIIiI) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iIiiIiiiii = this.iIiIiIiIii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u4f25\u9077\u91c8\u65c6\u751a\u6266\u8dd8\u79cd"))).description(iiiIIiIIii.ALLATORIxDEMO("\u4f40\u9004\u8de5\u8fc2\u6b04\u8dd8\u79db\u65f3\u91d8\u65c0\u755f\u6235\u5008\u79d9\u5710\u6822\uff55\u5302\u5740\uff7b"))).defaultValue((Object)(0x4E & 0x71))).min(5 >> 3).sliderMax(0x13F9 & 0x6FEE).build());
        this.iiIiIiIiiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u675d\u5f74\u4e3d\u7739\u6580\u65a8\u8fa8"))).description(iiiIIiIIii.ALLATORIxDEMO("\u5b38\u572d\u674b\u5f74\u4e2b\u7739\u6596\u81ef\u52bd\u65dd\u5f40\u8ffb\u63e2\u4ec7\u9672\u6b47\u570d\u683f\u6cd3\u9740"))).defaultValue((Object)(--1 != 0))).build());
        this.IiIiIIIiiI = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u53b9\u80f8\u6cb2\u9737\u5726\u6802\u6580\u65a8\u8fa8"))).description(iiiIIiIIii.ALLATORIxDEMO("\u63c5\u8fd4\u538f\u80f8\u6ca4\u9737\u5745\u6877\u76c4\u506a\u79bc\u659b\u5717\u65d3\u65f0\u5f38\u8fc9\u63d7"))).defaultValue((Object)(3 >> 1))).build());
        this.IiIIIIiiii = this.iiIIIIiIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u4f56\u9004\u5478\u767e\u5f23\u5ef3\u8fa9"))).description(iiiIIiIIii.ALLATORIxDEMO("\u4f40\u9004\u546e\u5ef3\u8fbf\u591f\u4e50\u623d\u5101\u8b9d\u73ee\u5b94\u763b\u5f70\uff55\u6bd3\u79c5\uff7b"))).defaultValue((Object)(0x1FEC & 0x63FB))).min(3 >> 2).sliderMax(0x7FB2 & 0x275D).build());
        this.iiiiIiiIIi = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u7682\u64a8\u6a57\u5f0a\u9644CE"))).description(iiiIIiIIii.ALLATORIxDEMO("\u76f1\u64b8\u6a51\u5f4f\u4e2e\u79c6\u750a\u0006\u0016\u8c5e\u8bed\u4ff6\u601d"))).defaultValue((Object)((2 ^ 3) != 0))).visible(() -> this.iIIiiIIIII.get())).build());
        this.IiIiiIIiii = this.iiIIIIiIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u76a2\u64a8\u6a57\u5f0a\u9644\u5755\u6871\u6cc1\u9744"))).description(iiiIIiIIii.ALLATORIxDEMO("\u7694\u64a8\u6a41\u5f0a\u4e6b\u81ef\u52bd\u9642\u6b22\u53ca\u80ba\u76a6\u5710\u6822\u6c99\u970a\u885b\u4e48"))).defaultValue((Object)((3 & 5) != 0))).visible(() -> this.iIIiiIIIII.get())).build());
        this.iiIIiIiiII = this.iiIIiiIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6df2\u6db0\u57ff\u5cdf"))).description(iiiIIiIIii.ALLATORIxDEMO("\u6dd5\u6d86\u57df\u5cf4\u5c7a\u6567\u631c"))).defaultValue((Object)(3 >> 1))).build());
        this.iiiiiIIIii = this.iiIIiiIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6d81\u6dc3\u534c\u5752\u9aae\u5ea3\u5688"))).description(iiiIIiIIii.ALLATORIxDEMO("\u6db7\u6de3\u537d\u5775\u76c4\u9afd\u5efb\u56c6\u6567\u631c"))).defaultValue((Object)(5 >> 2))).build());
        this.IIIiIIiiIi = this.iiIIiiIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6df2\u6db0\u533f\u5721\u514c\u7111"))).description(iiiIIiIIii.ALLATORIxDEMO("\u6dd2\u6d81\u5318\u5717\u76a1\u5114\u715f\u6567\u631c"))).defaultValue((Object)(5 >> 2))).build());
        this.IIIiIiiIIi = this.iiIIiiIiIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u6df2\u6db0\u751a\u721f\u7fa1\u7c8d"))).description(iiiIIiIIii.ALLATORIxDEMO("\u5c66\u6245\u671c\u756f\u7229\u7f81\u7cbc\u66dd\u6322\u4e1f\u635a\u5ba2\u7c6c\u57f9"))).defaultValue((Object)(3 >> 2))).build());
        this.iIiiIiiiII = this.iiIIiiIiIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiIiiIIIiI.ALLATORIxDEMO("\u751a\u721f\u7fa1\u7c8d\u7c7e\u57fd"))).description(iiiIIiIIii.ALLATORIxDEMO("\u7558\u4ece\u66da\u6325\u76a6\u755f\u724c\u7ff9\u7cc3\u7c6c\u57f9"))).defaultValue((Object)iiIiiIIIiI.ALLATORIxDEMO("u\u001ad\u001fk\u0005"))).visible(() -> this.IIIiIiiIIi.get())).build());
        iiIiiiIIII iiIiiiIIII3 = this;
        iiIiiiIIII iiIiiiIIII4 = this;
        iiIiiiIIII iiIiiiIIII5 = this;
        iiIiiiIIII iiIiiiIIII6 = this;
        this.ALLATORIxDEMO = new SecureRandom();
        this.IIiIIiIIii = 3 & 4;
        iiIiiiIIII5.IiiIIIiiIi = this.IIiIIiIIii;
        iiIiiiIIII5.IiiiiIIIIi = 0.0;
        iiIiiiIIII4.iiIiIiiiiI = 0.0;
        iiIiiiIIII4.IiiIiIIIiI = 3 >> 2;
        iiIiiiIIII3.iIiIiiIiiI = 0L;
        iiIiiiIIII3.iIiIiIIiiI = 5 >> 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiiIIiIIii.ALLATORIxDEMO("\u0010I%D\u0013`@p\u0010a\u0001qpQ`\u8bd2\u66b3\u6592\u5270\u6725\u65ed\u7270\u673b\uff73"));
        }
    }

    private /* synthetic */ void IiiIIIIiiI(double IiIIiIiiiI, double IiIIiIiiiI2) {
        MagicMix.x = IiIIiIiiiI + (double)(this.IIiIIiIIii * (0x7B & 0x14));
        MagicMix.z = IiIIiIiiiI2 + (double)(this.IiiIIIiiIi * (0x38 & 0x57));
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        double d;
        iiIiiiIIII iiIiiiIIII2 = iiIiiiIIII3;
        iiIiiiIIII iiIiiiIIII3 = post;
        iiIiiiIIII IiIIiIiiiI = iiIiiiIIII2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null) {
            return;
        }
        iiIiiiIIII iiIiiiIIII4 = IiIIiIiiiI;
        double d2 = iiIiiiIIII4.iiIIIIiIII.player.getX();
        double d3 = iiIiiiIIII4.iiIIIIiIII.player.getZ();
        if (((Boolean)iiIiiiIIII4.iIIiiIIIII.get()).booleanValue()) {
            IiIIiIiiiI.ALLATORIxDEMO();
        }
        double d4 = Math.sqrt(Math.pow(d2 - IiIIiIiiiI.IiiiiIIIIi, 2.0) + Math.pow(d3 - IiIIiIiiiI.iiIiIiiiiI, 2.0));
        if (d > (double)((Integer)IiIIiIiiiI.iIiiIiiiii.get() * (0x59 & 0x36))) {
            if (!((Boolean)IiIIiIiiiI.iIIiiIIIII.get()).booleanValue()) {
                Object[] objectArray = new Object[2 ^ 3];
                objectArray[5 >> 3] = d4;
                IiIIiIiiiI.info(iiiIIiIIii.ALLATORIxDEMO("\u68a8\u6d46\u5255\u957f\u8db8\u79bb\u7993\u52a5]0C-Jx@\u65bc\u5706\u001dA(\u91a1\u65b9\u757b\u6211\u5029\u79f8"), objectArray);
            }
            IiIIiIiiiI.iiIiiiiiII(d2, d3);
        }
        iiIiiiIIII iiIiiiIIII5 = IiIIiIiiiI;
        iiIiiiIIII5.IiiiiIIIIi = d2;
        iiIiiiIIII5.iiIiIiiiiI = d3;
        IiIIiIiiiI.IiiIIIIiiI(d2, d3);
    }

    public boolean iiIiiiiiII() {
        return (Boolean)this.iIIiiIIIII.get();
    }

    static {
        IiiIIiiiiI = 0.0;
        IiiIIiIiIi = 0.0;
        iIIIIiiiIi = 0.0;
        IIIiIIIiII = 0.0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void IiiiiiiIIi(double d, double d2) {
        iiIiiiIIII iiIiiiIIII2;
        block2: {
            void IiIIiIiiiI;
            void IiIIiIiiiI2;
            int n;
            int n2;
            iiIiiiIIII2 = this;
            int n3 = n4 = 5 >> 3;
            while (true) {
                if (n3 >= 100) break block2;
                iiIiiiIIII iiIiiiIIII3 = iiIiiiIIII2;
                ++n4;
                n2 = iiIiiiIIII3.ALLATORIxDEMO();
                n = iiIiiiIIII3.ALLATORIxDEMO();
                if (!(Math.sqrt(Math.pow((double)n2 - IiIIiIiiiI2, 2.0) + Math.pow((double)n - IiIIiIiiiI, 2.0)) < (double)((Integer)iiIiiiIIII2.iiIIiIiiIi.get() * (0x35 & 0x5A)))) break;
                n3 = n4;
            }
            int n4 = (int)Math.floor((double)(IiIIiIiiiI2 / 16.0));
            int n5 = (int)Math.floor((double)(IiIIiIiiiI / 16.0));
            iiIiiiIIII iiIiiiIIII4 = iiIiiiIIII2;
            iiIiiiIIII4.IIiIIiIIii = n2 / (0x13 & 0x7C) - n4;
            iiIiiiIIII4.IiiIIIiiIi = n / (0x12 & 0x7D) - n5;
            return;
        }
        if (!((Boolean)iiIiiiIIII2.iIIiiIIIII.get()).booleanValue()) {
            iiIiiiIIII2.warning(iiIiiIIIiI.ALLATORIxDEMO("\u96f9\u671f\u5019\u79de\u7549\u6235\u5967\u8d20\uff7a\u4f7a\u755e\u9edd\u8bd2\u504a\u798d"), new Object[2 & 5]);
        }
        iiIiiiIIII2.IIiIIiIIii = 100000;
        iiIiiiIIII2.IiiIIIiiIi = 100000;
    }

    private /* synthetic */ void ALLATORIxDEMO(double IiIIiIiiiI3, double IiIIiIiiiI22) {
        int IiIIiIiiiI3 = (int)Math.floor(IiIIiIiiiI3 / 16.0);
        int n = (int)Math.floor(IiIIiIiiiI22 / 16.0);
        int IiIIiIiiiI22 = (Integer)this.IIiiIiiiII.get() / (0x36 & 0x59);
        iiIiiiIIII iiIiiiIIII2 = this;
        iiIiiiIIII2.IIiIIiIIii = IiIIiIiiiI22 - IiIIiIiiiI3;
        iiIiiiIIII2.IiiIIIiiIi = (Integer)this.iIIiIIiiII.get() / (0x3D & 0x52) - n;
    }

    private /* synthetic */ int ALLATORIxDEMO() {
        iiIiiiIIII iiIiiiIIII2 = this;
        int n = (Integer)iiIiiiIIII2.iiIIiiIiii.get();
        int n2 = (Integer)iiIiiiIIII2.iiIiIIiIIi.get();
        return iiIiiiIIII2.ALLATORIxDEMO.nextInt(n, n2 + (2 ^ 3)) * (iiIiiiIIII2.ALLATORIxDEMO.nextBoolean() ? 3 & 5 : -1);
    }

    @Override
    public void onActivate() {
        iiIiiiIIII iiIiiiIIII2 = this;
        super.onActivate();
        if (iiIiiiIIII2.iiIIIIiIII.player != null) {
            iiIiiiIIII iiIiiiIIII3 = this;
            iIIIIiiiIi = iiIiiiIIII3.iiIIIIiIII.player.getX();
            IIIiIIIiII = iiIiiiIIII3.iiIIIIiIII.player.getZ();
            iiIiiiIIII3.IiiiiIIIIi = iIIIIiiiIi;
            iiIiiiIIII3.iiIiIiiiiI = IIIiIIIiII;
            iiIiiiIIII3.iiIiiiiiII(iIIIIiiiIi, IIIiIIIiII);
            if (!((Boolean)iiIiiiIIII3.iIIiiIIIII.get()).booleanValue()) {
                Object[] objectArray = new Object[--4];
                objectArray[3 >> 2] = iIIIIiiiIi;
                objectArray[3 & 5] = IIIiIIIiII;
                objectArray[5 >> 1] = this.IIiIIiIIii;
                objectArray[--3] = this.IiiIIIiiIi;
                this.info(iiIiiIIIiI.ALLATORIxDEMO("\u5011\u5777\u6853\u5dcb\u5465\u754a1\u0000~\u53b7\u70e2\u0012{\u000bu\f`\u0004=\u0005s\u000bgc_\tv\u506a\u79ad\u001fv-SaZ%Sa_"), objectArray);
                return;
            }
        } else {
            iIIIIiiiIi = 0.0;
            IIIiIIIiII = 0.0;
            iiIiiiIIII iiIiiiIIII4 = this;
            iiIiiiIIII4.IiiiiIIIIi = 0.0;
            iiIiiiIIII4.iiIiIiiiiI = 0.0;
        }
    }

    public String ALLATORIxDEMO() {
        if (((Boolean)this.iIIiiIIIII.get()).booleanValue()) {
            return iiiIIiIIii.ALLATORIxDEMO("\u7694\u64a8\u6a70\u5f3b\uff77\u5758\u686b\u4fe8\u600b\u5df3\u96f6\u85cc");
        }
        Object[] objectArray = new Object[--5];
        objectArray[3 & 4] = ((FakeCoordinates.ObfuscationMode)((Object)this.IiIiiIIiiI.get())).toString();
        objectArray[5 >> 2] = this.IIiIIiIIii;
        objectArray[1 ^ 3] = this.IiiIIIiiIi;
        objectArray[--3] = MagicMix.x;
        objectArray[--4] = MagicMix.z;
        return String.format(iiIiiIIIiI.ALLATORIxDEMO("\u6a18\u5f45\u001br\u0000%\u0007(\u0019\u5005\u7999+\rv\r?\u0004{\u00064\u000bq\u5358\u5746\u0005*\u0005\u5011\u5755\u6871\u001fv\rs\u000bgcZ%S+Gc_"), objectArray);
    }
}

