package com.zombiehorde.client;

import com.zombiehorde.ZombieHordeMod;
import com.zombiehorde.registry.ModEntities;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = ZombieHordeMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.RUNNER_ZOMBIE.get(), ZombieRenderer::new);
        event.registerEntityRenderer(ModEntities.BRUTE_ZOMBIE.get(), ZombieRenderer::new);
        event.registerEntityRenderer(ModEntities.PLAGUE_ZOMBIE.get(), ZombieRenderer::new);
        event.registerEntityRenderer(ModEntities.EMBER_ZOMBIE.get(), ZombieRenderer::new);
    }

    private ClientModEvents() {
    }
}
