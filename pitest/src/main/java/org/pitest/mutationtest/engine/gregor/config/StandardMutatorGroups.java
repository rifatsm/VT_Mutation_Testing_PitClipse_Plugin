package org.pitest.mutationtest.engine.gregor.config;

import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;

import java.util.List;
import java.util.Map;

public class StandardMutatorGroups implements MutatorGroup {
    @Override
    public void register(Map<String, List<MethodMutatorFactory>> mutators) {

        mutators.put("OLD_DEFAULTS", gather(mutators,"INVERT_NEGS",
                "RETURN_VALS",
                "MATH",
                "VOID_METHOD_CALLS",
                "NEGATE_CONDITIONALS",
                "CONDITIONALS_BOUNDARY",
                "INCREMENTS"));

        mutators.put("PIT_DEFAULTS", gather(mutators,"INVERT_NEGS",
                "MATH",
                "VOID_METHOD_CALLS",
                "REMOVE_CONDITIONALS_ORDER_ELSE",
                "REMOVE_CONDITIONALS_EQUAL_ELSE",
                "CONDITIONALS_BOUNDARY",
                "INCREMENTS", "RETURNS"));

        mutators.put("DEFAULTS", gather(mutators,"REMOVE_CONDITIONALS",
                "AOD"));

        mutators.put("STRONGER", gather(mutators,"PIT_DEFAULTS",
                "EXPERIMENTAL_SWITCH",
                "REMOVE_CONDITIONALS_ORDER_IF",
                "REMOVE_CONDITIONALS_EQUAL_IF"));

    }

}
