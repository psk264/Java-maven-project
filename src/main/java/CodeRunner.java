//public ==> keyword used as an access modifier
//class ==> keyword to define the class
//{ } ==> defines the class body

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class CodeRunner {

    public static void main(String[] args) {
        System.out.println("**********************************************************************************");
        System.out.println("-------------------------\n------GivenAnArray---------\n-------------------------");
        CodeRunner.GivenAnArrayRunner();
        System.out.println("*************************************END of GivenAnArray*********************************************");
        System.out.println("-------------------------\n------GivenStrings---------\n-------------------------");
        CodeRunner.GivenStringsRunner();
        System.out.println("**************************************END of GivenAStringRunner********************************************");
        System.out.println("-------------------------\n------GivenAList---------\n-------------------------");
        CodeRunner.GivenAListRunner();
        System.out.println("***********************************END of GivenAListRunner***********************************************");
        System.out.println("-------------------------\n------GivenANumber---------\n-------------------------");
        CodeRunner.GivenANumberRunnder();
        System.out.println("***************************************END of GivenANumberRunner*******************************************");



    }

    static void GivenAListRunner(){

        ListNode mylist = new ListNode();
        mylist.addElement(1);
        mylist.addElement(2);
        mylist.addElement(3);
        mylist.addElement(4);
        mylist.addElement(5);

        System.out.println("------reverseList---------");
        System.out.println(GivenAList.reverseList(mylist));  //prints the new head
        System.out.println(GivenAList.reverseList(mylist).value);

        System.out.println("------middleNode---------");
        System.out.print(GivenAList.middleNode(mylist).value);//prints the new list
        System.out.println();
        
        System.out.println("------getMedian---------");
        System.out.println(GivenAList.getMedian(new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(9);
                add(5);
                add(6);
            }
        }));
        System.out.println("------End of getMedian---------");
    }
    static void GivenStringsRunner(){
        System.out.println("------isIsomorphic---------");
        System.out.println(GivenStrings.isIsomorphic("egg", "add"));
        System.out.println(GivenStrings.isIsomorphic("piper", "title"));
        System.out.println(GivenStrings.isIsomorphic("foo", "bar"));

        System.out.println("------longestPalindrome---------");
        System.out.println(GivenStrings.longestPalindrome("babad"));
        System.out.println(GivenStrings.longestPalindrome("cbbd"));

        System.out.println("------reverseString---------");
        System.out.println(GivenStrings.reverseString("babad"));

        System.out.println("------isAnagram---------");
        System.out.println(GivenStrings.isAnagram("anagram", "margana"));
        System.out.println(GivenStrings.isAnagram("babad", "hello"));

        GivenStrings.queueMethod();
        System.out.println(GivenStrings.stringParser("aabbbaaa"));


    }
    static void GivenAnArrayRunner() {
        System.out.println("------BinarySearch---------");
        System.out.println(GivenAnArray.BinarySearch( new int[]{-1,0,3,5,9,12},9));
        System.out.println(GivenAnArray.BinarySearch(new int[] {5,6,7,9,24,31}, 9));

        System.out.println("------FindSumDigitTarget---------");
        //example of using format to print integers
        int[] answer = GivenAnArray.FindSumDigitTarget(new int[]{2,1,5,3},4);
        System.out.format("%d, %d",answer[0], answer[1]);
        System.out.println();

        System.out.println(Arrays.toString(GivenAnArray.FindSumDigitTarget(new int[]{5, 6, 1, 9, 4, 3}, 8)));

        System.out.println(Arrays.toString(GivenAnArray.FindBuyandSellPrice(new int[] {7,1,5,3,6,4})));
        System.out.println("------ContainsDuplicate---------");
        //Example of using arraylist to iteratively print the integers
        ArrayList ans = GivenAnArray.runningSum(new int[]{1,2,3,4});
        for(int i=0;i<ans.size();i++)
            System.out.format("%d ", ans.get(i));
        System.out.println();

        System.out.println(GivenAnArray.ContainsDuplicate(new int[] {5,6,7,9,24,31})); //false
        System.out.println(GivenAnArray.ContainsDuplicate(new int[] {5,6,7,9,24,31,9})); //true
        System.out.println(GivenAnArray.ContainsDuplicate(new int[] {5,6,7,7,24,7})); //true
        System.out.println("------ProductOfItself---------");
        int[] productOfItself = GivenAnArray.ProductOfItself(new int[] {1,2,4,6,1});
        System.out.println(Arrays.toString(productOfItself));
        System.out.println("------MaximumSumOfSubArray---------");
        System.out.println(GivenAnArray.MaximumSumOfSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println("------MaxProductOfSubArray---------");
        System.out.println(GivenAnArray.MaxProductOfSubArray(new int[]{2,3,-2,4}));
        System.out.println("------pivotIndex---------");
        System.out.println(GivenAnArray.pivotIndex(new int[]{1,7,3,6,5,6}));  //3
        System.out.println(GivenAnArray.pivotIndex(new int[]{2,1,-1})); //0
        System.out.println(GivenAnArray.pivotIndex(new int[]{-1,-1,-1,-1,-1,0}));  //2
        System.out.println(GivenAnArray.pivotIndex(new int[]{-1,-1}));  //-1

        System.out.println("------addtoArrayForm---------");
        System.out.println(GivenAnArray.addtoArrayForm(new int[]{1,2,0,0}, 34));
        System.out.println(GivenAnArray.addtoArrayForm(new int[]{2,7,4}, 181));
        System.out.println(GivenAnArray.addtoArrayForm(new int[]{2,1,5}, 806));
        System.out.println(GivenAnArray.addtoArrayForm(new int[]{0}, 23));
        System.out.println(GivenAnArray.addtoArrayForm(new int[]{0}, 1000));
        System.out.println("------End of addtoArrayForm---------");



    }

    static void GivenANumberRunnder() {
        System.out.println("------reverseNumber---------");
        System.out.println(GivenANumber.reverseNumber(34));

        System.out.println("------parseUnsignedInt---------");
        System.out.println(GivenANumber.reverseBits(Integer.parseUnsignedInt("11111111111111111111111111111101",2)));
        System.out.println(GivenANumber.reverseBits(Integer.parseUnsignedInt("00000010100101000001111010011100", 2)));
    }


}
