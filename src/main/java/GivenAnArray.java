import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Thread.enumerate;

public class GivenAnArray {

    /**
     * @param nums >> sorted int array
     * @param target >> number to lookup
     * @return int index
     */
     static  int BinarySearch(int[] nums, int target) {
            int returnIndex=-1;
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
                return returnIndex;
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
        HashMap<Integer, Integer> temp = new HashMap<>();

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
     * Memory o(1), Time complexity O(n)
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
     * Time Complexity O(n), Memory or Space complexity O(n)
     * Note - we can use the HashSet instead of HashMap since both have same space complexity O(n)
     */
    static boolean ContainsDuplicate(int[] nums){
        HashSet<Integer> temp = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(temp.contains(nums[i])){
                return true;
            }
            temp.add(nums[i]);
        }
        return false;
    }

    /**
     * @param nums >> input array of integers
     * @return array of product of input array with itself excluding the current element.
     *
     * Time Complexity O(n), space complexity for output array O(n)
     */
    static int[] ProductOfItself(int[] nums){
        int[] answer = new int[nums.length];
      //  Arrays.fill(answer,1);
        int prefix=1, postfix=1;

        for(int index=0;index<nums.length; index++){
            answer[index] = prefix;
            prefix *= nums[index];
        }

        for(int index=nums.length-1;index>=0; index--){
            answer[index] *= postfix;
            postfix *= nums[index];
        }
        return answer;
    }

    /**
     * @param nums -> give an integer array
     * @return int maxSum of a subarray in the given array
     *
     * Time Complexity O(n), space complexity O(1)
     */
    static int MaximumSumOfSubArray(int[] nums){
        int maxSum = nums[0];
        int curSum=0;

        for (int n: nums) {
            if(curSum<0){
                curSum = 0;
            }
            curSum += n;
            maxSum = Math.max(curSum,maxSum);
        }
        return maxSum;
    }

    /**
     * @param nums >> given an integer array
     * @return int max product of subarray
     *
     * Time complexity O(n)
     */
    static int MaxProductOfSubArray(int[] nums){
        int productAns = Arrays.stream(nums).max().getAsInt();
        int curMin=1, curMax=1;
        for (int n: nums) {
            if(n==0) continue;
            int temp = curMax;
            curMax = Math.max(n*curMax, n* curMin);
            curMax = Math.max(curMax, n);

            curMin = Math.min(n*temp, n* curMin);
            curMin = Math.min(curMin, n);
            productAns = Math.max(curMax,productAns);
        }

        return productAns;
    }

    /**
     * Given an array of integers nums, calculate the pivot index of this array.
     * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
     * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
     * Return the leftmost pivot index. If no such index exists, return -1.
     *
     * @param nums >> integer array
     * @return int value pivot index
     */
    static int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int pIndex=-1;
        int lSum=0, lIndex=0;

        while(lIndex<nums.length){
            int rSum=totalSum-nums[lIndex]-lSum;

            if(lSum == rSum){
                return lIndex;
            }
            else{
                lSum +=nums[lIndex];
                lIndex++;
            }

        }
        return pIndex;
    }

    static List<Integer> addtoArrayForm(int[] num, int k){
        List<Integer> returnList = new ArrayList<>();
     //   returnList = Arrays.stream(num).boxed().collect(Collectors.toList());
        int n = num.length, i=n-1;
        while(i>=0 || k>0){
            if(i>=0) k += num[i];
            returnList.add(k%10);
            k=k/10;
            i--;
        }
        Collections.reverse(returnList);
        return returnList;
    }




}
