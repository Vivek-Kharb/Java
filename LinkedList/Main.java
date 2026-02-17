import java.util.*;
import java.lang.* ;

public class Main {

    public static void main(String[] args) {

        //
//        String s = sc.nextLine();
//
//        System.out.println(s);
//
//        System.out.println(s.length());
//        System.out.println(s.charAt(7));
//        System.out.println(s.indexOf("k"));
//
//        System.out.println(s.compareTo("vivek l"));
//
//        System.out.println(s.contains("kha"));
//        System.out.println(s.startsWith("v"));
//        System.out.println(s.toLowerCase());
//        System.out.println(s.toUpperCase());
//        s = s+ "added";
//        System.out.println(s);
//        System.out.println(s+10+20);
//        System.out.println(s+(10+20));
//        System.out.println(10+20+s);
//
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {1,2,3};
//
//        System.out.println("arr1: "+ arr1[0]);
//        System.out.println("arr2: "+ arr2[0]);
//        arr2[0]=99;
//        System.out.println("arr2: "+ arr2[0]);
//
//        String x ="hello";
//        String y = "hello";
//        //y="yoyo";
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(y);
//        System.out.println(x.equals(y));
//        System.out.println(x==y);


        Scanner sc = new Scanner(System.in);


        StringBuilder sb = new StringBuilder("stringbuilder");
        System.out.println(sb);
        sb.append("123");
        System.out.println(sb);
        sb.setCharAt(2,'Z');
        System.out.println(sb);
        sb.insert(1,'Y');
        System.out.println(sb);

        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.reverse());



    }

}


//       static void sortLexicographicallyUsingSelection(String[] fruits){
//            for(int i =0;i<fruits.length;i++){
//                int minIndex = i;
//                for (int j = i+1; j < fruits.length; j++) {
//
//                    if(fruits[minIndex].compareTo(fruits[j])<0)
//                        continue;
//                    else{
//                        minIndex=j;
//                    }
//                    //  for(int k =0; k < Math.min(fruits[minIndex].length(),fruits[j].length());k++){
////                        System.out.println("K LOOP: "+ k);
////                        if(fruits[minIndex].charAt(k)<fruits[j].charAt(k))
////                            break;
////                        if(fruits[minIndex].charAt(k)>fruits[j].charAt(k)){
////                            minIndex=j;
////                            System.out.println("new Min index: "+minIndex);
////                            break;
////                        }
////                        if(fruits[minIndex].charAt(k)==fruits[j].charAt(k) && k==fruits[j].length()-1){
////                            minIndex=j;
////                            System.out.println("another min: "+ minIndex);
////                            break;
////                        }
////                    }
//               }
//                if(minIndex!=i) {
//                String temp = fruits[minIndex];
//                fruits[minIndex] = fruits[i];
//                fruits[i] = temp;
//                }
//                System.out.println("Print after every swap");
//                for(String m : fruits){
//                    System.out.print(m+" ");
//                }
//                System.out.println();
//        }
//
//           for(String m : fruits){
//               System.out.print(m+" ");
//            }
//
//        }



//    static void moveZerosToRightUsingBubbleSort(int[] array){
//        for(int i=0;i<array.length;i++){
//            for (int j = 0; j < array.length-i-1; j++) {
//                if(array[j]==0 && array[j+1]!=0){
//                    int temp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//        }
//
//        for (int i:array){
//            System.out.print(i+" ");
//        }
//    }

//        static void moveZerosToRightAndKeepRestInOrder(int[] array){
//            int zeroCounter=0;
//            int nonZeroCounter=0;
//            for(int i =0;i<array.length;){
//                if(array[i]!=0){
//                    i++;
//                    continue;
//                }
//                while(i<array.length && array[i]==0  ){
//                    zeroCounter++;
//                    i++;
//                }
//                if(zeroCounter>0 && i!=array.length){
//                    while (i<array.length  && array[i]>0  ){
//                        nonZeroCounter++;
//                        i++;
//                    }
//                    for(int k =0;k<nonZeroCounter;k++){
//                        array[i-zeroCounter-nonZeroCounter+k]=array[i-nonZeroCounter+k];
//                        array[i-nonZeroCounter+k]=0;
//                    }
//                    for(int l=0;l<zeroCounter;l++){
//                        array[i-zeroCounter+l]=0;
//                    }
//               }
//                i=i - zeroCounter;
//                if(i+zeroCounter==array.length)
//                    break;
//                zeroCounter=0;
//                nonZeroCounter=0;
//          }
//            for(int m : array){
//                System.out.print(m+" ");
//            }
//
//        }
//


