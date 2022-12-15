//public ==> keyword used as an access modifier
//class ==> keyword to define the class
//{ } ==> defines the class body

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class CodeRunner {

    public static void main(String[] args) {
        CodeRunner.GivenAnArrayRunner();
        CodeRunner.GivenStringsRunner();
        CodeRunner.GivenAListRunner();

    }

    static void GivenAListRunner(){

        ListNode mylist = new ListNode();
        mylist.addElement(1);
        mylist.addElement(2);
        mylist.addElement(3);
        mylist.addElement(4);
        mylist.addElement(5);

        System.out.println(GivenAList.reverseList(mylist));  //prints the new head
        System.out.println(GivenAList.reverseList(mylist).value);  //prints the value of the new head
    }
    static void GivenStringsRunner(){
        System.out.println(GivenStrings.isIsomorphic("egg", "add"));
        System.out.println(GivenStrings.isIsomorphic("piper", "title"));
        System.out.println(GivenStrings.isIsomorphic("foo", "bar"));
    }
    static void GivenAnArrayRunner() {
        System.out.println(GivenAnArray.BinarySearch( new int[]{-1,0,3,5,9,12},9));
        System.out.println(GivenAnArray.BinarySearch(new int[] {5,6,7,9,24,31}, 9));

        //example of using format to print integers
        int[] answer = GivenAnArray.FindSumDigitTarget(new int[]{2,1,5,3},4);
        System.out.format("%d, %d",answer[0], answer[1]);
        System.out.println();

        System.out.println(Arrays.toString(GivenAnArray.FindSumDigitTarget(new int[]{5, 6, 1, 9, 4, 3}, 8)));

        System.out.println(Arrays.toString(GivenAnArray.FindBuyandSellPrice(new int[] {7,1,5,3,6,4})));

        //Example of using arraylist to iteratively print the integers
        ArrayList ans = GivenAnArray.runningSum(new int[]{1,2,3,4});
        for(int i=0;i<ans.size();i++)
            System.out.format("%d ", ans.get(i));
        System.out.println();

        System.out.println(GivenAnArray.ContainsDuplicate(new int[] {5,6,7,9,24,31}));
        System.out.println(GivenAnArray.ContainsDuplicate(new int[] {5,6,7,9,24,31,9}));
        System.out.println(GivenAnArray.ContainsDuplicate(new int[] {5,6,7,7,24,7}));

        int[] productOfItself = GivenAnArray.ProductOfItself(new int[] {1,2,4,6,1});
        System.out.println(Arrays.toString(productOfItself));

        System.out.println(GivenAnArray.MaximumSumOfSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

        System.out.println(GivenAnArray.MaxProductOfSubArray(new int[]{2,3,-2,4}));

        System.out.println(GivenAnArray.pivotIndex(new int[]{1,7,3,6,5,6}));  //3
        System.out.println(GivenAnArray.pivotIndex(new int[]{2,1,-1})); //0
        System.out.println(GivenAnArray.pivotIndex(new int[]{-1,-1,-1,-1,-1,0}));  //2
        System.out.println(GivenAnArray.pivotIndex(new int[]{-1,-1}));  //-1

    }
}
