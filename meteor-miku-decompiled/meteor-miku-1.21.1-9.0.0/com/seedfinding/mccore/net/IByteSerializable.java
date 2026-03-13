/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.seedfinding.mccore.net;

import com.seedfinding.mccore.net.ByteBuffer;
import java.io.IOException;

public interface IByteSerializable {
    public void read(ByteBuffer var1) throws IOException;

    public void write(ByteBuffer var1) throws IOException;
}

