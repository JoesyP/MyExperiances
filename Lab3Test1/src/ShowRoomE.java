//import java.io.File;
import java.io.*;
import java.util.*;

public class ShowRoomE {
    private ArrayList<DrivableE> vehicles = new ArrayList<DrivableE>();

    public ShowRoomE(ArrayList<DrivableE> vehicles) {
        this.vehicles = vehicles;
    }
     
    public ShowRoomE(String x) {
        this.vehicles = new ArrayList <DrivableE>();
    }
    public void setVehicles(ArrayList<DrivableE> vehicles) {
        this.vehicles = vehicles;
    }
    public ArrayList<DrivableE> getVehicles(){
        return vehicles;
    }

    public void loadCar() throws IOException {
        File file = new File("data/cars.csv");
        Scanner reader = new Scanner(file);
        String make, model, color;
        int year;
        double price;
        reader.nextLine();
        while (reader.hasNextLine()) {
            String dataLine = reader.nextLine();
            String[] dataSplits = dataLine.split(",");
            make = dataSplits[0];
            model = dataSplits[1];
            year = Integer.parseInt(dataSplits[2].trim());
            color = dataSplits[3];
            price = Double.parseDouble(dataSplits[4].trim());
            CarE car1 = new CarE(make, model, year, color, price);
            vehicles.add(car1);
        }
       
        reader.close();

    }

    public DrivableE getCars(int car) {
        return vehicles.get(car);
    }




    //maybe add .toString() to vehicles.get(x) if theirs a prob w output
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < vehicles.size(); i++) {
            result += vehicles.get(i) + " ";
        }
        return result;
    }
}