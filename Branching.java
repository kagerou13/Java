public class Branching {
    public static void main(String[] args) {
        //Branching Program
        int math = 90;
        if (math > 70){
            System.out.println("You are good");
        }else{
            System.out.println("Try Hard Next Time");
        }

        switch (math) {
            case 90:
                System.out.println("Very Good");
                break;
            case 80:
                System.out.println("Good");
                break;
            case 70:
                System.out.println("Enough");
                break;
            default:
                break;
        }
    }
}
