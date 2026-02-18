class Solution {
    public void nextPermutation(int[] array) {
        int n = array.length;
        int i = n-1;

        for(;i>0;i--){
            if(array[i-1]<array[i]){
                break;
            }
        }

        if(i!=0){
            int swapIndex=i-1;
            for(int j=n-1;j>=i;j--){
                if(array[j]>array[i-1]){
                    swapIndex=j;
                    break;
                }
            }
            int temp = array[i-1];
            array[i-1]=array[swapIndex];
            array[swapIndex]=temp;
        }

        int end = n-1;
        while(i<end){
            int temp2 = array[end];
            array[end]=array[i];
            array[i]=temp2;
            i++;
            end--;
        }



        return;
    }
}