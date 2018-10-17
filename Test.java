public class Test {
    public static void main(String[] args) throws Exception{
        Doctor doctor = new Doctor("Khan Shan e Azam");
        Depertement depertement1 = new Depertement(new Cardiology("khan"));
        Depertement depertement = new Depertement(new Cardiology("khan"),new Doctor("Rashid"),new Doctor("Anees"),new Doctor("Habib"),new Hospital("Aga Khan","Gulshan",5349595,doctor,new Patient("Ali","Heart",18.25,depertement1,doctor),depertement1));
        Patient patient = new Patient("Gulzar","Heart ",18.5,depertement,doctor);
        Hospital hospital = new Hospital("T.O","gulshan",0213232,doctor,patient,depertement);

        hospital.addPatiants();
    }
}
