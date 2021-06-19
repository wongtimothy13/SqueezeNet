import java.util.Scanner; 

public class control_flow_project {
    
    public class AsciiChars 
    {
        public static void printNumbers()
        {
            // TODO: print valid numeric input
        }

        public static void printLowerCase()
        {
            // TODO: print valid lowercase alphabetic input
        }

        public static void printUpperCase()
        {
            // TODO: print valid uppercase alphabetic input
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = input.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("Do you wish to continue to the interactive portion? y/n");
        String rep = input.next();
        if (rep.equals("y") || rep.equals("yes")){
            // System.out.println("Caught");
        } else {
            System.out.println("Please return back later to complete the surbey.");
            System.exit(0);
        }

    }



}