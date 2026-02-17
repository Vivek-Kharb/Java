import java.util.*;
import java.lang.* ;

public class BucketSort{
    void bucketSort(float[] array){

        int num;

        ArrayList<Float>[] buckets = new ArrayList[11];

        for(int i=0;i<11;i++){
            buckets[i]= new ArrayList<Float>();
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
            num = (int)Math.ceil((array[i])*10);
            System.out.print(num+" ");
            System.out.println();
            buckets[num].add(array[i]);
        }

        for(int i=0;i<11;i++) {
            Collections.sort(buckets[i]);
        }

        int index=0;
        for(int i=0;i<11;i++){
            for (int j=0;j< buckets[i].size();j++){
                array[index++]= buckets[i].get(j);
            }
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
       }
    }
}