//    static void insertionSortIncreasing(int[] array ){
//
//        for(int i=0;i< array.length-1;i++){
//                if(array[i+1]<array[i]){
//                    for(int j=i+1;j>0;j--){
//                        if(array[j]<array[j-1]){
//                            int temp=array[j];
//                            array[j]=array[j-1];
//                            array[j-1]=temp;
//                        }
//                    }
//                }
//           }
//        for(int i : array){
//            System.out.print(i+" ");
//        }
//    }


//
//    static void selectionSortIncreasing(int[] array){
//
//        for(int i=0;i<array.length-1;i++){
//            int minIndex = i;
//            for(int j=i+1;j<array.length;j++){
//                  if(array[j]<array[i]){
//                      minIndex=j;
//                  }
//             }
//            if(minIndex!=i) {
//                int temp = array[minIndex];
//                array[minIndex] = array[i];
//                array[i] = temp;
//            }
//        }
//
//        for(int i : array){
//        System.out.print(i+" ");
//        }
//
//    }


//    static void bubbleSortIncreasing(int[] array){
//
//        for(int i=0;i<array.length;i++){
//            for(int j=0 ;j<array.length-i-1;j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        for(int i : array){
//            System.out.print(i+" ");
//        }
//    }



//    static void keypadCombinations(String digits, String[] kp, String res){
//        if(digits.length()==0){
//            System.out.print(res+" ");
//            return;
//        }
//        int currentNumber = digits.charAt(0)-'0';
//        String currentChoice = kp[currentNumber];
//        for(int i=0;i<currentChoice.length(); i++){
//            keypadCombinations(digits.substring(1),kp,res+currentChoice.charAt(i) );
//        }
//     }



//    static int frogJump(int[] heightOfStones, int numberOfStones,int index){
//        if(index==numberOfStones-1){
//            return 0 ;
//        }
//        int oneJump = Math.abs(heightOfStones[index+1]-heightOfStones[index])
//                + frogJump(heightOfStones, numberOfStones, index+1);
//        if(index==numberOfStones-2) return oneJump;
//        int twoJump = Math.abs(heightOfStones[index+2]-heightOfStones[index])
//                +  frogJump(heightOfStones, numberOfStones, index+2);
//
//        return Math.min(oneJump,twoJump);
//    }

//    static void printSumOfAllsubsetsOfIntegerArray(int[] list,int sum) {
//
//        if(list.length==0){
//            System.out.println(sum);
//            return;
//        }
//        int first = list[0];
//        printSumOfAllsubsetsOfIntegerArray(Arrays.copyOfRange(list ,1,list.length), sum+first);
//        printSumOfAllsubsetsOfIntegerArray(Arrays.copyOfRange(list ,1,list.length), sum);
//    }



//    static void printAllSubsequencesOfAString(String s,String currentSubsequence){
//        if(s.length()==0){
//            System.out.println(currentSubsequence);
//            return;
//        }
//        char first = s.charAt(0);
//        printAllSubsequencesOfAString(s.substring(1),currentSubsequence+first);
//        printAllSubsequencesOfAString(s.substring(1),currentSubsequence);
//
//    }

//     static ArrayList<String> returnAllSubsequencesOfAString(String s) {
//         ArrayList<String> ans = new ArrayList<>();
//         if(s.length()==0){
//             ans.add("");
//             return ans ;
//         }
//         char first = s.charAt(0);
//         ArrayList<String> smallAns=  returnAllSubsequencesOfAString(s.substring(1));
//        for(String ss: smallAns){
//            ans.add(ss);
//            ans.add(first+ss);
//        }
//         return ans;
//    }

//     static boolean checkStringPalindrome(String s ){
//       if (s.length()==0 || s.length()==1){
//           return true;
//       }
//        if (s.charAt(0)!=s.charAt(s.length()-1))
//            return false;
//        boolean isPalindrome = true;
//        isPalindrome = checkStringPalindrome(s.substring(1, s.length() - 1));
//         return isPalindrome;
//      }

//     static String reverseString(String s){
//        if(s.length()==0){
//            return "";
//        }
//        String ans = new String();
//        ans = ans + reverseString(s.substring(1));
//        char ch= s.charAt(0);
//        ans+=ch;
//        return ans;
//     }

