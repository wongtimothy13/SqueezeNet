import java.util.Arrays;

public class arrays {
    
    // Number 1: Sum all values within array assumping integer array.
    public static int addarr(int[] args){
        int sum=0;
        for (int i=0; i<args.length; i++){
            sum += args[i];
        }
        return sum;
    }
    
    // Number 2: The output is the maximum value in the array which is 6.

    public static int[] toPower(int size, int power){
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = (int) Math.pow(i, power);
        }
        return arr;

    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4}; // a randomly initialized array to test
        int sum;
        sum = addarr(arr); // Print out test example for number #1.
        System.out.println(sum);

        int[] narr = toPower(5, 2); // Print our test example for #3.
        System.out.println(Arrays.toString(narr));
    }



}
