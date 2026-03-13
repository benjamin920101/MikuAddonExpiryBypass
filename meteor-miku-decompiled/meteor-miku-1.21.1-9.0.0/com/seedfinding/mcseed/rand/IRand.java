/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 */
package com.seedfinding.mcseed.rand;

public interface IRand {
    public int nextInt();

    public int nextInt(int var1);

    public boolean nextBoolean();

    public float nextFloat();

    public long nextLong();

    public double nextDouble();

    public double nextGaussian();
}

