package ninjacraft.mod.entities.projectiles;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import ninjacraft.mod.util.Reference;

public class RenderArrowBomb extends RenderArrow<EntityArrowBomb> {

	public RenderArrowBomb(RenderManager manager) {

		super(manager);

	}

	
	@Override
	protected ResourceLocation getEntityTexture(EntityArrowBomb entity) {
		
		return new ResourceLocation(Reference.MODID + ":textures/entity/projectiles/arrow_bomb.png");
		
	}
	
}
