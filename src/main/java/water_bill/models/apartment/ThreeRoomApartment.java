package water_bill.models.apartment;

import water_bill.models.WaterRatio;

public class ThreeRoomApartment extends Apartment {
    private int noOfGuests;
    private WaterRatio waterRatio;

    public ThreeRoomApartment(int noOfGuests, WaterRatio waterRatio) {
        super(noOfGuests, waterRatio, 5);
        this.noOfGuests = noOfGuests;
        this.waterRatio = waterRatio;
    }
}
