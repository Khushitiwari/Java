
public class Oops{

    public static void main(String args[]){
      Pen p1 = new Pen(); // created a pen object calledd p1
      p1.setColor("Blue");
      System.out.println(p1.color);
      

      BankAccount user1 = new BankAccount();
      user1.username ="Khushi";

    }
     // Creating a student object and using copy constructor
     // calling a constructor
     Student s1 = new Student();
    // Student s2 = new Student("Khushi");
     s1.name ="Priya";
     s1.age = 19 ;
     s1.password = "abvh";

     Student s2 = new Studednt(s1); // copying s1 properties into s2
     s2.password = "qwerty";

    


    // Creating new animal

     Human khushi = new Human();
     khushi.eat();



  // creating new object for abstraction

    Donkey d = new Donkey();
    d.eat();
    d.walk();

    Monkey m = new Monkey();
    m.eat();
    m.walk();

}


//bank class
class BankAccount{
    public String username;
    private String password;
}

//classes name captial and fn name starts with small letter in java
  ass Pen { // Pen class

String color; // attributes
int tip;
int price;

String getColor(){ // getter 
    return this.color;
}

void setColor(String newColor){ // setter
    color = newColor;

}

void setTip(int newTip){
    tip = newTip;

}

}

// student class 

class Student {
    String name ;
    int age;
    
    float percentage; 
    STring password;


     // creating constructor of student for copying (copy constrcutor)
     Student(Student s1 ){
        this.name = s1.nmae;
        this.age = s1.age;
     }

}

 //constructors
 
    Student(){ // non parametrized constructor

        System.out.println("hello");

    }
   

   //parametrized constructor
    Student (String name) {
        this.name = name ;
    }


    //Animals constructor for showinf inheritance

    class Animals{
        void eat(){

            System.out.println("Eat");
        }

        void breathe(){

            System.out.println("breathe");
        }
    }

    class Fish extends Animals{

        void swim(){
             System.out.println("swim");
        }
    }

    class Shark extends Animals{
        void jump(){
             System.out.println("jump");
        }
    }

    class Whale extends Fish{

        void talk(){
            System.out.println("talking");
        }

    }

    class Birds extends Animals{
        void fly(){
             System.out.println("swim");
        }
    }

    class Crow extends Birds{
        void chirping(){
            System.out.println("kaao kaao");
        }

    }

    class Mammals extends Animals{
        void walk(){
             System.out.println("swim");
        }
    }


    class Human extends Mammals{
        void dancing(){
            System.out.println("Dancing");
        }
}


//  abstract class 

abstract class Animal {

    String color;

    Animal(){ // parent constructor will be called first (used to intitialise ) then child 
        color ="brown";
    }

    void eat(){
     System.out.println("animals eats");
    }

    abstract void walk();
}

class Donkey extends Animal {

    void changeColor(){
        color = "grey";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}

class Monkey extends Animal{
    void changeColor(){
        color = "Dark brown";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

//interface example chess player

interface ChessPlayer{

    void moves(); // it is by defualt abstract and public and we can't write implementation of it
}

class Queen implements ChessPlayer{
   public void moves(){
        System.out.println("up, down , right, left, diagonal(in all four directions)");
    }
}

class Rook implements ChessPlayer{
   public void moves(){
        System.out.println("up, down , right, left)");
    }
}

class Bishop implements ChessPlayer{
   public void moves(){
        System.out.println("diagonally(in all four directions)");
    }
}

// another example of multiple inheritance

interface Hervivore{

    void eatPlants();

}


interface Carnivore{

    void eatMeats();

}

class Beer implements Hervivore, Carnivore {
    public void eatPlants(){
        System.out.println("Eats plants ");

    }


    public void eatMeats(){
        System.out.println("Eats meats only");
    }
}