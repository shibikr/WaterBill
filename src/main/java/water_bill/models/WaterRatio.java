package water_bill.models;

public class WaterRatio {
    private int corporationWater;
    private int boreWellWater;

    public WaterRatio(int corporationWater, int boreWellWater) {
        this.corporationWater = corporationWater;
        this.boreWellWater = boreWellWater;
    }

    public int getCorporationWater() {
        return corporationWater;
    }

    public int getBoreWellWater() {
        return boreWellWater;
    }
}
