package java3;

public class Main {
    public static void main(String[] args) {
        Person student = new Person("Bingham", "Gabriel", "12345", "0102");
        Person staff = new Person("bingham", "Onuma", "Callofduty", 0);
        Physics calc = new Physics();
        System.out.println(calc.calcVel(20, 10));
        System.out.println(calc.calcVel(15, 2, 7));
        // System.out.println(student);
        // System.out.println(person.getName());
    }
}
