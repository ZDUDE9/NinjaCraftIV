package ninjacraft.mod.entities.projectiles;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import ninjacraft.mod.util.Reference;

public class RenderArrowSharpened extends RenderArrow<EntityArrowSharpened> {

	public RenderArrowSharpened(RenderManager manager) {

		super(manager);

	}

	
	@Override
	protected ResourceLocation getEntityTexture(EntityArrowSharpened entity) {
		
		return new ResourceLocation(Reference.MODID + ":textures/entity/projectiles/arrow_sharpened.png");
		
	}
	
}
