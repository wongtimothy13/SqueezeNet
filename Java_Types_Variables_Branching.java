/*  
Exercises: 
 Create a small program that defines some fields. 
 Try creating some illegal field names and see what kind of error the compiler produces. 
 Use the naming rules and conventions as a guide. 
 In the program you created, try leaving the fields uninitialized and print out their values. 
 Try the same with a local variable and see what kind of compiler errors you can produce. 
 Becoming familiar with common compiler errors will make it easier to recognize bugs in your code. 
*/

public class Java_Types_Variables_Branching {
    public static void main(String[] args) {
      //int 3jksdf; //Has to start with a letter
      /*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        Syntax error on token "3", delete this token

        at Java_Types_Variables_Branching.main(Java_Types_Variables_Branching.java:3) */

      int a = 5;
      int b = 0;
      // System.out.println(a/b); //Divide by Zero Error
      /* Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Java_Types_Variables_Branching.main(Java_Types_Variables_Branching.java:11) */


      System.out.printf(c); //using non-instantiated variable
      /* Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        c cannot be resolved to a variable

        at Java_Types_Variables_Branching.main(Java_Types_Variables_Branching.java:16) */

      System.out.printf("Continue Testing PLS") //Did not put ";" at the end
      /* 
      Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        c cannot be resolved to a variable
        Syntax error, insert ";" to complete Statement

        at Java_Types_Variables_Branching.main(Java_Types_Variables_Branching.java:16)
      */
    }
  }
  