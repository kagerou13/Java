import java.util.Arrays;
import java.util.Scanner;

public class App {

    //ask to order
    public static String askOrder(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What would you like to eat : ");
        
        String input = sc.next();
        return input;
    }

    // contains function
    public static boolean contains(String[] menu, String order){
        for (String item : menu){
            if (order.equals(item)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String[] fastFoodMenu = {"Burgers", "Nuggets", "Fries"};
        System.out.print("The fast food menu has these items : ");
        System.out.println(Arrays.toString(fastFoodMenu));
        int total = 0;
        String order = "";
        while (!order.equals("quit")) {
            order = askOrder();
            if (contains(fastFoodMenu, order)){
                total++;
            }else{
                System.out.println("Your order is not in our menu, please order again");
            }
        }

        var amount = 0;
        for (int i = 0; i < total; i++){
            amount+=2;
        }

        System.out.printf("The total for the order is $%1d\n", amount);
    }
}
