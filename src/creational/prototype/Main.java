package creational.prototype;

/**
 * @author gauravkabra
 * @since 2024
 */

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // shallow copy - change in one affects another
        ShallowEmployee e1 = new ShallowEmployee(0, "gaurav", 10);
        ShallowEmployee e2 = (ShallowEmployee) e1.clone(); 

        e1.setEmpName("keshav");
        System.out.println(e2.getEmpName());

        e1.addSkill("C++");
        System.out.println(e2.getSkills());

        // deep copy - change in one DOES NOT affect another
        DeepEmployee e3 = new DeepEmployee(0, "gaurav", 10);
        DeepEmployee e4 = (DeepEmployee) e3.clone(); 

        e3.setEmpName("keshav");
        System.out.println(e4.getEmpName());

        e3.addSkill("C++");
        System.out.println(e4.getSkills());
    }
}
