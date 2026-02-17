public class BinarySearch {
    int binarySearch(int[] array, int target,int begin, int end){
        int midIndex = (end+begin)/2;
        if(begin>end){
            return -1;
        }
        if(target==array[midIndex]) {
            while(midIndex >=0 && array[midIndex]==target){
                midIndex--;
            }
            return midIndex+1;
        }
        else if (target<array[midIndex]){
            midIndex = binarySearch(array,target, begin,midIndex-1);
        }
        else
            midIndex = binarySearch(array,target,midIndex+1,end);

       return midIndex;
    }
}