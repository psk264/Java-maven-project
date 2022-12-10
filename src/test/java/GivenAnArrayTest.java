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
                () -> assertEquals(true, GivenAnArray.ContainsDuplicate(new int[] {1,2,4,6,1})),
                () -> assertEquals(false, GivenAnArray.ContainsDuplicate(new int[] {1,2,4,6,10})),
                () -> assertEquals(true, GivenAnArray.ContainsDuplicate(new int[] {1,2,2,6,1})),
                () -> assertEquals(false, GivenAnArray.ContainsDuplicate(new int[] {1}))


        );
    }
}