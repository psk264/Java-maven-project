import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GivenAnArrayTest {

    @Test
    void bsearchTest() {
        assertAll(
                () -> assertEquals(3 , GivenAnArray.BinarySearch(new int[] {5,6,8,9,14,32}, 9)),
                () -> assertEquals(-1 , GivenAnArray.BinarySearch(new int[] {5,6,7,9,14,23}, 8))
                );
    }



    @Test
    void findSumDigitTargetTest() {
        assertAll(
                () -> assertArrayEquals(new int[] {5,0}, GivenAnArray.FindSumDigitTarget(new int[] {5,6,1,9,4,3}, 8)),
                () -> assertArrayEquals(new int[] {-1,-1}, GivenAnArray.FindSumDigitTarget(new int[] {5,6,1,9,4,3}, 100))

        );

    }

    @Test
    void FindBuyandSellPriceTest() {
        assertAll(
                () -> assertArrayEquals(new int[] {1,9}, GivenAnArray.FindBuyandSellPrice(new int[] {5,6,1,9,4,3})),
                () -> assertArrayEquals(new int[] {2,14}, GivenAnArray.FindBuyandSellPrice(new int[] {2,6,7,9,14,3}))

        );

    }

    @Test
    void ContainsDuplicateTest(){
        assertAll(
                () -> assertTrue(GivenAnArray.ContainsDuplicate(new int[] {1,2,4,6,1})),
                () -> assertFalse(GivenAnArray.ContainsDuplicate(new int[] {1,2,4,6,10})),
                () -> assertTrue(GivenAnArray.ContainsDuplicate(new int[] {1,2,2,6,1})),
                () -> assertFalse(GivenAnArray.ContainsDuplicate(new int[] {1}))


        );
    }

    @Test
    void ProductOfItselfTest(){
        assertAll(
                () -> assertArrayEquals(new int[]{48, 24, 12, 8, 48}, GivenAnArray.ProductOfItself(new int[] {1,2,4,6,1})),
                () -> assertArrayEquals(new int[]{480, 240, 120, 80, 48}, GivenAnArray.ProductOfItself(new int[] {1,2,4,6,10})),
                () -> assertArrayEquals(new int[] {24, 12, 12, 4, 24}, GivenAnArray.ProductOfItself(new int[] {1,2,2,6,1})),
                () -> assertArrayEquals(new int[] {1}, GivenAnArray.ProductOfItself(new int[] {1})),
                () -> assertArrayEquals(new int[] {2, 1}, GivenAnArray.ProductOfItself((new int[]{1,2})))
        );
    }

    @Test
    void MaxSumOfSubArrayTest() {
        assertAll(
                () -> assertEquals(6, GivenAnArray.MaximumSumOfSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})),
                () -> assertEquals(4, GivenAnArray.MaximumSumOfSubArray(new int[]{-2,-1,-3,4,-1,-2,-1,-5,-4})),
                () -> assertEquals(-1, GivenAnArray.MaximumSumOfSubArray(new int[]{-2,-1,-3,-4,-1,-2,-1,-5,-4})),
                () -> assertEquals(0, GivenAnArray.MaximumSumOfSubArray(new int[]{-2,-1,0}))
                );
    }

    @Test
    void MaxProductOfSubArrayTest(){
        assertAll(
                () -> assertEquals(6, GivenAnArray.MaxProductOfSubArray(new int[] {2,3,-2,4})),
                () -> assertEquals(0, GivenAnArray.MaxProductOfSubArray(new int[] {0})),
                () -> assertEquals(1, GivenAnArray.MaxProductOfSubArray(new int[] {1,-1})),
                () -> assertEquals(1, GivenAnArray.MaxProductOfSubArray(new int[] {1,0}))
                );
    }

    @Test
    void pivotIndexTest(){
        assertAll(
                () -> assertEquals(3, GivenAnArray.pivotIndex(new int[]{1,7,3,6,5,6})),
        () -> assertEquals(0, GivenAnArray.pivotIndex(new int[]{2,1,-1})),
        () -> assertEquals(2, GivenAnArray.pivotIndex(new int[]{-1,-1,-1,-1,-1,0})),
        () -> assertEquals(-1, GivenAnArray.pivotIndex(new int[]{-1,-1}))

        );
    }
}