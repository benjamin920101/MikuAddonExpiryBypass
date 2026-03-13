/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.systems.modules.Category
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.player.ChatUtils
 *  net.minecraft.util.Formatting
 *  net.minecraft.text.Text
 *  net.minecraft.text.Style
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.text.MutableText
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iiIiIIiiii;
import com.github.mikumiku.addon.iiiiIiiiII;
import java.util.Date;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;
import net.minecraft.util.Formatting;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.MutableText;

public class IiiiIiiiIi
extends Module {
    public class_310 iiIIIIiIII;
    private boolean IiIIiIiiiI;
    private final int ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    public IiiiIiiiIi(Category category, String string, String object) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        IiiiIiiiIi iiiiIiiiIi2 = object2;
        Object object2 = object;
        object = iiiiIiiiIi2;
        void v1 = IiIIiIiiiI3;
        super((Category)IiIIiIiiiI2, (String)IiIIiIiiiI, (String)object2);
        v1.iiIIIIiIII = class_310.getInstance();
        v1.ALLATORIxDEMO = 0x67 & 0x7C;
        v1.iiIIIIiIII = class_310.getInstance();
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIIiiIiI.ALLATORIxDEMO("07Ez4\u0019G)\u00178\u0006(\"]G\u8bab\u6693\u65ec\u5257\u675c\u65f7\u7234\u674b\uff5d"));
        }
    }

    public void sendToggledMsg() {
        IiiiIiiiIi iiiiIiiiIi2 = iiiiIiiiIi3;
        class_5250 class_52502 = class_2561.empty().setStyle(class_2583.EMPTY.withFormatting(class_124.GREEN)).append(iiIiIIiiii.ALLATORIxDEMO("^5"));
        class_5250 class_52503 = class_2561.empty().setStyle(class_2583.EMPTY.withFormatting(class_124.RED)).append(iIiIIiiIiI.ALLATORIxDEMO("3!\u001a"));
        ChatUtils.forceNextPrefixClass(((Object)((Object)iiiiIiiiIi2)).getClass());
        IiiiIiiiIi iiiiIiiiIi3 = class_2561.empty();
        IiiiIiiiIi iiiiIiiiIi4 = iiiiIiiiIi2;
        IiiiIiiiIi iiiiIiiiIi5 = iiiiIiiiIi3;
        iiiiIiiiIi3.append((class_2561)class_2561.empty().setStyle(class_2583.EMPTY.withFormatting(class_124.WHITE)).append(iiiiIiiiIi4.title));
        iiiiIiiiIi5.append(iiIiIIiiii.ALLATORIxDEMO("["));
        iiiiIiiiIi3.append((class_2561)class_2561.empty().setStyle(class_2583.EMPTY.withFormatting(class_124.GRAY)).append(iIiIIiiIiI.ALLATORIxDEMO("\u00133\u0000;+\u0019\u0003|")));
        iiiiIiiiIi5.append((class_2561)(iiiiIiiiIi4.isActive() ? class_52502 : class_52503));
        iiiiIiiiII.ALLATORIxDEMO((class_2561)iiiiIiiiIi3, iiiiIiiiIi2.hashCode());
    }
}

