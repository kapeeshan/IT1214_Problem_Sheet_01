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

    ParkingLot[] parkinglot=new ParkingLot[5];
    int vehiclesparked=parkinglot.length;

    void park(String licensePlate,String ownerName,int hoursParked){
            int i=0;
            parkinglot[i]=new ParkingLot(licensePlate,ownerName,hoursParked);
            i++;
    }

    void remove(String licensePlate)
    int removeIndex;
     for (int i = 0; i < vehiclesparked; i++) {
                if (parkinglot[i].equals(licensePlate)) {
                    removeIndex= i;
                    break;
                }
            }
    for (int i = removeIndex; i < vehiclesparked- 1; i++) {
            parkinglot[i] = parkinglot[i + 1];
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