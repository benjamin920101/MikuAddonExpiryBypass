/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  xaero.common.minimap.waypoints.Waypoint
 *  xaero.hud.minimap.BuiltInHudModules
 *  xaero.hud.minimap.module.MinimapSession
 *  xaero.hud.minimap.waypoint.set.WaypointSet
 *  xaero.hud.minimap.world.MinimapWorld
 *  xaero.map.mods.SupportMods
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.iIiIiIiIII;
import com.github.mikumiku.addon.iIiiIiiiII;
import java.util.Date;
import xaero.common.minimap.waypoints.Waypoint;
import xaero.hud.minimap.BuiltInHudModules;
import xaero.hud.minimap.module.MinimapSession;
import xaero.hud.minimap.waypoint.set.WaypointSet;
import xaero.hud.minimap.world.MinimapWorld;
import xaero.map.mods.SupportMods;

public class IiIiiIIiIi {
    public IiIiiIIiIi() {
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(iIiIiIiIII.ALLATORIxDEMO("\u0014r\u0001_\u0017[dk\u0014Z%jtjd\u8be9\u66b7\u65a9\u5274\u671e\u65e9\u724b\u673f\uff48"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Waypoint ALLATORIxDEMO(int n, int n2) {
        int n3 = n;
        WaypointSet IiIIiIiiiI = IiIiiIIiIi.ALLATORIxDEMO();
        if (IiIIiIiiiI == null) {
            return null;
        }
        for (Waypoint waypoint : IiIIiIiiiI.getWaypoints()) {
            void IiIIiIiiiI2;
            if (waypoint.getX() != n3 || waypoint.getZ() != IiIIiIiiiI2) continue;
            return waypoint;
        }
        return null;
    }

    public static String ALLATORIxDEMO(String string) {
        int IiIIiIiiiI;
        String string2 = string;
        StackTraceElement stackTraceElement = new RuntimeException().getStackTrace()[3 & 5];
        String string3 = new StringBuffer(stackTraceElement.getMethodName()).insert(5 >> 3, stackTraceElement.getClassName()).toString();
        int n = string2.length();
        int n2 = n - (2 ^ 3);
        char[] cArray = new char[n];
        int n3 = --5 << --4 ^ (--2 ^ --5);
        int cfr_ignored_0 = --1 << --3 ^ 5 >> 1;
        int n4 = (--3 ^ --5) << --3 ^ --5;
        int n5 = IiIIiIiiiI = string3.length() - (3 & 5);
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

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, int n2, int n3, String string, String string2) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        int IiIIiIiiiI222 = n2;
        int IiIIiIiiiI4 = n;
        WaypointSet waypointSet = IiIiiIIiIi.ALLATORIxDEMO();
        if (waypointSet == null) {
            return;
        }
        if (IiIiiIIiIi.ALLATORIxDEMO(IiIIiIiiiI4, (int)IiIIiIiiiI3) != null) {
            return;
        }
        int n4 = 10;
        Waypoint IiIIiIiiiI222 = new Waypoint(IiIIiIiiiI4, IiIIiIiiiI222, (int)IiIIiIiiiI3, (String)IiIIiIiiiI2, (String)IiIIiIiiiI, n4, 3 & 4, (2 & 5) != 0);
        waypointSet.add(IiIIiIiiiI222);
        SupportMods.xaeroMinimap.requestWaypointsRefresh();
    }

    /*
     * WARNING - void declaration
     */
    public static void ALLATORIxDEMO(int n, int n2, int n3, String string) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        int IiIIiIiiiI222 = n2;
        int IiIIiIiiiI3 = n;
        WaypointSet waypointSet = IiIiiIIiIi.ALLATORIxDEMO();
        if (waypointSet == null) {
            return;
        }
        if (IiIiiIIiIi.ALLATORIxDEMO(IiIIiIiiiI3, (int)IiIIiIiiiI2) != null) {
            return;
        }
        String string2 = iIiiIiiiII.ALLATORIxDEMO("\u7f8e");
        int n4 = 0x3F & 0x4A;
        Waypoint IiIIiIiiiI222 = new Waypoint(IiIIiIiiiI3, IiIIiIiiiI222, (int)IiIIiIiiiI2, (String)IiIIiIiiiI, string2, n4, 3 >> 2, 5 >> 3);
        waypointSet.add(IiIIiIiiiI222);
        SupportMods.xaeroMinimap.requestWaypointsRefresh();
    }

    public static WaypointSet ALLATORIxDEMO() {
        MinimapSession minimapSession = (MinimapSession)BuiltInHudModules.MINIMAP.getCurrentSession();
        if (minimapSession == null) {
            return null;
        }
        MinimapWorld minimapWorld = minimapSession.getWorldManager().getCurrentWorld();
        if (minimapWorld == null) {
            return null;
        }
        return minimapWorld.getCurrentWaypointSet();
    }
}

