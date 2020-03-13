package JavaLearnOOP;

public class Main {


    public static void main(String[] args){
        final float pi = 3.14f;
        System.out.println(Person.summ);

        Person maks = new Person(180, 74.3f);
               maks.say("Hi, I'm Max");

        System.out.println(maks.height);

        Person Oleg = new Person();
        Oleg.height = 173;
        Oleg.weight = 98.5f;

        Oleg.say("Hello World!");
        System.out.println(Oleg.weight);

        Student vova = new Student(175, 78.5f, 3);
        System.out.println(vova.course);

    }

}
