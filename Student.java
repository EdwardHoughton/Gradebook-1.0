//SubClass
//This should work
public class Student extends Person {
    String grade;
@Override
public String getname(){
    return grade;
}
public String grade(String grade){
    this.grade = grade;
    return grade;
}
public Student(String firstName, String lastName){
    super(firstName, lastName);
}
}