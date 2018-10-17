public class Depertement {

    private Depertement name;
    private Doctor doctor1;
    private Doctor doctor2;
    private Doctor doctor3;
    private Hospital hospital;

    public Depertement(){}

    public Depertement(Depertement name){
        this.name = name;
    }

    public Depertement(Depertement name, Doctor doctor1, Doctor doctor2, Doctor doctor3,Hospital hospital) {
        this.name = name;
        this.doctor1 = doctor1;
        this.doctor2 = doctor2;
        this.doctor3 = doctor3;
        this.hospital=hospital;
    }

    public Depertement getName() {
        return name;
    }

    public void setName(Depertement name) {
        this.name = name;
    }

    public Doctor getDoctor1() {
        return doctor1;
    }

    public void setDoctor1(Doctor doctor1) {
        this.doctor1 = doctor1;
    }

    public Doctor getDoctor2() {
        return doctor2;
    }

    public void setDoctor2(Doctor doctor2) {
        this.doctor2 = doctor2;
    }

    public Doctor getDoctor3() {
        return doctor3;
    }

    public void setDoctor3(Doctor doctor3) {
        this.doctor3 = doctor3;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
