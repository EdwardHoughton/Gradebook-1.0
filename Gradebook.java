//This code is still faulty=====n
//this is encapsulation
public abstract class Gradebook {
    String firstName, lastName, name;
    // double grade;
    // double GPA;
    //Gradebook(){
    //     ArrayList<String> stringList = new ArrayList<String>();//List for the name of person
    //     ArrayList<Double> doubleList = new ArrayList<Double>();//List for the grade of the person with the name
    //     //ArrayList<Double> doubleList2 = new ArrayList<Double>();//List for the GPA
    // }
    // //constructor
    public void Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //constructor for name
    //sets a name
    public void setName(String name){
        this.name = name;
    }
    //returns a name
    public String getlastName(String lastName){
        return lastName;
    }
    public String getfirstName(String firstName){
        return firstName;
    }
    //returns a name
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return String.format("%s %s", getfirstName(firstName), getlastName(lastName));
    }
}
//     // Constructor for Grade
//     public void grade(double grade){
//         this.grade = grade;
//     }
//     //Set the grade
//     public void setGrade(double grade){
//         this.grade = grade;
//     }
//     //Get the Grade
//     public Double getGrade(){
//         return grade; //Return the Grade
//     }

//     public void GPA(double GPA){
//         this.GPA = GPA;
//     }

//     public void setGPA(double GPA){
//         this.GPA = GPA;
//     }

//     public double getGPA() {
//         return GPA;
//     }
// }