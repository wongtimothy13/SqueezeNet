import java.util.*;

public class java_learning {
    public static void main(String[] args) {
        // System.out.println("Hey!");
        Scanner sc = new Scanner(System.in);
        // String temp = sc.nextLine();
        // System.out.println(temp);

        
        ArrayList<Integer> arL = new ArrayList<Integer>();
        arL.add(145);
        arL.add(23);
        arL.add(26);
        arL.add(345);
        arL.add(235);
        Collections.sort(arL);

        final double startTime = System.currentTimeMillis();
        int Sum = 0;
        for (int i=0; i<1_000_000_000; i++){
            Sum += i;
        }
        final double endTime = System.currentTimeMillis();


        // Collections.sort(arL);
        // System.out.println(arL);
        System.out.println(Sum);
        System.out.println((double)((endTime - startTime)/1000));
                

    }
}


