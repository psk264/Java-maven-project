//public ==> keyword used as an access modifier
//class ==> keyword to define the class
//{ } ==> defines the class body

import java.util.ArrayList;

public class CodeRunner {

    public static void main(String[] args) {

//        System.out.println("Hello, Olivia!");
//        int myFirstNumber=(5+10) + (2*10);
//        int mySecondNumber =12;
//        int myThirdNumber = 6;
//
//        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
//
//        System.out.println(myTotal);

        System.out.println(GivenAnArray.BinarySearch( new int[]{-1,0,3,5,9,12},9));
        System.out.println(GivenAnArray.BinarySearch(new int[] {5,6,7,9,24,31}, 9));
        int[] answer = GivenAnArray.FindSumDigitTarget(new int[]{2,1,5,3},4);
        System.out.format("%d, %d",answer[0], answer[1]);
        System.out.println();
        answer = GivenAnArray.FindSumDigitTarget(new int[]{5, 6, 1, 9, 4, 3}, 8);
        System.out.format("%d, %d",answer[0], answer[1]);
        System.out.println();
        answer = GivenAnArray.FindBuyandSellPrice(new int[] {7,1,5,3,6,4});
        System.out.format("%d, %d",answer[0], answer[1]);
        System.out.println();
       ArrayList ans = GivenAnArray.runningSum(new int[]{1,2,3,4});
        for(int i=0;i<ans.size();i++)
            System.out.format("%d ", ans.get(i));
        System.out.println();
        System.out.println(GivenAnArray.ContainsDuplicate(new int[] {5,6,7,9,24,31}));
        System.out.println(GivenAnArray.ContainsDuplicate(new int[] {5,6,7,9,24,31,9}));
        System.out.println(GivenAnArray.ContainsDuplicate(new int[] {5,6,7,7,24,7}));



    }
}
