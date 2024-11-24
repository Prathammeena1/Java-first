package OOPs;

public class Student {
    int rollNum;
    String name;

//  runtime polymorphisms  //
    Student() {

    }
    Student(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }

    @Override
    public String toString() {
        return STR."Student{rollNum=\{rollNum}, name='\{name}'}";
    }
}
