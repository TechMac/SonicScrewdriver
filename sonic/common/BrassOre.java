package sonic.common;

import sonic.client.Container;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BrassOre extends Block{

	public BrassOre(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(Container.SonicScrewdriver);
	}
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon("sonic:oreBrass");
	}
}