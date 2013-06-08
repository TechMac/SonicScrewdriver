package sonic.client;


import sonic.common.BrassOre;
import sonic.common.CreativeTab;
import sonic.common.Dalekanium;
import sonic.common.FishFingerAndCustard;
import sonic.common.GalvanizedMetal;
import sonic.common.HandleBlue;
import sonic.common.HandleGreen;
import sonic.common.IngotBrass;
import sonic.common.IronGrip;
import sonic.common.ItemBattery;
import sonic.common.ItemBlackLeather;
import sonic.common.ItemCircuit;
import sonic.common.ItemCrystal;
import sonic.common.ItemSonicScrewdriver;
import sonic.common.ItemTardisKey;
import sonic.common.ItemTin;
import sonic.common.ItemUpgradeFreeze;
import sonic.common.ItemUpgradeTardisCall;
import sonic.common.ItemUpgradeTransform;
import sonic.common.ItemUpgradeWrench;
import sonic.common.JammieDodger;
import sonic.common.MechaliteOre;
import sonic.common.MoldingTool;
import sonic.common.ProtoSonicScrewdriver;
import sonic.common.QuantumQuattroOre;
import sonic.common.UpgardeRedstone;
import sonic.common.UpgradeCalc;
import sonic.common.UpgradeChest;
import sonic.common.UpgradeChestUpgrade;
import sonic.common.UpgradeCrafting;
import sonic.common.UpgradeCraftingUpgrade;
import sonic.common.UpgradeCreative;
import sonic.common.UpgradeDamage;
import sonic.common.UpgradeDoor;
import sonic.common.UpgradeEnchanting;
import sonic.common.UpgradeFall;
import sonic.common.UpgradeFertilizer;
import sonic.common.UpgradeFirewall;
import sonic.common.UpgradeFlashlight;
import sonic.common.UpgradeLand;
import sonic.common.UpgradeLightning;
import sonic.common.UpgradeLock;
import sonic.common.UpgradeMagic;
import sonic.common.UpgradeProjectile;
import sonic.common.UpgradeRotate;
import sonic.common.UpgradeScanning;
import sonic.common.UpgradeShield;
import sonic.common.UpgradeToggler;
import sonic.common.ValonCrystal;
import sonic.common.WorldGeneratorMoreMaterialsExpansion;
import sonic.common.oreTin;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "SonicScrewdriver", name = "Sonic Screwdriver", version = "v0.2")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Container {

	public static CreativeTabs SonicScrewdriver = new CreativeTab(CreativeTabs.getNextID(), "Sonic Screwdriver");
	
	
	
	
	//items
	public static Item sonicScrewdriver;
	public static Item Upgrade2;
	public static Item TardisKey;
	public static Item Upgrade3;
	public static Item Upgrade4;
	public static Item Upgrade5;
	public static Item Upgrade6;
	public static Item Upgrade7;
	public static Item Upgrade8;
	public static Item Upgrade9;
	public static Item Upgrade10;
	public static Item Upgrade11;
	public static Item Upgrade12;
	public static Item Upgrade13;
	public static Item Upgrade14;
	public static Item Upgrade15;
	public static Item Upgrade16;
	public static Item Upgrade17;
	public static Item Upgrade18;
	public static Item Upgrade19;
	public static Item Upgrade20;
	public static Item Upgrade21;
	public static Item Upgrade22;
	public static Item Upgrade23;
	public static Item UpgradeCalc;
	public static Item UpgradeFirewall;
	public static Item UpgradeLand;
	public static Item UpgradeFall;
	
	
	
	public static Item Crystal;
	public static Item UpgradeCreative;
	public static Item ProtoSonic;
	public static Item Brass;
	public static Item QuantumQuattro;
	public static Block QuantumQuattroOre;
	public static Item HandleBlue;
	public static Item IronGrip;
	public static Item GalvanizedIron;
	public static Item FishCustard;
	public static Item MoldingTool;
	public static Item Circuit;
	public static Item Battery;
	public static Item BlackLeather;
	public static Item Dalekanium;
	public static Item HandleGreen;
	public static Item Tin;
	public static Item Dodger;
	public static Item SmartCircuit;


	
	
	
	//blocks
	
	public static Block MechaliteOre;
	public static Block BrassOre;
	public static Block TinOre;

	

	//item ID's
	public int sonicScrewdriverID = 1000;
	public int TardisKeyID = 1001;
	public int Upgrade2ID = 1002;
	public int Upgrade3ID = 1003;
	public int Upgrade4ID = 1004;
	public int Upgrade5ID = 1005;
	public int Upgrade6ID = 1006;
	public int Upgrade7ID = 1007;
	public int Upgrade8ID = 1008;
	public int Upgrade9ID = 1009;
	public int Upgrade11ID = 1011;
	public int Upgrade10ID = 1010;
	public int Upgrade12ID = 1012;
	public int Upgrade13ID = 1013;
	public int Upgrade14ID = 1014;
	public int Upgrade15ID = 1015;
	public int Upgrade16ID = 1016;
	public int Upgrade17ID = 1017;
	public int Upgrade18ID = 1018;
	public int Upgrade19ID = 1019;
	public int Upgrade20ID = 1020;
	public int Upgrade21ID = 1021;
	public int Upgrade22ID = 1022;
	public int Upgrade23ID = 1023;
	public int UpgradeCalcID = 1024;
	public int UpgradeFireWallID = 1025;
	public int UpgradeLandID = 1026;
	public int UpgradeFallID = 1027;
	
	
	
	public int CrystalID = 1029;
	public int UpgradeCreativeID = 1030;
	public int MechaliteOreID = 1031;
	public int ProtoSonicID = 1032;
	public int BrassOreID = 1033;
	public int BrassID = 1034;
	public int QuantumQuattroID = 1035;
	public int QuantumQuattroOreID = 1036;
	public int HandleBlueID = 1037;
	public int IronGripID = 1038;
	public int GalvanizedIronID = 1039;
	public int FishCustardID = 1040;
	public int MoldingToolID = 1041;
	public int CircuitID = 1042;
	public int BatteryID = 1043;
	public int BlackLeatherID = 1044;
	public int DalekaniumID = 1045;
	public int HandleGreenID = 1046;
	public int TinID = 1047;
	public int DodgerID = 1048;
	public int TinOreID = 1049;
	public int SmartCircuitID = 1052;
			
			
	
	
	
	@Init
	public void load (FMLInitializationEvent event) {
		
		//add items here:
		sonicScrewdriver = new ItemSonicScrewdriver(sonicScrewdriverID).setUnlocalizedName("Sonic Screwdriver").setCreativeTab(this.SonicScrewdriver).setFull3D();
		TardisKey = new ItemTardisKey(TardisKeyID).setUnlocalizedName("Tardis Key").setCreativeTab(this.SonicScrewdriver);
		Upgrade2 = new ItemUpgradeTardisCall(Upgrade2ID).setUnlocalizedName("Upgrade Tardis Call").setCreativeTab(this.SonicScrewdriver);
		Upgrade3 = new ItemUpgradeWrench(Upgrade3ID).setUnlocalizedName("Upgrade Mod Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade4 = new ItemUpgradeFreeze(Upgrade4ID).setUnlocalizedName("Upgrade Freeze Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade5 = new ItemUpgradeTransform(Upgrade5ID).setUnlocalizedName("Upgrade Transform Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade6 = new UpgradeDoor(Upgrade6ID).setUnlocalizedName("Upgrade Door Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade7 = new UpgradeDamage(Upgrade7ID).setUnlocalizedName("Upgrade Damage Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade8 = new UpgardeRedstone(Upgrade8ID).setUnlocalizedName("Upgrade Redstone Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade9 = new UpgradeScanning(Upgrade9ID).setUnlocalizedName("Upgrade Scanning Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade10 = new UpgradeProjectile(Upgrade10ID).setUnlocalizedName("Upgrade Projectile Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade11 = new UpgradeChest(Upgrade11ID).setUnlocalizedName("Upgrade Chest Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade12 = new UpgradeChestUpgrade(Upgrade12ID).setUnlocalizedName("Upgrade ChestUpgrade Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade13 = new UpgradeEnchanting(Upgrade13ID).setUnlocalizedName("Upgrade Enchanting Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade14 = new UpgradeFlashlight(Upgrade14ID).setUnlocalizedName("Upgrade Flashlight Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade15 = new UpgradeMagic(Upgrade15ID).setUnlocalizedName("Upgrade Magicwand Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade16 = new UpgradeRotate(Upgrade16ID).setUnlocalizedName("Upgrade Rotate Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade17 = new UpgradeShield(Upgrade17ID).setUnlocalizedName("Upgrade Shield Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade18 = new UpgradeCrafting(Upgrade18ID).setUnlocalizedName("Upgrade Crafting Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade19 = new UpgradeCraftingUpgrade(Upgrade19ID).setUnlocalizedName("Upgrade AutoCrafting Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade20 = new UpgradeToggler(Upgrade20ID).setUnlocalizedName("Upgrade Toggler Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade21 = new UpgradeLock(Upgrade21ID).setUnlocalizedName("Upgrade Lock Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade22 = new UpgradeFertilizer(Upgrade22ID).setUnlocalizedName("Upgrade Fertilizer Module").setCreativeTab(this.SonicScrewdriver);
		Upgrade23 = new UpgradeLightning(Upgrade23ID).setUnlocalizedName("Upgrade Lightning Module").setCreativeTab(this.SonicScrewdriver);
		UpgradeCalc = new UpgradeCalc(UpgradeCalcID).setUnlocalizedName("Upgrade Calculator Module").setCreativeTab(this.SonicScrewdriver);
		UpgradeFirewall = new UpgradeFirewall(UpgradeFireWallID).setUnlocalizedName("Upgrade Firewall Module").setCreativeTab(this.SonicScrewdriver);
		UpgradeLand = new UpgradeLand(UpgradeLandID).setUnlocalizedName("Upgrade Landscape Module").setCreativeTab(this.SonicScrewdriver);
		UpgradeFall = new UpgradeFall(UpgradeFallID).setUnlocalizedName("Upgrade No Fall Module").setCreativeTab(this.SonicScrewdriver);
		
		
		
		UpgradeCreative = new UpgradeCreative(UpgradeCreativeID).setUnlocalizedName("Upgrade Creative Module").setCreativeTab(this.SonicScrewdriver);
		MechaliteOre = new MechaliteOre(MechaliteOreID, Material.iron).setUnlocalizedName("Mechalite Ore").setCreativeTab(this.SonicScrewdriver).setHardness(1000F).setResistance(1000);
		ProtoSonic = new ProtoSonicScrewdriver(ProtoSonicID).setUnlocalizedName("Proto Sonic Screwdriver").setCreativeTab(this.SonicScrewdriver);
		Crystal = new ItemCrystal(CrystalID).setUnlocalizedName("Mechalite Crystal").setCreativeTab(this.SonicScrewdriver);
		BrassOre = new BrassOre(BrassOreID, Material.iron).setUnlocalizedName("Brass Ore").setCreativeTab(this.SonicScrewdriver).setHardness(1000F).setResistance(1000);
		Brass = new IngotBrass(BrassID).setUnlocalizedName("Brass Ingot").setCreativeTab(this.SonicScrewdriver);
		QuantumQuattro = new ValonCrystal(QuantumQuattroID).setUnlocalizedName("Quantum Quattro").setCreativeTab(this.SonicScrewdriver);
		HandleBlue = new HandleBlue(HandleBlueID).setUnlocalizedName("Handle").setCreativeTab(this.SonicScrewdriver);
		QuantumQuattroOre = new QuantumQuattroOre(QuantumQuattroOreID, Material.iron).setUnlocalizedName("Quantum Quattro Ore").setCreativeTab(this.SonicScrewdriver).setHardness(1000F).setResistance(1000);
		IronGrip = new IronGrip(IronGripID).setUnlocalizedName("Iron Grip").setCreativeTab(this.SonicScrewdriver);
		GalvanizedIron = new GalvanizedMetal(GalvanizedIronID).setUnlocalizedName("Galvanized Iron").setCreativeTab(this.SonicScrewdriver);
		FishCustard = new FishFingerAndCustard(FishCustardID, 14, false).setUnlocalizedName("Fish Fingers And Custard").setCreativeTab(this.SonicScrewdriver);
		MoldingTool = new MoldingTool(MoldingToolID).setUnlocalizedName("Molding Tool").setCreativeTab(this.SonicScrewdriver);
		Circuit = new ItemCircuit(CircuitID).setUnlocalizedName("Circuit").setCreativeTab(this.SonicScrewdriver);
		Battery = new ItemBattery(BatteryID).setUnlocalizedName("Battery").setCreativeTab(this.SonicScrewdriver);
		BlackLeather = new ItemBlackLeather(BlackLeatherID).setUnlocalizedName("Black Leather").setCreativeTab(this.SonicScrewdriver);
		Dalekanium = new Dalekanium(DalekaniumID).setUnlocalizedName("Dalekanium").setCreativeTab(this.SonicScrewdriver);
		HandleGreen = new HandleGreen(HandleGreenID).setUnlocalizedName("Handle").setCreativeTab(this.SonicScrewdriver);
		Tin = new ItemTin(TinID).setUnlocalizedName("Tin Ingot").setCreativeTab(this.SonicScrewdriver);
		Dodger = new JammieDodger(DodgerID, 12, false).setUnlocalizedName("Jammie Dodger").setCreativeTab(this.SonicScrewdriver);
		TinOre = new oreTin(TinOreID, Material.iron).setUnlocalizedName("Tin Ore").setCreativeTab(this.SonicScrewdriver);

		
		
		
		
		
		//Crafting
//		CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(new ItemStack(Item.appleGold, 1), true, new Object[]{
//			"" +
//			"TCT", 
//			"CCC", 
//			"TCT", 
//			Character.valueOf('C'), Crystal, Character.valueOf('T'), Item.book
//				}));

		
		GameRegistry.addRecipe(new ItemStack(sonicScrewdriver, 1), new Object []{
			"TTX", 
			"PNP", 
			"GIT", Character.valueOf('X'), Crystal, Character.valueOf('P'), Brass, Character.valueOf('G'), ProtoSonic, Character.valueOf('N'), Item.netherStar, Character.valueOf('I'), IronGrip
			
	});
		GameRegistry.addRecipe(new ItemStack(ProtoSonic, 1), new Object []{
			"TTX", 
			"PNP", 
			"HTT", Character.valueOf('X'), QuantumQuattro, Character.valueOf('P'), Brass, Character.valueOf('H'), HandleBlue, Character.valueOf('N'), IronGrip
			
	});
		

		
		GameRegistry.addShapelessRecipe(new ItemStack(Item.appleGold, 2), new Object []{
			Item.appleRed, Item.bread, Item.diamond
			
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(TardisKey, 1), new Object []{
			MoldingTool, GalvanizedIron, Item.diamond
			
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Dodger, 4), new Object []{
			Item.bucketMilk, Item.appleRed, Item.wheat
			
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(FishCustard, 2), new Object []{
			Item.fishCooked, Item.wheat, Item.bowlSoup
			
		});
		
		
		
		
		
		
		
		
		gameRegisters();
		languageRegisters();
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorMoreMaterialsExpansion());
	}
	


	private void languageRegisters() {
		GameRegistry.registerItem(sonicScrewdriver, "Sonic Screwdriver");
		GameRegistry.registerItem(TardisKey, "Tardis Key");
		GameRegistry.registerItem(Upgrade2, "Upgrade Call Tardis");
		GameRegistry.registerItem(Upgrade3, "Upgrade Mod Module");
		GameRegistry.registerItem(Upgrade4, "Upgrade Freeze Module");
		GameRegistry.registerItem(Upgrade5, "Upgrade Transform Module");
		GameRegistry.registerItem(Upgrade6, "Upgrade Door Module");
		GameRegistry.registerItem(Upgrade7, "Upgrade Damage Module");
		GameRegistry.registerItem(Upgrade8, "Upgrade Redstone Module");
		GameRegistry.registerItem(Upgrade9, "Upgrade Scanning Module");
		GameRegistry.registerItem(Upgrade11, "Upgrade Chest Module");
		GameRegistry.registerItem(Upgrade10, "Upgrade Projectile Module");
		GameRegistry.registerItem(Upgrade12, "Upgrade Chestupgrade");
		GameRegistry.registerItem(Upgrade13, "Upgrade Enchanting Module");
		GameRegistry.registerItem(Upgrade14, "Upgrade Flashlight Module");
		GameRegistry.registerItem(Upgrade15, "Upgrade Magicwand Module");
		GameRegistry.registerItem(Upgrade16, "Upgrade Rotate Module");
		GameRegistry.registerItem(Upgrade17, "Upgrade Shield Module");
		GameRegistry.registerItem(Upgrade18, "Upgrade Crafting Module");
		GameRegistry.registerItem(Upgrade19, "Upgrade Crafting Upgrade Module");
		GameRegistry.registerItem(Upgrade20, "Upgrade Toggler Module");
		GameRegistry.registerItem(Upgrade21, "Upgrade Lock Module");
		GameRegistry.registerItem(Upgrade22, "Upgrade Ferstilizer Module");
		GameRegistry.registerItem(UpgradeLand, "Upgrade Landscape Module");
		GameRegistry.registerItem(UpgradeFall, "Upgrade No Fall Module");
		GameRegistry.registerBlock(MechaliteOre, "Mechalite Ore");
		GameRegistry.registerItem(ProtoSonic, "Proto Sonic Screwdriver");
		GameRegistry.registerItem(UpgradeCreative, "Upgrade Creative Module");
		GameRegistry.registerItem(Crystal, "Mechalite Crystal");
		GameRegistry.registerItem(Upgrade23, "Upgrade Lightning Module");
		GameRegistry.registerItem(UpgradeCalc, "Upgrade Calculator Module");
		GameRegistry.registerItem(UpgradeFirewall, "Upgrade Firewall Module");
		GameRegistry.registerBlock(BrassOre, "Brass Ore");
		GameRegistry.registerItem(Brass, "Brass Ingot");
		GameRegistry.registerItem(QuantumQuattro, "Quantum Quattro");
		GameRegistry.registerBlock(QuantumQuattroOre, "Quantum Quattro Ore");
		GameRegistry.registerItem(HandleBlue, "Handle Blue");
		GameRegistry.registerItem(IronGrip, "Iron Grip");
		GameRegistry.registerItem(GalvanizedIron, "Galvanized Iron");
		GameRegistry.registerItem(FishCustard, "Fish Fingers And Custard");
		GameRegistry.registerItem(Circuit, "Circuit");
		GameRegistry.registerItem(Battery, "Battery");
		GameRegistry.registerItem(BlackLeather, "Black Leather");
		GameRegistry.registerItem(Dalekanium, "Dalekanium");
		GameRegistry.registerItem(HandleGreen, "Handle Green");
		GameRegistry.registerItem(Tin, "Tin Ingot");
		GameRegistry.registerItem(Dodger, "Jammie Dodger");
		GameRegistry.registerBlock(TinOre, "Tin Ore");
			

		
		
		
		
	}

	private void gameRegisters() {
		LanguageRegistry.addName(sonicScrewdriver, "Sonic Screwdriver");
		LanguageRegistry.addName(TardisKey, "Tardis Key");
		LanguageRegistry.addName(Upgrade2, "Upgrade Call Tardis");
		LanguageRegistry.addName(Upgrade3, "Upgrade Mod Module");
		LanguageRegistry.addName(Upgrade4, "Upgrade Freeze Module");
		LanguageRegistry.addName(Upgrade5, "Upgrade Transform Module");
		LanguageRegistry.addName(Upgrade6, "Upgrade Door Module");
		LanguageRegistry.addName(Upgrade7, "Upgrade Damage Module");
		LanguageRegistry.addName(Upgrade8, "Upgrade Redstone Module");
		LanguageRegistry.addName(Upgrade9, "Upgrade Scanning Module");
		LanguageRegistry.addName(Upgrade11, "Upgrade Chest Module");
		LanguageRegistry.addName(Upgrade10, "Upgrade Projectile Module");
		LanguageRegistry.addName(Upgrade12, "Upgrade ChestUpgrade");
		LanguageRegistry.addName(Upgrade13, "Upgrade Enchanting Module");
		LanguageRegistry.addName(Upgrade14, "Upgrade Flashlight Module");
		LanguageRegistry.addName(Upgrade15, "Upgrade Magicwand Module");
		LanguageRegistry.addName(Upgrade16, "Upgrade Rotate Module");
		LanguageRegistry.addName(Upgrade17, "Upgrade Shield Module");
		LanguageRegistry.addName(Upgrade18, "Upgrade Crafting Module");
		LanguageRegistry.addName(Upgrade19, "Upgrade Crafting Upgrade Module");
		LanguageRegistry.addName(Upgrade20, "Upgrade Toggler Module");
		LanguageRegistry.addName(Upgrade21, "Upgrade Lock Module");
		LanguageRegistry.addName(Upgrade22, "Upgrade Fertilizer Module");
		LanguageRegistry.addName(Upgrade23, "Upgrade Lightning Module");
		LanguageRegistry.addName(UpgradeCalc, "Upgrade Calculator Module");
		LanguageRegistry.addName(UpgradeFirewall, "Upgrade Firewall Module");
		
		
		
		LanguageRegistry.addName(BrassOre, "Brass Ore");
		LanguageRegistry.addName(Brass, "Brass Ingot");
		LanguageRegistry.addName(MechaliteOre, "Mechalite Ore");
		LanguageRegistry.addName(ProtoSonic, "Proto Sonic Screwdriver");
		LanguageRegistry.addName(UpgradeCreative, "Upgrade Creative");
		LanguageRegistry.addName(Crystal, "Mechalite Crystal");
		LanguageRegistry.addName(QuantumQuattro, "Quantum Quattro");
		LanguageRegistry.addName(HandleBlue, "Handle Blue");
		LanguageRegistry.addName(IronGrip, "Iron Grip");
		LanguageRegistry.addName(GalvanizedIron, "Galvanized Iron");
		LanguageRegistry.addName(FishCustard, "Fish Fingers And Custard");
		LanguageRegistry.addName(MoldingTool, "Molding Tool");
		LanguageRegistry.addName(QuantumQuattroOre, "Quantum Quattro Ore");
		LanguageRegistry.addName(Circuit, "Circuit");
		LanguageRegistry.addName(Battery, "Battery");
		LanguageRegistry.addName(BlackLeather, "Black Leather");
		LanguageRegistry.addName(Dalekanium, "Dalekanium");
		LanguageRegistry.addName(HandleGreen, "Handle Green");
		LanguageRegistry.addName(Tin, "Tin Ingot");
		LanguageRegistry.addName(Dodger, "Jammie Dodger");
		LanguageRegistry.addName(TinOre, "Tin Ore");

		
		
	}
	
}
	
	

