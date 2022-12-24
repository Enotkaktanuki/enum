import enamm.Degree;
import enamm.Payment;

public class Mentor extends Person{

    public Degree degree;


    public Mentor(String FIO, int age, String gender, Degree degree) {
        super(FIO, age, gender);
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "\nMentor: " +
                "\nРанг: " + degree +
                "\nФИО: " + FIO +
                "\nВозраст: " + age +
                "\nПол: " + gender;
    }
}