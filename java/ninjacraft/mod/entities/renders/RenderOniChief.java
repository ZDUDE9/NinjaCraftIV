package ninjacraft.mod.entities.renders;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import ninjacraft.mod.entities.EntityOniChief;
import ninjacraft.mod.entities.models.ModelOniChief;
import ninjacraft.mod.util.Reference;

public class RenderOniChief extends RenderLiving<EntityOniChief> {

	public static final ResourceLocation TEXTURES = new ResourceLocation(
			Reference.MODID + ":textures/entities/oni_chief.png");

	public RenderOniChief(RenderManager manager) {
		super(manager, new ModelOniChief(), 0.5F);

	}

	@Override
	protected ResourceLocation getEntityTexture(EntityOniChief entity) {

		return TEXTURES;
	}

	@Override
	protected void applyRotations(EntityOniChief entityLiving, float p_77043_2_, float rotationYaw,
			float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
