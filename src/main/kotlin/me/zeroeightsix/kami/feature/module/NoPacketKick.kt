package me.zeroeightsix.kami.feature.module

/**
 * @see me.zeroeightsix.kami.mixin.client.MixinClientConnection
 */
@Module.Info(
    name = "NoPacketKick",
    category = Module.Category.MISC,
    description = "Prevent large packets from kicking you"
)
object NoPacketKick : Module()
