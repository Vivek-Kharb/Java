class Solution {

    public int reverseBits(int n) {
        int rev=0;
        for(int i =0;i<32;i++){
            rev<<=1;
            rev = rev |(n&1);
            n>>=1;
        }
        return rev ;
    }


    // public int reverseBits(int n) {
    //     System.out.println("n: "+n);
    //     int rev=0;
    //     int i =0;
    //     while(n!=0){
    //         if((n&1)==1){
    //          rev = rev | ( 1<<(31-i));
    //         }
    //          n>>=1;
    //          i++;
    //     }
    //     return rev ;
    // }
}