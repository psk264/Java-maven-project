import java.util.HashMap;

public class GivenANumber {
    public static int reverseBits(int n){
        int result=0;
        for(int i=0;i<32;i++){
            int currentBit = (n >> i) & 1;
            result = result | (currentBit << (31-i));
        }

        return result;
    }

    public static int reverseNumber(int num){

        if(num>=0 && num<10) return num;
        int ans = 0;
        while(num!=0){
            ans = ans*10 + num%10;
            num /=10;
        }
        return ans;

    }
}
