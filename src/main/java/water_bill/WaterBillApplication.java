package water_bill;

public class WaterBillApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        if(args.length != 0 && args[0] != null) {
            System.out.println(args[0]);
        }
    }
}