package Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DataSave {
    ArrayList<Product> p = new ArrayList<>();
    ArrayList<Product> product;
    
    public boolean saveData(String[] data) {
        try{ 
            FileWriter fileWriter = new FileWriter("Warehouse.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write(data[0] + "#" + data[1] + "#" +
                                  data[2] + "#" + data[3] + "#" +
                                  data[4] + "#" + data[5] + "#" +
                                  data[6] + "#" + data[7] + "#" +
                                  data[8] + "#" + data[9] + "\n");
            printWriter.close();
            fileWriter.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public ArrayList <Product> readData() {
        try {
            product = new ArrayList<>();
            FileReader fileReader = new FileReader("Warehouse.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while(line != null) {
                String data[] = line.split("#");
                Product prd = new Product(data[0], data[1], data[2],
                                Integer.parseInt(data[3]), 
                                Integer.parseInt(data[4]),
                                Integer.parseInt(data[5]),
                                Integer.parseInt(data[6]), data[7], 
                                data[8], data[9]);
                product.add(prd);
                line = bufferedReader.readLine();
                p = product;
                }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
}
