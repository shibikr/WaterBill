package water_bill.models.apartment;

import water_bill.models.WaterRatio;

public class TwoRoomApartment extends Apartment {
    private int noOfGuests;
    private WaterRatio waterRatio;

    public TwoRoomApartment(int noOfGuests, WaterRatio waterRatio) {
        super(noOfGuests, waterRatio, 3);
        this.noOfGuests = noOfGuests;
        this.waterRatio = waterRatio;
    }
}
