import java.util.*;

class Factorial{ 
	static int i;
	static Scanner sc = new Scanner(System.in);
    static int number = sc.nextInt();

    static int len=String.valueOf(number).length();

    static int [] array = new int[len];

    public static int [] output_array = new int[100];
    void digit_Factorial(int array_number){
       
        if (array_number == 0 || array_number == 1)
            array[i] = 1;
        else{
            int fact = 1;
                
                fact = fact * i;
                array[i] = fact;    
            }   
          //  return array_number*digit_Factorial(array_number-1);
        }
        
  //have to do
    public static void main(String [] args){
      /*  Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int len=String.valueOf(number).length();

        int [] array = new int[len];
        
        */

        Factorial F_number = new Factorial();

        for(i = 0;i < len; i++){
            int r = number%10;
            array[len-i-1] = r;
            number = number/10;
        }

        for(int i = 0;i<len;i++){
           F_number.digit_Factorial(array[i]);
        }    
        for(int i = 0;i<len;i++){
            System.out.println(output_array[i]);
         }    
        sc.close();
    }
    
}