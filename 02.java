class Vehicle {
    
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

    public String getOwnerName() {
        return ownerName;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
     public int getHoursParked() {
        return hoursParked;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setHoursParked(int hoursParked) {
        this.hoursParked = hoursParked;
    }


}

class ParkingLot{
    Vehicle vehicle;

    ParkingLot[] parkinglot=new ParkingLot[5];
    int vehiclesparked=parkinglot.length;


    public ParkingLot(String licensePlate, String ownerName, int hoursParked) {
        vehicle.setLicensePlate(licensePlate);
        vehicle.setOwnerName(ownerName);
        vehicle.setHoursParked(hoursParked);
    }

    public ParkingLot() {

    }

    void park(String licensePlate,String ownerName,int hoursParked){
            int i=0;
            parkinglot[i]=new ParkingLot(licensePlate,ownerName,hoursParked);
            i++;
    }

    void remove(String licensePlate){
    int removeIndex;
     for (int i = 0; i < vehiclesparked; i++) {
                if (parkinglot[i].equals(licensePlate)) {
                    removeIndex= i;
                    for (int j = removeIndex; j < vehiclesparked- 1; j++) {
                    parkinglot[i] = parkinglot[i + 1];
                        }
                    break;
                }
                
            }
    
    }

    void display(){
        System.out.println("Parked Vehicle Details");
        for (int i = 0; i < vehiclesparked; i++) {
            System.out.println(parkinglot[i]);
        }
    }

}

class Main{
    public static void main(String[] args) {
        ParkingLot p1=new ParkingLot();

        p1.park("ABC123", "John Doe", 2);
        p1.park("XYZ789", "Jane Smith", 4);
        p1.park( "LMN456",  "Bob Brown", 1);

        p1.remove( "XYZ789");
        p1.display();
    }
}