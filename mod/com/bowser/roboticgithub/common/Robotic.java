package com.bowser.roboticgithub.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import com.bowser.robotic.proxy.CommonProxy;
import com.bowser.robotic.proxy.GuiHandler;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "roboticmod", name = "Mod Robotic", version = "1.0.0")

public class Robotic
{

public static final String modid = "roboticmod";
    
    @Instance("roboticmod")
    public static Robotic instance;
    
    @SidedProxy(clientSide = "com.bowser.robotic.proxy.ClientProxy", serverSide = "com.bowser.robotic.proxy.CommonProxy")
    public static CommonProxy proxy;
    
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
    
    //items
    public static Item copperIngot;
    public static Item lithiumDust;


    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //Blocks
        cuivreOre = new OreCuivre(Material.rock).setBlockName("cuivreore").setBlockTextureName("roboticmod:orecuivre").setCreativeTab(CreativeTabs.tabBlock).setHardness(3.0F).setResistance(5.0F);
        GameRegistry.registerBlock(cuivreOre, "block_cuivre");
        
        siliciumOre = new OreSilicium(Material.rock).setBlockName("siliciumore").setBlockTextureName("roboticmod:oresilicium").setCreativeTab(CreativeTabs.tabBlock).setHardness(5.0F).setResistance(7.0F);
        GameRegistry.registerBlock(siliciumOre, "block_siliciumore");
        
        lithiumOre = new LithiumOre(Material.rock).setBlockName("lithiumore").setBlockTextureName("roboticmod:orelithium").setCreativeTab(CreativeTabs.tabBlock).setHardness(2.0F).setResistance(5.0F);
        GameRegistry.registerBlock(lithiumOre, "block_lithium");
        
            //blocks+techne
        fourArc = new FourArcBlock(Material.rock, false).setBlockName("fourarc").setBlockTextureName("roboticmod:fourarcbreak").setCreativeTab(CreativeTabs.tabBlock).setHardness(3.0F).setResistance(5.0F);
        GameRegistry.registerBlock(fourArc, "four_arc");
        
        chargeurSansNoyau = new ChargeurSansNoyauBlock(Material.rock).setBlockName("chargeursansnoyau").setBlockTextureName("roboticmod:chargeursansnoyau").setCreativeTab(CreativeTabs.tabBlock).setHardness(3.0F).setResistance(5.0F);
        GameRegistry.registerBlock(chargeurSansNoyau, "chargeur_sans_noyau");
        

        
        
        blockCable = new BlockElectricCable().setBlockName("blockPipe").setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(blockCable, "block_cable");
        
        
        //arbre de Resine
        boisResine = new BoisResine().setBlockTextureName("roboticmod:resine_bois").setBlockName("resine_bois");
        feuillesResine = new FeuillesResine().setBlockTextureName("roboticmod:feuilles").setBlockName("resine_feuilles"); 
        pousseResine = new PousseResine().setBlockTextureName("roboticmod:pousse").setBlockName("resine_pousse");
        
        GameRegistry.registerBlock(boisResine , "resine_bois");
        GameRegistry.registerBlock(feuillesResine , "resine_feuilles");
        GameRegistry.registerBlock(pousseResine, "resine_pousse");
        
        //items
        copperIngot = new CopperIngot().setUnlocalizedName("copperingot").setTextureName("roboticmod:copperingot").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(copperIngot, "copper_ingot");
        
        lithiumDust = new LithiumDust().setUnlocalizedName("lithiumdust").setTextureName("roboticmod:lithiumdust").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(lithiumDust, "lithium_dust");
        
        //recipe furnace basic
        GameRegistry.addSmelting(cuivreOre, new ItemStack(copperIngot, 1), 0f);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRender();
        
        proxy.registerTileEntityRender();
        
        proxy.registerGuiHandler(this.instance, new GuiHandler());
        
        GameRegistry.registerTileEntity(TileEntityFourArc.class, "FourArc");
        GameRegistry.registerTileEntity(TileEntityChargeurSansNoyau.class, "TileEntityChargeurSansNoyau");
        GameRegistry.registerTileEntity(TileEntityChargeurAvecNoyau.class, "TileEntityChargeurAvecNoyau");
        
        //generator
        GameRegistry.registerWorldGenerator(new WorldGeneratorCopper(), 0);
        
            //generation Arbres a Resine
        GameRegistry.registerWorldGenerator(new WorldGeneration(), 0);
        
        
        GameRegistry.registerTileEntity(TileEntityPipe.class, "Pipe");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
