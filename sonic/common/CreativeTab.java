package sonic.common;

import sonic.client.Container;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTab extends CreativeTabs {
	
	public static final String NAME = "Sonic Screwdriver";
	
	public CreativeTab(int par1, String par2Str){
		super(par1, par2Str);
	
		LanguageRegistry.instance().addStringLocalization("itemGroup." + NAME, "en_US", "Sonic Screwdriver");
		
	}
	@SideOnly(Side.CLIENT)
		public Item getTabIconItem(){
		return Container.sonicScrewdriver;
		}

	public String getTranslatedLabels(){
		return "Sonic Screwdriver";
	}

}
