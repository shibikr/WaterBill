package water_bill.dto;

import java.util.List;

public class WaterBillInput {
    private List<String> input;
    public WaterBillInput(List<String> lines) {
        this.input = lines;
    }

    public List<String> getInput() {
        return input;
    }
}
