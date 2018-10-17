import java.util.ArrayList;

public class Hospital {

    private String name;
    private String address;
    private long contact;
    private Doctor doctor;
    private Patient patient;
    private Depertement depertement;

    public Hospital(String name, String address, long contact,Doctor doctor,Patient patient,Depertement depertement) {
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.doctor=doctor;
        this.patient=patient;
        this.depertement=depertement;
    }
    public Hospital(String name, String address, long contact){
        this.name=name;
        this.contact=contact;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Depertement getDepertement() {
        return depertement;
    }

    public void setDepertement(Depertement depertement) {
        this.depertement = depertement;
    }

    public void addPatiants()throws NullPointerException{
        ArrayList<Patient> patiants = new ArrayList<>();
        patiants.add(new Patient("Gulzar","Heart",19.4,new Depertement(new Cardiology("khan")),new Doctor("Khan")));

        System.out.println(patiants.get(0).getAge()+"Depertement Is "+patiants.get(0).getDepertement().getName()+""+doctor.getDname()+patiants.get(0).getDepertement().getDoctor2());

    }

}
