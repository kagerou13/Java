import java.util.*;

/*
 * Input x Integer what include range of primitive data type
 */

public class DataType{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();   // number of line
        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong(); //input number that will we check below
                System.out.println(x+" can be fitted in:");

                //check data type
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE){
                    System.out.println("* short");
                }    
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                //print when input is not include range of data type
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close(); //close the object
    }
}



