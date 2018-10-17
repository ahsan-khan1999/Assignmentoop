public class Pharmacy extends Depertement{

    private String panadol;
    private String disprine;
    private String jardin;
    private String telday;
    private String brufine;
    private String jardinD;

    public Pharmacy(Depertement name, Doctor doctor1, Doctor doctor2, Doctor doctor3) {
        super(name, doctor1, doctor2, doctor3,new Hospital("Aga","Gulshan",93457874));
    }

    public Pharmacy(String panadol , String disprine , String jardin ,String telday , String brufine , String jardinD){
        this.disprine=disprine;
        this.brufine=brufine;
        this.jardin=jardin;
        this.jardinD=jardinD;
        this.panadol=panadol;
        this.telday=telday;
    }

}
