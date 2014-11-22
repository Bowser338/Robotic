package com.bowser.robotic.common;

import java.awt.Color;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.bowser.robotic.common.blocks.BlockElectricCable;
import com.bowser.robotic.common.blocks.BlockPipeTest;
import com.bowser.robotic.common.blocks.BoisResine;
import com.bowser.robotic.common.blocks.ChargeurSansNoyauBlock;
import com.bowser.robotic.common.blocks.FeuillesResine;
import com.bowser.robotic.common.blocks.FourArcBlock;
import com.bowser.robotic.common.blocks.LithiumOre;
import com.bowser.robotic.common.blocks.OreCuivre;
import com.bowser.robotic.common.blocks.OreManganese;
import com.bowser.robotic.common.blocks.OreSilicium;
import com.bowser.robotic.common.blocks.OreTungstene;
import com.bowser.robotic.common.blocks.PousseResine;
import com.bowser.robotic.common.entity.EntityGuardian;
import com.bowser.robotic.common.gen.WorldGeneration;
import com.bowser.robotic.common.gen.WorldGeneratorCopper;
import com.bowser.robotic.common.items.Battery;
import com.bowser.robotic.common.items.CopperIngot;
import com.bowser.robotic.common.items.ExoSqueletteBase;
import com.bowser.robotic.common.items.LithiumDust;
import com.bowser.robotic.common.items.MKIISword;
import com.bowser.robotic.common.items.MKISword;
import com.bowser.robotic.common.items.ManganeseChunk;
import com.bowser.robotic.common.items.SiliciumIngot;
import com.bowser.robotic.common.items.SuBattery;
import com.bowser.robotic.common.items.TungsteneIngot;
import com.bowser.robotic.common.tileentity.TileEntityBlockPipeTest;
import com.bowser.robotic.common.tileentity.TileEntityChargeurAvecNoyau;
import com.bowser.robotic.common.tileentity.TileEntityChargeurSansNoyau;
import com.bowser.robotic.common.tileentity.TileEntityFourArc;
import com.bowser.robotic.proxy.CommonProxy;
import com.bowser.robotic.proxy.GuiHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "roboticmod", name = "Mod Robotic", version = "1.0.0" )

public class Robotic
{

public static final String modid = "roboticmod";
    
    @Instance("roboticmod")
    public static Robotic instance;
    
