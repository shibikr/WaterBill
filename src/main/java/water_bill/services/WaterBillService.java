package water_bill.services;

import water_bill.dto.WaterBillInput;
import water_bill.models.Bill;
import water_bill.models.WaterRate;
import water_bill.models.WaterRatio;
import water_bill.models.apartment.Apartment;
import water_bill.models.apartment.ThreeRoomApartment;
import water_bill.models.apartment.TwoRoomApartment;
import java.util.List;
import static java.util.Objects.isNull;

public class WaterBillService {
    private WaterBillInput waterBillInput;

    public WaterBillService(WaterBillInput waterBillInput) {
        this.waterBillInput = waterBillInput;
    }

    public void generateBill() {
        List<String> input = this.waterBillInput.getInput();
        Apartment apartment = buildApartmentDetails(input);
        if(isNull(apartment)) {
            System.out.println("Invalid input, please check");
            return;
        }
        WaterRate waterRate = new WaterRate();
        Bill bill = new Bill(apartment, waterRate);
        System.out.println(bill.getTotalWaterConsumed() + " " + bill.getTotalCost());
    }

    private Apartment buildApartmentDetails(List<String> input) {
        List<String> apartmentDetails = List.of(input.get(0).split(" "));
        int noOfGuests = getNoOfGuests(input);
        if(apartmentDetails.get(0).equals("ALLOT_WATER")) {
            WaterRatio waterRatio = getWaterRatio(apartmentDetails.get(2));
            if(apartmentDetails.get(1).equals("2")) {
                return new TwoRoomApartment(noOfGuests, waterRatio);
            } else if (apartmentDetails.get(1).equals("3")) {
                return new ThreeRoomApartment(noOfGuests, waterRatio);
            }
        }
        return null;
    }

    private WaterRatio getWaterRatio(String waterRatioInput) {
        String[] waterRatio = waterRatioInput.split(":");
        return new WaterRatio(convertToInt(waterRatio[0]), convertToInt(waterRatio[1]));
    }

    private int getNoOfGuests(List<String> input) {
        int noOfGuests = 0;
        for(int i = 1; i< input.size(); i++) {
            List<String> guestsCommand = List.of(input.get(i).trim().split(" "));
            if(guestsCommand.get(0).equals("BILL")) {
                return noOfGuests;
            } else if (guestsCommand.get(0).equals("ADD_GUESTS")) {
                noOfGuests+=convertToInt(guestsCommand.get(1));
            }
        }
        return noOfGuests;
    }

    private int convertToInt(String number) {
        return Integer.parseInt(number);
    }
}
