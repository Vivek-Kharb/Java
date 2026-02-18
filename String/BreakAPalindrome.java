class Solution {
    public String breakPalindrome(String s) {
        int n = s.length();
        String answer ="";

        if(n==1){
            return answer;
        }

        for(int i =0;i<n/2;i++){
            if(s.charAt(i)!='a'){
                String sub = s.substring(0,i);
                answer= sub+'a';
                sub = s.substring(i+1);
                answer=answer+sub;
                return answer;
            }
        }
        // if(n%2==0){
        String sub = s.substring(0,n-1);
        answer= sub+'b';
        return answer;
        // }
        // else {
        //     String sub = s.substring(0,n-1);
        //      answer= sub+'b';
        //     return answer;
        // }

        //r//eturn answer;
    }
}