package net.prehistoricnaturefossils.blocks.base;

import net.prehistoricnaturefossils.triggers.CustomTrigger;

import javax.annotation.Nullable;

public interface IAdvancementGranterFossil {
    @Nullable
    CustomTrigger getModTrigger();
}
