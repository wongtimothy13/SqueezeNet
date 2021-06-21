public class calculator {
    
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }

    public static double division(int num1, int num2){
        return (double)num1 / num2;
    }

    public static int square(int num1, int num2){
        return (int) Math.pow(num1, 2);
    }
    public static void main(String[] args){
        int tmp = MagicCalculator.factorial(10);
        System.out.println(tmp);
    }
}

class MagicCalculator extends calculator{
    public static double squareroot(int num1){
        return (double)num1/num2;
    }

    public static double sine(double num1){
        return Math.sin(num1);
    }

    public static double cosine(double num1){
        return Math.cos(num1);
    }

    public static double tangent(double num1){
        return Math.tan(num1);
    }

    public static int factorial(int num1){
        if (num1 != 0){
            return num1 * MagicCalculator.factorial(num1-1);
        } else {
            return 1;
        }
    }
}
