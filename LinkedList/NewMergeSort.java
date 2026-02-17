public class NewMergeSort {

    static void newMergeSort(int [] array , int leftIndex, int rightIndex){

        if(leftIndex>=rightIndex){
            return;
        }
        int midIndex = (leftIndex+rightIndex)/2;

        newMergeSort(array,leftIndex,midIndex);
        newMergeSort(array,midIndex+1,rightIndex);
        merge(array,leftIndex,midIndex,rightIndex);
    }

    static void merge(int[] array, int leftIndex, int midIndex, int rightIndex){
         int n1 = midIndex-leftIndex+1;
         int n2 = rightIndex-midIndex;

         int[] leftArray = new int[n1];
         int[] rightArray = new int[n2];

         int i,j,k;
         for(i=0;i<n1;i++){
             leftArray[i]=array[leftIndex+i];
         }
         for (j=0;j<n2;j++){
             rightArray[j]=array[midIndex+1+j];
         }

        i=0;
         j=0;
         k=leftIndex;

         while(i<n1 && j< n2){
             if(leftArray[i]<rightArray[j]){
                 array[k++]=leftArray[i++];
             }
             else
                 array[k++]=rightArray[j++];
         }
         while(i<n1){
             array[k++]=leftArray[i++];

         }
        while(j<n2){
            array[k++]=rightArray[j++];
        }
    }

    static void displayArray(int[] array){
        for(int i: array){
            System.out.print(i+" ");
        }
    }

}