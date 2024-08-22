import java.util.*;

class Tasksheet117 {
      public static void main(String[] args) {
      Scanner num = new Scanner(System.in);
       
      System.out.print("Input the 1st number: ");
      int x = num.nextInt();
       
      System.out.print("Input the 2nd number: ");
      int y = num.nextInt();
       
      System.out.print("Input the 3rd number: ");
      int z = num.nextInt();
       
       
      if (x > y)
       if (x > z)
        System.out.println("The greatest: " + x);
       
      if (y > x)
       if (y > z)
        System.out.println("The greatest: " + y);
       
      if (z > x)
       if (z > y)
        System.out.println("The greatest: " + z);

        if (x == y && x == z)
        {
            System.out.println("All numbers are equal");
        }
        else
        {
            System.out.println("All numbers are different");
        }
    }
}
   
    