//     static String removeOccurrances(String s, char ch){
//        String ans = new String();
//       if(s.length()==0){
//            return "";
//       }
//       if(s.charAt(0)!=ch) {
//           ans += s.charAt(0);
//       }
//        ans =ans+ removeOccurrances(s.substring(1),ch);
//        return ans;
//     }

//    static ArrayList<Integer> getAllIndexForTarget(int target, int index, int[] array){
//        if(index==array.length){
//            return new ArrayList<>();
//        }
//        ArrayList<Integer> ans = new ArrayList<>();
//        if(array[index]==target){
//            ans.add(index);
//        }
//        ans.addAll(getAllIndexForTarget(target, index+1,array));
//        return ans;
//    }




//    static void printIndex(int n , int index, int[] array){
//
//       if(index==array.length){
//           return;
//       }
//       if(array[index]==n){
//            System.out.println(index);
//       }
//        printIndex(n,index+1,array);
//        return;
//    }
//
//
//
//      static boolean find(int index, int n, int[] array){
//
//        boolean isPresent=false;
//          if(index==array.length){
//              return false;
//          }
//        if(array[index]==n){
//            return true;
//        }
//        return find(index+1,n, array);
//    }
//
//
//
//    static int printMax( int index ,int[] array ){
//        if(index==array.length-1){
//            return array[index];
//        }
//        int max = printMax(index+1,array);
//        if(max>array[index]){
//            return max;
//        }
//        else{
//            return array[index];
//        }
//    }
//
//    static void printArray(int index ,int[] array){
//        if(index==array.length)
//            return ;
//        System.out.println(array[index]);
//        printArray(index+1, array);
//   }
//
//
//
//    static int eGCD(int x , int y){//euclid method for GCD
//        if(y==0){
//            return x;
//        }
//        return  eGCD(y,x%y);
//    }
//
//    static int rGCD(int x, int y){//reminder method for GCD
//        while(y%x!=0){
//           int rem=y%x;
//            y=x;
//            x=rem;
//        }
//        return x;
//    }
//
//    static int sumWithAlternateSign(int n){
//        if(n%2==0){
//            return -(n/2);
//       }
//        else{
//            return -(n/2)+n;
//        }
//    }
//
//    static void printMultiples(int x, int y) {
//        if (y == 0) {
//            return ;
//        }
//        printMultiples(x,y-1);
//        System.out.println(x*y);
//    }

//    static int power(int x, int y) {
//
//        if (y == 0) {
//            return 1;
//        }
//        if (y % 2 == 0) {
//            return power(x, y / 2) * power(x, y / 2);
//        } else {
//            return x * power(x, y / 2) * power(x, y / 2);
//        }
//    }

//    static int power(int x, int y){
//        if(y==0 ){
//            return 1;
//        }
//        return x*power(x,y-1);
//    }

//    static int sumOfDigits(int n) {
//        int sum = 0;
//        if (n % 10 == n) {
//            return n;
//        }
//        return sumOfDigits(n / 10) + n % 10;
//    }
//
//
//    static int printFibonnaci(int n) {
//        int i = 0;
//        int sum = 0;
//
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        return printFibonnaci(n - 1) + printFibonnaci(n - 2);
//    }
//
//
//    static int printFactorial(int n) {
//        int fact;
//        if (n == 1) {
//            return 1;
//        }
//
//        return n * printFactorial(n - 1);
//    }
//
//    static void printDecreasing(int n) {
//        if (n == 1) {
//            System.out.println("N :" + n);
//            return;
//        }
//        System.out.println("N: " + n);
//        printDecreasing(n - 1);
//    }
//
//
//    static void printIncreasing(int n) {
//
//        if (n == 1) {
//            System.out.println("N : " + n);
//            return;
//        }
//        printIncreasing(n - 1);
//        System.out.println("N : " + n);
//    }

