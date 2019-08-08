/*
 * BluSunrize
 * Copyright (c) 2017
 *
 * This code is licensed under "Blu's License of Common Sense"
 * Details can be found in the license file in the root folder of this project
 */

package blusunrize.immersiveengineering.common.blocks.metal;

import blusunrize.immersiveengineering.common.blocks.IEBaseBlock;
import blusunrize.immersiveengineering.common.blocks.ItemBlockIEBase;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;

public class MetalDecoration0Block extends IEBaseBlock<BlockTypes_MetalDecoration0>
{
	public MetalDecoration0Block()
	{
		super("metal_decoration", Material.IRON, PropertyEnum.create("type", BlockTypes_MetalDecoration0.class), ItemBlockIEBase.class);
		this.setHardness(3.0F);
		this.setResistance(15.0F);
		this.setBlockLayer(BlockRenderLayer.SOLID, BlockRenderLayer.CUTOUT);
	}
}