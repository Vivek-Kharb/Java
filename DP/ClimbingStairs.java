class Solution {


    public int climbStairs(int n) {

        if(n<=3){
            return n;
        }

        int[] memo = new int[n+1];
        memo[0]=0;
        memo[1]=1;
        memo[2]=2;

        for(int i =3;i<=n;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }

        return memo[n];

    }

    // int[] memo = new int[46];

    // public int climbStairs(int n) {

    //     Arrays.fill(memo,-1);
    //     memo[1]=1;
    //     memo[2]=2;

    //     return solution(n);//+ climbStairs(n-2);

    // }

    // int solution(int n){
    //    if(n<=0){
    //     return 0;
    //    }
    //     else if(memo[n]!=-1){
    //         return memo[n];
    //     }

    //     return memo[n]=solution(n-1)+solution(n-2);
    // }
}