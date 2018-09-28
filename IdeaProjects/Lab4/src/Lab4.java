import java.lang.*;
import java.util.*;

public class Lab4
{
    public static void main(String[] args)
    {
      Scanner scnr = new Scanner(System.in);

      int option = 0;

      System.out.println("Do you have a dog or a cat?\n" +
                         "1. Dog\n" + "2. Cat");
      option = scnr.nextInt();

      if (option == 1)
      {
          System.out.println("You have a dog!");
      }

      else if (option == 2)
      {
          System.out.println("Eww! You have a cat!");
      }

      else
      {
          System.out.println("You have nothing!");
      }

      return;
    }
}
