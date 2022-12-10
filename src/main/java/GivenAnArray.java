import java.util.*;

public class GivenAnArray {

    /**
     * @param nums >> sorted int array
     * @param target >> number to lookup
     * @return int index
     */
     static  int BinarySearch(int[] nums, int target) {
            int index=-1;
            int end=nums.length-1;
            int start = 0;


            while(start<end){
                 int pointer = start + (end - start + 1)/2;

                if(target < nums[pointer]) {
                    end = pointer-1;
                }
                else {
                    start = pointer;
                }
            }

            if(nums[start]==target) return start;
            else
                return index;
    }

    /**
     * @param nums >> int array
     * @param target >> int
     * @return int array

    Given an array, return the indicies of two values which sums upto to the given target.
    In any given array, there is only 1 solution.
    For example, {2,7,11,15}, target=9  >> return {0,1} because 2+7=9

    Solution uses HashMap and has time complexity o(n). If we go the bruteforce route the time complexity would be O(n^2)
 */
     static int[] FindSumDigitTarget(int [] nums, int target){
        int[] returnArr = {-1,-1};  //Don't really have to define this array, it could save memory
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();

        for (int index =0; index<nums.length; index++) {
            int diff = target - nums[index];
            if(temp.containsKey(diff)){
                returnArr[0] = index;
                returnArr[1] = temp.get(diff);
                return returnArr;
//                return new int[] {index, temp.get(target-nums[index])};
            }
            else {
                temp.put(nums[index], index);
            }
        }
        return returnArr;

    }

    /**
     * @param prices int array of prices on consecutive days
     * @return int array of buy and sell price, the buy price (loweset we can buy) and sell price (highest we can sell)
     *
     * Memory o(1), Time complexity O(n)
     *
     * Example: {7,1,5,3,6,4} >> return: {1,6}
     */
    static int[] FindBuyandSellPrice(int[] prices){
         int buyPointer=0, sellPointer=1, maxProfit=0;
         int[] returnPrice = {-1,-1};
         while(sellPointer<prices.length){
             int profit = prices[sellPointer] - prices[buyPointer];
             if(prices[buyPointer]<prices[sellPointer]) {
                 if (profit > maxProfit) {
                     maxProfit = profit;
                     returnPrice[0] = prices[buyPointer];
                     returnPrice[1] = prices[sellPointer];
                 }
             }
             else{
                buyPointer=sellPointer;
             }
             sellPointer++;

         }
         return returnPrice;

    }

    static ArrayList<Integer> runningSum(int[] nums) {
        ArrayList <Integer> ans = new ArrayList<>();
        int tempSum=0;
        for(int i=0;i<nums.length;i++){
            ans.add(i, tempSum+nums[i]);
            tempSum += nums[i];
        }
        return ans;
    }

    /**
     * @param nums > integer array
     * @return boolean > true = found atleast two instance, false = no duplicate found, distinct numbers in the array
     *
     * Time Complexity O(n)
     */
    static boolean ContainsDuplicate(int[] nums){
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(temp.containsValue(nums[i])){
                return true;
            }
            temp.put(i, nums[i]);
        }
        return false;
    }
}
