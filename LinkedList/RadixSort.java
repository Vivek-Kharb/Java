public class RadixSort{

        void radixSort(int[] array){
            int max=findMax(array);
            int maxDigits = findNumberOfDigits(max);
            int[] counter = new int[10];
            int[] solution = new int[array.length];


            System.out.println("original array");
            displayArray(array);

            for(int k=1; max/k >0 ; k*=10){
                makePrefixCountArray(array,k,counter);
                for(int i=array.length-1;i>=0;i--){
                    solution[counter[(array[i]/k)%10]-1]=array[i];
                    counter[(array[i]/k)%10]--;
                }

                for(int i =0;i<array.length;i++){
                    array[i]=solution[i];
                }
                System.out.println("Solution for k: "+ k );
                displayArray(solution);

                System.out.println("for k: "+ k);
           }

            System.out.println("Solution array");
            displayArray(solution);
        }


        void makePrefixCountArray(int[] array, int k, int[] counter ){

           for(int i=0;i<10;i++){
               counter[i]=0;
           }

            for(int i=0;i<array.length;i++){
                counter[(array[i]/k)%10]++;
            }
            System.out.println("counter before prefix k: "+ k);
            displayArray(counter);
            for(int i=1;i<counter.length;i++){
                counter[i]=counter[i-1]+counter[i];
            }
            System.out.println("counter after prefix K : " + k);
            displayArray(counter);

        }

        int findMax(int[] arrray){
            int max=arrray[0];
            for (int i=0;i<arrray.length;i++){
                if (arrray[i]>max) max=arrray[i];
            }
            System.out.println("Max: "+max);
            return max;
        }

        void displayArray(int[] array){
            for(int p : array){
                System.out.print(p+" ");
            }
            System.out.println();
        }


        int findNumberOfDigits(int max) {
            int noOfDigits = 1;
            while (max / 10 != 0) {
                noOfDigits++;
                max = max / 10;
            }
            System.out.println("no of Digits of max : " +noOfDigits);
            return noOfDigits;
        }

}