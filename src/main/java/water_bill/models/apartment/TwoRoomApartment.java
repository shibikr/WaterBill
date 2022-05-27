package water_bill.models.apartment;

import water_bill.models.WaterRatio;

public class TwoRoomApartment extends Apartment {
    private static final int NUMBER_OF_PEOPLE = 3;

    public TwoRoomApartment(int noOfGuests, WaterRatio waterRatio) {
        super(noOfGuests, waterRatio, NUMBER_OF_PEOPLE);
    }
}
