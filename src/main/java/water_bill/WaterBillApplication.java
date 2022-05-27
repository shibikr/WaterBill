package water_bill;

import water_bill.dto.WaterBillInput;
import water_bill.lib.FileProcessor;

import java.io.IOException;

public class WaterBillApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to water bill generation system!");
        if(args.length != 0 && args[0] != null) {
            FileProcessor fileProcessor = new FileProcessor(args[0]);
            WaterBillInput waterBillInput = fileProcessor.readFile();
            System.out.println(waterBillInput.toString());
        } else {
            System.out.println("Please provide valid filepath");
        }
    }
}