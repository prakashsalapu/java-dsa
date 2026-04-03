
/*
 Class: A class is a Blueprint to  create an Object. It defines 3 things.
         They are : 1.State (variables/fields) Ex: name, roll, x, y, etc.
                    2.Behaviour (methods/functions) Ex: fun(), eat(), setup(), etc.
                    3.Identity (Object Identity) Ex: Student bhanu = new Student();

 Object: An Object is an Instance of a class.(Physical Entity) 
         Object = State + Behavior + Identity

 new = dynamically allocates memory & returns a ref variable to it.

 Constructor = Constructor is a special method that runs when you create an object & it allocates some variables.

 this = 'this' keyword is a  reference variable that refers to the 'current object' of the class.
*/

//import java.util.Arrays;
public class Introduction {
    public static void main(String[] args) {

//        Student[] bhanu = new Student[5];
//        System.out.println(Arrays.toString(bhanu));

        Student bhanu = new Student(75,"bhanu",8.5);
        Student prakash = new Student(85,"Prakash",9.5);
        Student rahul = new Student(65,"Rahul",6.5);

//        bhanu.roll = 75;
//        bhanu.name = "Prakash";
//        bhanu.grade = 8.5f;
//        System.out.println(bhanu.roll);
//        System.out.println(bhanu.name);
//        System.out.println(bhanu.grade);

//        System.out.println(bhanu.roll +" "+ bhanu.name+" " + bhanu.grade);
//        System.out.println(prakash.roll +" "+ prakash.name+" " + prakash.grade);

        bhanu.greeting();
        prakash.greeting();
        rahul.greeting();


    }

}
class Student {

    int roll; //  instance variables
    String name;
    double grade;



    Student (int roll, String name, double grade) {
       this.roll = roll; // current Object's variable (ex: bhanu or prakash or rahul)
       this.name = name;
       this.grade = grade;
    }
    void greeting () {
        System.out.println("\nRoll Num : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Garde : " + grade);
    }


}
