package passenger;

import idgen.PassengerIdGen;

public class Passenger {

    String name;
    int contactInfo;
    int PassId;

    public Passenger(String name,int contactInfo){
        this.name = name;
        this.contactInfo = contactInfo;
        this.PassId = PassengerIdGen.genPassengerId();
    }

    public int getPassId(){
        return PassId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactInfo(){
        return contactInfo;
    }

    public void setContactInfo(int contactInfo) {
        this.contactInfo = contactInfo;
    }
}
