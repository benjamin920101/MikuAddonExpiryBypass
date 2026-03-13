/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent
 *  meteordevelopment.meteorclient.events.game.ReceiveMessageEvent
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.settings.StringSetting$Builder
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.block.TrapdoorBlock
 *  net.minecraft.text.Text
 *  net.minecraft.block.entity.SignBlockEntity
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import com.github.mikumiku.addon.IIIiIIiiii;
import com.github.mikumiku.addon.IIiiIIIIII;
import com.github.mikumiku.addon.iIIiIIIIii;
import com.github.mikumiku.addon.iiIIIIiiIi;
import com.github.mikumiku.addon.iiiIIIIiiI;
import com.github.mikumiku.addon.iiiIIiIIii;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.util.BaritoneUtil;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import meteordevelopment.meteorclient.events.entity.player.InteractBlockEvent;
import meteordevelopment.meteorclient.events.game.ReceiveMessageEvent;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.text.Text;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiiiIiii
extends iiiiIiIiii {
    private int IIiiIiiiII;
    private final SettingGroup IIIiIiiIIi;
    private final Setting<Integer> iiiIiIiIIi;
    private boolean iIiIiIiIii;
    public final Map<UUID, String> iiiiiIIIii;
    private final Setting<Map<String, String>> iIIiIIiiII;
    private class_2338 IiiIIiiiiI;
    private final Setting<Boolean> IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private String iIiiIiiiII;
    private final Setting<Integer> iIIiiIIIII;
    private static final int iiIiIIiIIi = 200;
    private final Setting<Boolean> IIIIiIiiIi;
    private final Setting<String> IiIiIIIIiI;
    private class_2338 iiiiiIIiiI;
    private final Setting<Integer> iiIIIIiIII;
    private final Setting<String> IiIIiIiiiI;
    private final Setting<Boolean> ALLATORIxDEMO;

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        IIIiiiIiii iIIiiiIiii2 = string2;
        String string2 = string;
        IIIiiiIiii IiIIiIiiiI = iIIiiiIiii2;
        IiIIiIiiiI.info("\u00a7a\u73cd\u73e0\u5df2\u6210\u529f\u62c9\uff01ID: \u00a7b" + (String)string2, new Object[2 & 5]);
        if (((Boolean)IiIIiIiiiI.ALLATORIxDEMO.get()).booleanValue() && IiIIiIiiiI.iiiiiIIiiI != null) {
            IiIIiIiiiI.iiIIIIiIII.execute(() -> {
                IIIiiiIiii iIIiiiIiii2 = this;
                this.iiIIIIiIII.player.requestTeleport((double)iIIiiiIiii2.iiiiiIIiiI.getX() + 0.5, (double)this.iiiiiIIiiI.getY(), (double)this.iiiiiIIiiI.getZ() + 0.5);
                iIIiiiIiii2.info(iiiIIiIIii.ALLATORIxDEMO("\u00f6\u0003\u5d9f\u8fdc\u56b2\u8d7e\u59af\u4f4c\u7f08\u3001"), new Object[3 >> 2]);
            });
        }
        IiIIiIiiiI.iIiIiIiIii = 2 & 5;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ class_2338 IiiiiiiIIi(String string) {
        int n;
        IIIiiiIiii iIIiiiIiii2;
        IIIiiiIiii iIIiiiIiii3 = iIIiiiIiii2 = this;
        int n2 = iIIiiiIiii3.iiIIIIiIII.player.getBlockPos().getX();
        int n3 = iIIiiiIiii3.iiIIIIiIII.player.getBlockPos().getY();
        int n4 = iIIiiiIiii3.iiIIIIiIII.player.getBlockPos().getZ();
        int n5 = (Integer)iIIiiiIiii3.iiiIiIiIIi.get();
        int n6 = n = -n5;
        while (n6 <= n5) {
            int n7 = 0xFFFFFFFD & 0xFFFFFFFE;
            while (true) {
                int n8;
                if (n7 > 4) break;
                int n9 = -n5;
                while (n9 <= n5) {
                    int n10;
                    class_2338 class_23382 = new class_2338(n2 + n, n3 + n8, n4 + n10);
                    class_2561[] class_2561Array = iIIiiiIiii2.iiIIIIiIII.world.getBlockEntity(class_23382);
                    if (class_2561Array instanceof class_2625) {
                        class_2561Array = ((class_2625)class_2561Array).getFrontText().getMessages((2 & 5) != 0);
                        int n11 = class_2561Array.length;
                        int n12 = 3 & 4;
                        while (n12 < n11) {
                            void IiIIiIiiiI;
                            int n13;
                            if (class_2561Array[n13].getString().toLowerCase().contains(IiIIiIiiiI.toLowerCase())) {
                                iIIiiiIiii2.info("\u627e\u5230\u5305\u542b\u540d\u5b57\u7684\u544a\u793a\u724c: " + class_23382.toShortString(), new Object[2 & 5]);
                                return class_23382.down();
                            }
                            n12 = ++n13;
                        }
                    }
                    n9 = ++n10;
                }
                n7 = ++n8;
            }
            n6 = ++n;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(InteractBlockEvent interactBlockEvent) {
        void IiIIiIiiiI;
        IIIiiiIiii iIIiiiIiii2 = iIIiiiIiii3;
        if (!((Boolean)iIIiiiIiii2.IIIIiIiiIi.get()).booleanValue()) {
            return;
        }
        IIIiiiIiii iIIiiiIiii3 = IiIIiIiiiI.result.getBlockPos();
        if (iIIiiiIiii2.iiIIIIiIII.world.getBlockState((class_2338)iIIiiiIiii3).getBlock() instanceof class_2533) {
            IIIiiiIiii iIIiiiIiii4 = iIIiiiIiii2;
            iIIiiiIiii4.ALLATORIxDEMO("\u7528\u6237\u540d" + ((Map)iIIiiiIiii4.iIIiIIiiII.get()).size(), (class_2338)iIIiiiIiii3);
            IiIIiIiiiI.cancel();
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        IIIiiiIiii iIIiiiIiii2 = iIIiiiIiii3;
        IIIiiiIiii iIIiiiIiii3 = post;
        IIIiiiIiii IiIIiIiiiI = iIIiiiIiii2;
        if (IiIIiIiiiI.iIiIiIiIii) {
            IIIiiiIiii iIIiiiIiii4 = IiIIiIiiiI;
            iIIiiiIiii4.IIiiIiiiII += 3 >> 1;
            if (iIIiiiIiii4.IIiiIiiiII > (Integer)IiIIiIiiiI.iiIIIIiIII.get()) {
                IiIIiIiiiI.info(IIiiIIIIII.ALLATORIxDEMO("\u62be\u73f7\u7397\u529a\u8f2a\u8d9f\u6581\uff36\u819d\u5292\u91ba\u7f54"), new Object[2 & 5]);
                IIIiiiIiii iIIiiiIiii5 = IiIIiIiiiI;
                iIIiiiIiii5.iIiIiIiIii = 3 >> 2;
                iIIiiiIiii5.IIiiIiiiII = 2 & 5;
                BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
                return;
            }
        }
        if (IiIIiIiiiI.IiiIIiiiiI != null && iiIIIIiiIi.ALLATORIxDEMO(IiIIiIiiiI.IiiIIiiiiI, 4.0)) {
            IIIiiiIiii iIIiiiIiii6 = IiIIiIiiiI;
            IIIiiiIiii iIIiiiIiii7 = IiIIiIiiiI;
            iIIiiiIiii6.ALLATORIxDEMO(iIIiiiIiii6.IiiIIiiiiI, iIIiiiIiii7.iIiiIiiiII);
            if (((Boolean)iIIiiiIiii7.ALLATORIxDEMO.get()).booleanValue() && IiIIiIiiiI.iiiiiIIiiI != null) {
                iiIIIIiiIi.ALLATORIxDEMO(IiIIiIiiiI.iiiiiIIiiI, 0.0);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String string, class_2338 class_23382) {
        void IiIIiIiiiI;
        IIIiiiIiii iIIiiiIiii2 = string2;
        String string2 = string;
        IIIiiiIiii IiIIiIiiiI2 = iIIiiiIiii2;
        ((Map)IiIIiIiiiI2.iIIiIIiiII.get()).put(string2, IIIiiiIiii.ALLATORIxDEMO((class_2338)IiIIiIiiiI));
        iiiiIiiiII.ALLATORIxDEMO("\u5df2\u6dfb\u52a0\u73cd\u73e0 \u00a7b" + (String)string2 + "\u00a7f -> " + IiIIiIiiiI.toShortString());
        iiiiIiiiII.ALLATORIxDEMO("\u8bf7\u81ea\u884c\u4fee\u6539\u00a7b" + (String)string2 + "\u00a7f \u4e3a\u7528\u6237\u6635\u79f0");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(String string, String string2) {
        void IiIIiIiiiI;
        IIIiiiIiii iIIiiiIiii2 = string3;
        String string3 = string2;
        IIIiiiIiii IiIIiIiiiI2 = iIIiiiIiii2;
        if (IiIIiIiiiI2.iiIIIIiIII.player == null) {
            return;
        }
        IiIIiIiiiI2.iiIIIIiIII.player.networkHandler.sendChatMessage("/msg " + (String)IiIIiIiiiI + " " + (String)string3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382, String string) {
        void IiIIiIiiiI;
        IIIiiiIiii iIIiiiIiii2 = iIIiiiIiii3;
        IIIiiiIiii iIIiiiIiii3 = class_23382;
        IIIiiiIiii IiIIiIiiiI2 = iIIiiiIiii2;
        if (IiIIiIiiiI2.iiIIIIiIII.player.squaredDistanceTo((double)iIIiiiIiii3.getX(), (double)iIIiiiIiii3.getY(), (double)iIIiiiIiii3.getZ()) < 25.0) {
            iiiIIIIiiI.ALLATORIxDEMO((class_2338)iIIiiiIiii3, class_2350.UP, 5 >> 2, class_1268.MAIN_HAND, BaritoneUtil.SwingSide.iiIIIIiIII);
            IiIIiIiiiI2.info("\u00a7a\u73cd\u73e0\u5df2\u6210\u529f\u62c9\uff01ID: \u00a7b" + (String)IiIIiIiiiI, new Object[3 & 4]);
            IIIiiiIiii iIIiiiIiii4 = IiIIiIiiiI2;
            iIIiiiIiii4.iIiIiIiIii = 2 & 5;
            iIIiiiIiii4.IiiIIiiiiI = null;
            return;
        }
        IIIiiiIiii iIIiiiIiii5 = IiIIiIiiiI2;
        iIIiiiIiii5.IiiIIiiiiI = iIIiiiIiii3;
        iIIiiiIiii5.iIiiIiiiII = IiIIiIiiiI;
        IiIIiIiiiI2.iiIIIIiIII.execute(() -> IiIIiIiiiI2.ALLATORIxDEMO((String)IiIIiIiiiI));
    }

    public static class_2338 ALLATORIxDEMO(String string) {
        String string2 = string;
        if (string2 == null) {
            return null;
        }
        try {
            String[] IiIIiIiiiI = string2.trim().split(IIiiIIIIII.ALLATORIxDEMO("f\u0004\u0011"));
            if (IiIIiIiiiI.length != --3) {
                throw new IllegalArgumentException(iiiIIiIIii.ALLATORIxDEMO("I\u000bv\ta\u0014|FA\u0017q\u0003n\u0001[\u001e(\nf\u0016l\u0007w"));
            }
            int n = Integer.parseInt(IiIIiIiiiI[5 >> 3]);
            int n2 = Integer.parseInt(IiIIiIiiiI[2 ^ 3]);
            int n3 = Integer.parseInt(IiIIiIiiiI[--2]);
            return new class_2338(n, n2, n3);
        } catch (Exception IiIIiIiiiI) {
            iiiiIiiiII.ALLATORIxDEMO("\u65e0\u6cd5\u89e3\u6790\u73cd\u73e0\u4f4d\u7f6e\u5b57\u7b26: " + string2);
            return null;
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(ReceiveMessageEvent receiveMessageEvent) {
        IIIiiiIiii iIIiiiIiii2 = object;
        Object object = receiveMessageEvent;
        IIIiiiIiii IiIIiIiiiI = iIIiiiIiii2;
        if (IiIIiIiiiI.iiIIIIiIII.player == null || IiIIiIiiiI.iiIIIIiIII.world == null) {
            return;
        }
        object = object.getMessage().getString();
        if ((object = IiIIiIiiiI.ALLATORIxDEMO((String)object)) == null) {
            return;
        }
        Object object2 = object;
        object = ((iIIiIIIIii)object2).IiIIiIiiiI;
        if (!((iIIiIIIIii)object2).ALLATORIxDEMO.contains((CharSequence)IiIIiIiiiI.IiIIiIiiiI.get())) {
            return;
        }
        IiIIiIiiiI.info("\u6536\u5230\u6765\u81ea " + (String)object + " \u7684\u62c9\u73cd\u73e0\u8bf7\u6c42\u3002", new Object[3 >> 2]);
        class_2338 class_23382 = IIIiiiIiii.ALLATORIxDEMO((String)((Map)IiIIiIiiiI.iIIiIIiiII.get()).get(object));
        if (class_23382 == null && ((Boolean)IiIIiIiiiI.iiIIiiIiii.get()).booleanValue() && (class_23382 = IiIIiIiiiI.IiiiiiiIIi((String)object)) != null) {
            ((Map)IiIIiIiiiI.iIIiIIiiII.get()).put(object, IIIiiiIiii.ALLATORIxDEMO(class_23382));
            IiIIiIiiiI.info("\u5df2\u901a\u8fc7\u544a\u793a\u724c\u8bb0\u5f55\u73cd\u73e0: " + IIIiiiIiii.ALLATORIxDEMO(class_23382), new Object[2 & 5]);
        }
        if (class_23382 == null) {
            Object object3 = object;
            IiIIiIiiiI.ALLATORIxDEMO((String)object3, "\u6ca1\u627e\u5230\u4f60\u7684\u73cd\u73e0\u554a " + (String)object3);
            return;
        }
        IIIiiiIiii iIIiiiIiii3 = IiIIiIiiiI;
        double d = iIIiiiIiii3.iiIIIIiIII.player.getBlockPos().getSquaredDistance((class_2382)class_23382);
        if (((Boolean)iIIiiiIiii3.IiIIIIiiii.get()).booleanValue() && d > (double)((Integer)IiIIiIiiiI.iIIiiIIIII.get() * (Integer)IiIIiIiiiI.iIIiiIIIII.get())) {
            IiIIiIiiiI.ALLATORIxDEMO((String)object, "\u6211\u73b0\u5728\u79bb\u4f60\u7684\u73cd\u73e0\u592a\u8fdc\uff0c\u8ddd\u79bb " + d);
            return;
        }
        IiIIiIiiiI.info("\u5f00\u59cb\u6267\u884c\u73cd\u73e0\u62c9\u4efb\u52a1: " + (String)object, new Object[3 >> 2]);
        IiIIiIiiiI.ALLATORIxDEMO(class_23382, (String)object, d);
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        IIIiiiIiii iIIiiiIiii2 = iIIiiiIiii3;
        IIIiiiIiii iIIiiiIiii3 = render2DEvent;
        IIIiiiIiii IiIIiIiiiI = iIIiiiIiii2;
        if (Utils.isLoading() || IiIIiIiiiI.isActive()) {
            // empty if block
        }
    }

    public IIIiiiIiii() {
        IIIiiiIiii iIIiiiIiii2 = this;
        super((Category)IiIiIIIIiI, iiiIIiIIii.ALLATORIxDEMO("\u738d\u73c5\u70e4\u591f\u7bb6\u5bc4"), IIiiIIIIII.ALLATORIxDEMO("\u81bd\u52b2\u7bf6\u741c\u4e5d\u7664\u4ecd\u76be\u73ba\u73da\u70ce\u90c7\u53b8\u4eff\uff7b\u96b5\u6581\u79fb\u803d\u62f3"));
        iIIiiiIiii2.IIIiIiiIIi = iIIiiiIiii2.settings.getDefaultGroup();
        iIIiiiIiii2.IiIIiIiiiI = iIIiiiIiii2.IIIiIiiIIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(iiiIIiIIii.ALLATORIxDEMO("\u514b\u9539\u5b25"))).description(IIiiIIIIII.ALLATORIxDEMO("\u533f\u545c\u8bdf\u5124\u9534\u5b20\u76be\u79b6\u8070\u5c46\u62f3"))).defaultValue((Object)iiiIIiIIii.ALLATORIxDEMO("\u62de\u6263"))).build());
        this.iIIiIIiiII = this.IIIiIiiIIi.add((Setting)((IIIiIIiiii)((Object)((IIIiIIiiii)((Object)new IIIiIIiiii().name(IIiiIIIIII.ALLATORIxDEMO("\u73f7\u7397\u7083")))).description(iiiIIiIIii.ALLATORIxDEMO("\u5dc3\u8ff9\u750d\u6222\u547d\uff4c\u53d6\u8ffe\u660d\u6d7b\u675a\u95b5\u5768\u6810\u3070")))).ALLATORIxDEMO());
        this.IIIIiIiiIi = this.IIIiIiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u6de1\u52d7\u73f7\u7397\u7083\u6a56\u5f35"))).description(iiiIIiIIii.ALLATORIxDEMO("\u8ba5\u6a04\u5f48\u53cd\u4ea5\u6dde\u52fd\u73f5\u73f7\u70cb"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iiIIiiIiii = this.IIIiIiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u6660\u808a\u8bfc\u525c\u5470\u794d\u7276"))).description(iiiIIiIIii.ALLATORIxDEMO("\u82e0\u676a\u625b\u5270\u73e8\u73a0\u8b95\u5f35\uff09\u5259\u5c38\u8b95\u4eeb\u4e4a\u659c\u545f\u794a\u720c\u8392\u5391\u73ef\u73a0\u4e1e\u4ee7\u76bc\u541a\u5b25"))).defaultValue((Object)(5 >> 2))).build());
        this.iiiIiIiIIi = this.IIIiIiiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u6406\u7d55\u5470\u794d\u7276\u533d\u5fbe"))).description(iiiIIiIIii.ALLATORIxDEMO("\u646c\u7d62\u546f\u797d\u726e\u76c4\u8326\u56a9\u5372\u5f93\u3070"))).defaultValue((Object)(0x74 & 0x4B))).min(0x2A & 0x5D).sliderRange(0x79 & 0xE, 0x3FCD & 0x40B2).visible(() -> (Boolean)this.iiIIiiIiii.get())).build());
        this.iiIIIIiIII = this.IIIiIiiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u8d01\u8dd5\u8df2\u65cc\u6581\u95ce"))).description(iiiIIiIIii.ALLATORIxDEMO("\u5164\u8bf8\u62ec\u73d8\u7390\u76c4\u6725\u5960\u65d4\u95b4Q4[|\u3070"))).defaultValue((Object)(0x64FC & 0x1BCB))).min(0x17 & 0x7C).sliderRange(0x7F & 0x14, 0x6E74 & 0x5FAB).build());
        this.IiIIIIiiii = this.IIIiIiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u5910\u8fab\u76be\u4e7a\u62f3"))).description(iiiIIiIIii.ALLATORIxDEMO("\u5f13\u4e2b\u738d\u73c5\u8dc8\u79cb\u8f87\u8ff9\u65b1\u81c8\u52e8\u62f7\u7e80\u8bcf\u6c55\u3070"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iIIiiIIIII = this.IIIiIiiIIi.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u6777\u591d\u8daa\u7981"))).description(iiiIIiIIii.ALLATORIxDEMO("\u5131\u8bf8\u62ec\u738a\u73c2\u76c4\u6725\u597a\u8de5\u79ac\u3070"))).defaultValue((Object)(0x79 & 0x7E))).min(0x4E & 0x3B).sliderRange(0x7A & 0xF, 0x732C & 0xDFF).visible(() -> (Boolean)this.IiIIIIiiii.get())).build());
        this.ALLATORIxDEMO = this.IIIiIiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u4f28\u7532\u5479\u8fee\u56a9\u51c0\u53a6\u7083"))).description(iiiIIiIIii.ALLATORIxDEMO("\u62ec\u73d8\u7390\u544e\u660a\u5461\u8ff6\u569e\u8d52\u5996\u4f75\u7f79\u3070"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IiiIIIiiIi = this.IIIiIiiIIi.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u81f0\u5bed\u4e73\u79b6\u8070\u6b14\u5223"))).description(iiiIIiIIii.ALLATORIxDEMO("\u676d\u52a4\u5628\u76a1\u7981\u806f\u6b23\u523c\uff19\u6bbf\u4e6a\u6728\u52e6\u564a\u53af\u80d8\u4e50\u4e38\u6820\u3070"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.IiIiIIIIiI = this.IIIiIiiIIi.add((Setting)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)((StringSetting.Builder)new StringSetting.Builder().name(IIiiIIIIII.ALLATORIxDEMO("\u79b6\u8070\u6b14\u5223"))).description(iiiIIiIIii.ALLATORIxDEMO("\u7981\u806f\u6b76\u5269l\u9efd\u8be3\u660dsf\u76d9\u6804\u5f18\u3070"))).defaultValue((Object)IIiiIIIIII.ALLATORIxDEMO("/\ud801\udc98aCV\u007fA\t\u27bb\n1H\u0013+I\\\u279b\u000bi\\\u0012Y\u0011^\u001e"))).visible(() -> (Boolean)this.IiiIIIiiIi.get())).build());
        IIIiiiIiii iIIiiiIiii3 = this;
        IIIiiiIiii iIIiiiIiii4 = this;
        this.iiiiiIIiiI = null;
        iIIiiiIiii4.iIiIiIiIii = 3 & 4;
        iIIiiiIiii4.IiiIIiiiiI = null;
        iIIiiiIiii3.iIiiIiiiII = "";
        iIIiiiIiii3.IIiiIiiiII = 3 >> 2;
        IIIiiiIiii iIIiiiIiii5 = this;
        iIIiiiIiii3.iiiiiIIIii = new HashMap<UUID, String>();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiiIIiIIii.ALLATORIxDEMO("\u0010I%D\u0013``P0A!QpQ`\u8bd2\u66b3\u6592\u5270\u6725\u65ed\u7270\u673b\uff73"));
        }
    }

    @Override
    public void onActivate() {
        IIIiiiIiii iIIiiiIiii2 = this;
        super.onActivate();
        if (((Boolean)iIIiiiIiii2.IIIIiIiiIi.get()).booleanValue()) {
            iiiiIiiiII.ALLATORIxDEMO(iiiIIiIIii.ALLATORIxDEMO("\u8bf2\u7cfe\u784b\u53b3\u950b\u70f9\u51de\u738b\u73c3\u70fe\u76a6\u6d53\u6772\u95a2\u6596\u570a\u675d\u6dbb\u5285\uff53\u4e37\u7560\u62e8\u5f9e\u89de\u539d\u302b"));
        }
    }

    public iIIiIIIIii IiiiiiiIIi(String string) {
        IIIiiiIiii iIIiiiIiii2 = object;
        Object object = string;
        IIIiiiIiii IiIIiIiiiI = iIIiiiIiii2;
        object = Pattern.compile(iiiIIiIIii.ALLATORIxDEMO(">-\u001bdm\u007f!\b\u001a5m\u001c\u001fxk\f<vkR(L3U%W3\u001f\u001cVK-N.i\u0001")).matcher((CharSequence)object);
        if (((Matcher)object).matches()) {
            Object object2 = object;
            object = ((Matcher)object2).group(4 ^ 5).trim();
            String string2 = ((Matcher)object2).group(1 ^ 3).trim();
            return new iIIiIIIIii((String)object, string2);
        }
        return null;
    }

    public iIIiIIIIii ALLATORIxDEMO(String string) {
        IIIiiiIiii iIIiiiIiii2 = object;
        Object object = string;
        IIIiiiIiii IiIIiIiiiI = iIIiiiIiii2;
        String string2 = IIiiIIIIII.ALLATORIxDEMO("/\ud801\udc98aCV\u007fA\t\u27bb\n1H\u0013+I\\\u279b\u000bi\\\u0012Y\u0011^\u001e");
        if (((Boolean)IiIIiIiiiI.IiiIIIiiIi.get()).booleanValue()) {
            string2 = (String)IiIIiIiiiI.IiIiIIIIiI.get();
        }
        if (((Matcher)(object = Pattern.compile(string2).matcher((CharSequence)object))).matches()) {
            return new iIIiIIIIii(((Matcher)object).group(--1).trim(), ((Matcher)object).group(1 ^ 3).trim());
        }
        return null;
    }

    public static String ALLATORIxDEMO(class_2338 IiIIiIiiiI) {
        return IiIIiIiiiI.getX() + " " + IiIIiIiiiI.getY() + " " + IiIIiIiiiI.getZ();
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(class_2338 class_23382, String string, double d) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        IIIiiiIiii iIIiiiIiii2 = string2;
        String string2 = string;
        IIIiiiIiii IiIIiIiiiI3 = iIIiiiIiii2;
        if (IiIIiIiiiI3.iIiIiIiIii) {
            IiIIiIiiiI3.warning(IIiiIIIIII.ALLATORIxDEMO("\u5f24\u5277\u5da5\u6713\u73ba\u73da\u575f\u62f3\u4e5a\u3038"), new Object[3 >> 2]);
            return;
        }
        if (IiIIiIiiiI2 == null) {
            IiIIiIiiiI3.error("\u672a\u627e\u5230 \u00a7c" + (String)string2 + "\u00a7f \u7684\u73cd\u73e0\u3002", new Object[3 & 4]);
            return;
        }
        if (IiIIiIiiiI3.iiIIIIiIII.player == null || IiIIiIiiiI3.iiIIIIiIII.world == null) {
            IiIIiIiiiI3.error(iiiIIiIIii.ALLATORIxDEMO("\u73ac\u5be7\u671e\u5745\u7eb7\uff60\u65e9\u6cb1\u6266\u882a\u3001"), new Object[2 & 5]);
            return;
        }
        IiIIiIiiiI3.iiiiiIIiiI = IiIIiIiiiI3.iiIIIIiIII.player.getBlockPos();
        IiIIiIiiiI3.iIiIiIiIii = 3 >> 1;
        IiIIiIiiiI3.info("\u00a7a\u6b63\u5728\u62c9\u73cd\u73e0: " + (String)string2, new Object[3 ^ 3]);
        IiIIiIiiiI3.ALLATORIxDEMO(string2, "\u6b63\u5728\u8def\u4e0a\uff0c\u8ddd\u79bb\uff1a" + (double)IiIIiIiiiI);
        IiIIiIiiiI3.ALLATORIxDEMO((class_2338)IiIIiIiiiI2, string2);
    }

    public static String ALLATORIxDEMO() {
        class_310 class_3102 = class_310.getInstance();
        if (class_3102.getCurrentServerEntry() != null) {
            return class_3102.getCurrentServerEntry().address;
        }
        return IIiiIIIIII.ALLATORIxDEMO("o\u0019Q\u0019U\u0000T");
    }
}

