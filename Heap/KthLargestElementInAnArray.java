class Solution {
    public int findKthLargest(int[] nums, int k) {
        // one method is to sort array and finiding
        // other method is using heap and keeping heap size to k+1 only

        int n = nums.length;
        int L = 0;
        int R = n-1;

        int pivotIndex = 0;

        while(true){
            pivotIndex = partitionAlgo(nums, L, R);

            if(pivotIndex==k-1){
                break;
            }
            else if(pivotIndex>k-1){
                R=pivotIndex-1;
            }
            else{
                L=pivotIndex+1;
            }
        }
        return nums[pivotIndex];
    }

    public int partitionAlgo(int[] nums, int L, int R){
        int P = nums[L];
        int i =L+1;
        int j =R;

        while(i<=j){
            if(nums[i]<P && nums[j]>P){
                swap(nums, i,j);
                i++;
                j--;
            }
            if(nums[i]>=P){
                i++;
            }
            if(nums[j]<=P){
                j--;
            }
        }

        swap(nums,L, j);
        return j;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}