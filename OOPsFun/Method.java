package OOPsFun;

//other class
class person{
    String name;
    int age;

    //without parameter method
    void walk(){
        System.out.println(name+" is walking");
    }

    void eat(){
        System.out.println(name+" is eating");
    }

    //Parameterized method

    void walk(int setps){
        System.out.println(name+ " walked "+ setps+ " steped");
    }

}


//main class
public class Method {

    //main metod
    public static void main(String[] args) {

        
        System.out.println("this is avadh");
        System.out.println("this is meet");
        
        person p1 = new person();
        p1.name = "Avadh";
        p1.age = 21;
        System.out.println(p1.name +" " + p1.age);

        person p2 = new person();
        p2.name = "Meet";
        p2.age = 20;
        System.out.println(p2.name +" " + p2.age);

        p1.walk();
        p2.walk(100);
        p2.eat();
        
    }
    


}