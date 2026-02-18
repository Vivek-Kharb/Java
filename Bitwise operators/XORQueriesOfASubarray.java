class Solution {


    public int[] xorQueries(int[] arr, int[][] queries) {
        int [] answer = new int[queries.length];

        int[] cummulativeXor = new int[arr.length];

        cummulativeXor[0]=arr[0];
        for(int i =1;i<arr.length;i++){
            cummulativeXor[i]=cummulativeXor[i-1]^arr[i];
        }

        for(int i=0;i<queries.length;i++){
            int startIndex = queries[i][0];
            int endIndex = queries[i][1];

            if(startIndex>0) answer[i]=cummulativeXor[endIndex]^cummulativeXor[startIndex-1];
            else  answer[i]=cummulativeXor[endIndex];
        }

        return answer;
    }
    // public int[] xorQueries(int[] arr, int[][] queries) {
    //     int [] answer = new int[queries.length];

    //     for(int i=0;i<queries.length;i++){
    //         int startIndex = queries[i][0];
    //         int endIndex = queries[i][1];

    //         int xor=0;
    //         for(int j=startIndex;j<=endIndex;j++){
    //             xor=xor^arr[j];
    //         }
    //         answer[i]=xor;
    //     }

    //     return answer;
    // }
}