     package com.csc;

    import java.util.ArrayList;
    import java.util.List;
    public class Zipper {
        public static List<Integer> zipIntegers(List<Integer> list1, List<Integer> list2) {
            List<Integer> merged = new ArrayList<>();
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

        public static List<String> zipStrings(List<String> list1, List<String> list2) {
            List<String> merged = new ArrayList<>();
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

        public static void main(String[] args) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(3);
            list1.add(5);

            List<Integer> list2 = new ArrayList<>();
            list2.add(2);
            list2.add(4);
            list2.add(6);

            List<Integer> result = zipIntegers(list1, list2);
            System.out.println(result);
        }

        public static Object zip(List<Integer> list1, List<Integer> list2) {
            throw new UnsupportedOperationException("Unimplemented method 'zip'");
        }
    }
