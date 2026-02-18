class Solution {
    public int minimumRounds(int[] tasks) {
        int n = tasks.length;
        int rounds=0;
        Arrays.sort(tasks);

        for(int i =0;i<n;){
            int count=0;
            int num=tasks[i];
            while(i<n && tasks[i]==num){
                i++;
                count++;
            }
            // if(count%5==0 && count%3==0 ){
            //     rounds=rounds+count/3;
            // }
            // else  if(count%5==0 ){
            //     rounds=rounds+2*(count/);
            // }

            if(count==1){
                return -1;
            }
            if(count%3==0){
                rounds=rounds+ count/3;
            }
            else{
                rounds=rounds+ 1+ count/3;
            }

        }
        return  rounds;
    }
}