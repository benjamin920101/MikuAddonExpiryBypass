/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.MeteorClient
 *  meteordevelopment.meteorclient.events.world.TickEvent$Post
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.EntityTypeListSetting$Builder
 *  meteordevelopment.meteorclient.settings.IntSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.settings.SettingGroup
 *  meteordevelopment.meteorclient.systems.friends.Friends
 *  meteordevelopment.meteorclient.systems.modules.Modules
 *  meteordevelopment.meteorclient.systems.modules.misc.AutoReconnect
 *  meteordevelopment.meteorclient.utils.entity.DamageUtils
 *  meteordevelopment.meteorclient.utils.player.PlayerUtils
 *  meteordevelopment.orbit.EventHandler
 *  net.minecraft.util.Formatting
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Items
 *  net.minecraft.text.Text
 *  net.minecraft.network.packet.s2c.common.DisconnectS2CPacket
 *  net.minecraft.text.MutableText
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IiiIIIIiiI;
import com.github.mikumiku.addon.iIiIIiiIiI;
import com.github.mikumiku.addon.iiiIiIIIII;
import com.github.mikumiku.addon.iiiiIiIiii;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.EntityTypeListSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.friends.Friends;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.misc.AutoReconnect;
import meteordevelopment.meteorclient.utils.entity.DamageUtils;
import meteordevelopment.meteorclient.utils.player.PlayerUtils;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.util.Formatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.text.MutableText;

