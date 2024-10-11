package com.csc;

import java.util.Arrays;
import java.util.List; // Import List

import static org.junit.jupiter.api.Assertions.assertEquals; // Import Arrays
import org.junit.jupiter.api.Test;

public class ZipperTest {


  @Test
  void testZip() {
    List<Integer> list1 = Arrays.asList(1, 3, 5);
    List<Integer> list2 = Arrays.asList(2, 4, 6);
    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
    assertEquals(expected, Zipper.zip(list1, list2));
  }
}
