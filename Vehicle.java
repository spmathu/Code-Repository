public class Vehicle {
    String brand;
    int wheel;

    private String getBrand() {
        return brand;}

    private int getWheel() {
        return wheel;} 

    private void setBrand(String brand){
        this.brand=brand;}

       private void setWheel(int wheel){
        this.wheel=wheel;} 

    
    public static void main(String[] args) {
        Vehicle car=new Vehicle();
        Vehicle bike=new Vehicle();

        car.setBrand("Audi");
        car.setWheel(4);

        bike.setBrand("Royal Enfield");
        bike.setWheel(2);

        System.out.println(" Car Brand :" +car.getBrand() + "            "+"NO of Wheels :"+ car.getWheel());
        System.out.println(" Car Brand :" +bike.getBrand() + "   "+"NO of Wheels :"+ bike.getWheel());


    }
    
}
