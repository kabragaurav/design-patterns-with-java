package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShallowEmployee implements Cloneable {
    private int empId;
    private String empName;
    private double salary;
    private List<String> skills;

    public ShallowEmployee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;

        skills = new ArrayList<>();
        skills.add("Java");
        skills.add("JS");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {  
        return super.clone(); 
    }
    
    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    @Override
    public String toString() {
        return "ShallowEmployee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", skills=" + skills
                + "]";
    }
}
