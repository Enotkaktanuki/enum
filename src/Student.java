import enamm.Degree;
import enamm.Payment;

public class Student extends Person{


    public Payment payment;

    public Student(String FIO, int age, String gender, Payment payment) {
        super(FIO, age, gender);
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "\nStudent:" +
                "\nDegree: " + payment +
                "\nФИО: " + FIO +
                "\nВозраст: " + age +
                "\nПол: " + gender;
    }
}
