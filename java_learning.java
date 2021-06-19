import java.util.*;
public class java_learning {
    public static void main(String[] args){
        // System.out.println("Hello World");
        String[] arr = {"one","two","three","four"};
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr));
        // System.out.println(arr[0]);

        ArrayList<String> names = new ArrayList<String>(5);
        // System.out.println(names);
        names.add("BOB");
        names.add("SARAH");
        names.add("John");
        // names.remove("BOB");
        Collections.reverse(names);
        // System.out.println(names);
        // System.out.println(names.length());
        // System.out.println(names.contains("Bob"));
        // System.out.println(names.size()-2);


        enum Sample{
            ONE,
            TWO,
            THREE
        }
        
        for (Sample sam : Sample.values()) {
            System.out.println(sam);
        }

    }
}


