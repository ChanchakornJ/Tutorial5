//Chanchakorn Jullapech
//672115007
public class CovidVaccine {
    int SID;
    String firstName;
    String lastName;
    String[] prevVaccine;
    public CovidVaccine(int SID,String firstName,String lastName,String[] prevVaccine){
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.prevVaccine = prevVaccine;
    }
    @Override
    public String toString() {
        String vaccines = String.join(", ", prevVaccine);
        return "SID: " + SID + ", " + firstName + " " + lastName + ", Previous Vaccines: " + vaccines;
    }

    
}
