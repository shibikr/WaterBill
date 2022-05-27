package water_bill.dto;

import java.util.List;

public class WaterBillInput {
    private List<List<String>> lines;
    public WaterBillInput(List<List<String>> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "WaterBillInput{" +
                "lines=" + lines +
                '}';
    }
}
