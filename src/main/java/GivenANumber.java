public class GivenANumber {
    public static int reverseBits(int n){
        int result=0;
        for(int i=0;i<32;i++){
            int currentBit = (n >> i) & 1;
            result = result | (currentBit << (31-i));
        }
        return result;
    }
}
