package LAB8;

public class PersonApp {
    public static void main(String[] args) {

        //objects

        Person p1 = new Person();
        p1.setName("sasina Nimkhon");
        p1.setAge(22);

        Person p2 = new Teacher("RUTS");
        p2.setName("sasina nimkhon");
        p2.setAge(22);

        Person p3 = new Doctor("Nimkhon");
        p3.setName("sasina Nimkhon");
        p3.setAge(22);

        //call introduce
        p1.introduce();
        p2.introduce();
        p3.introduce();

    }
}