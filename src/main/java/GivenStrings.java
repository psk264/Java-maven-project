import java.util.Collections;
import java.util.HashMap;

public class GivenStrings {
    /**
     * @param given string s
     * @param given string t
     * @return Boolean value to determine if given strings are isomorphic.  Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * Time Complexity O(n) (iterate thru strings and add to HashMap in O(1)), Space complexity O(n) >> hashmaps
     **/
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> hashmap_s = new HashMap<>();
        HashMap<Character,Character> hashmap_t = new HashMap<>();
        int index=0;

        while(index<s.length()){
            char ch_s = s.charAt(index);
            char ch_t = t.charAt(index);
            if((hashmap_s.containsKey(ch_s) && hashmap_s.get(ch_s) != ch_t) ||
                    hashmap_t.containsKey(ch_t) && hashmap_t.get(ch_t) != ch_s) return false;
            else {
                hashmap_s.put(ch_s,ch_t);
                hashmap_t.put(ch_t,ch_s);
            }
            index++;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        String returnString = "";
        //babad >> bab, aba
        //babab >> babab
        //cbbd >> bb
        int resultLength = 1;
        int start=0, end=0;
        //odd length string case
        for(int index=0; index<s.length()-1;index++)
        {
            int left = index, right = index;
            while (left >= 0 && right < s.length()) {
                if(s.substring(left).equals(s.substring(right))){
                    left -= 1;
                    right += 1;
                }
                else{
                    break;
                }
                if (right - left + 1 > resultLength) {
                        resultLength = right - left + 1;
                        start=left+1;
                        end=right-1;
                    }

            }
        }
    //even length string case
        for(int index=0; index<s.length()-1;index++)
        {
            int left = index, right = index+1;
            while (left >= 0 && right < s.length()) {
                if(s.substring(left).equals(s.substring(right))){
                    left -= 1;
                    right += 1;
                }
                else{
                    break;
                }
                if (right - left + 1 > resultLength) {
                    resultLength = right - left + 1;
                    start=left+1;
                    end=right-1;
                }

            }
        }
        returnString = s.substring(start,end);
        return returnString;
    }
}
