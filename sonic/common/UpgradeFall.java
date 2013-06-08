package sonic.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class UpgradeFall extends Item{

	public UpgradeFall(int par1) {
		super(par1);
		this.setMaxStackSize(16);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("sonic:Upgrade25");
	}
}
