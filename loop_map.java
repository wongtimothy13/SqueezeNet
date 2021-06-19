import java.util.Scanner;
import java.util.HashMap;

import javax.xml.transform.Templates;

public class loop_map {

    public static void number1(){
        int count = 5;
        Scanner input = new Scanner(System.in); 
        int[] arr = new int[5];
        int number;
        for (int i=0; i<5; i++){
            System.out.println("Please provide 5 numbers one by one. You have "+count+" numbers left to provide.");
            number = input.nextInt();
            arr[i] = number;
            count--;
        }
        int min, max, product, sum;
        product = 1; 
        sum = 0;
        min = 99999;
        max = -99999;
        for (int i=0; i<5; i++){
            int temp = arr[i];
            if (min > temp){
                min = temp;
            }
            if (temp > max){
                max = temp;
            }
            product *= temp;
            sum += temp;
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Sum: "+sum);
        System.out.println("Product: "+product);
    }

    public static void number2(){
        Scanner input = new Scanner(System.in);
        HashMap<String, String> carInventory = new HashMap<String, String>();
        carInventory.put("Civic", "Honda");
        carInventory.put("Accord", "Honda");
        carInventory.put("Corolla", "Toyota");
        carInventory.put("S", "Tesla");
        carInventory.put("E", "Tesla");
        System.out.println("What car model are you looking for?");
        String model = input.nextLine();
        String suggest = carInventory.get(model);
        if (suggest != null){
            System.out.println("Oh, we have that model in our "+suggest+" section right this way!!.");
        } else {
            System.out.println("We do not carry this model. Would you like to look at our other options?");
        }
        
    }

    public static void main(String[] args){
        //Run code for number1
        number1();

        //Run code for number2
        number2();
    }
}
