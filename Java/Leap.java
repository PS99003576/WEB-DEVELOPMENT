import java.util.*;

class Leap{



    public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter The Year:");
          int year = sc.nextInt();

        if(year%4 == 0)
        {
            if(year%100 == 0)
            {
                if(year%400 == 0)
                    System.out.println("Leap year");
                else   
                     System.out.println("Not Leap year");
            }
            System.out.println("Leap year");;
        }
        else{
            System.out.println("Not Leap year");
        }



    }
}