import enamm.PL;

public abstract class Person {

    public PL pl;
    String FIO;

    int age;
    String gender;

    public Person() {}

    public Person(String FIO, int age, String gender) {
        this.FIO = FIO;
        this.age = age;
        this.gender = gender;
    }
}
