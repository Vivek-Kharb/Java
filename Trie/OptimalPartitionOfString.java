class Solution {
    public int partitionString(String s) {
        int minimum=0;
        int i =0;
        int[] arr = new int[26];

        while(i<s.length()){
            int ch= s.charAt(i)-'a';
            if(arr[ch]==0){
                arr[ch]=1;
                i++;
            }
            else{
                minimum++;
                arr = new int[26];
            }
            if(i==s.length()){
                minimum++;
                break;
            }

        }

        return minimum;
    }
}