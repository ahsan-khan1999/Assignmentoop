public class Emergency extends Depertement {

    public Emergency(Depertement name, Doctor doctor1, Doctor doctor2, Doctor doctor3) {
        super(name, doctor1, doctor2, doctor3,new Hospital("Aga","Gulshan",93457874));
    }
}
