//SuperClass
//This should work
public abstract class Person {
    String firstName, lastName, name;

    public Person(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
}
public String getlastName(String lastName){
    return lastName;
}
public String getfirstName(String firstName){
    return firstName;
}
public String getname(){
    return name;
}
}