package ninjacraft.mod.util;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Actions {

	/* Damage Entity */
	public static void damageEntity(Entity entityTarget, float damageAmount) {
		entityTarget.attackEntityFrom(DamageSource.GENERIC, damageAmount);
	}

	/* Add POtion Effect */
	public static void addPotionEffect(EntityLivingBase entity, Potion potion, int durationIn, int amplifierIn,
			boolean showParticles) {
		if (entity.world.isRemote)
			return;
		entity.addPotionEffect(new PotionEffect(potion, durationIn, amplifierIn, false, showParticles));
	}

	/* Play Sound */
	public static void playSound(Entity target, SoundEvent soundEvent, float pitch, float volume) {
		playSound(target.world, target.getPosition(), soundEvent, pitch, volume);
	}

	public static void playSound(World world, BlockPos position, SoundEvent soundEvent, float pitch, float volume) {
		if (world.isRemote)
			return;
		world.playSound(null, position.getX(), position.getY(), position.getZ(), soundEvent, SoundCategory.PLAYERS,
				volume, pitch);
	}

	public static void setBlockState(World world, BlockPos position, IBlockState blockState) {
		if (world.isRemote || position == null)
			return;
		world.setBlockState(position, blockState);
	}

	public static void setBlockStates(World world, BlockPos position, IBlockState blockState, int radius,
			boolean replaceAir) {

		if (world.isRemote || position == null)
			return;

		for (int x = -radius; x <= radius; x++) {
			for (int y = -radius; y <= radius; y++) {
				for (int z = -radius; z <= radius; z++) {
					BlockPos pos = new BlockPos(position.getX() + x, position.getY() + y, position.getZ() + z);
					if (pos.getDistance(position.getX(), position.getY(), position.getZ()) <= radius) {
						if (replaceAir || (!world.isAirBlock(pos)
								&& !world.getBlockState(pos).getBlock().isReplaceable(world, pos))) {
							world.setBlockState(pos, blockState);
						}
					}
				}
			}
		}
	}
	
    
   public static BlockPos getBlockInRange(Entity source, Block block, int range) {

       double distCl = 999;
       BlockPos posCl = null;
       for (int x = -range; x < range; x++) {
           for (int y = -range; y < range; y++) {
               for (int z = -range; z < range; z++) {
                   BlockPos pos = new BlockPos(source.getPosition().add(x, y, z));
                   IBlockState state = source.world.getBlockState(pos);
                   if (state.getBlock() == block) {
                       //return pos;
                       double dist = Math.sqrt(source.getDistanceSq(pos));
                       if (dist < distCl) {
                           distCl = dist;
                           posCl = pos;
                       }
                   }
               }
           }
       }

       return posCl;
   }

}
