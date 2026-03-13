/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  fi.dy.masa.litematica.data.DataManager
 *  fi.dy.masa.litematica.schematic.placement.SchematicPlacement
 *  meteordevelopment.meteorclient.events.world.TickEvent$Pre
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EnumSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.client.MinecraftClient
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiIiiIIiIi;
import com.github.mikumiku.addon.iiIiiIIiIi;
import com.github.mikumiku.addon.iiiiIiIiii;
import fi.dy.masa.litematica.data.DataManager;
import fi.dy.masa.litematica.schematic.placement.SchematicPlacement;
import java.util.Date;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EnumSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.client.MinecraftClient;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class iiiiiIIIIi
extends iiiiIiIiii {
    private final SettingGroup IiIIIIiiii;
    private final Setting<Boolean> IiiIIIiiIi;
    private final Setting<class_2350> iiIIiiIiii;
    private final SettingGroup iIiiIiiiII;
    private int iIIiiIIIII;
    private SchematicPlacement iiIiIIiIIi;
    private class_2338 IIIIiIiiIi;
    private final Setting<Integer> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private boolean IiIIiIiiiI;
    private class_2338 ALLATORIxDEMO;

    public void iIiiIIiiIi() {
        this.iiIIiiIiii.set((Object)class_2350.SOUTH);
    }

    public void IIIIIIiIii() {
        this.iiIIiiIiii.set((Object)class_2350.EAST);
    }

    private /* synthetic */ void iIIiIIiIii() {
        block6: {
            iiiiiIIIIi iiiiiIIIIi2 = iiiiiIIIIi3;
            if (class_310.getInstance().player == null) {
                return;
            }
            SchematicPlacement schematicPlacement = iiiiiIIIIi2.ALLATORIxDEMO();
            if (schematicPlacement == null) {
                if (((Boolean)iiiiiIIIIi2.IiiIIIiiIi.get()).booleanValue()) {
                    iiiiiIIIIi2.warning(IiIiiIIiIi.ALLATORIxDEMO("\u6756\u6260\u524c\u62ab\u5f2d\uff12\u659c\u6ccb\u5261\u59f5\u534a\u8dc1\u96f3\u7397\u5bea\u52a1\u80a1"), new Object[2 & 5]);
                }
                return;
            }
            try {
                iiiiiIIIIi iiiiiIIIIi3 = class_310.getInstance().player.getBlockPos();
                schematicPlacement = schematicPlacement.getOrigin();
                iiiiiIIIIi iiiiiIIIIi4 = iiiiiIIIIi2;
                iiiiiIIIIi4.IIIIiIiiIi = new class_2338(schematicPlacement.getX() - iiiiiIIIIi3.getX(), 5 >> 3, schematicPlacement.getZ() - iiiiiIIIIi3.getZ());
                iiiiiIIIIi iiiiiIIIIi5 = iiiiiIIIIi2;
                iiiiiIIIIi2.ALLATORIxDEMO = new class_2338(iiiiiIIIIi3.getX(), 3 & 4, iiiiiIIIIi3.getZ());
                iiiiiIIIIi2.IiIIiIiiiI = 3 >> 1;
                if (((Boolean)iiiiiIIIIi2.IiiIIIiiIi.get()).booleanValue()) {
                    iiiiiIIIIi iiiiiIIIIi6 = iiiiiIIIIi2;
                    iiiiiIIIIi6.info("\u8ddf\u968f\u73a9\u5bb6\u529f\u80fd\u5df2\u521d\u59cb\u5316\u3002\u76f8\u5bf9\u504f\u79fb: " + iiiiiIIIIi2.IIIIiIiiIi.getX() + ", " + iiiiiIIIIi6.IIIIiIiiIi.getZ(), new Object[3 ^ 3]);
                    return;
                }
            } catch (Exception exception) {
                if (!((Boolean)iiiiiIIIIi2.IiiIIIiiIi.get()).booleanValue()) break block6;
                iiiiiIIIIi2.error("\u521d\u59cb\u5316\u8ddf\u968f\u73a9\u5bb6\u529f\u80fd\u5931\u8d25: " + exception.getMessage(), new Object[3 & 4]);
            }
        }
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Pre pre) {
        iiiiiIIIIi iiiiiIIIIi2 = iiiiiIIIIi3;
        iiiiiIIIIi iiiiiIIIIi3 = pre;
        iiiiiIIIIi IiIIiIiiiI = iiiiiIIIIi2;
        if (class_310.getInstance().player == null || class_310.getInstance().world == null) {
            return;
        }
        iiiiiIIIIi iiiiiIIIIi4 = IiIIiIiiiI;
        if (((Boolean)IiIIiIiiiI.iiIIIIiIII.get()).booleanValue()) {
            iiiiiIIIIi4.ALLATORIxDEMO();
            return;
        }
        iiiiiIIIIi4.iIIiiIIIII += 2 ^ 3;
        iiiiiIIIIi iiiiiIIIIi5 = IiIIiIiiiI;
        if (iiiiiIIIIi5.iIIiiIIIII >= (Integer)iiiiiIIIIi5.IiIiIIIIiI.get()) {
            IiIIiIiiiI.iIIiiIIIII = 3 & 4;
            IiIIiIiiiI.IiiiiiiiII();
        }
    }

    public void IiIiiiIIiI() {
        this.iiIIiiIiii.set((Object)class_2350.WEST);
    }

    public boolean IiiIIIIiiI() {
        return this.IiIIiIiiiI;
    }

    private /* synthetic */ void IiiiiiiiII() {
        block5: {
            iiiiiIIIIi iiiiiIIIIi2 = iiiiiIIIIi3;
            SchematicPlacement schematicPlacement = iiiiiIIIIi2.ALLATORIxDEMO();
            if (schematicPlacement == null) {
                if (((Boolean)iiiiiIIIIi2.IiiIIIiiIi.get()).booleanValue()) {
                    iiiiiIIIIi2.warning(iiIiiIIiIi.ALLATORIxDEMO("\u672e\u904e\u62cd\u62d2\u5f55"), new Object[3 ^ 3]);
                }
                return;
            }
            try {
                iiiiiIIIIi iiiiiIIIIi3 = schematicPlacement.getOrigin();
                class_2338 class_23382 = iiiiiIIIIi3.offset((class_2350)iiiiiIIIIi2.iiIIiiIiii.get());
                schematicPlacement.setOrigin(class_23382, null);
                if (((Boolean)iiiiiIIIIi2.IiiIIIiiIi.get()).booleanValue()) {
                    iiiiiIIIIi2.info("\u6295\u5f71\u5df2\u4ece " + iiiiiIIIIi3.toShortString() + " \u79fb\u52a8\u5230 " + class_23382.toShortString(), new Object[5 >> 3]);
                    return;
                }
            } catch (Exception exception) {
                if (!((Boolean)iiiiiIIIIi2.IiiIIIiiIi.get()).booleanValue()) break block5;
                iiiiiIIIIi2.error("\u79fb\u52a8\u6295\u5f71\u5931\u8d25: " + exception.getMessage(), new Object[3 >> 2]);
            }
        }
    }

    public boolean IiiiiiiIIi() {
        return (Boolean)this.iiIIIIiIII.get();
    }

    @Override
    public void onActivate() {
        iiiiiIIIIi iiiiiIIIIi2 = this;
        iiiiiIIIIi2.iIIiiIIIII = 5 >> 3;
        iiiiiIIIIi2.IiIIiIiiiI = 3 & 4;
        this.ALLATORIxDEMO = null;
        this.IIIIiIiiIi = null;
        if (((Boolean)this.IiiIIIiiIi.get()).booleanValue()) {
            this.info(iiIiiIIiIi.ALLATORIxDEMO("\u62ed\u5f6a\u7994\u52a4\u5612\u5deb\u5444\u7520"), new Object[5 >> 3]);
        }
        iiiiiIIIIi iiiiiIIIIi3 = this;
        iiiiiIIIIi3.ALLATORIxDEMO();
        if (((Boolean)iiiiiIIIIi3.iiIIIIiIII.get()).booleanValue()) {
            this.iIIiIIiIii();
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(class_2338 class_23382) {
        block5: {
            iiiiiIIIIi iiiiiIIIIi2 = iiiiiIIIIi3;
            iiiiiIIIIi iiiiiIIIIi3 = class_23382;
            iiiiiIIIIi IiIIiIiiiI = iiiiiIIIIi2;
            SchematicPlacement schematicPlacement = IiIIiIiiiI.ALLATORIxDEMO();
            if (schematicPlacement == null || IiIIiIiiiI.IIIIiIiiIi == null) {
                return;
            }
            try {
                class_2338 class_23383 = schematicPlacement.getOrigin();
                iiiiiIIIIi3 = new class_2338(iiiiiIIIIi3.getX() + IiIIiIiiiI.IIIIiIiiIi.getX(), class_23383.getY(), iiiiiIIIIi3.getZ() + IiIIiIiiiI.IIIIiIiiIi.getZ());
                if (!class_23383.equals((Object)iiiiiIIIIi3)) {
                    schematicPlacement.setOrigin((class_2338)iiiiiIIIIi3, null);
                    if (((Boolean)IiIIiIiiiI.IiiIIIiiIi.get()).booleanValue()) {
                        IiIIiIiiiI.info("\u8ddf\u968f\u73a9\u5bb6: \u6295\u5f71\u5df2\u79fb\u52a8\u5230 " + iiiiiIIIIi3.toShortString(), new Object[3 & 4]);
                        return;
                    }
                }
            } catch (Exception exception) {
                if (!((Boolean)IiIIiIiiiI.IiiIIIiiIi.get()).booleanValue()) break block5;
                IiIIiIiiiI.error("\u8ddf\u968f\u73a9\u5bb6\u79fb\u52a8\u6295\u5f71\u5931\u8d25: " + exception.getMessage(), new Object[2 & 5]);
            }
        }
    }

    public void iIIiiiIiiI() {
        this.iiIIiiIiii.set((Object)class_2350.UP);
    }

    public class_2350 ALLATORIxDEMO() {
        return (class_2350)this.iiIIiiIiii.get();
    }

    public void iiIiiiiiII() {
        this.IiIIiIiiiI = 3 ^ 3;
        this.ALLATORIxDEMO = null;
        this.IIIIiIiiIi = null;
        if (((Boolean)this.IiiIIIiiIi.get()).booleanValue()) {
            this.info(iiIiiIIiIi.ALLATORIxDEMO("\u8ddb\u96e8\u73ad\u5bd1\u529b\u80ba\u5dd6\u918a\u7f4a"), new Object[3 >> 2]);
        }
    }

    public void IiiIIIIiiI() {
        this.iiIIiiIiii.set((Object)class_2350.DOWN);
    }

    public int ALLATORIxDEMO() {
        return (Integer)this.IiIiIIIIiI.get();
    }

    private /* synthetic */ SchematicPlacement ALLATORIxDEMO() {
        iiiiiIIIIi iiiiiIIIIi2;
        block4: {
            iiiiiIIIIi2 = iiiiiIIIIi3;
            if (!((Boolean)iiiiiIIIIi2.iiiiiIIiiI.get()).booleanValue()) {
                return iiiiiIIIIi2.iiIiIIiIIi;
            }
            try {
                iiiiiIIIIi iiiiiIIIIi3 = DataManager.getSchematicPlacementManager();
                if (iiiiiIIIIi3 != null) {
                    iiiiiIIIIi2.iiIiIIiIIi = iiiiiIIIIi3.getSelectedSchematicPlacement();
                }
            } catch (Exception exception) {
                if (!((Boolean)iiiiiIIIIi2.IiiIIIiiIi.get()).booleanValue()) break block4;
                iiiiiIIIIi2.error("\u83b7\u53d6\u5f53\u524d\u6295\u5f71\u4f4d\u7f6e\u5931\u8d25: " + exception.getMessage(), new Object[3 ^ 3]);
            }
        }
        return iiiiiIIIIi2.iiIiIIiIIi;
    }

    public void IiiiiiiIIi() {
        this.iiIIiiIiii.set((Object)class_2350.NORTH);
    }

    public class_2338 ALLATORIxDEMO() {
        return this.IIIIiIiiIi;
    }

    public iiiiiIIIIi() {
        iiiiiIIIIi iiiiiIIIIi2 = this;
        super(iiIiiIIiIi.ALLATORIxDEMO("\u62ef\u5f68\u8def\u96dc"), IiIiiIIiIi.ALLATORIxDEMO("\u81be\u529b\u79aa\u529b\u5f02\u5275\u9053\u5ba3\u76dfYWW([1_(W?_|\u628b\u5f0d\u5381\u747a\u56e0R>\u977c\u89bf\u5bd5\u88aeEW(\\6_(J\"\b%"));
        iiiiiIIIIi2.iIiiIiiiII = iiiiiIIIIi2.settings.getDefaultGroup();
        iiiiiIIIIi2.IiIIIIiiii = iiiiiIIIIi2.settings.createGroup(iiIiiIIiIi.ALLATORIxDEMO("\u7981\u52b1\u8b8e\u7f3d"));
        iiiiiIIIIi2.iiIIiiIiii = iiiiiIIIIi2.IiIIIIiiii.add((Setting)((EnumSetting.Builder)((EnumSetting.Builder)((EnumSetting.Builder)new EnumSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u79d8\u52e9\u65d0\u541a"))).description(iiIiiIIiIi.ALLATORIxDEMO("\u62f5\u5f72\u799c\u52ac\u76fe\u65a0\u5421\u3051"))).defaultValue((Object)class_2350.NORTH)).build());
        this.IiIiIIIIiI = this.IiIIIIiiii.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u79d8\u52e9\u9076\u5ead"))).description(iiIiiIIiIi.ALLATORIxDEMO("\u79ff\u52ef\u903b\u5ee1\uff2c\u4ea2\u6e1c\u6248\u521f\u4e5d\u5351\u4f7f\uff5dU4\u525b#Z$K\u79cb\uff39\u3051"))).defaultValue((Object)(0x16 & 0x7D))).min(3 >> 1).max(0x7BFE & 0x4C9).sliderMax(0x7D & 0x66).build());
        this.iiiiiIIiiI = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u81c9\u52e9\u68a9\u6d40"))).description(iiIiiIIiIi.ALLATORIxDEMO("\u81ce\u52cf\u68c4\u6d79\u5e27\u799c\u52ac\u5f33\u524e\u906e\u4e29\u76fe\u628c\u5f41\u3051"))).defaultValue((Object)((3 & 5) != 0))).build());
        this.IiiIIIiiIi = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u8b93\u5f14\u7992\u52a3"))).description(iiIiiIIiIi.ALLATORIxDEMO("\u571a\u801b\u594e\u680b\u4e4d\u8bb3\u5f32\u79ff\u52d2\u64d4\u4f6c\u3051"))).defaultValue((Object)((3 ^ 3) != 0))).build());
        this.iiIIIIiIII = this.iIiiIiiiII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiIiiIIiIi.ALLATORIxDEMO("\u8dfc\u96ce\u73c0\u5bbd"))).description(iiIiiIIiIi.ALLATORIxDEMO("\u8bad\u62a7\u5f20\u8db8\u968b\u73c9\u5bb5\u76e3\u6c30\u5e09\u79e2\u5298\u3051"))).defaultValue((Object)(5 >> 3))).build());
        iiiiiIIIIi iiiiiIIIIi3 = this;
        iiiiiIIIIi iiiiiIIIIi4 = this;
        this.iIIiiIIIII = 5 >> 3;
        iiiiiIIIIi4.iiIiIIiIIi = null;
        iiiiiIIIIi4.ALLATORIxDEMO = null;
        iiiiiIIIIi3.IIIIiIiiIi = null;
        iiiiiIIIIi3.IiIIiIiiiI = 3 >> 2;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiIiiIIiIi.ALLATORIxDEMO("n0{\u001dm\u0019>\tn\u0018_(\u000e(\u001e\u8bab\u66cd\u65eb\u520e\u675c\u6593\u7209\u6745\uff0a"));
        }
    }

    public boolean ALLATORIxDEMO() {
        return (Boolean)this.iiiiiIIiiI.get();
    }

    public void onDeactivate() {
        if (((Boolean)this.IiiIIIiiIi.get()).booleanValue()) {
            this.info(IiIiiIIiIi.ALLATORIxDEMO("\u62b4\u5f32\u79cd\u52fc\u564b\u5db3\u506e\u7578"), new Object[2 & 5]);
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        block5: {
            iiiiiIIIIi iiiiiIIIIi2 = iiiiiIIIIi3;
            if (class_310.getInstance().player == null) {
                return;
            }
            if (!iiiiiIIIIi2.IiIIiIiiiI) {
                iiiiiIIIIi2.iIIiIIiIii();
                return;
            }
            try {
                iiiiiIIIIi iiiiiIIIIi3 = class_310.getInstance().player.getBlockPos();
                class_2338 class_23382 = new class_2338(iiiiiIIIIi3.getX(), 2 & 5, iiiiiIIIIi3.getZ());
                if (iiiiiIIIIi2.ALLATORIxDEMO == null || !iiiiiIIIIi2.ALLATORIxDEMO.equals((Object)class_23382)) {
                    class_2338 class_23383 = class_23382;
                    iiiiiIIIIi2.ALLATORIxDEMO(class_23383);
                    iiiiiIIIIi2.ALLATORIxDEMO = class_23383;
                    return;
                }
            } catch (Exception exception) {
                if (!((Boolean)iiiiiIIIIi2.IiiIIIiiIi.get()).booleanValue()) break block5;
                iiiiiIIIIi2.error("\u5904\u7406\u8ddf\u968f\u73a9\u5bb6\u529f\u80fd\u5931\u8d25: " + exception.getMessage(), new Object[3 & 4]);
            }
        }
    }
}

