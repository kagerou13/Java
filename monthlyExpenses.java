public class monthlyExpenses {
   public static void main(String[] args) {
      /**
       * This is for implement what I learn yesterday
       */

      System.out.println("This is my first program\n");
      int salary = 2400000;
      boolean dailySnacks = true;
      final String favoSnack = "Ultramilk";
      double priceperDay = 10000.0;
      int priceMilk = 6000;
      
      int otherSnacks = (int) priceperDay - priceMilk;
      int sumdailySnacks = otherSnacks + priceMilk;
      System.out.println("Daily Expenses : "+sumdailySnacks);

      int sumweeklySnacks = sumdailySnacks * 7;
      System.out.println("Weekly Expenses : "+ sumweeklySnacks);

      int summonthlySnacks = sumweeklySnacks * 4;
      System.out.println("Monthly Expenses : "+summonthlySnacks);

      int remaindSalary = salary -= summonthlySnacks;
      System.out.println("Remaind Salary : "+remaindSalary);

      int forMyParent = 250000;
      int finalremaindSalary = remaindSalary -= forMyParent;
      System.out.println("Final Remaind Salary : "+finalremaindSalary);

      String warning = "lavish";
      System.out.println("Don't be "+warning);

      float phi = 3.14F;
      int circle = 50;
      double sum = (circle * circle) * phi;
      System.out.printf("%d * %d * %.2f = %.2f\n",circle,circle,phi,sum);
   }
}
