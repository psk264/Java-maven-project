import java.util.*;

public class GivenStrings {
    /**
     * @param given string s
     * @param given string t
     * @return Boolean value to determine if given strings are isomorphic.  Two strings s and t are isomorphic if the characters in s can be replaced to get t.
     * Time Complexity O(n) (iterate thru strings and add to HashMap in O(1)) ; Space complexity O(n) >> hashmaps
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
        String palindrome = "";
        int resultLength=0;
        //babad >> bab, aba
        //babab >> babab
        //cbbd >> bb

        int n=s.length();

        for(int i=0;i<n;i++) {
            int left=i;
            int right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)) {
                if (right - left + 1 > resultLength) {
                    resultLength = right - left + 1;
                    palindrome = s.substring(left, right+1);
                }
                left -= 1;
                right += 1;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)) {
                if (right - left + 1 > resultLength) {
                    resultLength = right - left + 1;
                    palindrome = s.substring(left, right+1);
                }
                left -= 1;
                right += 1;
            }

        }
        return palindrome;
    }



    public static String reverseString(String s){
        /*--approach1 => Using StringBuilder
         * Time complexity o(n)
         */
//        StringBuilder builder = new StringBuilder(s);
//        return builder.reverse().toString();

        /*--approach2 => Using StringBuffer
         * Time complexity o(n)
         */
        StringBuffer buffer = new StringBuffer(s);
        return buffer.reverse().toString();
    }

    public static boolean isAnagram(String a, String b) {
//        //Approach 1 - Time complexity O(n), Space complexity O(n)
//        a = a.toLowerCase();
//        b = b.toLowerCase();
//        if(a.length()!=b.length()) return false;
//        if(a.equals(b)) return true;
//        HashMap<Character, Integer> set1 = new HashMap<>();
//        HashMap<Character, Integer> set2 = new HashMap<>();
//        for(Character ch : a.toCharArray()){
//            int counter =0;
//            if(!set1.containsKey(ch)){
//                set1.put(ch, 1);
//            }
//            else {
//                counter = set1.get(ch) + 1;
//                set1.put(ch,counter);
//            }
//        }
//        for(Character ch : b.toCharArray()){
//            int counter =0;
//            if(!set2.containsKey(ch)){
//                set2.put(ch, 1);
//            }
//            else {
//                counter = set2.get(ch) + 1;
//                set2.put(ch,counter);
//            }
//        }
//        if(set1.equals(set2)) return true;
//        else return false;

        //Approach 2- Time complexity O(n), space complexity O(1) besides the give string no other data structures
        for(int i=0; i<a.length();i++){
            if(b.contains(String.valueOf(a.charAt(i)))){
                // b.replace(a.charAt(i),' ');
                int index=b.indexOf(a.charAt(i));
                if(index>0 & index<b.length()-1){
                    String s1 = b.substring(index+1,b.length());
                    String s2 = b.substring(0,index);
                    b=s1.concat(s2);
                }
                else if(index ==0) {
                    b = b.substring(1);
                }
                else if(index == b.length()-1){
                    b = b.substring(0, index);
                }
            }
            else{
                return false;
            }
        }
        return true;

    }

    public static void queueMethod(){
        Stack<String> priorityQueuequeue = new Stack<>();
        Queue<String> arrayDequeue = new ArrayDeque<>(4);

        priorityQueuequeue.add("banana");
        priorityQueuequeue.add("apple");
        priorityQueuequeue.add("kiwi");
        priorityQueuequeue.add("strawberry");

        arrayDequeue.add("banana");
        arrayDequeue.add("apple");
        arrayDequeue.add("kiwi");
        arrayDequeue.add("strawberry");

        System.out.println(priorityQueuequeue);
        System.out.println(arrayDequeue);

        priorityQueuequeue.pop();
        arrayDequeue.poll();

        System.out.println(priorityQueuequeue);
        System.out.println(arrayDequeue);


    }
//aabbbaaa -> aa#3b#3a

    public static String stringParser(String inputString){
        if(inputString.length()<=1) return inputString;
        String parseString ="";
        int n=inputString.length();
      //  HashMap<Character, Integer> mapping = new HashMap<>();
        int counter=0,i=0;
        char ch = inputString.charAt(0);
        while(i<n){
             ch = inputString.charAt(i);
             counter=1;
            for(int j=i+1; j<n;j++){
                if(ch != inputString.charAt(j)) {
                    if(counter >=3)
                        parseString = parseString + "#" + counter + ch;
                    else
                        parseString += String.valueOf(ch).repeat(counter);
                    break;
                }
                counter++;
            }
//            if(counter >=3)
//                 parseString = parseString + "#" + counter + ch;
            i+=counter;
        }
        if(counter >=3)
            parseString = parseString + "#" + counter + ch;
        else
            parseString += String.valueOf(ch).repeat(counter);

        return parseString;

        }


}
