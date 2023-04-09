package net.prehistoricnaturefossils.triggers;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModTriggers

{

    public static final CustomTrigger ANTEOSAURUS_COMPLETE = new CustomTrigger("adv_anteosaurus");


    public static final CustomTrigger[] TRIGGER_ARRAY = new CustomTrigger[] {
            ANTEOSAURUS_COMPLETE

    };

    public static void registerTriggers()
    {
        Method method;

        method = ReflectionHelper.findMethod(CriteriaTriggers.class, "register", "func_192118_a", ICriterionTrigger.class);

        method.setAccessible(true);

        for (int i=0; i < TRIGGER_ARRAY.length; i++)
        {
            try
            {
               method.invoke(null, TRIGGER_ARRAY[i]);
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
            {
               e.printStackTrace();
            }
        }
    }
}