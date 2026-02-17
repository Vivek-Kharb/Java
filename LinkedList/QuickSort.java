import java.util.*;
import java.lang.* ;

public class QuickSort{

     void quickSort(int[] array, int startIndex, int endIndex){

       if(startIndex>=endIndex){
           return;
       }

        int pivot = partition(array, startIndex, endIndex);
       quickSort(array, startIndex, pivot-1);
        quickSort(array, pivot+1, endIndex);
    }

       int partition(int[] array, int startIndex, int endIndex){
          int pivot=array[startIndex];
          int count=0;
          for(int i =startIndex+1;i<=endIndex;i++){
              if(array[i]<=pivot) count++;
          }
          int pivotIndex= startIndex+count;

          swap(array, startIndex, pivotIndex);
        int i = startIndex,j=endIndex;
          while(i < pivotIndex && j > pivotIndex){
              while (array[i] <= pivot) i++;
              while (array[j] > pivot) j--;
              if(i < pivotIndex && j > pivotIndex ){
                  swap(array, i, j);
                  i++;
                  j--;
              }
          }

          return pivotIndex;
         }

      void swap (int[] array, int x, int y){
        int temp=array[x];
        array[x]=array[y];
        array[y]=temp;
      }

      void displayArray(int[] arr){
            for(int i : arr){
                System.out.print(i+" ");
            }
      }
}