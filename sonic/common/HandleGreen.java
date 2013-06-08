package sonic.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HandleGreen extends Item{

	public HandleGreen(int par1) {
		super(par1);
		this.setMaxStackSize(64);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("sonic:HandleGreen");
		}
}
