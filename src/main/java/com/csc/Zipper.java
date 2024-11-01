     package com.csc;

    import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class Zipper {
        public static <T> List<T> zip(List<T> list1, List<T> list2) {
            List<T> merged = new ArrayList<>();
            int minLength = Math.min(list1.size(), list2.size());
            int i = 0;
            for (; i < minLength; i++) {
                merged.add(list1.get(i));
                merged.add(list2.get(i));
            }
            merged.addAll(list1.subList(i, list1.size()));
            merged.addAll(list2.subList(i, list2.size()));
            return merged;
        }

        public static <T> Map<String, T> hashmapify(List<String> keys, List<T> values) {
            if (keys.size() != values.size()) {
                throw new IllegalArgumentException("The two lists must have the same size.");
            }
            Map<String, T> map = new HashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
            return map;
        }

        public static void main(String[] args) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(3);
            list1.add(5);

            List<Integer> list2 = new ArrayList<>();
            list2.add(2);
            list2.add(4);
            list2.add(6);

            List<Integer> result = zip(list1, list2);
            System.out.println(result);
        }
    }
