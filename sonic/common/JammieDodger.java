package sonic.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class JammieDodger extends ItemFood{


	public JammieDodger(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		this.setMaxStackSize(64);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon("sonic:jammieDodger");
		}
}