class Solution {
    public double trimMean(int[] arr) {
        int length = arr.length;
        Arrays.sort(arr);

        double limit = 0.05*length;

        int start= (int)limit;
        int end  = length -(int)limit;
        double sum=0,newLength=0;

        for(int i = start; i<end;i++){
            sum=sum+arr[i];
            newLength++;
        }
        return sum/newLength;


    }
}