//        LinkList list = new LinkList();
//
//        DoubleLinkList dl = new DoubleLinkList();
//
//
//        System.out.println("1. Add Head: "+ dl.insertAtHead(50).value);
//        dl.printList();
//        System.out.println("2. Add Head: "+dl.insertAtHead(55).value);
//
//        dl.printList();
//        System.out.println("3. Add Head: "+dl.insertAtHead(60).value);
//        dl.printList();
//        System.out.println("4. Add Head: "+dl.insertAtHead(65).value);
//
//        dl.printList();
//
//        System.out.println("5. Add tail: "+dl.insertAtTail(70).value);
//
//        dl.printList();
//
//        System.out.println("6. Add tail: "+dl.insertAtTail(75).value);
//
//        dl.printList();
//
//        System.out.println("7. Add at 5: "+dl.insertAtIndex(80,5).value);
//
//        dl.printList();
//
//        System.out.println("8. Add  at 3: "+dl.insertAtIndex(90,3).value);
//
//        dl.printList();
//
//        System.out.println("9. Delte head: "+dl.deleteAtHead().value);
//
//        dl.printList();
//
//        System.out.println("10. Delte head: "+dl.deleteAtHead().value);
//
//        dl.printList();
//
//
//        System.out.println("11 .Delte tail: "+dl.deleteAtTail().value);
//
//        dl.printList();
//
//        System.out.println("10. Delte head: "+dl.deleteAtHead().value);
//
//        dl.printList();
//
//        System.out.println("12. Delte tail: "+dl.deleteAtTail().value);
//        dl.printList();
//
//
//        System.out.println("1. Add Head: "+ dl.insertAtHead(50).value);
//        dl.printList();
//        System.out.println("2. Add Head: "+dl.insertAtHead(55).value);
//
//        dl.printList();
//        System.out.println("3. Add Head: "+dl.insertAtHead(60).value);
//        dl.printList();
//        System.out.println("4. Add Head: "+dl.insertAtHead(65).value);
//
//        dl.printList();
//        System.out.println("13. Delte at 1: "+dl.deleteAtIndex(1).value);
//
//        dl.printList();
//        System.out.println("14. Add  at 3: "+dl.insertAtIndex(80,3).value);
//        dl.printList();
//
//        System.out.println("15. Add at 3: "+dl.insertAtIndex(100,3).value);
//        dl.printList();
//        System.out.println("16. Add at 0: "+dl.insertAtIndex(120,0).value);
//
//        dl.printList();
//
//        System.out.println("17. Add at 50 : "+dl.insertAtIndex(800,50).value);
//
//        dl.printList();
//
//
//        System.out.println("18. Delte at 5: "+dl.deleteAtIndex(5).value);
//
//        dl.printList();
//
//        System.out.println("19 .Delete at 3 : "+dl.deleteAtIndex(3).value);
//
//        dl.printList();
//
//
//        System.out.println(dl.findNode(65).value);
//        System.out.println(dl.findNode(500).value);

//
//        list.insertFirst(3);
//        list.printList();
//        System.out.println("FIRST NODE DELETED : "+list.deleteFirst());
//        list.printList();
//
//        list.insertFirst(2);
//        list.printList();
//
//        list.insertFirst(1);
//        list.printList();
//        System.out.println("FIRST NODE DELTED : "+list.deleteFirst());
//        list.insertAtEnd(5);
//        list.printList();
//
//        list.insertAtEnd(6);
//        list.insertAtEnd(7);
//        list.insertAtEnd(8);
//
//        list.insertAtIndex(4,3);
//        list.printList();
//
//        list.insertAtEnd(11);
//        list.printList();
//        System.out.println("END NODE DELETED "+list.deleteEndNode());
//
//        list.printList();
//
//        list.insertAtIndex(9,8);
//        list.insertAtIndex(0,0);
//        list.printList();
//        System.out.println("END NODE DELETED"+list.deleteEndNode());
//        list.printList();
//        list.insertAtIndex(12,11);
//        System.out.println("END NODE DELETED"+list.deleteEndNode());
//        list.insertAtIndex(10,10);
//
//        list.printList();
//
//        System.out.println("FIRST NODE DELTED : "+ list.deleteFirst());
//        list.printList();
//
//        list.insertAtEnd(45);
//        list.insertAtEnd(44);
//        list.insertAtEnd(43);
//        list.insertAtEnd(42);
//        list.insertAtEnd(41);
//        list.insertAtEnd(40);
//
//        list.insertAtIndex(32,3);
//
//        list.insertAtIndex(31,3);
//        list.printList();
//        System.out.println( "DELETED AT INDEX 1: "+ list.deleteAtIndex(1) );
//        list.printList();
//        System.out.println( " DELETED AT INDEX 5: "+ list.deleteAtIndex(5));
//        list.printList();
//        System.out.println( " DELETED AT INDEX 3 :"+list.deleteAtIndex(3));
//        list.printList();
//        System.out.println( " DELETED AT INDEX 3 :"+list.deleteAtIndex(3));
//
//        list.printList();


