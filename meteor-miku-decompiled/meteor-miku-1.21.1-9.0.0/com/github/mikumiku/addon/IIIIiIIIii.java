/*
 * Decompiled with CFR 0.2-SNAPSHOT (FabricMC).
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.settings.BoolSetting$Builder
 *  meteordevelopment.meteorclient.settings.Setting
 *  meteordevelopment.meteorclient.utils.render.color.Color
 *  meteordevelopment.meteorclient.utils.world.Dimension
 *  net.minecraft.world.biome.Biome
 *  net.minecraft.world.gen.chunk.ChunkGenerator
 *  net.minecraft.world.gen.feature.ConfiguredFeature
 *  net.minecraft.world.gen.feature.FeatureConfig
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.world.gen.feature.OreFeatureConfig
 *  net.minecraft.world.gen.WorldPresets
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.world.dimension.DimensionOptions
 *  net.minecraft.world.HeightLimitView
 *  net.minecraft.world.gen.HeightContext
 *  net.minecraft.world.gen.feature.ScatteredOreFeature
 *  net.minecraft.util.math.intprovider.ConstantIntProvider
 *  net.minecraft.util.math.intprovider.IntProvider
 *  net.minecraft.world.gen.heightprovider.HeightProvider
 *  net.minecraft.world.gen.placementmodifier.CountPlacementModifier
 *  net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier
 *  net.minecraft.world.gen.feature.PlacedFeature
 *  net.minecraft.world.gen.placementmodifier.PlacementModifier
 *  net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier
 *  net.minecraft.world.gen.feature.OrePlacedFeatures
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.registry.entry.RegistryEntryList
 *  net.minecraft.world.gen.WorldPreset
 *  net.minecraft.registry.RegistryWrapper$Impl
 *  net.minecraft.registry.RegistryWrapper$WrapperLookup
 *  net.minecraft.world.gen.feature.util.PlacedFeatureIndexer
 *  net.minecraft.world.gen.feature.util.PlacedFeatureIndexer$IndexedFeatures
 *  net.minecraft.registry.BuiltinRegistries
 *  net.minecraft.registry.RegistryKeys
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIIiiiIIii;
import com.github.mikumiku.addon.IiIiIiIIII;
import com.github.mikumiku.addon.iIiIIIiiiI;
import com.github.mikumiku.addon.mixin.CountPlacementModifierAccessor;
import com.github.mikumiku.addon.mixin.HeightRangePlacementModifierAccessor;
import com.github.mikumiku.addon.mixin.RarityFilterPlacementModifierAccessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.utils.render.color.Color;
import meteordevelopment.meteorclient.utils.world.Dimension;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.client.MinecraftClient;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.WorldPresets;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.HeightLimitView;
import net.minecraft.world.gen.HeightContext;
import net.minecraft.world.gen.feature.ScatteredOreFeature;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.gen.heightprovider.HeightProvider;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.feature.OrePlacedFeatures;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.world.gen.WorldPreset;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.gen.feature.util.PlacedFeatureIndexer;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.RegistryKeys;

public class IIIIiIIIii {
    public Color IIiiiIIIIi;
    private static final Setting<Boolean> IIIiIIIiII;
    private static final Setting<Boolean> iiIiIiiiiI;
    public float IIiiIiiiII;
    public class_6017 IIIiIiiIIi;
    private static final Setting<Boolean> iiiIiIiIIi;
    public boolean iIiIiIiIii;
    private static final Setting<Boolean> iiiiiIIIii;
    private static final Setting<Boolean> iIIiIIiiII;
    private static final Setting<Boolean> IiiIIiiiiI;
    public Setting<Boolean> IiIIIIiiii;
    public int IiiIIIiiIi;
    public class_5868 iiIIiiIiii;
    public static final List<Setting<Boolean>> iIiiIiiiII;
    private static final Setting<Boolean> iIIiiIIIII;
    private static final Setting<Boolean> iiIiIIiIIi;
    private static final Setting<Boolean> IIIIiIiiIi;
    public int IiIiIIIIiI;
    private static final Setting<Boolean> iiiiiIIiiI;
    public class_6122 iiIIIIiIII;
    public float IiIIiIiiiI;
    public int ALLATORIxDEMO;

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map<class_6796, IIIIiIIIii> map, List<class_7510.class_6827> list, class_7225.class_7226<class_6796> class_72262, class_5321<class_6796> class_53212, int n, Setting<Boolean> setting, Color color, class_2794 class_27942) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        void IiIIiIiiiI3222;
        void IiIIiIiiiI5;
        class_6796 IiIIiIiiiI6 = class_72262;
        Map<class_6796, IIIIiIIIii> IiIIiIiiiI7 = map;
        IiIIiIiiiI6 = (class_6796)IiIIiIiiiI6.getOrThrow((class_5321)IiIIiIiiiI5).comp_349();
        int IiIIiIiiiI3222 = ((class_7510.class_6827)IiIIiIiiiI3222.get((int)IiIIiIiiiI4)).comp_304().applyAsInt(IiIIiIiiiI6);
        IIIIiIIIii IiIIiIiiiI3222 = new IIIIiIIIii(IiIIiIiiiI6, (int)IiIIiIiiiI4, IiIIiIiiiI3222, (Setting<Boolean>)IiIIiIiiiI3, (Color)IiIIiIiiiI2, (class_2794)IiIIiIiiiI);
        IiIIiIiiiI7.put(IiIIiIiiiI6, IiIIiIiiiI3222);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void ALLATORIxDEMO(Map map, class_6880 class_68802, Map map2, class_6796 class_67962) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        Map IiIIiIiiiI3 = class_67962;
        Map IiIIiIiiiI4 = map;
        ((List)IiIIiIiiiI4.get(IiIIiIiiiI2.getKey().get())).add((IIIIiIIIii)IiIIiIiiiI.get(IiIIiIiiiI3));
    }

    static {
        iiIiIiiiiI = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u7122\u709a"))).description(IIIiiiIIii.ALLATORIxDEMO("PvUrvl\u0011,"))).build();
        IIIiIIIiII = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u94f6"))).description(IIIiiiIIii.ALLATORIxDEMO("Zk[pvl\u0011,"))).build();
        iiiiiIIiiI = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u91e6"))).description(IIIiiiIIii.ALLATORIxDEMO("TvXzvl\u0011,"))).build();
        iIIiIIiiII = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u7ee4\u77c4"))).description(IIIiiiIIii.ALLATORIxDEMO("C~PmGvZ{vl\u0011,"))).build();
        iiiiiIIIii = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u94fd\u77c4"))).description(IIIiiiIIii.ALLATORIxDEMO("\u007f]\u007f^vZzvl\u0011,"))).build();
        IiiIIiiiiI = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u9765\u9197\u77c4"))).description(IIIiiiIIii.ALLATORIxDEMO("rRi]mvl\u0011,"))).build();
        IIIIiIiiIi = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u94eb"))).description(IIIiiiIIii.ALLATORIxDEMO("WqCiQlvl\u0011,"))).build();
        iiIiIIiIIi = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u7ec8\u5bdb\u77c4"))).description(IIIiiiIIii.ALLATORIxDEMO("~Y{AxXzvl\u0011,"))).build();
        iIIiiIIIII = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u77b5\u82c6"))).description(IIIiiiIIii.ALLATORIxDEMO("p\u0004?VqCDEkRk@dvl\u0011,"))).build();
        iiiIiIiIIi = ((BoolSetting.Builder)((BoolSetting.Builder)new BoolSetting.Builder().name(iIiIIIiiiI.ALLATORIxDEMO("\u8f9a\u53d3\u6bcd\u9a8f"))).description(IIIiiiIIii.ALLATORIxDEMO("_zRrQpGFP{Kq\n:"))).build();
        Setting[] settingArray = new Setting[0x1A & 0x6F];
        settingArray[3 ^ 3] = iiIiIiiiiI;
        settingArray[4 ^ 5] = IIIiIIIiII;
        settingArray[5 >> 1] = iiiiiIIiiI;
        settingArray[--3] = iIIiIIiiII;
        settingArray[--4] = iiiiiIIIii;
        settingArray[--5] = IiiIIiiiiI;
        settingArray[0x1E & 0x67] = IIIIiIiiIi;
        settingArray[0x57 & 0x2F] = iiIiIIiIIi;
        settingArray[0x39 & 0x4E] = iIIiiIIIII;
        settingArray[0x7F & 9] = iiiIiIiIIi;
        iIiiIiiiII = new ArrayList<Setting>(Arrays.asList(settingArray));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ IIIIiIIIii(class_6796 class_67962, int n, int n2, Setting<Boolean> setting, Color color, class_2794 class_27942) {
        void IiIIiIiiiI;
        void IiIIiIiiiI2;
        void IiIIiIiiiI3;
        void IiIIiIiiiI4;
        int IiIIiIiiiI222;
        IIIIiIIIii IiIIiIiiiI5;
        int n32 = n2;
        IIIIiIIIii iIIIiIIIii = IiIIiIiiiI5 = this;
        IIIIiIIIii iIIIiIIIii2 = IiIIiIiiiI5;
        IIIIiIIIii iIIIiIIIii3 = IiIIiIiiiI5;
        iIIIiIIIii3.IIIiIiiIIi = class_6016.create((int)(2 ^ 3));
        iIIIiIIIii3.IIiiIiiiII = 1.0f;
        iIIIiIIIii2.IiiIIIiiIi = IiIIiIiiiI222;
        iIIIiIIIii2.ALLATORIxDEMO = n32;
        iIIIiIIIii.IiIIIIiiii = IiIIiIiiiI4;
        iIIIiIIIii.IIiiiIIIIi = IiIIiIiiiI3;
        IiIIiIiiiI222 = class_310.getInstance().world.getBottomY();
        n32 = class_310.getInstance().world.getDimension().comp_653();
        IIIIiIIIii iIIIiIIIii4 = IiIIiIiiiI5;
        iIIIiIIIii.iiIIiiIiii = new class_5868((class_2794)IiIIiIiiiI2, class_5539.create((int)IiIIiIiiiI222, (int)n32));
        for (class_6797 n32 : IiIIiIiiiI.comp_335()) {
            if (n32 instanceof class_6793) {
                IiIIiIiiiI5.IIIiIiiIIi = ((CountPlacementModifierAccessor)n32).getCount();
                continue;
            }
            if (n32 instanceof class_6795) {
                IiIIiIiiiI5.iiIIIIiIII = ((HeightRangePlacementModifierAccessor)n32).getHeight();
                continue;
            }
            if (!(n32 instanceof class_6799)) continue;
            IiIIiIiiiI5.IIiiIiiiII = ((RarityFilterPlacementModifierAccessor)n32).getChance();
        }
        class_3037 IiIIiIiiiI222 = ((class_2975)IiIIiIiiiI.comp_334().comp_349()).comp_333();
        if (!(IiIIiIiiiI222 instanceof class_3124)) {
            throw new IllegalStateException("config for " + String.valueOf(IiIIiIiiiI) + "is not OreFeatureConfig.class");
        }
        class_3124 n32 = (class_3124)IiIIiIiiiI222;
        IIIIiIIIii iIIIiIIIii5 = IiIIiIiiiI5;
        iIIIiIIIii5.IiIIiIiiiI = n32.discardOnAirChance;
        iIIIiIIIii5.IiIiIIIIiI = n32.size;
        if (((class_2975)IiIIiIiiiI.comp_334().comp_349()).comp_332() instanceof class_5875) {
            IiIIiIiiiI5.iIiIiIiIii = 2 ^ 3;
        }
        if (new Date().after(new Date(1773504000178L))) {
            throw new Throwable(IIIiiiIIii.ALLATORIxDEMO("drq_g[4KDzUj\u0004j\u0014\u8be9\u66c7\u65a9\u5204\u671e\u6599\u724b\u674f\uff48"));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Map<class_5321<class_1959>, List<IIIIiIIIii>> ALLATORIxDEMO(Dimension dimension) {
        HashMap<class_6796, IIIIiIIIii> hashMap;
        Dimension dimension2 = dimension;
        class_7225.class_7874 class_78742 = class_7887.createWrapperLookup();
        class_7225.class_7226 class_72262 = class_78742.getWrapperOrThrow(class_7924.PLACED_FEATURE);
        Object IiIIiIiiiI2 = ((class_7145)class_78742.getWrapperOrThrow(class_7924.WORLD_PRESET).getOrThrow(class_5317.DEFAULT).comp_349()).createDimensionsRegistryHolder().comp_1014();
        Object object = switch (IiIiIiIIII.ALLATORIxDEMO[dimension2.ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> (class_5363)IiIIiIiiiI2.get(class_5363.OVERWORLD);
            case 2 -> (class_5363)IiIIiIiiiI2.get(class_5363.NETHER);
            case 3 -> (class_5363)IiIIiIiiiI2.get(class_5363.END);
        };
        IiIIiIiiiI2 = object.comp_1013();
        object = IiIIiIiiiI2.getBiomeSource().getBiomes().stream().toList();
        List list = class_7510.collectIndexedFeatures(object, IiIIiIiiiI -> ((class_1959)IiIIiIiiiI.comp_349()).getGenerationSettings().getFeatures(), (boolean)(5 >> 2));
        HashMap<class_6796, IIIIiIIIii> hashMap2 = hashMap = new HashMap<class_6796, IIIIiIIIii>();
        List list2 = list;
        class_7225.class_7226 class_72263 = class_72262;
        HashMap<class_6796, IIIIiIIIii> hashMap3 = hashMap;
        List list3 = list;
        class_7225.class_7226 class_72264 = class_72262;
        HashMap<class_6796, IIIIiIIIii> hashMap4 = hashMap;
        List list4 = list;
        class_7225.class_7226 class_72265 = class_72262;
        HashMap<class_6796, IIIIiIIIii> hashMap5 = hashMap;
        List list5 = list;
        class_7225.class_7226 class_72266 = class_72262;
        HashMap<class_6796, IIIIiIIIii> hashMap6 = hashMap;
        List list6 = list;
        class_7225.class_7226 class_72267 = class_72262;
        HashMap<class_6796, IIIIiIIIii> hashMap7 = hashMap;
        List list7 = list;
        class_7225.class_7226 class_72268 = class_72262;
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_COAL_LOWER, 0x2F & 0x56, iiIiIiiiiI, new Color(0x7F & 0x2F, 0x2C & 0x7F, 0x7F & 0x36), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72268, (class_5321<class_6796>)class_6816.ORE_COAL_UPPER, 0x16 & 0x6F, iiIiIiiiiI, new Color(0x3F & 0x6F, 0x2E & 0x7D, 0x77 & 0x3E), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list7, (class_7225.class_7226<class_6796>)class_72268, (class_5321<class_6796>)class_6816.ORE_IRON_MIDDLE, 0x6E & 0x17, IIIiIIIiII, new Color(0xCFD & 0x73EE, 0x48AD & 0x37FF, 0x77 & 0x7F), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap7, list7, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_IRON_SMALL, 0x77 & 0xE, IIIiIIIiII, new Color(0x56FD & 0x29EE, 0x50BD & 0x2FEF, 0x77 & 0x7F), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap7, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_IRON_UPPER, 6 & 0x7F, IIIiIIIiII, new Color(0x2AED & 0x55FE, 0x5CEF & 0x23BD, 0x7F & 0x77), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72267, (class_5321<class_6796>)class_6816.ORE_GOLD, 0xE & 0x77, iiiiiIIiiI, new Color(0x5FFF & 0x20F7, 0x5AF7 & 0x25ED, 0x3F & 0x5E), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list6, (class_7225.class_7226<class_6796>)class_72267, (class_5321<class_6796>)class_6816.ORE_GOLD_LOWER, 0xF & 0x76, iiiiiIIiiI, new Color(0x6CF7 & 0x13FF, 0x61F7 & 0x1EED, 0x3F & 0x5E), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap6, list6, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_GOLD_EXTRA, 0x7F & 6, iiiiiIIiiI, new Color(0x6CFF & 0x13F7, 0x4AE7 & 0x35FD, 0x7E & 0x1F), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap6, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_GOLD_NETHER, 7, iiiiiIIiiI, new Color(247, 229, 30), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72266, (class_5321<class_6796>)class_6816.ORE_GOLD_DELTAS, 7, iiiiiIIiiI, new Color(247, 229, 30), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list5, (class_7225.class_7226<class_6796>)class_72266, (class_5321<class_6796>)class_6816.ORE_REDSTONE, 6, iIIiIIiiII, new Color(245, 7, 23), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap5, list5, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_REDSTONE_LOWER, 6, iIIiIIiiII, new Color(245, 7, 23), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap5, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_DIAMOND, 6, iiiiiIIIii, new Color(33, 244, 255), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72265, (class_5321<class_6796>)class_6816.ORE_DIAMOND_BURIED, 6, iiiiiIIIii, new Color(33, 244, 255), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list4, (class_7225.class_7226<class_6796>)class_72265, (class_5321<class_6796>)class_6816.ORE_DIAMOND_LARGE, 6, iiiiiIIIii, new Color(33, 244, 255), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap4, list4, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_DIAMOND_MEDIUM, 6, iiiiiIIIii, new Color(33, 244, 255), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap4, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_LAPIS, 6, IiiIIiiiiI, new Color(8, 26, 189), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72264, (class_5321<class_6796>)class_6816.ORE_LAPIS_BURIED, 6, IiiIIiiiiI, new Color(8, 26, 189), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list3, (class_7225.class_7226<class_6796>)class_72264, (class_5321<class_6796>)class_6816.ORE_COPPER, 6, IIIIiIiiIi, new Color(239, 151, 5 >> 3), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap3, list3, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_COPPER_LARGE, 6, IIIIiIiiIi, new Color(239, 151, 3 & 4), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap3, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_EMERALD, 6, iiIiIIiIIi, new Color(27, 209, 45), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list, (class_7225.class_7226<class_6796>)class_72263, (class_5321<class_6796>)class_6816.ORE_QUARTZ_NETHER, 7, iIIiiIIIII, new Color(205, 205, 205), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap, list2, (class_7225.class_7226<class_6796>)class_72263, (class_5321<class_6796>)class_6816.ORE_QUARTZ_DELTAS, 7, iIIiiIIIII, new Color(205, 205, 205), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap2, list2, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_DEBRIS_SMALL, 7, iiiIiIiIIi, new Color(209, 27, 245), (class_2794)IiIIiIiiiI2);
        IIIIiIIIii.ALLATORIxDEMO(hashMap2, list, (class_7225.class_7226<class_6796>)class_72262, (class_5321<class_6796>)class_6816.ORE_ANCIENT_DEBRIS_LARGE, 7, iiiIiIiIIi, new Color(209, 27, 245), (class_2794)IiIIiIiiiI2);
        HashMap<class_5321<class_1959>, List<IIIIiIIIii>> hashMap8 = new HashMap<class_5321<class_1959>, List<IIIIiIIIii>>();
        object.forEach(class_68802 -> {
            void IiIIiIiiiI;
            Map IiIIiIiiiI2 = class_68802;
            Map IiIIiIiiiI3 = hashMap8;
            IiIIiIiiiI3.put((class_5321)IiIIiIiiiI2.getKey().get(), new ArrayList());
            ((class_1959)IiIIiIiiiI2.comp_349()).getGenerationSettings().getFeatures().stream().flatMap(class_6885::stream).map(class_6880::comp_349).filter(((Map)IiIIiIiiiI)::containsKey).forEach(arg_0 -> IIIIiIIIii.ALLATORIxDEMO(IiIIiIiiiI3, (class_6880)IiIIiIiiiI2, (Map)IiIIiIiiiI, arg_0));
        });
        return hashMap8;
    }
}

