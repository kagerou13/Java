import java.util.*;

public class Parse{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Converting from data type to others
        
        //Numeric to numeric
        //Widening
        int i = 132;

        //widening casting
        long l = i;
        float f = i;
        double d = i;

        //Print to display
        System.out.println("Numeric Casting");
        System.out.println("\nWidening Casting - small to large data type");
        System.out.println("Integer to Long: "+l);
        System.out.println("Integer to Float: "+f);
        System.out.println("Integer to Double: "+d);
        
        //Narrowing Casting
        double dou = 45.8;
        int inn = (int) dou;
        float fl = (float) dou;

        //Print to display
        System.out.println("\nNarrowing Casting - large to small type data");
        System.out.println("Double to Integer: "+inn);
        System.out.println("Double to Float: "+fl);

        //add byte and byte
        byte a = 10;
        byte b = 10;
        byte c = (byte) (a + b);
        /*
         * Specially addition byte and byte such above, must convert to byte
         */
        System.out.println("\n(byte) 10 + 10"+c);


        //String to Numeric

        String str = "354";
        
        //parse String to Integer use parse
        int strToInt = Integer.parseInt(str);
        double strToDouble = Double.parseDouble(str);
        float strToFloat = Float.parseFloat(str);

        //Print to display
        System.out.println("String to Integer : "+strToInt);
        System.out.println("String to Double: "+strToDouble);
        System.out.println("String to Float: "+strToFloat);
        
        //parse string to numeric use valueOf
        int strToInt2 = Integer.valueOf(str);
        double strToDouble2 = Double.valueOf(str);
        float strToFloat2 = Float.valueOf(str);

        //Print to display
        System.out.println("\nConvert String to Numeric use valueOf()");
        System.out.println("Strin to Integer: "+strToInt2);
        System.out.println("Strin to Double: "+strToDouble2);
        System.out.println("Strin to Float: "+strToFloat2);
        

        //Numeric to String
        int exInt = 5;
        double extDou = 13.2;
        float extFlo = 2.6F;
        
        //convert numeric to string use valueOf
        String strInt = String.valueOf(exInt);
        String strDou = String.valueOf(extDou);
        String strFlo = String.valueOf(extFlo);

        //Print to display
        System.out.println("\nParse Numeric to String use valueOf");
        System.out.println("-Integer to String: "+strInt);
        System.out.println("-Double to String: "+strDou);
        System.out.println("-Float to String: "+strFlo);

        //convert numeric to string
        String strInt2 = Integer.toString(exInt);
        String strDou2 = Double.toString(extDou);
        String strFlo2 = Float.toString(extFlo);

        //Print to Display
        System.out.println("\nParse Numeric to String Type.toString");
        System.out.println("--Integer to String: "+strInt);
        System.out.println("--Double to String: "+strDou);
        System.out.println("--Float to String: "+strFlo);


        /*
         * Conclusion:
         * 1. Widening Casting - large to small type data
         * 2. Narrowing Casting - small to large type data
         * 3. Convert String to Numeric
         *    a. valueOf() 
         *    - int i = Integer.valueOf(str)
         *    - double d = Double.Value(str)
         *    - float f = Float.valueOf(str)
         *    b. Parse...()
         *    - int i = Integer.parseInt(str)
         *    - double d = Double.parseDouble(str)
         *    - float f = Float.parseFloat(str)
         * 4. Convert Numeric to String
         *    a. valueOf()
         *    - String str = String.valueOf(i)
         *    - String str = String.valueOf(f)
         *    - String str = string.valueOf(d)
         *    b. to
         *    - String str = Integer.tostring(i)
         *    - String str = Integer.tostring(d)
         *    - String str = Integer.tostring(f)
         */
    }
}








