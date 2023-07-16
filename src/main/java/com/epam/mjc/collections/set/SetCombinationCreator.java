package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combinationSet = new HashSet<>();

        for (String element : firstSet) {
            if (secondSet.contains(element) && !thirdSet.contains(element)) {
                combinationSet.add(element);
            }
        }

        for (String element : thirdSet) {
            if (!firstSet.contains(element) && !secondSet.contains(element)) {
                combinationSet.add(element);
            }
        }

        return combinationSet;
    }
}
