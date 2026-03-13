/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalXZ
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalXZ;
import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIiIiiiiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.modules.NetherSearchArea;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.Dimension;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIiIIiII
extends iiiiIiIiii {
    private final Setting<Integer> iiiiiIIIii;
    private boolean iIIiIIiiII;
    private final Setting<NetherSearchArea.SearchMode> IiiIIiiiiI;
    private class_2338 IiIIIIiiii;
    private final Setting<NetherSearchArea.SearchShape> IiiIIIiiIi;
    private boolean iiIIiiIiii;
    private class_2338 iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    private int iiIiIIiIIi;
    private int IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    private List<class_2338> iiIIIIiIII;
    private final Setting<Integer> IiIIiIiiiI;
    private final Setting<Integer> ALLATORIxDEMO;

    private /* synthetic */ boolean IiiiiiiIIi() {
        if (((class_310)this.iiIIIIiIII).world == null) {
            return (3 ^ 3) != 0;
        }
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, int n, int n2, NetherSearchArea.SearchMode searchMode) {
        int[][] IiIIiIiiiI;
        IiiIiIIiII iiiIiIIiII = iiiIiIIiII2;
        IiiIiIIiII iiiIiIIiII2 = class_23382;
        IiiIiIIiII IiIIiIiiiI2 = iiiIiIIiII;
        if (IiIIiIiiiI == NetherSearchArea.SearchMode.ALLATORIxDEMO) {
            void v1 = IiIIiIiiiI = -IiIIiIiiiI;
            while (v1 <= IiIIiIiiiI) {
                void v2 = -IiIIiIiiiI;
                while (v2 <= IiIIiIiiiI) {
                    void var5_6;
                    class_2338 class_23383 = new class_2338(iiiIiIIiII2.getX() + var5_6 * IiIIiIiiiI, iiiIiIIiII2.getY(), iiiIiIIiII2.getZ() + IiIIiIiiiI * IiIIiIiiiI);
                    IiIIiIiiiI2.iiIIIIiIII.add(class_23383);
                    v2 = ++var5_6;
                }
                v1 = ++IiIIiIiiiI;
            }
        } else {
            int[][] nArrayArray = new int[4][];
            int[] nArray = new int[--2];
            int n3 = 5 >> 3;
            nArray[n3] = 3 >> 1;
            nArray[--1] = 5 >> 3;
            nArrayArray[n3] = nArray;
            int[] nArray2 = new int[5 >> 1];
            nArray2[3 ^ 3] = 3 >> 2;
            int n4 = 2 ^ 3;
            nArray2[n4] = 3 & 5;
            nArrayArray[n4] = nArray2;
            int[] nArray3 = new int[1 ^ 3];
            nArray3[3 ^ 3] = -4 >> 2;
            nArray3[3 & 5] = 5 >> 3;
            nArrayArray[1 ^ 3] = nArray3;
            int[] nArray4 = new int[5 >> 1];
            nArray4[3 ^ 3] = 3 & 4;
            nArray4[4 ^ 5] = -4 >> 2;
            nArrayArray[--3] = nArray4;
            IiIIiIiiiI = nArrayArray;
            int n5 = 3 >> 2;
            int n6 = 3 & 4;
            int n7 = 2 & 5;
            int n8 = 4 ^ 5;
            int n9 = 3 & 4;
            class_2338 class_23384 = new class_2338(iiiIiIIiII2.getX(), iiiIiIIiII2.getY(), iiiIiIIiII2.getZ());
            IiIIiIiiiI2.iiIIIIiIII.add(class_23384);
            void var10_14 = IiIIiIiiiI * --4;
            while (n8 <= var10_14) {
                int[] nArray5 = IiIIiIiiiI[n7];
                int n10 = 3 ^ 3;
                while (n10 < n8) {
                    int n11;
                    if (Math.abs(n5 += nArray5[5 >> 3]) <= IiIIiIiiiI && Math.abs(n6 += nArray5[5 >> 2]) <= IiIIiIiiiI) {
                        class_2338 class_23385 = new class_2338(iiiIiIIiII2.getX() + n5 * IiIIiIiiiI, iiiIiIIiII2.getY(), iiiIiIIiII2.getZ() + n6 * IiIIiIiiiI);
                        IiIIiIiiiI2.iiIIIIiIII.add(class_23385);
                    }
                    n10 = ++n11;
                }
                int n12 = 3 & 5;
                ++n9;
                n7 = (n7 + (3 >> 1)) % --4;
                if (n9 != --2) continue;
                int n13 = 5 >> 2;
                ++n8;
                n9 = 3 >> 2;
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, int n, int n2) {
        void IiIIiIiiiI;
        int n32 = n2;
        IiiIiIIiII IiIIiIiiiI2 = this;
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.5;
        double d4 = (double)n32 / (Math.PI * 2);
        IiIIiIiiiI *= 0x3C & 0x53;
        double d5 = d2;
        while (d5 <= (double)IiIIiIiiiI) {
            void IiIIiIiiiI3;
            n32 = (int)Math.round(d2 * Math.cos(d));
            int n4 = (int)Math.round(d2 * Math.sin(d));
            class_2338 n32 = new class_2338(IiIIiIiiiI3.getX() + n32, IiIIiIiiiI3.getY(), IiIIiIiiiI3.getZ() + n4);
            IiIIiIiiiI2.iiIIIIiIII.add(n32);
            d += d3;
            d5 = d2 += d4 * d3;
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        IiiIiIIiII iiiIiIIiII = iiiIiIIiII2;
        IiiIiIIiII iiiIiIIiII2 = class_23382;
        IiiIiIIiII IiIIiIiiiI = iiiIiIIiII;
        if (IiIIiIiiiI.IiIIIIiiii != null && IiIIiIiiiI.IiIIIIiiii.getX() == iiiIiIIiII2.getX() && IiIIiIiiiI.IiIIIIiiii.getZ() == iiiIiIIiII2.getZ()) {
            return;
        }
        IiIIiIiiiI.IiIIIIiiii = iiiIiIIiII2;
        try {
            BaritoneAPI.getProvider().getPrimaryBaritone().getElytraProcess().pathTo((Goal)new GoalXZ(iiiIiIIiII2.getX(), iiiIiIIiII2.getZ()));
            return;
        } catch (Exception this2) {
            ChatUtils.error((String)("\u5bfb\u8def\u5931\u8d25: " + this2.getMessage()), (Object[])new Object[3 >> 2]);
            return;
        }
    }

    @Override
    public void onActivate() {
        if (((class_310)this.iiIIIIiIII).player == null || ((class_310)this.iiIIIIiIII).world == null) {
            ChatUtils.error((String)IIIIiIIIIi.ALLATORIxDEMO(")>\u0018+:\u0006~\u001a\u0003z$\u00176\u0003=R/\u001eq\u00141\u00039_"), (Object[])new Object[5 >> 3]);
            this.toggle();
            return;
        }
        if (!this.IiiiiiiIIi()) {
            ChatUtils.warning((String)IIiIiiiiIi.IiiiiiiIIi("\u4f67\u5ff7\u985c\u573a\u5737\u72c3\u4e0a\u627f\u80da\u4f6d\u752f\u6b56\u6a06\u5765\uff26"), (Object[])new Object[3 >> 2]);
            if (!((Boolean)this.IiIiIIIIiI.get()).booleanValue()) {
                this.toggle();
                return;
            }
        }
        this.IiiiiiiIIi();
    }

    public void onDeactivate() {
        IiiIiIIiII iiiIiIIiII = this;
        iiiIiIIiII.ALLATORIxDEMO();
        iiiIiIIiII.iiIiiiiiII();
    }

    public boolean ALLATORIxDEMO() {
        return this.iIIiIIiiII;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        IiiIiIIiII iiiIiIIiII = iiiIiIIiII2;
        IiiIiIIiII iiiIiIIiII2 = pre;
        IiiIiIIiII IiIIiIiiiI = iiiIiIIiII;
        if (((class_310)IiIIiIiiiI.iiIIIIiIII).player == null || ((class_310)IiIIiIiiiI.iiIIIIiIII).world == null) {
            return;
        }
        if (((Boolean)IiIIiIiiiI.IiIiIIIIiI.get()).booleanValue() && !IiIIiIiiiI.iiIIiiIiii && IiIIiIiiiI.IiiiiiiIIi() && !IiIIiIiiiI.isActive()) {
            IiIIiIiiiI.toggle();
            return;
        }
        IiiIiIIiII iiiIiIIiII3 = IiIIiIiiiI;
        iiiIiIIiII3.iiIIiiIiii = iiiIiIIiII3.IiiiiiiIIi();
        if (!iiiIiIIiII3.IiiiiiiIIi() && IiIIiIiiiI.isActive()) {
            ChatUtils.warning((String)IIIIiIIIIi.ALLATORIxDEMO("\u79e9\u5f48\u4ee5\u5744\u72ae\uff79\u5002\u6b1f\u644a\u7d5d\u3056"), (Object[])new Object[3 >> 2]);
            IiIIiIiiiI.toggle();
            return;
        }
        if (!IiIIiIiiiI.iIIiIIiiII) {
            return;
        }
        IiiIiIIiII iiiIiIIiII4 = IiIIiIiiiI;
        iiiIiIIiII4.iiIiIIiIIi += 4 ^ 5;
        if (iiiIiIIiII4.iiIiIIiIIi < (Integer)IiIIiIiiiI.ALLATORIxDEMO.get()) {
            return;
        }
        IiIIiIiiiI.iiIiIIiIIi = 5 >> 3;
        if (IiIIiIiiiI.iiIIIIiIII == null || IiIIiIiiiI.iiIIIIiIII.isEmpty()) {
            ChatUtils.error((String)IIiIiiiiIi.IiiiiiiIIi("\u670d\u750d\u6217\u642e\u7d05\u708b\uff26"), (Object[])new Object[3 ^ 3]);
            IiIIiIiiiI.toggle();
            return;
        }
        IiiIiIIiII iiiIiIIiII5 = IiIIiIiiiI;
        if (iiiIiIIiII5.IIIIiIiiIi >= iiiIiIIiII5.iiIIIIiIII.size()) {
            ChatUtils.info((String)("\u5730\u72f1\u641c\u7d22\u5b8c\u6210\uff01\u8bbf\u95ee\u4e86 " + IiIIiIiiiI.iiIIIIiIII.size() + " \u4e2a\u70b9\u3002"), (Object[])new Object[3 & 4]);
            IiIIiIiiiI.toggle();
            return;
        }
        IiiIiIIiII iiiIiIIiII6 = IiIIiIiiiI;
        iiiIiIIiII2 = iiiIiIIiII6.iiIIIIiIII.get(iiiIiIIiII6.IIIIiIiiIi);
        if (IiIIiIiiiI.ALLATORIxDEMO((class_2338)iiiIiIIiII2)) {
            IiiIiIIiII iiiIiIIiII7 = IiIIiIiiiI;
            iiiIiIIiII7.IIIIiIiiIi += 3 & 5;
            ChatUtils.info((String)("\u5230\u8fbe\u70b9 " + iiiIiIIiII7.IIIIiIiiIi + "/" + IiIIiIiiiI.iiIIIIiIII.size()), (Object[])new Object[3 ^ 3]);
            IiiIiIIiII iiiIiIIiII8 = IiIIiIiiiI;
            if (iiiIiIIiII8.IIIIiIiiIi < iiiIiIIiII8.iiIIIIiIII.size()) {
                IiiIiIIiII iiiIiIIiII9 = IiIIiIiiiI;
                class_2338 class_23382 = iiiIiIIiII9.iiIIIIiIII.get(iiiIiIIiII9.IIIIiIiiIi);
                IiIIiIiiiI.ALLATORIxDEMO(class_23382);
                return;
            }
        } else {
            IiIIiIiiiI.ALLATORIxDEMO((class_2338)iiiIiIIiII2);
        }
    }

    private /* synthetic */ void iiIiiiiiII() {
        IiiIiIIiII iiiIiIIiII = this;
        IiiIiIIiII iiiIiIIiII2 = this;
        this.iiIIIIiIII = null;
        iiiIiIIiII2.IIIIiIiiIi = 3 ^ 3;
        iiiIiIIiII2.iIiiIiiiII = null;
        this.IiIIIIiiii = null;
        this.iiIiIIiIIi = 2 & 5;
        iiiIiIIiII.iIIiIIiiII = this.iiIiIIiIIi;
        iiiIiIIiII.iiIIiiIiii = 2 & 5;
    }

    private /* synthetic */ void IiiIIIIiiI() {
        IiiIiIIiII iiiIiIIiII;
        IiiIiIIiII iiiIiIIiII2;
        (iiiIiIIiII2 = this).iiIIIIiIII = new ArrayList<class_2338>();
        if ((iiiIiIIiII2 = this).iIiiIiiiII == null) {
            return;
        }
        int n = (Integer)iiiIiIIiII2.iiiiiIIIii.get();
        int n2 = (Integer)iiiIiIIiII2.IiIIiIiiiI.get() * (0x17 & 0x78);
        NetherSearchArea.SearchMode searchMode = (NetherSearchArea.SearchMode)((Object)iiiIiIIiII2.IiiIIiiiiI.get());
        if ((NetherSearchArea.SearchShape)((Object)iiiIiIIiII2.IiiIIIiiIi.get()) == NetherSearchArea.SearchShape.iiIIIIiIII) {
            IiiIiIIiII iiiIiIIiII3 = iiiIiIIiII2;
            iiiIiIIiII = iiiIiIIiII3;
            iiiIiIIiII3.ALLATORIxDEMO(iiiIiIIiII3.iIiiIiiiII, n, n2);
        } else {
            IiiIiIIiII iiiIiIIiII4 = iiiIiIIiII2;
            iiiIiIIiII = iiiIiIIiII4;
            iiiIiIIiII4.ALLATORIxDEMO(iiiIiIIiII4.iIiiIiiiII, n, n2, searchMode);
        }
        ChatUtils.info((String)("\u751f\u6210\u4e86 " + iiiIiIIiII.iiIIIIiIII.size() + " \u4e2a\u641c\u7d22\u70b9\u3002"), (Object[])new Object[3 >> 2]);
    }

    public int IiiiiiiIIi() {
        if (this.iiIIIIiIII != null) {
            return this.iiIIIIiIII.size();
        }
        return 0;
    }

    private /* synthetic */ void IiiiiiiIIi() {
        if (((class_310)this.iiIIIIiIII).player == null) {
            return;
        }
        IiiIiIIiII iiiIiIIiII = this;
        this.iIiiIiiiII = ((class_310)this.iiIIIIiIII).player.getBlockPos();
        this.IiiIIIIiiI();
        this.IIIIiIiiIi = 5 >> 3;
        iiiIiIIiII.iiIiIIiIIi = this.IIIIiIiiIi;
        iiiIiIIiII.iIIiIIiiII = 4 ^ 5;
        ChatUtils.info((String)("\u5f00\u59cb\u5730\u72f1\u641c\u7d22\uff0c\u5171 " + this.iiIIIIiIII.size() + " \u4e2a\u70b9\uff0c\u4f7f\u7528 " + ((NetherSearchArea.SearchMode)((Object)this.IiiIIiiiiI.get())).name() + " \u6a21\u5f0f + " + ((NetherSearchArea.SearchShape)((Object)this.IiiIIIiiIi.get())).name() + " \u5f62\u72b6\u3002"), (Object[])new Object[3 >> 2]);
        if (!this.iiIIIIiIII.isEmpty()) {
            IiiIiIIiII iiiIiIIiII2 = this;
            iiiIiIIiII2.ALLATORIxDEMO(iiiIiIIiII2.iiIIIIiIII.get(3 & 4));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        this.iIIiIIiiII = 5 >> 3;
        BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
        ChatUtils.info((String)IIIIiIIIIi.ALLATORIxDEMO("\u5744\u72ae\u6469\u7d7c\u5d8f\u500a\u6b1d\u3056"), (Object[])new Object[5 >> 3]);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ boolean ALLATORIxDEMO(class_2338 class_23382) {
        void IiIIiIiiiI;
        class_243 class_2432;
        IiiIiIIiII iiiIiIIiII = iiiIiIIiII2;
        if (((class_310)iiiIiIIiII.iiIIIIiIII).player == null) {
            return (3 & 4) != 0;
        }
        IiiIiIIiII iiiIiIIiII2 = ((class_310)iiiIiIIiII.iiIIIIiIII).player.getPos();
        if (Math.sqrt(Math.pow(class_2432.x - (double)IiIIiIiiiI.getX(), 2.0) + Math.pow(((class_243)iiiIiIIiII2).z - (double)IiIIiIiiiI.getZ(), 2.0)) < (double)((Integer)iiiIiIIiII.iIIiiIIIII.get()).intValue()) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    public IiiIiIIiII() {
        IiiIiIIiII iiiIiIIiII = this;
        super(IIiIiiiiIi.IiiiiiiIIi("\u5702\u72d6\u6259\u56d9"), IIIIiIIIIi.ALLATORIxDEMO("\u577a\u5769\u7283\u4e54\u7ca9\u7ea6\u6075\u573c\u643b\u7d7b\u7ea1\u67da\u6263\u7230\u54b3\u76c0\u5355\u57d1\u3027"));
        iiiIiIIiII.iiiiiIIiiI = iiiIiIIiII.settings.getDefaultGroup();
        iiiIiIIiII.IiiIIiiiiI = iiiIiIIiII.iiiiiIIiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiiiiIi.IiiiiiiIIi("\u642e\u7d05\u6a13\u5f28"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u87e8\u6592\uff68\u4eb7\u4e7f\u5fba\u87e8\u65c7\u5436\u594f\uff69\u904e\u8839\uff43\u637b\u8808\u6204\u63c1\u3027"))).defaultValue((Object)NetherSearchArea.SearchMode.iiiiiIIiiI)).build());
        this.IiiIIIiiIi = this.iiiiiIIiiI.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IIiIiiiiIi.IiiiiiiIIi("\u642e\u7d05\u5f50\u7291"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u7790\u5f30\uff63\u65eb\u5f6e\u531d\u5786\uff69\u87e4\u65be\uff43\u5774\u5f26\u87d5\u65c5\u3027"))).defaultValue((Object)NetherSearchArea.SearchShape.iiiiiIIiiI)).build());
        this.iiiiiIIIii = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiiiiIi.IiiiiiiIIi("\u642e\u7d05\u5378\u5fa3"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u644e\u7d5b\u5368\u57d3\u76a3\u5313\u5ff6\uff52\u4e90\u5363\u5725\u4e7e\u533a\u4f43\u3027"))).defaultValue((Object)(0x5F & 0x70))).min(--1).max(0x3F98 & 0x6777).sliderRange(0x6A & 0x1F, 0x2792 & 0x7F7D).build());
        this.ALLATORIxDEMO = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiiiiIi.IiiiiiiIIi("\u642e\u7d05\u902d\u5e81"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6bb6\u6b73\u7982\u52fa\u4e12\u9586\u76fd\u5269\u6509\u95a6\u9698\uff2f\u6529\u504e\u8dd4\u5c7a\u9046\u5ed4\u8dce\u5f84\uff07\u3027"))).defaultValue((Object)(0x36 & 0x5D))).min(3 >> 1).max(0x7C & 0x67).build());
        this.IiIiIIIIiI = this.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiIiiiiIi.IiiiiiiIIi("\u81d8\u528f\u5f32\u59ec"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u8fd7\u5142\u5769\u7283\u65a8\u819f\u52f1\u5f72\u598f\u6473\u7d2c\u3027"))).defaultValue((Object)(5 >> 3))).build());
        this.IiIIiIiiiI = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiiiiIi.IiiiiiiIIi("\u708b\u95d3\u8def\u799c"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u6402\u7d17\u70c0\u4e19\u95ad\u76f6\u8d84\u79c9\uff75\u4eb7\u5363\u5725\u4e43\u5307\u4f34\u3050\u59db\u67ee\u52d9\u8f2f\u8da4\u79e9\u4e36\u001fuR\u5ea4\u8bdb\u8be7\u7f1c\u4e7e^8\u3027"))).defaultValue((Object)(0x1A & 0x75))).min(1 ^ 3).max(0x7BC2 & 0x4BD).build());
        this.iIIiiIIIII = this.iiiiiIIiiI.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiIiiiiIi.IiiiiiiIIi("\u76fc\u6800\u6397\u8ff6\u8def\u799c"))).description(IIIIiIIIIi.ALLATORIxDEMO("\u8bd6\u4e43\u5262\u8fc7\u76bc\u680b\u709e\u76dd\u8daf\u79e5\u967d\u5065\uff7a\u65fd\u5738\uff07\u3027"))).defaultValue((Object)(0x39 & 0x76))).min(--2).max(0x37FE & 0x49F5).sliderRange(5 >> 1, 0x6296 & 0x1DE9).build());
        this.iiIiiiiiII();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIiIiiiiIi.IiiiiiiIIi("El0!AB2rbcSSw&\u0012\u8bd0\u66c6\u6597\u5222\u6707\u6582\u726f\u671e\uff26"));
        }
    }

    public int ALLATORIxDEMO() {
        return this.IIIIiIiiIi;
    }
}

