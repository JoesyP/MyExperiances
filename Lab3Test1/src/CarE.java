
public class CarE implements DrivableE {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    public CarE(String make, String model,int year, String color, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    public String getModel(){
        return model;
    }
    public String getMake(){
        return make;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public void drive() {
    	System.out.println("The "+getMake()+" "+getModel()+" was drivin 20 miles!");
        }

    @Override
    public void stop() {
    	System.out.println("The "+getMake()+" "+getModel()+" was stopped and shut off!");
    }

    @Override
    public void start() {
    	System.out.println("The "+getMake()+" "+getModel()+" was started to drive!");
    }
    @Override
    public String toString(){
    	 String Print = String.format("Make: %-13s Model: %-8s Year: %-5d Color: %-8s Price %8.2f",
                 getMake(), getModel(), getYear(), getColor(), getPrice());
    	 return Print;
    }
}
