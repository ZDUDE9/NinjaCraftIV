package ninjacraft.mod.entities.projectiles;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import ninjacraft.mod.init.ItemInit;
import ninjacraft.mod.util.Actions;

public class EntityArrowBomb extends EntityArrow
{
	public EntityArrowBomb(World worldIn) {

		
		super(worldIn);
	}

	public EntityArrowBomb(World worldIn, double x, double y, double z) {

		
		super(worldIn, x, y, z);
	}
	
	public EntityArrowBomb(World worldIn, EntityLivingBase shooter) {

		
		super(worldIn, shooter);
	}


	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(ItemInit.ARROW_BOMB);
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

			Actions.addPotionEffect((EntityLivingBase) raytraceResultIn.entityHit, MobEffects.SLOWNESS, 100, 200,
					false);

		}

		Actions.setBlockStates(world, getPosition(), Blocks.PACKED_ICE.getDefaultState(), 2, false);

		super.onHit(raytraceResultIn);
	}

	
}
