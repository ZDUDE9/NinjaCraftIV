package ninjacraft.mod.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import ninjacraft.mod.entities.EntityOniChief;
import ninjacraft.mod.entities.projectiles.EntityArrowBomb;
import ninjacraft.mod.entities.projectiles.EntityArrowSharpened;
import ninjacraft.mod.entities.projectiles.RenderArrowBomb;
import ninjacraft.mod.entities.projectiles.RenderArrowSharpened;
import ninjacraft.mod.entities.renders.RenderOniChief;

public class RenderHandler {

	public static void registerEntityRenders() {

		RenderingRegistry.registerEntityRenderingHandler(EntityOniChief.class, new IRenderFactory<EntityOniChief>() {

			@Override
			public Render<? super EntityOniChief> createRenderFor(RenderManager manager) {

				return new RenderOniChief(manager);

			}

		});

		RenderingRegistry.registerEntityRenderingHandler(EntityArrowSharpened.class,
				new IRenderFactory<EntityArrowSharpened>() {

					public net.minecraft.client.renderer.entity.Render<? super EntityArrowSharpened> createRenderFor(
							RenderManager manager) {

						return new RenderArrowSharpened(manager);
					}

				});

		RenderingRegistry.registerEntityRenderingHandler(EntityArrowBomb.class, new IRenderFactory<EntityArrowBomb>() {

			public net.minecraft.client.renderer.entity.Render<? super EntityArrowBomb> createRenderFor(
					RenderManager manager) {

				return new RenderArrowBomb(manager);
			}

		});

	}

}
