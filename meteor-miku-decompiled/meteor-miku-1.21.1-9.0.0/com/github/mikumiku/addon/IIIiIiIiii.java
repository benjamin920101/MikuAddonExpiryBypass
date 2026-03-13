/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.mixininterface.IClientPlayerInteractionManager
 *  meteordevelopment.meteorclient.utils.player.FindItemResult
 *  meteordevelopment.meteorclient.utils.player.SlotUtils
 *  net.minecraft.util.Hand
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.block.Block
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.block.BlockState
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iIiIiiiIii;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.mixininterface.IClientPlayerInteractionManager;
import meteordevelopment.meteorclient.utils.player.FindItemResult;
import meteordevelopment.meteorclient.utils.player.SlotUtils;
import net.minecraft.util.Hand;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.network.packet.Packet;
import net.minecraft.block.BlockState;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IIIiIiIiii {
    public static int iiiiiIIiiI;
    private static final iIiIiiiIii iiIIIIiIII;
    public static int IiIIiIiiiI;
    public static int ALLATORIxDEMO;

    public static List<Integer> ALLATORIxDEMO(Predicate<class_1799> predicate) {
        int IiIIiIiiiI;
        Predicate<class_1799> predicate2 = predicate;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n = IiIIiIiiiI = 3 ^ 3;
        while (true) {
            if (n >= 36) break;
            if (predicate2.test(MeteorClient.mc.player.getInventory().getStack(IiIIiIiiiI))) {
                arrayList.add(IiIIiIiiiI);
            }
            n = ++IiIIiIiiiI;
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    java.lang.IllegalStateException: java.io.IOException: Stream closed

