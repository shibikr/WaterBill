package water_bill.models.apartment;

import water_bill.models.WaterRatio;

public class ThreeRoomApartment extends Apartment {

    private static final int NUMBER_OF_PEOPLE = 5;
    public ThreeRoomApartment(int noOfGuests, WaterRatio waterRatio) {
        super(noOfGuests, waterRatio, NUMBER_OF_PEOPLE);
    }
}
