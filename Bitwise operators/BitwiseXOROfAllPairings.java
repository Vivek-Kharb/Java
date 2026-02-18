class Solution {
    public int xorAllNums(int[] num1, int[] num2) {

        int x1=0;
        int x2=0;
        int n1=num1.length;
        int n2=num2.length;
        for(int i =0;i<num1.length;i++){
            x1=x1^num1[i];
        }

        for(int i =0;i<num2.length;i++){
            x2=x2^num2[i];
        }

        if(n1%2==0 && n2%2==0){
            return 0;
        }

        if(n1%2==0){
            return x1;
        }
        if(n2%2==0){
            return x2;
        }

        return x1^x2;
    }
}