    @SidedProxy(clientSide = "com.bowser.robotic.proxy.ClientProxy", serverSide = "com.bowser.robotic.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    
    //ExoSquelette 
    public static Item exoSqueletteBaseTorse;
    public static Item exoSqueletteBaseLegs;
    public static Item exoSqueletteBaseHelmet;
    
    
    //blocks
    public static Block cuivreOre;
    public static Block blockCable;
    public static Block boisResine;
    public static Block feuillesResine;
    public static Block pousseResine;
    public static Block fourArc;
    public static Block lithiumOre;
    public static Block chargeurSansNoyau;
    public static Block siliciumOre;
    public static Block pipetest;
    public static Block tungsteneOre;
    public static Block manganeseOre;
    
    
    public static CreativeTabs baseRoboticCreativeTabs = new baseRoboticCreativeTabs("base_creative_tab"); //.setBackgroundImageName("robotic_mod")
    
    //items 
    public static Item copperIngot;
    public static Item lithiumDust;
    public static Item manganeseChunk;
    public static Item tungsteneIngot;
    public static Item siliciumIngot;
    public static Item battery;
    public static Item suBattery;
    public static Item tungsteneStick;
    public static Item tungstenePickaxe;
    
    //MK tech
    public static Item MKIsword;
    public static ToolMaterial toolMKIsword = EnumHelper.addToolMaterial("MKItool", 0, 400, 0.0F, 1.0F, 0);
    public static Item MKIIsword;
    public static ToolMaterial toolMKIIsword = EnumHelper.addToolMaterial("MKIItool", 0, 400, 0.0F, 1.0F, 0);
    public static Item MKIIIsword;
    public static ToolMaterial toolMKIIIsword = EnumHelper.addToolMaterial("MKIIItool", 0, 400, 0.0F, 1.0F, 0);


    //tungstene tool
    public static ToolMaterial toolTungstene = EnumHelper.addToolMaterial("tungstenetool", 3, 4000, 10.0F, 4.0F, 0);

    


    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
        //Armures
        //MKI
        ArmorMaterial exosqulettebase = EnumHelper.addArmorMaterial("exosqulettebase", 25, new int[] {6, 6, 6}, 0);
        exoSqueletteBaseHelmet = new ExoSqueletteBase(exosqulettebase, 1, 0).setUnlocalizedName("custom_helm");
        exoSqueletteBaseTorse = new ExoSqueletteBase(exosqulettebase, 1, 1).setUnlocalizedName("custom_chest");
        exoSqueletteBaseLegs = new ExoSqueletteBase(exosqulettebase, 1, 2).setUnlocalizedName("custom_legs");
        GameRegistry.registerItem(exoSqueletteBaseHelmet, "custom_helm");
        GameRegistry.registerItem(exoSqueletteBaseTorse, "custom_chest");
        GameRegistry.registerItem(exoSqueletteBaseLegs, "custom_legs");
        
        //MKII

        
        //Tungstene Outils
        
        tungstenePickaxe = new TungstenePickaxe(toolTungstene).setUnlocalizedName("pickaxetungstene").setTextureName(modid + ":tungstene_pickaxe");
        GameRegistry.registerItem(tungstenePickaxe, "tungstene_pickaxe");
        
        
        
        //Blocks
        cuivreOre = new OreCuivre(Material.rock).setBlockName("cuivreore").setBlockTextureName("roboticmod:orecuivre").setCreativeTab(Robotic.baseRoboticCreativeTabs).setHardness(3.0F).setResistance(5.0F);
        GameRegistry.registerBlock(cuivreOre, "block_cuivre");
        
        manganeseOre = new OreManganese(Material.rock).setBlockName("manganeseore").setBlockTextureName("roboticmod:manganese_ore").setCreativeTab(Robotic.baseRoboticCreativeTabs).setHardness(3.0F).setResistance(5.0F);
        GameRegistry.registerBlock(manganeseOre, "block_manganese");
        
        tungsteneOre = new OreTungstene(Material.rock).setBlockName("tungsteneore").setBlockTextureName("roboticmod:oretungstene").setCreativeTab(Robotic.baseRoboticCreativeTabs).setHardness(5.0F).setResistance(10.0F);
        GameRegistry.registerBlock(tungsteneOre, "block_tungstene");
        
        siliciumOre = new OreSilicium(Material.rock).setBlockName("siliciumore").setBlockTextureName("roboticmod:oresilicium").setCreativeTab(Robotic.baseRoboticCreativeTabs).setHardness(5.0F).setResistance(7.0F);
        GameRegistry.registerBlock(siliciumOre, "block_siliciumore");
        
        lithiumOre = new LithiumOre(Material.rock).setBlockName("lithiumore").setBlockTextureName("roboticmod:orelithium").setCreativeTab(Robotic.baseRoboticCreativeTabs).setHardness(2.0F).setResistance(5.0F);
        GameRegistry.registerBlock(lithiumOre, "block_lithium");
        
            //blocks+techne
        fourArc = new FourArcBlock(Material.rock, false).setBlockName("fourarc").setBlockTextureName("roboticmod:fourarcbreak").setCreativeTab(Robotic.baseRoboticCreativeTabs).setHardness(3.0F).setResistance(5.0F);
        GameRegistry.registerBlock(fourArc, "four_arc");
        
        chargeurSansNoyau = new ChargeurSansNoyauBlock(Material.rock).setBlockName("chargeursansnoyau").setBlockTextureName("roboticmod:chargeursansnoyau").setCreativeTab(Robotic.baseRoboticCreativeTabs).setHardness(3.0F).setResistance(5.0F);
        GameRegistry.registerBlock(chargeurSansNoyau, "chargeur_sans_noyau");
        

        pipetest = new BlockPipeTest(Material.rock).setBlockName("pipetest").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        GameRegistry.registerBlock(pipetest, "block_pipetest");
        //GameRegistry.registerBlock(pipetest, ItemBlockPipeMetadataTest.class, "block_tuto_metadata");
        
        
        blockCable = new BlockElectricCable().setBlockName("blockPipe").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        GameRegistry.registerBlock(blockCable, "block_cable");
        
        
        //arbre de Resine
        boisResine = new BoisResine().setBlockTextureName("roboticmod:resine_bois").setBlockName("resine_bois").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        feuillesResine = new FeuillesResine().setBlockTextureName("roboticmod:feuilles").setBlockName("resine_feuilles").setCreativeTab(CreativeTabs.tabDecorations); 
        pousseResine = new PousseResine().setBlockTextureName("roboticmod:pousse").setBlockName("resine_pousse").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        
        GameRegistry.registerBlock(boisResine , "resine_bois");
        GameRegistry.registerBlock(feuillesResine , "resine_feuilles");
        GameRegistry.registerBlock(pousseResine, "resine_pousse");
        
        //ITEMS
        
        copperIngot = new CopperIngot().setUnlocalizedName("copperingot").setTextureName("roboticmod:copperingot").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        GameRegistry.registerItem(copperIngot, "copper_ingot");
        
        lithiumDust = new LithiumDust().setUnlocalizedName("lithiumdust").setTextureName("roboticmod:lithiumdust").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        GameRegistry.registerItem(lithiumDust, "lithium_dust");
        
        manganeseChunk = new ManganeseChunk().setUnlocalizedName("manganesechunk").setTextureName("roboticmod:manganese_chunk").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        GameRegistry.registerItem(manganeseChunk, "manganese_chunk");
        
        tungsteneIngot = new TungsteneIngot().setUnlocalizedName("tungsteneingot").setTextureName("roboticmod:tungstene_ingot").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        GameRegistry.registerItem(tungsteneIngot, "tungstene_ingot");
        
        siliciumIngot = new SiliciumIngot().setUnlocalizedName("siliciumingot").setTextureName("roboticmod:silicium_ingot").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        GameRegistry.registerItem(siliciumIngot, "silicium_ingot");
        
        battery = new Battery(7000, 1500).setUnlocalizedName("Battery").setTextureName("roboticmod:battery_7").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        GameRegistry.registerItem(battery, "battery");
        
        suBattery = new SuBattery().setTextureName("roboticmod:su_battery").setCreativeTab(Robotic.baseRoboticCreativeTabs).setUnlocalizedName("batterysu");
        GameRegistry.registerItem(suBattery, "subattery");
        
        tungsteneStick = new TungsteneStick().setUnlocalizedName("tungstenestick").setTextureName("roboticmod:tungstene_stick").setCreativeTab(Robotic.baseRoboticCreativeTabs);
        GameRegistry.registerItem(tungsteneStick, "tungstene_stick");
        
        
        
        //recipe furnace basic
        GameRegistry.addSmelting(cuivreOre, new ItemStack(copperIngot, 1), 0f);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRender();
        
        proxy.registerTileEntityRender();
        
        proxy.registerGuiHandler(this.instance, new GuiHandler());
        
        //ITEMS
        MKIsword = new MKISword(toolMKIsword).setUnlocalizedName("swordMKI").setTextureName("roboticmod:mk1_sword");
        GameRegistry.registerItem(MKIsword, "item_sword_mki");
        
        MKIIsword = new MKIISword(toolMKIIsword).setUnlocalizedName("swordMKII").setTextureName("roboticmod:mk2_sword");
        GameRegistry.registerItem(MKIIsword, "item_sword_mkii");
        
        GameRegistry.registerTileEntity(TileEntityFourArc.class, "FourArc");
        GameRegistry.registerTileEntity(TileEntityChargeurSansNoyau.class, "TileEntityChargeurSansNoyau");
        GameRegistry.registerTileEntity(TileEntityChargeurAvecNoyau.class, "TileEntityChargeurAvecNoyau");
        GameRegistry.registerTileEntity(TileEntityBlockPipeTest.class, "TileEntityBlockPipeTest");
        
        //generator
        GameRegistry.registerWorldGenerator(new WorldGeneratorCopper(), 0);
        
            //generation Arbres a Resine
        GameRegistry.registerWorldGenerator(new WorldGeneration(), 0);
        
        //ENTITY 
        EntityRegistry.registerGlobalEntityID(EntityGuardian.class, "Guardian", EntityRegistry.findGlobalUniqueEntityId(), new Color(0, 255, 0).getRGB(), new Color(255, 0, 0).getRGB());
        EntityRegistry.registerModEntity(EntityGuardian.class, "Guardian", 420, this.instance, 40, 1, true);
        
        //CRAFTING RECIPE
        
        GameRegistry.addRecipe(new ItemStack(battery, 1, battery.getMaxDamage()), new Object[] {"WIW", "WIW", "WRW", 'W', Items.iron_ingot, 'I', copperIngot, 'R', lithiumDust});
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
