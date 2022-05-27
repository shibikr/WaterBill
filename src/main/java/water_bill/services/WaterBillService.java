package water_bill.services;

import water_bill.dto.WaterBillInput;
import water_bill.models.Bill;

public class WaterBillService {
    private WaterBillInput waterBillInput;

    public WaterBillService(WaterBillInput waterBillInput) {
        this.waterBillInput = waterBillInput;
    }

    public void generateBill() {
        Bill bill = new Bill(1, 1);
        System.out.println(bill.getTotalWaterConsumed() + " " + bill.getTotalCost());
    }
}
