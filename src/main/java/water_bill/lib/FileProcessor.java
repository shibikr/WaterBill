package water_bill.lib;

import water_bill.dto.WaterBillInput;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileProcessor {
    private String filePath;

    public FileProcessor(String filePath) {
        this.filePath = filePath;
    }

    public WaterBillInput readFile() throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(this.filePath));
        try {
            String line = br.readLine();
            while (line != null) {
                lines.add(line);

                line = br.readLine();
            }
            return  new WaterBillInput(lines);
        } finally {
            br.close();
        }
    }
}
