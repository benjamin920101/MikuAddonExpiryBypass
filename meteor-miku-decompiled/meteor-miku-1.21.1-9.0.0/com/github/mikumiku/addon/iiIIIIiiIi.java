/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  baritone.api.pathing.goals.Goal
 *  baritone.api.pathing.goals.GoalBlock
 *  baritone.api.pathing.goals.GoalNear
 *  lombok.Generated
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.meteorclient.utils.world.BlockUtils
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.block.Block
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.util.math.RotationAxis
 *  net.minecraft.registry.Registries
 *  org.lwjgl.opengl.GL11
 */
package com.github.mikumiku.addon;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import com.github.mikumiku.addon.IiiiIIiiIi;
import com.github.mikumiku.addon.iIiiIiiiII;
import com.github.mikumiku.addon.iiiiIiiiII;
import java.util.Date;
import java.util.Set;
import lombok.Generated;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.meteorclient.utils.world.BlockUtils;
import meteordevelopment.meteorclient.utils.world.Dimension;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.registry.Registries;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class iiIIIIiiIi {
    public static String ALLATORIxDEMO(class_1792 IiIIiIiiiI) {
        return class_7923.ITEM.getId((Object)IiIIiIiiiI).getPath();
    }

    public static boolean IiiIIIIiiI(class_1792 IiIIiIiiiI) {
        if (Set.of(class_1802.WOODEN_SWORD, class_1802.STONE_SWORD, class_1802.IRON_SWORD, class_1802.GOLDEN_SWORD, class_1802.DIAMOND_SWORD, class_1802.NETHERITE_SWORD).contains(IiIIiIiiiI)) {
            return --1 != 0;
        }
        return false;
    }

    public static int ALLATORIxDEMO(class_1792 IiIIiIiiiI) {
        return class_310.getInstance().player.getInventory().count(IiIIiIiiiI);
    }

    public static void IiiIIIIiiI() {
        Settings settings = BaritoneAPI.getSettings();
        settings.allowBreak.value = (2 & 5) != 0;
        settings.allowPlace.value = (2 & 5) != 0;
    }

    public static void IiiiiiiIIi() {
        int n;
        IiiiIIiiIi.ALLATORIxDEMO("\u256f\u257d\u256b\u257d\u255d\u257d\u256b\u257d\u254b\u255d\u254b\u255d\u256b\u257d\u2561\u2577\u256a!\u256e\tIJ\u2564\u0003\u001b\r\u0006\u25b8\u25b2\u25a4\u0007\u0011\u0010\u0006\u252dJ\u001f\t\u256f\u257d\u2569\u257f\u2541\u2561\u256f\u2579\u256c'\u2559\u257f\u2577\u2561\u251fJ\u0013\u0005\u0016\u25a8\u25be\u25a8\u001d\u000b\u001c\n\u252dJ\u001b\r\u256a\r*-\u254a-)-\u254a-\u001b\r\u256f\u257d\u254b\u255d\u256c'\u254a-\r\r\u256a\r\u001b\u25a5\u25b3\u25a5\u25b3\u25a5\u001b\r;\u255c;-\u001b\u254d\u2561\u2577\u256d\u2547\u256f\u2579\u252c\u2509\u0015\u0003\u001b\u257c\u0006\u0000\u001a\u257d-\u2551\u2560\u2576\u252c\u2509\u001f\t\u25b3\u25a5\u25b1\u25a7\u25af\u0011\u001f\t\u256a\r\u0019\u000f\u2576\u0011OJ\u2562\u0005\u0002\u0000\u2567\u0000\u001d\u000b\u2566\u257a\u252c\u253a\u2566'\u256a\r,-\u254a-;\u2585\u2593\u2585\u25b3\u25a5\u001b\r;\u255c\u001b\r;\u2557\u256b\u257d\u256b\u2544\u256b\u257d\u256b\u25701\u254d\u256b\u257d\u254b\u256e;-\u001b\r\u25b9\u25af\u25b5\u000b\u001f\t\\\u250a\u2565\u2573\u256b\u257a,\u2561\u001a\u0014\u0007\u2560\u0010\u0006\\J\u25b7\u25a1\u25b3\r\u0019\u000f\u0007\u2560\u000b\u001c\u001b\u257c3\u2575\u2577\u2561\u252c\u2503\u2563\u2575\u2566\u2570\u2566\u2570\u256d\u257b\u256c\u257a\\J\u256b\u2544\u256b\u257d\u254b\u2550\u0011\u2559\u254b\u255d\u254b\u256b\u256b\u257d\u256b\u254b\u254b\u255d\u256b\u254b\u254b\u255d\u256b\u254b\u256b\u257d\u256b\u254b\u256b\u257d\u256b\u254b\u256b\u257d\u254b\u256b\u254b\u255d\u256b\u254b\u2561\u2577\u256d\u257c5\u2578\\S\u0015\u2572\n\u001d\u0006\u2561\u000b\u001d\u0007\u2560\u0001\u0014\\\u253b\u000e\u001a\u001b\u257c\b\u001b\u0007\u2560\u000e\u001c\u001b\u257c\b\u0019\u0007\u2560M]\u0013\u2574<\u2540\u2566\u2570\u256d\u2547\u256c\u257a\u252c\u2506\u256b\u257d\u256b\u2541\u254b\u255d\u254b\u2561\u254b\u255d\u254b\u2561\u256b\u257d\u256b\u2541\u254b\u255d\u256b\u2541\u254b\u255d\u256b\u2541\u256b\u257d\u256b\u254e1\u257c\n\u0015\u001b\u257c*4;\u255c\t\u001d\u0011\u2576\u000f\u001a\u001f\u2578NX\u0015\u2572\t\u001e\u0006\u2561\b\u0018\u0007\u2560\u0002\u0013\\\u253b\r\u001f\u001b\u257c3\u254f\u2577\u2561\u256f\u2545\u256b\u257d\u2569\u2543\u2577\u2561\u252c\u2506\u2563\u2575\u2566\u254c\u2566\u2570\u256d\u2547\u256c\u257a\u252c\u2506\u256b\u257d\u256b\u2541\u254b\u255d\u254b\u2561\u254b\u255d\u254b\u256e1\u257c\t\u001a;\u255c\t\u0015;\u255c\t\u0014\u001b\u257c\b\u001d\u001b\u257c\b\u001c\u001b\u257c(?;\u255c\b\u001e\u0011\u2576\u000e\u001f\u001f\u2578O_\u0015\u25721\u2577\u2576\u2560\u256a\u2545\u2577\u2561\u2560\u254f\u252c\u253a\u256f\u2540\u256b\u257d\u2569\u2546\u2577\u2561\u256f\u2540\u256b\u257d\u2569\u2546\u2577\u2561\u252c\u2503\u2563\u2575\u2566\u2549\u2566\u2570\u256d\u25766\u257e\u252c\u253a\u256b\u254b\u256b\u257d\u254b\u256b\u254b\u255d\u254b\u256b\u254b\u255d\u256b\u254b\u256b\u257d\u254b\u256b\u256b\u257d\u254b\u256b\u256b\u257d\u256b\u254b\u256b\u257d\u256b\u254b\u256b\u257d\u256b\u257a\u0011\u255c(;\u001b\u257c\u0002\u0010\u001d\u257a\f\u0011\\\u253b\u0006\u001a\u001b\u257c\u0012\u0000\u001a\u257d\u0013\u0000\u0010\u2577HX\u001f\u2578\u000f\u001e\u0019\u257e\u0013\u0005\u001f\u25781\u2577\u2569\u257f\u2577\u2558\u252c\u253a\u2563\u254c\u2566\u2570\u2566\u2549\u256d\u257b\u256c\u2543\u252c\u253a\u256b\u2544\u256b\u257d\u254b\u2564\u254b\u255d\u254b\u2564\u254b\u255d\u256b\u2544\u256b\u257d\u254b\u25501'");
        iIiiIiiiII.ALLATORIxDEMO("\u2550\u2506\u2548\u251a\u2563\u2507\u2542\u2510\u250e\u255c\u254d\u251f\u2549\u251b\u254b\u2519\u2552]\u254co,k\u254ai%w~\u2584\u2599\u25cb4f4f\u254em>l~\u2558\u2549\u251b\u2549\u252d\u2569\u253b\u2569\u253c3\u250b\u2569\u253b\u2549\u25289k\u0019K\u2591\u25c3\u25b1K9k9\u251a9k9k\u2548k(k\u2568K\u000bK\u2548k3a\u254b\u251d\u254d\u251f\u2509\u0006\u2546e/k\u2555v8\u25c2\u258d\u25df\u259a\u25c8\u25d6,=\u251e9k;\u2529\u2555\u2507\u254d\u2523\u2549\u251b\u254b\u252a%w~\u255d1s4\u2517\u001e\u2526\u254f\u251d\u254e\u252f~,\u2591\u25c3\u2591\u25c3\u25b1\u25e3\u0019K\u2568K\u0019K\u2548k*k\u2568K-k\u2568K9k\u2543\u251b\u2549\u251b\u2544A\u2548k.k\u2568K\u0019\u25e3\u2591\u25c3\u259b\u25c9\u2597m=\u251e~,7\u251f\u2549\u251b\u2554\u253f\u2548\u251a\u2555\u250a\u0018\u2520\u250e\u255c\u254d\u252c9k;i\u258d\u25df\u2595o9k;\u2529\u2555\u2507\u250e\u255b\u001b\u25124~4\u2517?m>l\u25d6\u2584\u2591k9k\u0019\u253a\r^\u0019\u253a\u0019\u21fb9\u007f,k\u0004K\u5411\u625b\u7eea\u67f71\u0019|8l'mkj'v?\u0010a\u2563\u253b\u2549\u251b\u257a\u2511\u254f\u251d\u254d\u251f\u250e\u255c\u2547\u2515\u2549\u251b\u2554\u2506\u2571\u251a\u2555\u2507\u254fJ\u250a\u255c\u254d\u251f\u257f\u251b\u254b\u2519\u2563\u2507\u254d\u251f\u257f\u251b\u254b\u2519\u2563\u2507\u250e\u255c\u2577\u2513\u2544\u2516\u2572\u2516\u254f\u251d\u2578\u251c\u250e\u255c\u257f\u251b\u2549\u251b\u256ea\u2568K\u0000K\u2568Z)k\u2548z\bK\u2548z\u000bK\u2548z*k\u2548z-k\u2548z,k\u2568Z\u000fK\u2548z$a\u254em=\u21df~\u80c0\u5312\u7b69\u4e19\u8807\u000e\u2536\u2548\u251a\u2555\u253b\u2542\u2510\u250e\u2560\u254d\u251f\u2549\u2527\u254b\u2519\u2555\u253b\u254d\u251f\u2549\u2527\u254b\u2519\u2555\u253b\u250e\u255c\u2541\u252f\u2544\u2516\u2544\u252a\u254f\u251d\u254e\u252fT\u255d(s9\u251a\bR\u0019\u253a\u000b[\u0019\u253a+z9\u251a\u000bY9\u251a\u000bX9\u251a+\u007f9\u251a+~9\u251a+}\u0019\u253a\u0019K\u2189k\u80df\u5344\u7b33\u4ec1\u8851E\u253e\u255c\u2547\u2515\u2575\u251b\u2554\u2506\u2574\u251a\u2555\u2507\u257e\u2510\u250e\u255c\u2571\u251f\u2549\u251b\u2577\u2519\u2555\u2507\u2571\u251f\u2549\u251b\u2577\u2519\u2555\u2507\u2532\u255c\u2541\u2513\u2577L\u2545t(m\u254f~f,\u2548y k\u2568X\tK\u2568X\bK\u2548x+k\u2568X*k\u2568X-k\u2548x,k\u2548k9\u21db9\u8087\u533c\u7b47\u4e30\u8827\u0013\u2511\u2543\u2511\u254f\u2524\u254d\u251f\u250e\u2565\u2547\u2515\u2549\u2522\u2554\u2506\u2548\u2523\u2555\u2507\u2542\u2529\u250e\u255c\u254d\u2526\u2549\u251b\u254b\u2520\u2555\u2507\u254d\u2526\u2549\u251b\u254b\u2514\u000f\u2503\u250e\u255c\u2541\u2525\u2544\u2516\u2544\u2520\u254f\u251d\u254e\u252a\u250e\u255c\u2549\u252d\u2549\u251b\u2569\u250d\u2569\u253b\u2569\u250d\u2569\u253b\u2549\u252d\u2549\u251b\u2569\u250d\u2549\u251b\u2569\u253c\u0013\u251a*}9\u251a*|9\u251a*s\u0019\u253a\nR9\u251a'q?\u251c)~~\u255d#w9\u251a0e8\u251b1c2\u2511~,\u218do\u5ff2\u633c\u6814i-gcw0A\u2541\u2519\u2555\u2507\u2537\u255c\u2541\u2513\u257d\u2516\u2544\u2516\u2576\u251d\u254e\u251c\u2537\u255c\u2549\u251b\u2570\u251b\u2569\u253b\u2550\u253b\u2569\u253b\u2550\u253b\u2549\u251b\u2570\u251b\u2569\u253b\u2544A");
        IiiiIIiiIi.ALLATORIxDEMO("\u2559\u256b\u257d\u2561\u2577\u256d\u257b\u256f\u2579\u252c\u253a\u2565\u2573\u256b\u257d\u2576\u2560\u256a\u257c\u2577\u2561\u2560\u2576\u252c\u253a\u256f\u2579\u256b\u257d\u2569\u257f\u2577\u2561\u256f\u2579\u256b\u257d\u2569\u257f\u2577\u2561\u252c\u253a\u2563\u2575\u2566\u2570\u2566\u2570\u256d\u257b\u256c\u257a\u252c\u253a\u256c'\u256a\r;-;-;-;-\u001b\r\u001b\r;-\u001b\r\u73b2\u5bbb\u7252\u54ec\u6834\rkAZT^_rCmhuyT_H\u0007\u001d\u000b\u001f\t\\J\u0015\u0003\u001b\r\u0006\u25610\u254c\u2577\u2561\u2560\u2576\u252c\u253a\u256f\u2579\u256b\u257d\u2569\u257f\u2577\u2561\u256f\u2579\u256b\u257d\u2569\u257f\u2577\u2561\u252c\u253a\u2563\u2575\u2566\u2570\u2566\u2570\u256d\u257b\u256c\u257a\u252c\u253a\u256b\u257d\u256b\u257d\u254b\u255d\u254b\u255d\u254b\u255d\u254b\u255d\u256b\u257d\u256b\u257d\u254b\u255d\u2558'\u254a-\u001b\r\u001b\r\u001b\r\u001b\r\u001b\r\u001b\r;-;-\u001b\r\u0011\u0007\u21ac\u000b\u80f3\u532c\u9094\u526c\u0015\u21b2\u001b\r\u0006\u0010\u001a\f\u0007\u0011\u0010\u0006\\J\u001f\t\u001b\r\u0019\u000f\u0007\u0011\u001f\u25781\u257c\u256d\u257f\u2577\u2561\u251a\u253a\u2563\u2575\u2550\u2570\u2566\u2570\u255b\u257b\u256c\u257a\u251a\u253a\u256b\u257d\u255d\u257d\u254b\u255d\u257d\u255d\u254b\u255d\u257d\u255d\u256b\u257d\u255d\u257d\u254b\u255d\u256c'\u254a\u255c\u001b\u0014\u001b\u257c\n\u001d\u001b\u257c\n\u001c\u001b\u257c*?;\u255c\n\u001e\u0011\u2576\f\u001f\u001f\u2578M_\u0015\u2572\n\u001b\u0006\u2561\u000b\u001b\u0007\u2560:\u2577\u251c\u253a\u256f\u2579\u2557\u257d\u2569\u257f\u254b\u2561\u256f\u2579\u2557\u257d\u2569\u257f\u254b\u2561\u252c\u253a\u255f\u2575\u2566\u2570\u255a\u2570\u256d\u257b\u2550\u257a\u252c\u253a\u2557\u257d\u256b\u257d\u2578\u0007\u254a\u255c*5;\u255c\n\u0014\u001b\u257c)=\u001b\u257c)<\u001b\u257c\t\u001f\u001b\u257c\t\u001e\u001b\u257c\t\u0019;\u255c)8\u001b\u257c\u0003\u0011\u001d\u257a5\u2578\u251c\u253a\u2565\u2573\u2557\u257d\u2576\u2560\u2556\u257c\u2577\u2561\u255c\u2576\u252c\u253a\u2553\u2579\u256b\u257d\u2555\u257f\u2577\u2561\u2553\u2579\u256b\u257d\u2555\u257f\u2577\u2561\u2510\u253a\u2563\u2575\u2555*\u2567\u2571\u000f\u001c\u001c\u257bNR\u001b\u257c\t\u0014;\u255c(=;\u255c(<\u001b\u257c\b\u001f;\u255c\b\u001e;\u255c\b\u0019\u001b\u257c\b\u0018\u001b\u257c1\u257c\u2561\u257d\u254b\u255d\u2572\u255d\u256b\u257d\u2558\u2577\u256d\u257b\u2556\u2579\u252c\u253a\u255c\u2573\u256b\u257d\u254f\u2560\u256a\u257c\u254e\u2561\u2560\u2576\u2515\u253a\u256f\u2579\u2552\u257d\u2569\u257f\u257a;\u256e\t\u001b\r\u0019\u000f\u0007\u0011\\J\u0013\u0005\u0016\u0000\u0016\u0000\u001d\u000b\u001c\n\\J\u21a8\r\u5fd0\u635a\u6814-\u2188-;-;-\u001b\r\u001b\r;-\u001b\r;-\u001b\r\u001b\r\u001b\r\u256a'\u256a\u2579\u256b\u257d\u254b\u256b\u254b\u255d\u256b\u254b\u2561\u2577\u256d\u254d\u256f\u2579\u252c\u250c\u2565\u2573\u256b\u254b\u2576\u2560\u256a\u254a\u2577\u2561\u2560\u2540\u252c\u253a\u256f\u254f\u256b\u257d\u2569\u2578-\u2560\u256e\t\u000b\r\u2568\u000f\u0016\u0011\u252dJ\u0001\u0005\u2567\u0000\u0005\u0000\u256c\u000b\b\n\u252dJ\u000e\r\u256a\r--\u254a-,-\u254a-\u0003\r\u256a'\u254a\u2557\u256b\u257d\u254b\u2564\u256b\u257d\u256b\u2544\u256b\u257d\u256b\u2544\u256b\u257d\u256b\u2544\u254b\u255d\u254b\u2564\u256b\u257d\u2561\u254e\u256d\u257b\u256f\u2540\u252c\u253a\u2565\u254a\u256b\u257d\u2576\u256d0\u257d\u0007\u0011\u0010\u21b7\u5213\u6221\u001f\u001d\u000b\u21bc\u0019\u000f\u0007\u0011\u001f\t\u001b\r\u0019\u000f\u0007\u0011\\J\u0013\u0005\u0016\u0000\u0016\u0000\u001d\u000b\u001c\n\\J\u001b\r\u001b\r;-;-;-;-\u001b\r\u256a'\u2541\u255d\u256b\u257d\u254b\u255d\u256b\u257d\u256b\u257d\u256b\u257d\u256b\u257d\u256b\u257d\u256b\u257d\u254b\u255d\u254b\u255d\u256b\u257d\u2561\u2577\u256d\u257b\u256f\u2579\u252c\u253a\u2565\u2573\u256b\u257d\u2576\u2560\u256a\u257c\u2577\u2561\u2560\u2576\u252c\u253a\u256f\u2579\u256b\u257d\u2569\u257f\u2577\u2561\u256f\u25741\u2579\u2569\u257f\u2577\u2561\u252c\u250c\u2563\u2575\u2566\u2570\u2566\u2546\u256d\u257b\u256c\u257a\u252c\u250c\u256b\u257d\u256b\u257d\u254b\u255a\u0011\u255c;>--\u001b\u257c\u001b\u001e,-\u001b\u257c;>\u0003\r\u001b\u257c\u001b\u001e\u0002\r\u001b\u257c\u001b\u0019+\u0007\u2541\u255d\u256b\u257d\u2561\u2577\u2554\u257b\u256f\u2579\u252c\u253a\u255c\u2573\u256b\u257d\u2576\u2560\u2553\u257c\u2577\u2561\u2560\u2576\u2521`\u590b\u76fd\u001b\u80d5\u750b\u000f\u6283\u814e\u001f\u975d\u5b6b'\u2563\u257f\u2577\u2561\u2515\u253a\u2563\u2575\u255f\u2570\u2566\u2570\u2554\u257b\u256c\u257a\u2515\u253a\u256b\u257d\u2552\u257d\u254b\u255d\u2572\u255d\u254b\u255d\u2572\u255d\u256b\u257d\u2552\u257d\u254b\u255d\u2566'");
        class_310 class_3102 = class_310.getInstance();
        int n2 = n = 3 >> 2;
        while (true) {
            if (n2 > 45) break;
            Object object = class_3102.player.getInventory().getStack(n);
            if (!object.isEmpty()) {
                object = object.getItem().getName().getString();
                iiiiIiiiII.IiiiiiiiII(n + ": " + (String)object);
            }
            n2 = ++n;
        }
    }

    public static boolean ALLATORIxDEMO(class_2338 class_23382) {
        class_2338 class_23383 = class_23382;
        class_2338 IiIIiIiiiI = class_310.getInstance();
        if (IiIIiIiiiI.world.getBlockState(class_23383).isAir() && BlockUtils.canPlace((class_2338)class_23383) && !IiIIiIiiiI.world.getBlockState(class_23383.down()).isAir()) {
            return 3 >> 1;
        }
        return false;
    }

    public static boolean ALLATORIxDEMO(String string, boolean bl) {
        boolean bl2;
        boolean IiIIiIiiiI = bl;
        String IiIIiIiiiI2 = string;
        try {
            Class.forName(IiIIiIiiiI2, IiIIiIiiiI, Thread.currentThread().getContextClassLoader());
            bl2 = true;
        } catch (ClassNotFoundException classNotFoundException) {
            return (2 & 5) != 0;
        }
        return bl2;
    }

    public static boolean IiiIIIIiiI() {
        return PlayerUtils.getDimension().equals((Object)Dimension.Nether);
    }

    public static boolean IiiiiiiIIi(class_1792 IiIIiIiiiI) {
        if (Set.of(class_1802.WOODEN_PICKAXE, class_1802.STONE_PICKAXE, class_1802.IRON_PICKAXE, class_1802.GOLDEN_PICKAXE, class_1802.DIAMOND_PICKAXE, class_1802.NETHERITE_PICKAXE).contains(IiIIiIiiiI)) {
            return --1 != 0;
        }
        return false;
    }

    public static boolean ALLATORIxDEMO(class_1792 class_17922) {
        class_1792 IiIIiIiiiI;
        class_1792[] class_1792Array = new class_1792[0x1D & 0x7B];
        class_1792Array[3 ^ 3] = class_1802.LEATHER_HELMET;
        class_1792Array[4 ^ 5] = class_1802.LEATHER_CHESTPLATE;
        class_1792Array[5 >> 1] = class_1802.LEATHER_LEGGINGS;
        class_1792Array[--3] = class_1802.LEATHER_BOOTS;
        class_1792Array[--4] = class_1802.CHAINMAIL_HELMET;
        class_1792Array[--5] = class_1802.CHAINMAIL_CHESTPLATE;
        class_1792Array[0x76 & 0xF] = class_1802.CHAINMAIL_LEGGINGS;
        class_1792Array[0x47 & 0x3F] = class_1802.CHAINMAIL_BOOTS;
        class_1792Array[0x2E & 0x59] = class_1802.IRON_HELMET;
        class_1792Array[0x49 & 0x3F] = class_1802.IRON_CHESTPLATE;
        class_1792Array[0x1B & 0x6E] = class_1802.IRON_LEGGINGS;
        class_1792Array[0x4F & 0x3B] = class_1802.IRON_BOOTS;
        class_1792Array[0x6D & 0x1E] = class_1802.GOLDEN_HELMET;
        class_1792Array[0x3F & 0x4D] = class_1802.GOLDEN_CHESTPLATE;
        class_1792Array[0x5F & 0x2E] = class_1802.GOLDEN_LEGGINGS;
        class_1792Array[0x1F & 0x6F] = class_1802.GOLDEN_BOOTS;
        class_1792Array[0x50 & 0x3F] = class_1802.DIAMOND_HELMET;
        class_1792Array[0x3D & 0x53] = class_1802.DIAMOND_CHESTPLATE;
        class_1792Array[0x7E & 0x13] = class_1802.DIAMOND_LEGGINGS;
        class_1792Array[0x77 & 0x1B] = class_1802.DIAMOND_BOOTS;
        class_1792Array[0x14 & 0x7F] = class_1802.NETHERITE_HELMET;
        class_1792Array[0x1F & 0x75] = class_1802.NETHERITE_CHESTPLATE;
        class_1792Array[0x7F & 0x16] = class_1802.NETHERITE_LEGGINGS;
        class_1792Array[0x77 & 0x1F] = class_1802.NETHERITE_BOOTS;
        class_1792Array[0x78 & 0x1F] = class_1802.TURTLE_HELMET;
        if (Set.of(class_1792Array).contains(IiIIiIiiiI)) {
            return (3 & 5) != 0;
        }
        return false;
    }

    public static boolean IiiiiiiIIi() {
        return PlayerUtils.getDimension().equals((Object)Dimension.Overworld);
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[--1];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).append(stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - --1;
        char[] cArray = new char[n];
        int n3 = --5 << --4;
        int cfr_ignored_0 = (--3 ^ --5) << --4 ^ 3 & 5;
        int n4 = (--3 ^ --5) << --3 ^ 5 >> 1;
        int n5 = IiIIiIiiiI = string3.length() - (2 ^ 3);
        int n6 = n2;
        String string4 = string3;
        while (n6 >= 0) {
            int n7 = n2--;
            cArray[n7] = (char)(n4 ^ (string2.charAt(n7) ^ string4.charAt(IiIIiIiiiI)));
            if (n2 < 0) break;
            int n8 = n2--;
            char c = cArray[n8] = (char)(n3 ^ (string2.charAt(n8) ^ string4.charAt(IiIIiIiiiI)));
            if (--IiIIiIiiiI < 0) {
                IiIIiIiiiI = n5;
            }
            n6 = n2;
        }
        return new String(cArray);
    }

    public static class_2338 ALLATORIxDEMO() {
        int n;
        class_2338 class_23382;
        int n2;
        class_310 class_3102 = class_310.getInstance();
        class_2350[] class_2350Array = class_3102.player.getHorizontalFacing();
        class_2338 class_23383 = class_3102.player.getBlockPos();
        class_2338 class_23384 = class_23383.offset((class_2350)class_2350Array);
        if (iiIIIIiiIi.ALLATORIxDEMO(class_23384)) {
            return class_23384;
        }
        class_2350[] class_2350Array2 = new class_2350[3];
        class_2350Array2[2 & 5] = class_2350Array.rotateYClockwise();
        class_2350Array2[3 & 5] = class_2350Array.rotateYCounterclockwise();
        class_2350Array2[1 ^ 3] = class_2350Array.getOpposite();
        class_2350Array = class_2350Array2;
        int n3 = class_2350Array2.length;
        int n4 = n2 = 2 & 5;
        while (n4 < n3) {
            class_2350 class_23502 = class_2350Array[n2];
            class_23382 = class_23383.offset(class_23502);
            if (iiIIIIiiIi.ALLATORIxDEMO(class_23382)) {
                return class_23382;
            }
            n4 = ++n2;
        }
        int n5 = n = 1;
        while (true) {
            if (n5 < -1) break;
            int n6 = 3 ^ 3;
            class_2338 class_23385 = class_23383.add(n6, n, n6);
            if (iiIIIIiiIi.ALLATORIxDEMO(class_23385)) {
                return class_23385;
            }
            n5 = n -= 2;
        }
        int n7 = n = 1;
        while (true) {
            if (n7 > 3) break;
            int n8 = -n;
            while (n8 <= n) {
                int n9;
                int n10 = -n;
                while (n10 <= n) {
                    block14: {
                        block15: {
                            if (Math.abs(n9) == --1 && n2 == 0) break block14;
                            if (n9 != 0) break block15;
                            if (Math.abs(n2) == 3 >> 1) break block14;
                        }
                        if (!(n9 == 0 && n2 == 0 || Math.abs(n9) != n && Math.abs(n2) != n)) {
                            int n11;
                            int n12 = n11 = -1;
                            while (true) {
                                if (n12 > 1) break;
                                class_23382 = class_23383.add(n9, n11, n2);
                                if (iiIIIIiiIi.ALLATORIxDEMO(class_23382)) {
                                    return class_23382;
                                }
                                n12 = ++n11;
                            }
                        }
                    }
                    n10 = ++n2;
                }
                n8 = ++n9;
            }
            n7 = ++n;
        }
        return null;
    }

    public static boolean ALLATORIxDEMO(class_2338 class_23382, class_2248 class_22482) {
        class_2338 IiIIiIiiiI = class_22482;
        class_2338 IiIIiIiiiI2 = class_23382;
        return class_310.getInstance().world.getBlockState(IiIIiIiiiI2).isOf((class_2248)IiIIiIiiiI);
    }

    @Generated
    private /* synthetic */ iiIIIIiiIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiiIIiiIi.ALLATORIxDEMO("lF\u0019\u000bHH\u001bXkizy~,;\u8bfa\u66cf\u659d\u520b\u672d\u65ab\u7245\u6717\uff2c"));
        }
        throw new UnsupportedOperationException(iIiiIiiiII.ALLATORIxDEMO("I'p8; vw|ol?r%l#',r/u5gf~#zl=mw%v?\u0019\t\\KP\u0005J\u001fx%m\"X\u001f|/"));
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(String string, double d, double d2, double d3, float f, int n) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        String IiIIiIiiiI5;
        String string2 = string;
        class_310 class_3102 = class_310.getInstance();
        class_4184 IiIIiIiiiI6 = class_3102.gameRenderer.getCamera();
        class_243 class_2432 = IiIIiIiiiI6.getPos();
        String string3 = IiIIiIiiiI5 = new class_4587();
        String string4 = IiIIiIiiiI5;
        string4.push();
        string4.translate((double)(IiIIiIiiiI4 - class_2432.x), (double)(IiIIiIiiiI3 - class_2432.y), (double)(IiIIiIiiiI2 - class_2432.z));
        string3.multiply(class_7833.POSITIVE_Y.rotationDegrees(-IiIIiIiiiI6.getYaw()));
        string3.multiply(class_7833.POSITIVE_X.rotationDegrees(IiIIiIiiiI6.getPitch()));
        string3.scale((float)(-IiIIiIiiiI), (float)(-IiIIiIiiiI), (float)IiIIiIiiiI);
        float cfr_ignored_0 = (float)class_3102.textRenderer.getWidth(string2) / 2.0f;
        GL11.glDepthFunc((int)(0x3A57 & 0x47AF));
        class_3102.getBufferBuilders().getEntityVertexConsumers().draw();
        GL11.glDepthFunc((int)(0x1A7B & 0x6787));
        IiIIiIiiiI5.pop();
    }

    public static boolean ALLATORIxDEMO(String IiIIiIiiiI) {
        return iiIIIIiiIi.ALLATORIxDEMO(IiIIiIiiiI, (3 ^ 3) != 0);
    }

    public static String ALLATORIxDEMO(class_1799 IiIIiIiiiI) {
        return class_7923.ITEM.getId((Object)IiIIiIiiiI.getItem()).getPath();
    }

    public static boolean ALLATORIxDEMO() {
        return PlayerUtils.getDimension().equals((Object)Dimension.End);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean ALLATORIxDEMO(class_2338 class_23382, double d) {
        void IiIIiIiiiI;
        class_2338 class_23383 = class_23382;
        class_2338 IiIIiIiiiI2 = class_310.getInstance();
        if (IiIIiIiiiI2.player == null || IiIIiIiiiI2.world == null) {
            return false;
        }
        IiIIiIiiiI2 = IiIIiIiiiI2.player.getBlockPos();
        class_2338.class_2339 class_23392 = new class_2338.class_2339();
        class_23392.set((class_2382)class_23383);
        class_23392.setY(IiIIiIiiiI2.getY());
        double d2 = IiIIiIiiiI2.getSquaredDistance((class_2382)class_23383);
        void v0 = IiIIiIiiiI;
        void var7_5 = v0 * v0;
        if (d2 <= var7_5) {
            BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
            return --1 != 0;
        }
        if (!BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().isPathing()) {
            iiIIIIiiIi.IiiIIIIiiI();
            IiIIiIiiiI2 = new GoalNear(class_23383, (int)IiIIiIiiiI - (3 >> 1));
            if (IiIIiIiiiI <= 0.0) {
                IiIIiIiiiI2 = new GoalBlock(class_23383);
            }
            BaritoneAPI.getProvider().getPrimaryBaritone().getCustomGoalProcess().setGoalAndPath((Goal)IiIIiIiiiI2);
        }
        return false;
    }

    public static void ALLATORIxDEMO() {
        BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
    }
}

