public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        if(n==0)
            return 0;
        int req= 0;
        for(int i=0; i<32; i++){
            req <<= 1;
            if((n&1)== 1)
                req++;
            n >>=1;
        }
        return req;
    }
}
