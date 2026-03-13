/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  meteordevelopment.meteorclient.pathing.NopPathManager
 *  meteordevelopment.meteorclient.pathing.PathManagers
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  net.minecraft.util.Formatting
 *  net.minecraft.text.Text
 *  net.minecraft.text.Style
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.text.MutableText
 *  net.minecraft.client.network.PendingUpdateManager
 *  net.minecraft.client.network.SequencedPacketCreator
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import com.github.mikumiku.addon.IiIIiIIIiI;
import com.github.mikumiku.addon.iIIIiiiiII;
import com.github.mikumiku.addon.iIiIiIIIii;
import com.github.mikumiku.addon.iiIIIIiIii;
import com.github.mikumiku.addon.iiiiIiiiII;
import com.github.mikumiku.addon.mixin.IClientWorld;
import java.util.Date;
import meteordevelopment.meteorclient.pathing.NopPathManager;
import meteordevelopment.meteorclient.pathing.PathManagers;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.util.Formatting;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.PendingUpdateManager;
import net.minecraft.client.network.SequencedPacketCreator;

public abstract class iiiiIiIiii
extends Module
implements iIiIiIIIii {
    public static final Category IiIiIIIIiI;
    public IBaritone iiiiiIIiiI;
    public class_310 iiIIIIiIII;
    public static final Category IiIIiIiiiI;
    public static final Category ALLATORIxDEMO;

    public void onActivate() {
        iiiiIiIiii iiiiIiIiii2 = this;
        super.onActivate();
        if (iiiiIiIiii2.iiIIIIiIII == null) {
            this.iiIIIIiIII = class_310.getInstance();
        }
        iiiiIiIiii iiiiIiIiii3 = this;
        iiiiIiIiii3.IiiIIIIiiI();
        iiiiIiIiii3.ALLATORIxDEMO();
    }

    private /* synthetic */ void IiiIIIIiiI() {
        try {
            try {
                if (!(PathManagers.get() instanceof NopPathManager)) {
                    this.iiiiiIIiiI = BaritoneAPI.getProvider().getPrimaryBaritone();
                }
            } catch (Exception exception) {
                this.error(iIIIiiiiII.ALLATORIxDEMO("\u8bbf\u5bc6\u88ad-)=\u0001\u001b\u0007\u0001\rN"), new Object[3 >> 2]);
            }
            IiIIiIIIiI.ALLATORIxDEMO(iiIIIIiIii.ALLATORIxDEMO(")$\t\u001e\u0002+\u0012\u0003\u0014\u0005\u000e\u000f"));
            return;
        } catch (Exception exception) {
            return;
        }
    }

    private /* synthetic */ void IiiiiiiIIi() {
        System.out.println(iIIIiiiiII.ALLATORIxDEMO("\\Z["));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void ALLATORIxDEMO(class_7204 class_72042) {
        class_7204 class_72043 = class_72042;
        class_310 class_3102 = class_310.getInstance();
        if (class_3102.getNetworkHandler() == null || class_3102.world == null) {
            return;
        }
        class_7202 class_72022 = ((IClientWorld)class_3102.world).getPendingManager().incrementSequence();
        try {
            int IiIIiIiiiI = class_72022.getSequence();
            class_3102.getNetworkHandler().sendPacket(class_72043.predict(IiIIiIiiiI));
            if (class_72022 == null) return;
        } catch (Throwable IiIIiIiiiI) {
            Throwable throwable;
            if (class_72022 != null) {
                try {
                    class_72022.close();
                    throwable = IiIIiIiiiI;
                    throw throwable;
                } catch (Throwable throwable2) {
                    IiIIiIiiiI.addSuppressed(throwable2);
                }
            }
            throwable = IiIIiIiiiI;
            throw throwable;
        }
        class_72022.close();
    }

    public void sendToggledMsg() {
        iiiiIiIiii iiiiIiIiii2 = iiiiIiIiii3;
        class_5250 class_52502 = class_2561.empty().setStyle(class_2583.EMPTY.withFormatting(class_124.GREEN)).append(iIIIiiiiII.ALLATORIxDEMO("'!"));
        class_5250 class_52503 = class_2561.empty().setStyle(class_2583.EMPTY.withFormatting(class_124.RED)).append(iiIIIIiIii.ALLATORIxDEMO("%&,"));
        ChatUtils.forceNextPrefixClass(iiiiIiIiii2.getClass());
        iiiiIiIiii iiiiIiIiii3 = class_2561.empty();
        iiiiIiIiii iiiiIiIiii4 = iiiiIiIiii2;
        iiiiIiIiii iiiiIiIiii5 = iiiiIiIiii3;
        iiiiIiIiii3.append((class_2561)class_2561.empty().setStyle(class_2583.EMPTY.withFormatting(class_124.WHITE)).append(iiiiIiIiii4.title));
        iiiiIiIiii5.append(iIIIiiiiII.ALLATORIxDEMO("O"));
        iiiiIiIiii3.append((class_2561)class_2561.empty().setStyle(class_2583.EMPTY.withFormatting(class_124.GRAY)).append(iiIIIIiIii.ALLATORIxDEMO("4%\u0007\r\f\u000f\u0004J")));
        iiiiIiIiii5.append((class_2561)(iiiiIiIiii4.isActive() ? class_52502 : class_52503));
        iiiiIiiiII.ALLATORIxDEMO((class_2561)iiiiIiIiii3, iiiiIiIiii2.hashCode());
    }

    /*
     * WARNING - void declaration
     */
    public iiiiIiIiii(Category category, String string, String string2, String ... stringArray) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        String[] stringArray2 = stringArray3;
        String[] stringArray3 = stringArray;
        String[] IiIIiIiiiI4 = stringArray2;
        super((Category)IiIIiIiiiI3, (String)IiIIiIiiiI2, (String)IiIIiIiiiI, stringArray3);
        IiIIiIiiiI4.iiIIIIiIII = class_310.getInstance();
        IiIIiIiiiI4.iiIIIIiIII = class_310.getInstance();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIIIiiiiII.ALLATORIxDEMO("?\u0004JI\u001b\nH\u001a\u0018\u000b\t\u001b-nH\u8b98\u66bc\u65ff\u5258\u676f\u65d8\u7227\u6744\uff6e"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public iiiiIiIiii(Category category, String string, String string2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        iiiiIiIiii iiiiIiIiii2 = string3;
        String string3 = string2;
        iiiiIiIiii IiIIiIiiiI3 = iiiiIiIiii2;
        super((Category)IiIIiIiiiI2, (String)IiIIiIiiiI, string3);
        IiIIiIiiiI3.iiIIIIiIII = class_310.getInstance();
        IiIIiIiiiI3.iiIIIIiIII = class_310.getInstance();
        try {
            if (!(PathManagers.get() instanceof NopPathManager)) {
                IiIIiIiiiI3.iiiiiIIiiI = BaritoneAPI.getProvider().getPrimaryBaritone();
            }
        } catch (Exception exception) {
            IiIIiIiiiI3.error(iiIIIIiIii.ALLATORIxDEMO("\u8bb7\u5bc3\u88a5(!8\t\u001e\u000f\u0004\u0005K"), new Object[3 & 4]);
        }
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIIIiiiiII.ALLATORIxDEMO("?\u0004JI\u001b\nH\u001a\u0018\u000b\t\u001b-nH\u8b98\u66bc\u65ff\u5258\u676f\u65d8\u7227\u6744\uff6e"));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        System.out.println(iiIIIIiIii.ALLATORIxDEMO("\u0017\u0019"));
    }

    /*
     * WARNING - void declaration
     */
    public iiiiIiIiii(String string, String string2) {
        void IiIIiIiiiI;
        iiiiIiIiii iiiiIiIiii2 = string3;
        String string3 = string2;
        iiiiIiIiii IiIIiIiiiI2 = iiiiIiIiii2;
        super(iiiiIiIiii.IiIIiIiiiI, (String)IiIIiIiiiI, string3);
        IiIIiIiiiI2.iiIIIIiIII = class_310.getInstance();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iiIIIIiIii.ALLATORIxDEMO("7\u0001BL\u0013\u000f@\u001f\u0010\u000e\u0001\u001e%k@\u8b9d\u66b4\u65fa\u5250\u676a\u65d0\u7222\u674c\uff6b"));
        }
    }

    static {
        ALLATORIxDEMO = new Category(iIIIiiiiII.ALLATORIxDEMO("\u0002\u0001\u0004\u001dO\u6270\u65f8"));
        IiIiIIIIiI = new Category(iiIIIIiIii.ALLATORIxDEMO("\u0007\t\u0001\u0015J\u7219\u8c69"));
        IiIIiIiiiI = new Category(iIIIiiiiII.ALLATORIxDEMO("%\u0006\u0003\u001a"));
    }
}

