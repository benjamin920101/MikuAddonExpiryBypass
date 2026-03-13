/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.systems.System
 *  meteordevelopment.meteorclient.systems.config.Config
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  net.minecraft.util.Formatting
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtElement
 *  net.minecraft.text.Text
 *  net.minecraft.text.MutableText
 *  net.minecraft.client.network.ServerInfo
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIIiIIIIi;
import com.github.mikumiku.addon.IiiIIIIiiI;
import com.github.mikumiku.addon.iiIiiIIiIi;
import com.seedfinding.mccore.version.MCVersion;
import java.util.Date;
import java.util.HashMap;
import java.util.Optional;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.System;
import meteordevelopment.meteorclient.systems.config.Config;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.util.Formatting;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.ServerInfo;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IiiIIIIIII
extends System<IiiIIIIIII> {
    private static final IiiIIIIIII IiIIiIiiiI = new IiiIIIIIII();
    public HashMap<String, iiIiiIIiIi> ALLATORIxDEMO;

    public iiIiiIIiIi ALLATORIxDEMO() {
        IiiIIIIIII iiiIIIIIII = object;
        if (MeteorClient.mc.isIntegratedServerRunning() && MeteorClient.mc.getServer() != null) {
            Object object = MCVersion.fromString(MeteorClient.mc.getServer().getVersion());
            if (object == null) {
                object = MCVersion.latest();
            }
            return new iiIiiIIiIi(MeteorClient.mc.getServer().getOverworld().getSeed(), (MCVersion)((Object)object));
        }
        return iiiIIIIIII.ALLATORIxDEMO.get(Utils.getWorldName());
    }

    private static /* synthetic */ void ALLATORIxDEMO(String string, String string2) {
        String IiIIiIiiiI = string2;
        String IiIIiIiiiI2 = string;
        Object[] objectArray = new Object[1 ^ 3];
        objectArray[3 >> 2] = IiIIiIiiiI;
        objectArray[--1] = MCVersion.latest().name;
        IiIIiIiiiI = class_2561.literal((String)String.format(IiIIiIIIIi.ALLATORIxDEMO("\u65e5\u6c85\u89f8\u67d8#\u0001n `3ij&0/\u7209\u6726a(ori.+\u6579\u7544\u0007itb'\u59ee\u67bb\u60c4\u60d4\u6698\u651e\u7224\u670b\uff60\u8bd0\u8fbc\u886bV\u0007"), objectArray));
        Object[] objectArray2 = new Object[1 ^ 3];
        objectArray2[2 & 5] = Config.get().prefix;
        objectArray2[2 ^ 3] = IiIIiIiiiI2;
        class_5250 class_52502 = class_2561.literal((String)(String.format(IiiIIIIiiI.ALLATORIxDEMO("'7M\u001dZ\u001d\u0017TFS"), objectArray2) + "<version>"));
        IiIIiIiiiI.append((class_2561)class_52502);
        String string3 = IiIIiIiiiI;
        string3.setStyle(string3.getStyle().withColor(class_124.YELLOW));
        ChatUtils.sendMsg((String)IiIIiIIIIi.ALLATORIxDEMO("?B\tC"), (class_2561)IiIIiIiiiI);
    }

    private static /* synthetic */ long ALLATORIxDEMO(String IiIIiIiiiI) {
        try {
            return Long.parseLong(IiIIiIiiiI);
        } catch (NumberFormatException numberFormatException) {
            return IiIIiIiiiI.strip().hashCode();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String string) {
        void IiIIiIiiiI;
        IiiIIIIIII iiiIIIIIII = object;
        if (MeteorClient.mc.isIntegratedServerRunning()) {
            return;
        }
        class_642 class_6422 = MeteorClient.mc.getCurrentServerEntry();
        Object object = null;
        if (class_6422 != null) {
            object = MCVersion.fromString(class_6422.version.getString());
        }
        if (object == null) {
            String string2 = IiiIIIIiiI.ALLATORIxDEMO("\rQ\u0012Y\u001eB\u001d");
            if (class_6422 != null) {
                string2 = class_6422.version.getString();
            }
            IiiIIIIIII.ALLATORIxDEMO((String)IiIIiIiiiI, string2);
            object = MCVersion.latest();
        }
        iiiIIIIIII.ALLATORIxDEMO((String)IiIIiIiiiI, (MCVersion)((Object)object));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2487 class_24872, String string) {
        IiiIIIIIII iiiIIIIIII;
        void IiIIiIiiiI;
        IiiIIIIIII iiiIIIIIII2 = iiiIIIIIII3;
        IiiIIIIIII iiiIIIIIII3 = class_24872;
        IiiIIIIIII IiIIiIiiiI2 = iiiIIIIIII2;
        IiiIIIIIII iiiIIIIIII4 = iiiIIIIIII3 = iiiIIIIIII3.getCompound((String)IiIIiIiiiI);
        if (iiiIIIIIII3 instanceof Optional) {
            iiiIIIIIII3 = (class_2487)((Optional)((Object)iiiIIIIIII4)).get();
            iiiIIIIIII = IiIIiIiiiI2;
        } else {
            iiiIIIIIII3 = (class_2487)iiiIIIIIII4;
            iiiIIIIIII = IiIIiIiiiI2;
        }
        iiiIIIIIII.ALLATORIxDEMO.put((String)IiIIiIiiiI, iiIiiIIiIi.ALLATORIxDEMO((class_2487)iiiIIIIIII3));
    }

    public static IiiIIIIIII ALLATORIxDEMO() {
        return IiIIiIiiiI;
    }

    public IiiIIIIIII ALLATORIxDEMO(class_2487 class_24872) {
        IiiIIIIIII iiiIIIIIII = iiiIIIIIII2;
        IiiIIIIIII iiiIIIIIII2 = class_24872;
        IiiIIIIIII IiIIiIiiiI = iiiIIIIIII;
        iiiIIIIIII2.getKeys().forEach(arg_0 -> IiIIiIiiiI.ALLATORIxDEMO((class_2487)iiiIIIIIII2, arg_0));
        return IiIIiIiiiI;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(class_2487 class_24872, String string, iiIiiIIiIi iiIiiIIiIi2) {
        void IiIIiIiiiI;
        iiIiiIIiIi IiIIiIiiiI2 = iiIiiIIiIi2;
        class_2487 IiIIiIiiiI3 = class_24872;
        if (IiIIiIiiiI2 == null) {
            return;
        }
        IiIIiIiiiI3.put((String)IiIIiIiiiI, (class_2520)IiIIiIiiiI2.ALLATORIxDEMO());
    }

    public IiiIIIIIII() {
        IiiIIIIIII iiiIIIIIII = this;
        super(IiiIIIIiiI.ALLATORIxDEMO("&k- q"));
        iiiIIIIIII.ALLATORIxDEMO = new HashMap();
        this.init();
        iiiIIIIIII.load(MeteorClient.FOLDER);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIIiIIIIi.ALLATORIxDEMO("\u001bln!\u001fBlr<c\rS\t\u0006L\u8bd0\u6698\u6597\u525c\u6727\u65dc\u726f\u6740\uff26"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void ALLATORIxDEMO(String string, MCVersion mCVersion) {
        void IiIIiIiiiI;
        IiiIIIIIII iiiIIIIIII = object;
        Object object = mCVersion;
        IiiIIIIIII IiIIiIiiiI2 = iiiIIIIIII;
        if (MeteorClient.mc.isIntegratedServerRunning()) {
            return;
        }
        long l = IiiIIIIIII.ALLATORIxDEMO((String)IiIIiIiiiI);
        IiIIiIiiiI2.ALLATORIxDEMO.put(Utils.getWorldName(), new iiIiiIIiIi(l, (MCVersion)((Object)object)));
    }

    public class_2487 toTag() {
        IiiIIIIIII iiiIIIIIII = iiiIIIIIII2;
        IiiIIIIIII iiiIIIIIII2 = new class_2487();
        iiiIIIIIII.ALLATORIxDEMO.forEach((arg_0, arg_1) -> IiiIIIIIII.ALLATORIxDEMO((class_2487)iiiIIIIIII2, arg_0, arg_1));
        return iiiIIIIIII2;
    }
}

