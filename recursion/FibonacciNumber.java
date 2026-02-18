class Solution {
    int[] fibo = new int[31];
    public int fib(int n) {
        Arrays.fill(fibo, -1);
        fibo[0]=0;
        fibo[1]=1;
        return fibo(n);
    }

    int fibo(int n){
        if(fibo[n]!=-1){
            return fibo[n];
        }
        return fibo[n]=  fibo(n-1)+fibo(n-2) ;
    }
}