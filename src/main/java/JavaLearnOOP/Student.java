package JavaLearnOOP;

public class Student extends Person {
    int course;

    Student (int heigth, float weight, int course){
        super(heigth, weight);
        this.course = course;
    }
}
