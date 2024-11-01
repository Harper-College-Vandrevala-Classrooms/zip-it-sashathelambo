package com.csc;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ZipperTest {

  @Test
  void testZipIntegers() {
    List<Integer> list1 = Arrays.asList(1, 3, 5);
    List<Integer> list2 = Arrays.asList(2, 4, 6);
    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
    assertEquals(expected, Zipper.zip(list1, list2));
  }

  @Test
  void testZipStrings() {
    List<String> list1 = Arrays.asList("a", "c", "e");
    List<String> list2 = Arrays.asList("b", "d", "f");
    List<String> expected = Arrays.asList("a", "b", "c", "d", "e", "f");
    assertEquals(expected, Zipper.zip(list1, list2));
  }
}
