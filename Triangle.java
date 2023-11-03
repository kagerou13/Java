public class Triangle {
   public static void main(String[] args) {
      for (int i = 0; i < 5; i++){
         for (int j = 0; j < 5; j++){                
             if (j + i >= 4){
                 System.out.print("*");
             }else{
                 System.out.print(" ");
             }
         }
         for (int k = 0; k < 5; k++){
             if (k < i ){
                 System.out.print("*");
             }else{
                 System.out.print(" ");
             }
         }
         System.out.println();
      }
      System.out.println();

      //simple code
      int n = 15;
      for (int a = 0; a < n; a++){
         for (int b = 0; b < n; b++){
            if (a + b < n || b > a-1){
               System.out.print(" ");           
            }else{
               System.out.print("*");
            }
         }
         System.out.println();
      }
      System.out.println();
   }
}
