import enamm.Degree;
import enamm.Payment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Mentor einstein = new Mentor("Эйнштейн Алберт",56,"male", Degree.MIDDLE);
        System.out.println(einstein.toString()+"\nЯзык программирования: "+einstein.pl.FLUTTER);
        Mentor cocojambo = new Mentor("Coco Jambo", 22,"non-binary",Degree.JUNIOR );
        System.out.println(cocojambo.toString()+"\nЯзык программирования: "+cocojambo.pl.JAVA);
        Mentor sirius = new Mentor("Sirius Black",32,"male",Degree.MIDDLE);
        System.out.println(sirius.toString()+"\nЯзык программирования: "+sirius.pl.JAVASCRIPT);

        Student tima = new Student("Tima",27,"male",Payment.PAYED);
        System.out.println(tima.toString()+"\nЯзык программирования: "+tima.pl.JAVA);
        Student dasha = new Student("Darya",26,"famale",Payment.FREE);
        System.out.println(dasha.toString()+"\nЯзык программирования: "+dasha.pl.FLUTTER);
        Student samsa = new Student("Samsa s myasom",0,"no gender",Payment.DELETED);
        System.out.println(samsa.toString()+"\nЯзык программирования: "+samsa.pl.JAVASCRIPT);



    }
}
