public class CountSort{
    void countSort(int[] array){
        int max= findMax(array);
        int[] counter = new int[max+1];
        int[] countPrefixSum = new int[max+1];
        int[] solution = new int[array.length];

        for(int i=0;i<array.length;i++){
            counter[array[i]]++;
        }

        System.out.println("Counter aaray");
        for(int k : counter){
            System.out.print(k+" ");
        }

        System.out.println();

        for(int i=0;i<counter.length;i++){
            if(i==0){
                countPrefixSum[i]=counter[i];
            }
            else{
                countPrefixSum[i]=countPrefixSum[i-1]+counter[i];
            }
        }

        System.out.println("Prefix counter aray");
        for(int k : countPrefixSum){
            System.out.print(k+" ");
        }
        System.out.println();

         for(int i=array.length-1;i>=0;i--){
             solution[countPrefixSum[array[i]]-1]=array[i];
             countPrefixSum[array[i]]--;//countPrefixSum[array[i]]-1;
         }

        System.out.println("Solution array");
        for(int p : solution){
            System.out.print(p+" ");
        }
        System.out.println();




//        k=0;
//        for ( int i=0;i<counter.length;i++){
//            for(int j=0;j<counter[i];j++){
//                array[k++]=i;
//            }
//        }


    }

    int findMax(int[] arrray){
        int max=arrray[0];
        for (int i=0;i<arrray.length;i++){
            if (arrray[i]>max) max=arrray[i];
        }
        System.out.println("Max: "+max);
        return max;
    }
}