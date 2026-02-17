public class MergeSort{
    static int[] mergeSort(int[] array,int leftIndex, int rightIndex) {
        if (leftIndex >=rightIndex) {
            int[] returnArray = new int[1];
            returnArray[0]=array[leftIndex];
            return  returnArray;
        }
        int midIndex = (leftIndex + rightIndex) / 2;

        int[] arr1 = new int [midIndex - leftIndex+1];
        arr1= mergeSort(array, leftIndex, midIndex);

        System.out.println(" arr1 length: "+ arr1.length);
        int[] arr2 = new int[rightIndex-midIndex];

        arr2 = mergeSort(array, midIndex+1, rightIndex);

        System.out.println(" arr2 length: "+ arr2.length);

        System.out.print("aar1 ");
        for (int i: arr1){
            System.out.print(" "+ i);
        }
        System.out.println();
        System.out.print("aar2: ");

        for (int i: arr2){
            System.out.print(" "+ i);
        }
        System.out.println();


        int i = 0; // pointer for arr1
        int j = 0; // pointer for arr2
        int m = arr1.length;

        int n = arr2.length;

        int k = leftIndex;
        System.out.println("Left Index: "+leftIndex);
        System.out.println("Right Index: "+rightIndex);
        System.out.println("Mid Index: "+midIndex);

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                array[k++] = arr1[i++];
            } else {
                array[k++] = arr2[j++];
            }
        }

        while (i < m) {
            array[k++] = arr1[i++];
        }

        while (j < n) {
            array[k++] = arr2[j++];
        }

        System.out.println("Before return array: ");
        for(int g: array){
            System.out.print(g+"  ");
        }
        return array;
    }
}