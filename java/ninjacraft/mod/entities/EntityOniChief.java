package ninjacraft.mod.entities;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import ninjacraft.mod.util.handlers.SoundsHandler;

public class EntityOniChief extends EntityCow {

	public EntityOniChief(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}


	@Override
	public EntityCow createChild(EntityAgeable ageable) {

		return new EntityOniChief(world);
		
	}
	
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsHandler.ENTITY_ONI_CHIEF_AMBIENT;
	}
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsHandler.ENTITY_ONI_CHIEF_HURT;
	}
	
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsHandler.ENTITY_ONI_CHIEF_AMBIENT;
	}
	
}
