public class Patient {

    private String name;
    private String disease;
    private double age;
    private Depertement depertement;
    private Doctor doctor;

    public Patient(String name, String disease, double age,Depertement depertement,Doctor doctor) {
        this.name = name;
        this.disease = disease;
        this.age = age;
        this.depertement=depertement;
        this.doctor=doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Depertement getDepertement() {
        return depertement;
    }

    public void setDepertement(Depertement depertement) {
        this.depertement = depertement;
    }
}
