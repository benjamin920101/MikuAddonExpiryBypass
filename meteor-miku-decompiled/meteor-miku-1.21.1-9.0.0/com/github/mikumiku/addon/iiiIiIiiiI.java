/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.events.entity.EntityAddedEvent
 *  meteordevelopment.meteorclient.events.render.Render2DEvent
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.modules.Module
 *  meteordevelopment.meteorclient.utils.Utils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.thrown.EnderPearlEntity
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.nbt.NbtCompound
 *  net.minecraft.nbt.NbtElement
 *  net.minecraft.text.Text
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIiIIIIi;
import com.github.mikumiku.addon.IiiiIiiIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import com.github.mikumiku.addon.mixinface.MoveEvent;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import meteordevelopment.meteorclient.events.entity.EntityAddedEvent;
import meteordevelopment.meteorclient.events.render.Render2DEvent;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.Utils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;

public class iiiIiIiiiI
extends iiiiIiIiii {
    public static String IIIIiIiiIi = "miku_pearl_owner_cache";
    public int IiIiIIIIiI;
    private final SettingGroup iiiiiIIiiI;
    public final Map<UUID, String> iiIIIIiIII;
    public static final int IiIIiIiiiI = 200000000;
    private final Setting<Boolean> ALLATORIxDEMO;

    @EventHandler
    private /* synthetic */ void IiiiiiiIIi(Render2DEvent render2DEvent) {
        block3: {
            iiiIiIiiiI iiiIiIiiiI2 = object;
            if (Utils.isLoading() || !iiiIiIiiiI2.isActive()) break block3;
            for (class_1297 class_12972 : ((class_310)iiiIiIiiiI2.iiIIIIiIII).world.getEntities()) {
                iiiIiIiiiI iiiIiIiiiI3;
                Object object;
                UUID uUID;
                block6: {
                    block4: {
                        class_1297 class_12973;
                        block5: {
                            if (!(class_12972 instanceof class_1684)) continue;
                            class_12972 = (class_1684)class_12972;
                            uUID = class_12972.getUuid();
                            object = null;
                            class_12973 = class_12972.getOwner();
                            if (class_12973 == null) break block4;
                            if (!(class_12973 instanceof class_1657)) break block5;
                            object = ((class_1657)class_12973).getGameProfile().getName();
                            if (!((Boolean)iiiIiIiiiI2.ALLATORIxDEMO.get()).booleanValue()) break block4;
                            iiiIiIiiiI iiiIiIiiiI4 = iiiIiIiiiI2;
                            iiiIiIiiiI3 = iiiIiIiiiI4;
                            iiiIiIiiiI4.iiIIIIiIII.put(uUID, (String)object);
                            break block6;
                        }
                        object = class_12973.getName().getString();
                    }
                    iiiIiIiiiI3 = iiiIiIiiiI2;
                }
                if (((Boolean)iiiIiIiiiI3.ALLATORIxDEMO.get()).booleanValue() && object == null) {
                    object = iiiIiIiiiI2.iiIIIIiIII.get(uUID);
                }
                class_1297 class_12974 = class_12972;
                if (object != null) {
                    class_12974.setCustomName((class_2561)class_2561.literal((String)object));
                    class_12972.setCustomNameVisible((2 ^ 3) != 0);
                    continue;
                }
                class_12974.setCustomName((class_2561)class_2561.literal((String)IiiIiIIIIi.ALLATORIxDEMO("\u91f0\u750e\u73d3\u73d1")));
                class_12972.setCustomNameVisible((2 ^ 3) != 0);
            }
        }
    }

    public void onDeactivate() {
        super.onDeactivate();
    }

    private static /* synthetic */ void ALLATORIxDEMO(class_1684 class_16842, class_742 class_7422) {
        class_1684 IiIIiIiiiI;
        class_1684 IiIIiIiiiI2;
        class_1684 class_16843 = class_16842;
        class_16842 = class_7422;
        class_1684 class_16844 = IiIIiIiiiI2 = class_16843;
        class_16844.setCustomName(IiIIiIiiiI.getName());
        class_16844.setCustomNameVisible(--1 != 0);
    }

    public iiiIiIiiiI() {
        iiiIiIiiiI iiiIiIiiiI2 = this;
        super(IiiIiIIIIi.ALLATORIxDEMO("\u8c3f\u7695\u73d3\u73d1"), MoveEvent.ALLATORIxDEMO("\u4e7a\u676c\u5f11\u73aa\u73a0\u6840\u8bf0\u4e7c\u4efa\u76c3\u546d\u5b30"));
        iiiIiIiiiI2.iiiiiIIiiI = iiiIiIiiiI2.settings.getDefaultGroup();
        iiiIiIiiiI2.ALLATORIxDEMO = iiiIiIiiiI2.iiiiiIIiiI.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(IiiIiIIIIi.ALLATORIxDEMO("\u6644\u80ec\u7f0d\u5b69"))).description(MoveEvent.ALLATORIxDEMO("\u546f\u756f\u663a\u80ba\u7f73\u5b3f\u52df\u80ba\uff6c\u8bd7\u4f0f\u738a\u73a0\u4e7c\u4efa\u76c3\u546d\u5b30"))).defaultValue((Object)(5 >> 2))).build());
        iiiIiIiiiI iiiIiIiiiI3 = this;
        iiiIiIiiiI iiiIiIiiiI4 = this;
        iiiIiIiiiI3.iiIIIIiIII = new HashMap<UUID, String>();
        iiiIiIiiiI3.IiIiIIIIiI = 3 ^ 3;
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IiiIiIIIIi.ALLATORIxDEMO("iz\u001c7Mt\u001edNu\u007fE[0>\u8bc6\u66ca\u65a1\u520e\u6711\u658e\u7259\u6732\uff30"));
        }
    }

    private static /* synthetic */ double IiiiiiiIIi(class_1684 class_16842, class_742 class_7422) {
        class_1684 IiIIiIiiiI = class_7422;
        class_1684 IiIIiIiiiI2 = class_16842;
        return IiIIiIiiiI.getPos().distanceTo(new class_243(IiIIiIiiiI2.getX(), IiIIiIiiiI2.getY(), IiIIiIiiiI2.getZ()));
    }

    private static /* synthetic */ boolean ALLATORIxDEMO(class_1684 class_16842, class_742 class_7422) {
        class_1684 IiIIiIiiiI = class_7422;
        class_1684 IiIIiIiiiI2 = class_16842;
        class_243 class_2432 = new class_243(IiIIiIiiiI2.getX(), IiIIiIiiiI2.getY(), IiIIiIiiiI2.getZ());
        if (IiIIiIiiiI.getPos().distanceTo(class_2432) < 2.0) {
            return (2 ^ 3) != 0;
        }
        return false;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        iiiIiIiiiI iiiIiIiiiI2 = iiiIiIiiiI3;
        iiiIiIiiiI iiiIiIiiiI3 = post;
        iiiIiIiiiI IiIIiIiiiI = iiiIiIiiiI2;
        if (!((Boolean)IiIIiIiiiI.ALLATORIxDEMO.get()).booleanValue()) {
            return;
        }
        iiiIiIiiiI iiiIiIiiiI4 = IiIIiIiiiI;
        iiiIiIiiiI4.IiIiIIIIiI += 3 & 5;
        if (iiiIiIiiiI4.IiIiIIIIiI >= 200000000) {
            IiIIiIiiiI.IiIiIIIIiI = 3 & 4;
            IiIIiIiiiI.ALLATORIxDEMO();
        }
    }

    public void IiiiiiiIIi(EntityAddedEvent entityAddedEvent) {
        iiiIiIiiiI iiiIiIiiiI2 = iiiIiIiiiI3;
        iiiIiIiiiI iiiIiIiiiI3 = entityAddedEvent;
        iiiIiIiiiI IiIIiIiiiI = iiiIiIiiiI2;
        if (((class_310)IiIIiIiiiI.iiIIIIiIII).world == null) {
            return;
        }
        iiiIiIiiiI3 = ((EntityAddedEvent)iiiIiIiiiI3).entity;
        if (iiiIiIiiiI3 instanceof class_1684) {
            iiiIiIiiiI3 = (class_1684)iiiIiIiiiI3;
            ((class_310)IiIIiIiiiI.iiIIIIiIII).world.getPlayers().stream().min(Comparator.comparingDouble(arg_0 -> iiiIiIiiiI.IiiiiiiIIi((class_1684)iiiIiIiiiI3, arg_0))).ifPresent(arg_0 -> iiiIiIiiiI.ALLATORIxDEMO((class_1684)iiiIiIiiiI3, arg_0));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO(Render2DEvent render2DEvent) {
        iiiIiIiiiI iiiIiIiiiI2 = iiiIiIiiiI3;
        if (!Utils.isLoading() && iiiIiIiiiI2.isActive()) {
            for (iiiIiIiiiI iiiIiIiiiI3 : ((class_310)iiiIiIiiiI2.iiIIIIiIII).world.getEntities()) {
                if (!(iiiIiIiiiI3 instanceof class_1684)) continue;
                class_1297 class_12972 = (iiiIiIiiiI3 = (class_1684)iiiIiIiiiI3).getOwner();
                if (class_12972 != null) {
                    if (class_12972 instanceof class_1657) {
                        class_1657 class_16572 = (class_1657)class_12972;
                        class_16572.getGameProfile().getName();
                        iiiIiIiiiI iiiIiIiiiI4 = iiiIiIiiiI3;
                        iiiIiIiiiI4.setCustomName(class_16572.getName());
                        iiiIiIiiiI4.setCustomNameVisible((3 & 5) != 0);
                        continue;
                    }
                    iiiIiIiiiI3.setCustomName(class_12972.getName());
                    iiiIiIiiiI3.setCustomNameVisible(5 >> 2);
                    continue;
                }
                iiiIiIiiiI3.setCustomName((class_2561)class_2561.literal((String)MoveEvent.ALLATORIxDEMO("\u918e\u7558\u73ad\u7387")));
                iiiIiIiiiI3.setCustomNameVisible(3 >> 1);
            }
        }
    }

    private static /* synthetic */ double ALLATORIxDEMO(class_1684 class_16842, class_742 class_7422) {
        class_1684 IiIIiIiiiI = class_7422;
        class_1684 IiIIiIiiiI2 = class_16842;
        return IiIIiIiiiI.getPos().distanceTo(new class_243(IiIIiIiiiI2.getX(), IiIIiIiiiI2.getY(), IiIIiIiiiI2.getZ()));
    }

    public Module fromTag(class_2487 class_24872) {
        iiiIiIiiiI iiiIiIiiiI2 = iiiIiIiiiI3;
        iiiIiIiiiI iiiIiIiiiI3 = class_24872;
        iiiIiIiiiI IiIIiIiiiI = iiiIiIiiiI2;
        iiiIiIiiiI iiiIiIiiiI4 = iiiIiIiiiI3;
        super.fromTag((class_2487)iiiIiIiiiI4);
        if (iiiIiIiiiI4 != null && iiiIiIiiiI3.contains(IIIIiIiiIi)) {
            iiiIiIiiiI3 = IiiiIiiIII.ALLATORIxDEMO((class_2487)iiiIiIiiiI3, IIIIiIiiIi);
            IiIIiIiiiI.iiIIIIiIII.clear();
            iiiIiIiiiI3.getKeys().forEach(arg_0 -> IiIIiIiiiI.ALLATORIxDEMO((class_2487)iiiIiIiiiI3, arg_0));
        }
        return IiIIiIiiiI;
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(EntityAddedEvent entityAddedEvent) {
        iiiIiIiiiI iiiIiIiiiI2 = iiiIiIiiiI3;
        iiiIiIiiiI iiiIiIiiiI3 = entityAddedEvent;
        iiiIiIiiiI IiIIiIiiiI = iiiIiIiiiI2;
        if (((class_310)IiIIiIiiiI.iiIIIIiIII).world == null) {
            return;
        }
        iiiIiIiiiI3 = ((EntityAddedEvent)iiiIiIiiiI3).entity;
        if (iiiIiIiiiI3 instanceof class_1684) {
            String string;
            iiiIiIiiiI3 = (class_1684)iiiIiIiiiI3;
            UUID uUID = iiiIiIiiiI3.getUuid();
            if (((Boolean)IiIIiIiiiI.ALLATORIxDEMO.get()).booleanValue() && (string = IiIIiIiiiI.iiIIIIiIII.get(uUID)) != null) {
                iiiIiIiiiI iiiIiIiiiI4 = iiiIiIiiiI3;
                iiiIiIiiiI4.setCustomName((class_2561)class_2561.literal((String)string));
                iiiIiIiiiI4.setCustomNameVisible(3 >> 1);
                return;
            }
            ((class_310)IiIIiIiiiI.iiIIIIiIII).world.getPlayers().stream().filter(arg_0 -> iiiIiIiiiI.ALLATORIxDEMO((class_1684)iiiIiIiiiI3, arg_0)).min(Comparator.comparingDouble(arg_0 -> iiiIiIiiiI.ALLATORIxDEMO((class_1684)iiiIiIiiiI3, arg_0))).ifPresent(arg_0 -> IiIIiIiiiI.ALLATORIxDEMO((class_1684)iiiIiIiiiI3, uUID, arg_0));
        }
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        iiiIiIiiiI iiiIiIiiiI2 = hashMap;
        if (((class_310)iiiIiIiiiI2.iiIIIIiIII).world == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ((class_310)iiiIiIiiiI2.iiIIIIiIII).world.getEntities().forEach(class_12972 -> {
            Map IiIIiIiiiI = class_12972;
            Map IiIIiIiiiI2 = hashMap;
            if (IiIIiIiiiI instanceof class_1684) {
                IiIIiIiiiI2.put(IiIIiIiiiI.getUuid(), --1 != 0);
            }
        });
        iiiIiIiiiI2.iiIIIIiIII.keySet().removeIf(uUID -> {
            Map IiIIiIiiiI = hashMap;
            UUID IiIIiIiiiI2 = uUID;
            if (!IiIIiIiiiI.containsKey(IiIIiIiiiI2)) {
                return 5 >> 2;
            }
            return false;
        });
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_1684 class_16842, UUID uUID, class_742 class_7422) {
        void IiIIiIiiiI;
        iiiIiIiiiI iiiIiIiiiI2 = object;
        Object object = class_7422;
        iiiIiIiiiI IiIIiIiiiI2 = iiiIiIiiiI2;
        object = object.getGameProfile().getName();
        void v1 = IiIIiIiiiI;
        v1.setCustomName((class_2561)class_2561.literal((String)object));
        v1.setCustomNameVisible((4 ^ 5) != 0);
        if (((Boolean)IiIIiIiiiI2.ALLATORIxDEMO.get()).booleanValue()) {
            void IiIIiIiiiI3;
            IiIIiIiiiI2.iiIIIIiIII.put((UUID)IiIIiIiiiI3, (String)object);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(class_2487 class_24872, UUID uUID, String string) {
        void IiIIiIiiiI;
        Object IiIIiIiiiI2 = string;
        class_2487 IiIIiIiiiI3 = class_24872;
        IiIIiIiiiI3.putString(IiIIiIiiiI.toString(), (String)IiIIiIiiiI2);
    }

    public class_2487 toTag() {
        iiiIiIiiiI iiiIiIiiiI2 = iiiIiIiiiI3;
        class_2487 class_24872 = super.toTag();
        if (class_24872 != null && ((Boolean)iiiIiIiiiI2.ALLATORIxDEMO.get()).booleanValue()) {
            iiiIiIiiiI iiiIiIiiiI3 = new class_2487();
            iiiIiIiiiI2.iiIIIIiIII.forEach((arg_0, arg_1) -> iiiIiIiiiI.ALLATORIxDEMO((class_2487)iiiIiIiiiI3, arg_0, arg_1));
            class_24872.put(IIIIiIiiIi, (class_2520)iiiIiIiiiI3);
        }
        return class_24872;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2487 class_24872, String string) {
        iiiIiIiiiI iiiIiIiiiI2 = object;
        Object object = class_24872;
        iiiIiIiiiI IiIIiIiiiI = iiiIiIiiiI2;
        try {
            void IiIIiIiiiI2;
            UUID uUID = UUID.fromString((String)IiIIiIiiiI2);
            Object object2 = object = object.getString((String)IiIIiIiiiI2);
            if (!((String)(object instanceof Optional ? (object = (String)((Optional)object2).get()) : (object = (String)object2))).isEmpty()) {
                IiIIiIiiiI.iiIIIIiIII.put(uUID, (String)object);
                return;
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
    }
}

