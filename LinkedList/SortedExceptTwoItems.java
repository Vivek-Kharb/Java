public class SortedExceptTwoItems{
    void sortedExceptTwoItems(int[] array){
        int firstIndex=0;
        int secondIndex=0;
        int n = array.length;


        System.out.println("Original array");
        for(int k: array){
            System.out.print(" " + k);
        }
        System.out.println();


        if(array[0]>array[1])
            firstIndex=0;
        if(array[n-1]<array[n-2]){
            secondIndex=n-1;
        }


        int i=0,j=n-1;
        while(array[i+1]>array[i]){
          i++;
        }
        firstIndex=i;
        while (array[j]>array[j-1]){
            j--;
        }
        secondIndex=j;

        System.out.println("First index: "+firstIndex);
        System.out.println("second index: "+secondIndex);
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;


        System.out.println("sorted array ");
        for(int k: array){
            System.out.print(" " +k);
        }
        System.out.println();
    }
}