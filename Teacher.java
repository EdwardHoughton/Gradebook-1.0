//SubClass
//This should work as well
public class Teacher extends Person {
    String suffix;
@Override
public String getname(){
    return suffix;
    //add grade
}
public Teacher(String firstName, String lastName){
    super(firstName, lastName);
}
}