public class iIiiiiIIIi
extends iiiiIiIiii {
    private final Setting<Boolean> IIiiiiiiII;
    private final Setting<Boolean> IIiiiIIIIi;
    private final Setting<Integer> IIIiIIIiII;
    private final Setting<Integer> iiIiIiiiiI;
    private final Setting<Boolean> IIiiIiiiII;
    private final Setting<Integer> IIIiIiiIIi;
    private final Setting<Integer> iiiIiIiIIi;
    private final SettingGroup iIiIiIiIii;
    private final Setting<Boolean> iiiiiIIIii;
    private final iiiIiIIIII iIIiIIiiII;
    private final Setting<Boolean> IiiIIiiiiI;
    private final Setting<Set<class_1299<?>>> IiIIIIiiii;
    private final Setting<Integer> IiiIIIiiIi;
    private final Setting<Boolean> iiIIiiIiii;
    private final Setting<Boolean> iIiiIiiiII;
    private final SettingGroup iIIiiIIIII;
    private final Setting<Boolean> iiIiIIiIIi;
    private final Setting<Boolean> IIIIiIiiIi;
    private final Setting<Boolean> IiIiIIIIiI;
    private final Setting<Boolean> iiiiiIIiiI;
    private final Setting<Boolean> iiIIIIiIII;
    private final Object2IntMap<class_1299<?>> IiIIiIiiiI;
    private final SettingGroup ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void ALLATORIxDEMO(class_2561 class_25612) {
        String string;
        Iterator<String> iterator;
        iIiiiiIIIi iIiiiiIIIi2;
        void IiIIiIiiiI;
        iIiiiiIIIi iIiiiiIIIi3 = iIiiiiIIIi2;
        class_5250 class_52502 = class_2561.literal((String)IiiIIIIiiI.ALLATORIxDEMO("#\u81d5\u52d1\u764c\u518bhS"));
        class_52502.append((class_2561)IiIIiIiiiI);
        iIiiiiIIIi3.ALLATORIxDEMO((class_2561)IiIIiIiiiI);
        if (((Boolean)iIiiiiIIIi3.iiIiIIiIIi.get()).booleanValue()) {
            iIiiiiIIIi3.info(iIiIIiiIiI.ALLATORIxDEMO("ZaZ|\u818d\u52f4\u761c\u51a6\u8ba1\u7eba\u4fa6\u6013gAZa"), new Object[3 ^ 3]);
            iIiiiiIIIi3.info("\u65ad\u5f00\u539f\u56e0: " + IiIIiIiiiI.getString(), new Object[5 >> 3]);
            if (((Boolean)iIiiiiIIIi3.IIIIiIiiIi.get()).booleanValue()) {
                iIiiiiIIIi iIiiiiIIIi4 = iIiiiiIIIi3;
                iIiiiiIIIi2 = iIiiiiIIIi4.iiIIIIiIII.player.getBlockPos();
                iIiiiiIIIi4.info("\u5750\u6807: X=" + iIiiiiIIIi2.getX() + ", Y=" + iIiiiiIIIi2.getY() + ", Z=" + iIiiiiIIIi2.getZ(), new Object[3 ^ 3]);
            }
            if (((Boolean)iIiiiiIIIi3.iiiiiIIIii.get()).booleanValue()) {
                iIiiiiIIIi iIiiiiIIIi5 = iIiiiiIIIi3;
                int this_ = iIiiiiIIIi5.iiIIIIiIII.player.getInventory().count(class_1802.TOTEM_OF_UNDYING);
                iIiiiiIIIi5.info("\u56fe\u817e\u6570\u91cf: " + this_, new Object[2 & 5]);
            }
            if (((Boolean)iIiiiiIIIi3.IiiIIiiiiI.get()).booleanValue()) {
                List<String> this_ = iIiiiiIIIi3.ALLATORIxDEMO();
                if (!this_.isEmpty()) {
                    iIiiiiIIIi3.info("\u89c6\u91ce\u5185\u73a9\u5bb6 (" + this_.size() + "):", new Object[2 & 5]);
                    iterator = this_.iterator();
                    Iterator<String> iterator2 = iterator;
                    while (iterator2.hasNext()) {
                        string = iterator.next();
                        iIiiiiIIIi3.info("  " + string, new Object[3 >> 2]);
                        iterator2 = iterator;
                    }
                } else {
                    iIiiiiIIIi3.info(IiiIIIIiiI.ALLATORIxDEMO("\u89f8\u91b6\u51ba\u6599\u5141\u4ea7\u739c\u5bc5"), new Object[3 >> 2]);
                }
            }
            iIiiiiIIIi3.info(iIiIIiiIiI.ALLATORIxDEMO("]f\u001d&ZazAZaZaZaZazAzAzAZa"), new Object[3 >> 2]);
        }
        if (((Boolean)iIiiiiIIIi3.IIiiiIIIIi.get()).booleanValue()) {
            class_52502.append((class_2561)class_2561.literal((String)IiiIIIIiiI.ALLATORIxDEMO("\"d\u000eH?d\u8bd8\u7ebe\u4fde\u6016\u0017L\bN")).withColor(0xFFFFFF3C & 0xFFFFFFC3));
            if (((Boolean)iIiiiiIIIi3.IIIIiIiiIi.get()).booleanValue()) {
                iIiiiiIIIi2 = iIiiiiIIIi3.iiIIIIiIII.player.getBlockPos();
                class_52502.append((class_2561)class_2561.literal((String)("\n\u5750\u6807: " + iIiiiiIIIi2.getX() + ", " + iIiiiiIIIi2.getY() + ", " + iIiiiiIIIi2.getZ())).withColor(-4 >> 2));
            }
            if (((Boolean)iIiiiiIIIi3.iiiiiIIIii.get()).booleanValue()) {
                int this_ = iIiiiiIIIi3.iiIIIIiIII.player.getInventory().count(class_1802.TOTEM_OF_UNDYING);
                class_52502.append((class_2561)class_2561.literal((String)("\n\u56fe\u817e\u6570\u91cf: " + this_)).withColor(-4 >> 2));
            }
            if (((Boolean)iIiiiiIIIi3.IiiIIiiiiI.get()).booleanValue()) {
                List<String> this_ = iIiiiiIIIi3.ALLATORIxDEMO();
                if (!this_.isEmpty()) {
                    class_52502.append((class_2561)class_2561.literal((String)("\n\u89c6\u91ce\u5185\u73a9\u5bb6 (" + this_.size() + "):")).withColor(-4 >> 2));
                    iterator = this_.iterator();
                    Iterator<String> iterator3 = iterator;
                    while (iterator3.hasNext()) {
                        string = iterator.next();
                        class_52502.append((class_2561)class_2561.literal((String)("\n  " + string)).withColor(-8355712));
                        iterator3 = iterator;
                    }
                } else {
                    class_52502.append((class_2561)class_2561.literal((String)iIiIIiiIiI.ALLATORIxDEMO("V\u8981\u91b2\u51c2\u659c\u5131\u4eaa\u73ce\u5bea")).withColor(-8355712));
                }
            }
        }
        if ((iIiiiiIIIi2 = (AutoReconnect)Modules.get().get(AutoReconnect.class)).isActive()) {
            class_52502.append((class_2561)class_2561.literal((String)IiiIIIIiiI.ALLATORIxDEMO("\"d\u4fd2\u601a\"i\u001e\u8192\u5297\u91b4\u8fe9\u5d83\u79b4\u755b")).withColor(-8355712));
            iIiiiiIIIi2.toggle();
        }
        iIiiiiIIIi3.iiIIIIiIII.player.networkHandler.onDisconnect(new class_2661((class_2561)class_52502));
    }

    @Override
    public void onActivate() {
        super.onActivate();
    }

    @EventHandler
    private /* synthetic */ void ALLATORIxDEMO(TickEvent.Post post) {
        int n;
        float f;
        iIiiiiIIIi object;
        iIiiiiIIIi iIiiiiIIIi2 = object;
        float IiIIiIiiiI = iIiiiiIIIi2.iiIIIIiIII.player.getHealth();
        if (f <= 0.0f) {
            iIiiiiIIIi2.toggle();
            return;
        }
        if (((Boolean)iIiiiiIIIi2.iiiiiIIIii.get()).booleanValue() && (n = iIiiiiIIIi2.iiIIIIiIII.player.getInventory().count(class_1802.TOTEM_OF_UNDYING)) <= (Integer)iIiiiiIIIi2.IIIiIiiIIi.get()) {
            iIiiiiIIIi iIiiiiIIIi3 = iIiiiiIIIi2;
            iIiiiiIIIi3.ALLATORIxDEMO("\u56fe\u817e\u6570\u91cf\u4f4e\u4e8e " + String.valueOf(iIiiiiIIIi3.IIIiIiiIIi.get()) + " (\u5f53\u524d: " + n + ")\u3002");
            if (((Boolean)iIiiiiIIIi2.IIiiiiiiII.get()).booleanValue()) {
                iIiiiiIIIi2.toggle();
            }
            return;
        }
        if (((Boolean)iIiiiiIIIi2.IiIiIIIIiI.get()).booleanValue() && !iIiiiiIIIi2.IiiiiiiIIi()) {
            return;
        }
        if (IiIIiIiiiI <= (float)((Integer)iIiiiiIIIi2.iiIiIiiiiI.get()).intValue()) {
            iIiiiiIIIi iIiiiiIIIi4 = iIiiiiIIIi2;
            iIiiiiIIIi4.ALLATORIxDEMO("\u751f\u547d\u503c\u4f4e\u4e8e " + String.valueOf(iIiiiiIIIi4.iiIiIiiiiI.get()) + "\u3002");
            if (((Boolean)iIiiiiIIIi2.iiiiiIIiiI.get()).booleanValue()) {
                if (iIiiiiIIIi2.isActive()) {
                    iIiiiiIIIi2.toggle();
                }
                iIiiiiIIIi2.IiiiiiiIIi();
                return;
            }
            if (((Boolean)iIiiiiIIIi2.IIiiiiiiII.get()).booleanValue()) {
                iIiiiiIIIi2.toggle();
            }
            return;
        }
        if (((Boolean)iIiiiiIIIi2.IIiiIiiiII.get()).booleanValue() && IiIIiIiiiI + iIiiiiIIIi2.iiIIIIiIII.player.getAbsorptionAmount() - PlayerUtils.possibleHealthReductions() < (float)((Integer)iIiiiiIIIi2.iiIiIiiiiI.get()).intValue()) {
            iIiiiiIIIi iIiiiiIIIi5 = iIiiiiIIIi2;
            iIiiiiIIIi5.ALLATORIxDEMO("\u751f\u547d\u503c\u5373\u5c06\u4f4e\u4e8e " + String.valueOf(iIiiiiIIIi5.iiIiIiiiiI.get()) + "\u3002");
            if (((Boolean)iIiiiiIIIi2.IIiiiiiiII.get()).booleanValue()) {
                iIiiiiIIIi2.toggle();
            }
            return;
        }
        if (!((Boolean)iIiiiiIIIi2.iiIIIIiIII.get()).booleanValue() && !((Boolean)iIiiiiIIIi2.iIiiIiiiII.get()).booleanValue() && ((Set)iIiiiiIIIi2.IiIIIIiiii.get()).isEmpty()) {
            return;
        }
        for (Object object2 : iIiiiiIIIi2.iiIIIIiIII.world.getEntities()) {
            if (!(object2 instanceof class_1657) || (this_ = (class_1657)object2).getUuid() == iIiiiiIIIi2.iiIIIIiIII.player.getUuid()) continue;
            if (((Boolean)iIiiiiIIIi2.iiIIIIiIII.get()).booleanValue() && this_ != iIiiiiIIIi2.iiIIIIiIII.player && !Friends.get().isFriend(this_)) {
                iIiiiiIIIi2.ALLATORIxDEMO((class_2561)class_2561.literal((String)("\u4e0d\u53d7\u4fe1\u4efb\u7684\u73a9\u5bb6 '" + String.valueOf(class_124.RED) + this_.getName().getString() + String.valueOf(class_124.WHITE) + "' \u51fa\u73b0\u5728\u6e32\u67d3\u8ddd\u79bb\u5185\u3002")));
                if (((Boolean)iIiiiiIIIi2.IIiiiiiiII.get()).booleanValue()) {
                    iIiiiiIIIi2.toggle();
                }
                return;
            }
            if (!((Boolean)iIiiiiIIIi2.iIiiIiiiII.get()).booleanValue() || !PlayerUtils.isWithin((class_1297)object2, (double)8.0) || !(DamageUtils.getAttackDamage((class_1309)this_, (class_1309)iIiiiiIIIi2.iiIIIIiIII.player) > IiIIiIiiiI + iIiiiiIIIi2.iiIIIIiIII.player.getAbsorptionAmount())) continue;
            iIiiiiIIIi iIiiiiIIIi6 = iIiiiiIIIi2;
            iIiiiiIIIi6.ALLATORIxDEMO(IiiIIIIiiI.ALLATORIxDEMO("\u68b5\u6d49\u5274\rJt\u6b1f\u565f\u5a70\u80f4\u3071"));
            if (((Boolean)iIiiiiIIIi6.IIiiiiiiII.get()).booleanValue()) {
                iIiiiiIIIi2.toggle();
            }
            return;
        }
        if (!((Set)iIiiiiIIIi2.IiIIIIiiii.get()).isEmpty()) {
            int n2 = 5 >> 3;
            iIiiiiIIIi iIiiiiIIIi7 = iIiiiiIIIi2;
            iIiiiiIIIi7.IiIIiIiiiI.clear();
            for (class_1297 this_ : iIiiiiIIIi7.iiIIIIiIII.world.getEntities()) {
                if (!PlayerUtils.isWithin((class_1297)this_, (double)((Integer)iIiiiiIIIi2.iiiIiIiIIi.get()).intValue()) || !((Set)iIiiiiIIIi2.IiIIIIiiii.get()).contains(this_.getType())) continue;
                ++n2;
                if (((Boolean)iIiiiiIIIi2.iiIIiiIiii.get()).booleanValue()) continue;
                iIiiiiIIIi2.IiIIiIiiiI.put((class_1299<?>)this_.getType(), iIiiiiIIIi2.IiIIiIiiiI.getOrDefault((Object)this_.getType(), 2 & 5) + --1);
            }
            if (((Boolean)iIiiiiIIIi2.iiIIiiIiii.get()).booleanValue() && n2 >= (Integer)iIiiiiIIIi2.IiiIIIiiIi.get()) {
                iIiiiiIIIi iIiiiiIIIi8 = iIiiiiIIIi2;
                iIiiiiIIIi8.ALLATORIxDEMO(iIiIIiiIiI.ALLATORIxDEMO("\u8364\u56a8\u51e2\u9055\u5bfd\u5bc2\u4f14\u6047\u6537\u8df9\u8f80\u962c\u5251\u305e"));
                if (((Boolean)iIiiiiIIIi8.IIiiiiiiII.get()).booleanValue()) {
                    iIiiiiIIIi2.toggle();
                    return;
                }
            } else if (!((Boolean)iIiiiiIIIi2.iiIIiiIiii.get()).booleanValue()) {
                for (Object2IntMap.Entry this_ : iIiiiiIIIi2.IiIIiIiiiI.object2IntEntrySet()) {
                    if (this_.getIntValue() < (Integer)iIiiiiIIIi2.IIIiIIIiII.get()) continue;
                    iIiiiiIIIi2.ALLATORIxDEMO("\u8303\u56f4\u5185 " + ((class_1299)this_.getKey()).getName().getString() + " \u6570\u91cf\u8d85\u8fc7\u9650\u5236\u3002");
                    if (((Boolean)iIiiiiIIIi2.IIiiiiiiII.get()).booleanValue()) {
                        iIiiiiIIIi2.toggle();
                    }
                    return;
                }
            }
        }
    }

    public iIiiiiIIIi() {
        iIiiiiIIIi iIiiiiIIIi2 = this;
        super(iiiiIiIiii.ALLATORIxDEMO, iIiIIiiIiI.ALLATORIxDEMO("\u6606\u80ba0\b;"), IiiIIIIiiI.ALLATORIxDEMO("\u5f41\u6ef2\u8de6\u724a\u5bef\u6772\u4ea3\u65e5\u81bf\u52bb\u65f8\u5f13\u8f8b\u6396\u3077_\u001aT\u7539\u9771\u62f0\u540c\u89c6\u91dd\u51d0\u73bd\u5be4\u549f9a/\u5714\u6805"));
        iIiiiiIIIi2.ALLATORIxDEMO = iIiiiiIIIi2.settings.getDefaultGroup();
        iIiiiiIIIi2.iIIiiIIIII = iIiiiiIIIi2.settings.createGroup(iIiIIiiIiI.ALLATORIxDEMO("\u5bd9\u4f2f\u8bd9\u7f32"));
        iIiiiiIIIi2.iIiIiIiIii = iIiiiiIIIi2.settings.createGroup(IiiIIIIiiI.ALLATORIxDEMO("\u65eb\u5f9f\u8bfa\u7f6c"));
        iIiiiiIIIi2.iiIiIiiiiI = iIiiiiIIIi2.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u7563\u543a\u5040\u966f\u5060"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u5f26\u750c\u5428\u502f\u4f1b\u4e9d\u6243\u7b5a\u4edb\u6b57\u5049\u65c5\u819f\u529b\u65d8\u5f13\u8f8b\u63e3\u3002\u8bad\u7f3b\u4e2eb\u7992\u757d\u6b6a\u52d7\u80b9\u3000"))).defaultValue((Object)(0x37 & 0x4E))).range(3 ^ 3, 0x7F & 0x13).sliderMax(0x33 & 0x5F).build());
        this.IIiiIiiiII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u663d\u8081\u98e3\u6d17"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u6895\u6d58\u5265\u5360\u5c53\u53c4\u5265\u8d80\u596a\u4f17\u5bc6\u4f4c\u756a\u546e\u5069\u4f08\u4e8e\u8bad\u5bcf\u961c\u506e\u65e5\u65f8\u5f0e\u8f96\u63e1\u3000"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiIIIIiIII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u4eb9\u4fa6\u4e87\u73ce\u5bea"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u5f06\u4e1e\u577d\u596e\u539e\u5224\u881d\u4e1e\u76f1\u739a\u5bc3\u51e9\u73e5\u576e\u6e32\u67c0\u8d88\u79af\u51d7\u65e5\u65f8\u5f0e\u8f96\u63e1\u3000"))).defaultValue((Object)((2 & 5) != 0))).build());
        this.iIiiIiiiII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u9675Ou7\u6b01\u5634"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u5f60\u9631\u8fe2\u73dc\u5ba5\u80a8\u5959\u77ac\u95e7\u6715\u6b6f\u4f32\u65e5\u65f8\u5f0e\u8f96\u63e1\u3000"))).defaultValue((Object)((3 & 4) != 0))).build());
        this.iiiiiIIiiI = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u663d\u8081\u5260\u633e"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u4f5d\u8815\u91fc\u65d8\u7e8c\u547b\u79b2\u755d\u81f9\u52fd\u763d\u51fa\u3011\u6cee\u7583\u545c\u4f09\u9198\u65be\u5467\u756c\u3000"))).defaultValue((Object)(5 >> 3))).build());
        this.IIiiiiiiII = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u4f03\u756f\u5472\u5114\u95b1"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u4f39\u7528\u541d\u79d4\u753c\u81b8\u52bb\u762e\u51f4\u6a69\u5713\u3000"))).defaultValue((Object)(3 >> 1))).build());
        this.IiIiIIIIiI = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u4e82\u5f2f\u674e\u73d5\u5bf1\u658a\u65ca\u5f5c"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u53d9\u677c\u5f40\u9611\u8fc2f#\u6869\u5196\u675c\u976d\u5908\u53f8\u73dc\u5b85\u6583\uff1f\u5123\u4e90\u65ad\u5f13\u8f8b\u63b1\u52cd\u80ee\u6218\u4f14\u7557\u650c\u3000"))).defaultValue((Object)(--1 != 0))).build());
        this.iiiiiIIIii = this.ALLATORIxDEMO.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u56b9\u8102\u68a7\u67b9"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u547a\u753b\u56ab\u816d\u6525\u91fc\u68b5\u67d6\uff79\u5f60\u568b\u816d\u6525\u9189\u4f4e\u4e9d\u8beb\u5b8e\u506e\u65e5\u65f8\u5f0e\u8f96\u63e1\u3000"))).defaultValue((Object)(3 >> 2))).build());
        this.IIIiIiiIIi = this.ALLATORIxDEMO.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u6747\u5c6d\u56b9\u8102\u6517\u9193"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u5f26\u56ed\u812b\u6536\u91cf\u4f5d\u4edb\u6b70\u506e\u65e5\u65f8\u5f0e\u8f96\u63e1\u3000"))).defaultValue((Object)(--3))).range(5 >> 3, 0x2F & 0x75).sliderRange(3 >> 2, 0x7F & 0x25).visible(() -> (Boolean)this.iiiiiIIIii.get())).build());
        class_1299[] class_1299Array = new class_1299[4 ^ 5];
        class_1299Array[5 >> 3] = class_1299.END_CRYSTAL;
        this.IiIIIIiiii = this.iIIiiIIIII.add((Setting)((EntityTypeListSetting.Builder)((EntityTypeListSetting.Builder)new EntityTypeListSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u7696\u63db\u5bf9\u4f0f"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u5f26\u6334\u5bef\u5bad\u4f26\u51e9\u73e5\u576e\u6307\u5b89\u8356\u56e0\u51d7\u65e5\u65f8\u5f0e\u8f96\u63e1\u3000"))).defaultValue(class_1299Array).build());
        this.iiIIiiIiii = this.iIIiiIIIII.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u4f38\u7554\u607c\u650c\u8bc6\u7bcb"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u573b\u8bf4\u7b84\u6215\u671a\u905c\u5ba9\u5beb\u4f60\u76f1\u6008\u6505\u6205\u5300\u72aa\u8ba1\u7b84\u6b9a\u79d9\u5bcc\u4f40\u4e1e\u95fa\u524f\u6326\u3000"))).defaultValue((Object)(5 >> 2))).visible(() -> {
            if (!((Set)this.IiIIIIiiii.get()).isEmpty()) {
                return 3 >> 1;
            }
            return false;
        })).build());
        this.IiiIIIiiIi = this.iIIiiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u607c\u650c\u966f\u5060"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u89d5\u53a4\u659e\u5f75\u8fed\u63d0\u525e\uff59\u9602\u8fd1\u901a\u5bcf\u5b8a\u4f01\u7697\u6755\u5c01\u6073\u6534\u3000"))).defaultValue((Object)(0x3A & 0x4F))).min(3 & 5).sliderMax(0x6D & 0x32).visible(() -> {
            if (((Boolean)this.iiIIiiIiii.get()).booleanValue() && !((Set)this.IiIIIIiiii.get()).isEmpty()) {
                return 5 >> 2;
            }
            return false;
        })).build());
        this.IIIiIIIiII = this.iIIiiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u5312\u4e56\u5bd9\u4f2f\u966f\u5060"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u89f5\u5384\u659e\u5f75\u8fed\u63d0\u527e\uff79\u5346\u4e7f\u5bd8\u4f53\u7c68\u57de\u9650\u8f83\u7697\u6755\u5c01\u6538\u918b\u3000"))).defaultValue((Object)(--2))).min(3 & 5).sliderMax(0x5B & 0x34).visible(() -> {
            if (!((Boolean)this.iiIIiiIiii.get()).booleanValue() && !((Set)this.IiIIIIiiii.get()).isEmpty()) {
                return --1 != 0;
            }
            return false;
        })).build());
        this.iiiIiIiIIi = this.iIIiiIIIII.add((Setting)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)((IntSetting.Builder)new IntSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u6887\u6d37\u8364\u56a8"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u5beb\u4f40\u8d88\u79fd\u4f60\u5909\u8f84\u65e2\u89b4\u53c2\u65f8\u5f0e\u8f96\u63e1\u3000"))).defaultValue((Object)(--5))).min(2 ^ 3).sliderMax(0x3E & 0x51).visible(() -> {
            if (!((Set)this.IiIIIIiiii.get()).isEmpty()) {
                return (4 ^ 5) != 0;
            }
            return false;
        })).build());
        this.IIiiiIIIIi = this.iIiIiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u8bf7\u5f29\u65ea\u5f7c\u53f8\u56bc"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u8bb0\u5f46\u65f8\u5f14\u8f8c\u63b6\u76d1\u8be8\u7e8e\u53db\u56e2"))).defaultValue((Object)(5 >> 2))).build());
        this.IiiIIiiiiI = this.iIiIiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u8bcc\u5f12\u89ba\u9189\u51f9\u73ce\u5bea"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u65d8\u5f13\u8f8b\u63e3\u65f6\u62b6\u541f\u89d2\u919c\u5196\u76d1\u624e\u6741\u73ed\u5bb4"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.IIIIiIiiIi = this.iIiIiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u8bf7\u5f29\u5737\u685b"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u65ad\u5f13\u8f8b\u63b1\u65a4\u8ba3\u5f00\u5f5d\u5205\u5714\u6805"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        this.iiIiIIiIIi = this.iIiIiIiIii.add((Setting)((BoolSetting.Builder)((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIiiIiI.ALLATORIxDEMO("\u800d\u5955\u6679\u7946\u6582\u5f8b"))).description(IiiIIIIiiI.ALLATORIxDEMO("\u665a\u5415\u575d\u8059\u597c\u4e6b\u663e\u7929\u8bb3\u7ed2\u76d6\u65be\u5f55\u8fd0\u63ed\u4fa5\u606d"))).defaultValue((Object)((4 ^ 5) != 0))).build());
        iIiiiiIIIi iIiiiiIIIi3 = this;
        iIiiiiIIIi3.IiIIiIiiiI = new Object2IntOpenHashMap();
        iIiiiiIIIi iIiiiiIIIi4 = this;
        iIiiiiIIIi3.iIIiIIiiII = new iiiIiIIIII(this);
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIIiiIiI.ALLATORIxDEMO("07Ez\u00149g\t\u00178\u0006(\u0002}G\u8bab\u66b3\u65cc\u5277\u677c\u65f7\u7234\u674b\uff5d"));
        }
    }

    private /* synthetic */ List<String> ALLATORIxDEMO() {
        iIiiiiIIIi iIiiiiIIIi2 = iIiiiiIIIi3;
        ArrayList<String> arrayList = new ArrayList<String>();
        if (iIiiiiIIIi2.iiIIIIiIII.world == null || iIiiiiIIIi2.iiIIIIiIII.player == null) {
            return arrayList;
        }
        for (iIiiiiIIIi iIiiiiIIIi3 : iIiiiiIIIi2.iiIIIIiIII.world.getPlayers()) {
            if (iIiiiiIIIi3.getUuid() == iIiiiiIIIi2.iiIIIIiIII.player.getUuid()) continue;
            iIiiiiIIIi iIiiiiIIIi4 = iIiiiiIIIi3;
            double d = Math.sqrt(iIiiiiIIIi2.iiIIIIiIII.player.squaredDistanceTo((class_1297)iIiiiiIIIi4));
            Object[] objectArray = new Object[--1];
            objectArray[3 & 4] = d;
            Object[] objectArray2 = new Object[3 & 5];
            objectArray2[2 & 5] = Float.valueOf(iIiiiiIIIi3.getHealth());
            String string = iIiiiiIIIi4.getName().getString() + " (\u8ddd\u79bb: " + String.format(iIiIIiiIiI.ALLATORIxDEMO("bRV:"), objectArray) + "\u683c, \u751f\u547d\u503c: " + String.format(IiiIIIIiiI.ALLATORIxDEMO("\u0012_\u0004\u0015"), objectArray2) + "/" + iIiiiiIIIi3.getMaxHealth() + ")";
            if (Friends.get().isFriend((class_1657)iIiiiiIIIi3)) {
                string = string + " [\u597d\u53cb]";
            }
            arrayList.add(string);
        }
        return arrayList;
    }

    private /* synthetic */ void ALLATORIxDEMO(String string) {
        iIiiiiIIIi iIiiiiIIIi2 = string2;
        String string2 = string;
        iIiiiiIIIi IiIIiIiiiI = iIiiiiIIIi2;
        IiIIiIiiiI.ALLATORIxDEMO((class_2561)class_2561.literal((String)string2));
    }

    private /* synthetic */ boolean IiiiiiiIIi() {
        iIiiiiIIIi iIiiiiIIIi2 = iIiiiiIIIi3;
        for (iIiiiiIIIi iIiiiiIIIi3 : iIiiiiIIIi2.iiIIIIiIII.world.getPlayers()) {
            if (iIiiiiIIIi3.getUuid() == iIiiiiIIIi2.iiIIIIiIII.player.getUuid() || !PlayerUtils.isWithin((class_1297)iIiiiiIIIi3, (double)30.0) || Friends.get().isFriend((class_1657)iIiiiiIIIi3)) continue;
            return (3 & 5) != 0;
        }
        return false;
    }

    private /* synthetic */ void IiiiiiiIIi() {
        MeteorClient.EVENT_BUS.subscribe((Object)this.iIIiIIiiII);
    }

    private /* synthetic */ void ALLATORIxDEMO() {
        MeteorClient.EVENT_BUS.unsubscribe((Object)this.iIIiIIiiII);
    }

    private /* synthetic */ class_5250 ALLATORIxDEMO(class_2561 class_25612) {
        iIiiiiIIIi iIiiiiIIIi2 = iIiiiiIIIi3;
        iIiiiiIIIi iIiiiiIIIi3 = class_25612;
        iIiiiiIIIi IiIIiIiiiI = iIiiiiIIIi2;
        class_5250 class_52502 = class_2561.literal((String)iIiIIiiIiI.ALLATORIxDEMO("\u81ad\u52d4\u763c\u5186\u65a2\u5fab]V"));
        class_52502.append((class_2561)iIiiiiIIIi3);
        if (((Boolean)IiIIiIiiiI.IIIIiIiiIi.get()).booleanValue()) {
            iIiiiiIIIi3 = IiIIiIiiiI.iiIIIIiIII.player.getBlockPos();
            class_52502.append((class_2561)class_2561.literal((String)("\n\u5750\u6807: " + iIiiiiIIIi3.getX() + ", " + iIiiiiIIIi3.getY() + ", " + iIiiiiIIIi3.getZ())).withColor(-4 >> 2));
        }
        if (((Boolean)IiIIiIiiiI.iiiiiIIIii.get()).booleanValue()) {
            int this_ = IiIIiIiiiI.iiIIIIiIII.player.getInventory().count(class_1802.TOTEM_OF_UNDYING);
            class_52502.append((class_2561)class_2561.literal((String)("\n\u56fe\u817e\u6570\u91cf: " + this_)).withColor(-4 >> 2));
        }
        if (((Boolean)IiIIiIiiiI.IiiIIiiiiI.get()).booleanValue() && !(this_ = IiIIiIiiiI.ALLATORIxDEMO()).isEmpty()) {
            class_52502.append((class_2561)class_2561.literal((String)IiiIIIIiiI.ALLATORIxDEMO("r\u89f9\u91b7\u51b2\u73d8\u5b83I")).withColor(-4 >> 2));
            Object this_ = this_.iterator();
            Object object = this_;
            while (object.hasNext()) {
                String string = (String)this_.next();
                class_52502.append((class_2561)class_2561.literal((String)("\n  " + string)).withColor(-8355712));
                object = this_;
            }
        }
        return class_52502;
    }
}

