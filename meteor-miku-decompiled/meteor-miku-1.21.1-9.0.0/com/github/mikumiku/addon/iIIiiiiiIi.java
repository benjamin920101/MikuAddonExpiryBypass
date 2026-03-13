/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  meteordevelopment.meteorclient.commands.Command
 *  net.minecraft.command.CommandSource
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiiiIIii;
import com.github.mikumiku.addon.IiiIIIiiII;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Date;
import meteordevelopment.meteorclient.commands.Command;
import net.minecraft.command.CommandSource;

public class iIIiiiiiIi
extends Command {
    public void build(LiteralArgumentBuilder<class_2172> literalArgumentBuilder) {
        LiteralArgumentBuilder<class_2172> literalArgumentBuilder2 = literalArgumentBuilder3;
        LiteralArgumentBuilder<class_2172> literalArgumentBuilder3 = literalArgumentBuilder;
        LiteralArgumentBuilder<class_2172> IiIIiIiiiI = literalArgumentBuilder2;
        literalArgumentBuilder3.executes(commandContext -> {
            iIIiiiiiIi iIIiiiiiIi2 = iIIiiiiiIi3;
            iIIiiiiiIi iIIiiiiiIi3 = commandContext;
            iIIiiiiiIi IiIIiIiiiI = iIIiiiiiIi2;
            IiIIiIiiiI.info(IIIiiiIIii.ALLATORIxDEMO("\\w"), new Object[3 ^ 3]);
            return --1;
        });
        literalArgumentBuilder3.then(iIIiiiiiIi.literal((String)IiiIIIiiII.IiiiiiiIIi("`wk{")).then(iIIiiiiiIi.argument((String)IIIiiiIIii.ALLATORIxDEMO("Z\u007fRpipSk\\~Wg"), (ArgumentType)StringArgumentType.word()).executes(commandContext -> {
            iIIiiiiiIi iIIiiiiiIi2 = object;
            Object object = commandContext;
            iIIiiiiiIi IiIIiIiiiI = iIIiiiiiIi2;
            object = StringArgumentType.getString((CommandContext)object, (String)IiiIIIiiII.IiiiiiiIIi("ERwggL@JBRCA"));
            IiIIiIiiiI.info("hi, " + (String)object, new Object[2 & 5]);
            return 3 >> 1;
        })));
    }

    public iIIiiiiiIi() {
        super(IIIiiiIIii.ALLATORIxDEMO("Dj\b<"), IiiIIIiiII.IiiiiiiIIi("+bxy4{\u007fci5*"), new String[2 & 5]);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIiiiIIii.ALLATORIxDEMO("drQ\u007fG{\u0014kdZUj\u0004j\u0014\u8be9\u66c7\u65a9\u5204\u671e\u6599\u724b\u674f\uff48"));
        }
    }
}

