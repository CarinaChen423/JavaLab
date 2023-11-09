import java.util.Arrays;
//Bubble sorting
//Task1A: Create an array from 10-1; Use one for loop to switch numbers to 9-1, the last one is 10
//Task1B: Add one more for loop, add counter++ in every loop, counter should show 135 as result
//Task2: Reduce inner loop interactions and the counter should be 99; Don't let the program check twice the sorting numbers
//Task3: Don't let the program check when the array already sorted. Counter should be 10
public class Lab6Task1 {
    public static void main(String[] args) {
        int [] array={10,9,8,7,6,5,4,3,2,1};
        int [] table={1,2,3,4,5,6,7,8,9,10};
        int counter=0;
        boolean toSort=true;

        System.out.println("Before: ");
        System.out.println(Arrays.toString(table));

//        for(int j=0;j<array.length-1;j++){
//            counter++;
//            for(int i=0;i<array.length-1;i++){
//                counter ++;
//                if(array[i]>array[i+1]){
//                    counter ++;
//                    int greater=array[i];
//                    array[i]=array[i+1];
//                    array[i+1]=greater;
//                }
//            }
//        }

//        for(int j=1;j<array.length;j++){
//            counter++;
//            //Reduce the loop  times
//            for(int i=0;i<array.length-j;i++){
//                counter ++;
//                if(array[i]>array[i+1]){
//                    counter ++;
//                    int greater=array[i];
//                    array[i]=array[i+1];
//                    array[i+1]=greater;
//                }
//            }
//        }

        for(int j=1;j<table.length&&toSort;j++){
            toSort=false;
            counter++;
            for(int i=0;i<table.length-j;i++){
                counter ++;
                if(table[i]>table[i+1]) {
                    counter++;
                    int greater = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = greater;
                    toSort = true;
                    }
                }
            }

        System.out.println("After:");
        System.out.println(Arrays.toString(table));
        System.out.println("Numbers of actions: "+counter);

        }
    }

