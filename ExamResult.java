/**
 * This is for implemented switch-case concept
 */
public class ExamResult{
   public static void main(String[] args) {
      String name = "Odin";
      int math = 10;
      int language = 5;
      int physic = 9;
      int chemistry = 10;

      switch (math) {
         case 10:
            System.out.println("Perfect Result");
            break;
         case 5:
            System.out.println("Nice Try, good luck for next time");
            break;
         default:
            break;
      }
   }
}