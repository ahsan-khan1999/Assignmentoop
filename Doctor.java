public class Doctor {

    private Depertement name;
    private Patient patient1;
    private Patient patient2;
    private String Dname;


    public Doctor(Depertement name, Patient patient1, Patient patient2,String Dname) {
        this.name = name;
        this.patient1 = patient1;
        this.patient2 = patient2;
        this.Dname = Dname;
    }
    public Doctor(String Dname){
        this.Dname =Dname;

    }

    public Depertement getName() {
        return name;
    }

    public void setName(Depertement name) {
        this.name = name;
    }

    public Patient getPatient1() {
        return patient1;
    }

    public void setPatient1(Patient patient1) {
        this.patient1 = patient1;
    }

    public Patient getPatient2() {
        return patient2;
    }

    public void setPatient2(Patient patient2) {
        this.patient2 = patient2;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public void recomendedMadicanes(){


    }
}
