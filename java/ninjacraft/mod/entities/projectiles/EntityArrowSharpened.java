package ninjacraft.mod.entities.projectiles;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.Actions;

public class EntityArrowSharpened extends EntityArrow
{
	
	
	public EntityArrowSharpened(World worldIn) {
		
		super(worldIn);
	}

	public EntityArrowSharpened(World worldIn, double x, double y, double z) {

		
		super(worldIn, x, y, z);
	}
	
	public EntityArrowSharpened(World worldIn, EntityLivingBase shooter) {

		
		super(worldIn, shooter);
	}


	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ItemInit.ARROW_SHARPENED);
	}
	
	@Override
	protected void arrowHit(EntityLivingBase living) {
	


		
		
		super.arrowHit(living);
	

	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		
	
	}
	@Override
	protected void onHit(RayTraceResult raytraceResultIn) {
		if (raytraceResultIn.entityHit != null) {

		}

        int range = 3; 

		
		Actions.setBlockState(world, Actions.getBlockInRange(this, Blocks.TORCH, range), Blocks.AIR.getDefaultState());
		Actions.setBlockState(world, Actions.getBlockInRange(this, Blocks.GLOWSTONE, range), Blocks.AIR.getDefaultState());
		Actions.setBlockState(world, Actions.getBlockInRange(this, Blocks.SEA_LANTERN, range), Blocks.AIR.getDefaultState());
		Actions.setBlockState(world, Actions.getBlockInRange(this, Blocks.GLASS, range), Blocks.AIR.getDefaultState());
		Actions.setBlockState(world, Actions.getBlockInRange(this, Blocks.GLASS_PANE, range), Blocks.AIR.getDefaultState());
		
		
		
		super.onHit(raytraceResultIn);
	}
	
}
