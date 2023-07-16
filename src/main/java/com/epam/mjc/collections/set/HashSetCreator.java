package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int x : sourceList) {
            if (x % 2 == 0) {
                int value = x;

                while (value % 2 == 0) {
                    hashSet.add(value);
                    value /= 2;
                }

                hashSet.add(value);
            } else {
                hashSet.add(x);
                hashSet.add(2 * x);
            }
        }

        return hashSet;
    }
}
