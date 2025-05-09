import java.util.*;
public class Department implements NEU_Unit {
    private String name;
    private List<NEU_Unit> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(NEU_Unit component) {
        components.add(component);
    }

    public void removeUnit(NEU_Unit component) {
        components.remove(component);
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        for (NEU_Unit component : components) {
            component.displayDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int totalStudents = 0;
        for (NEU_Unit component : components) {
            totalStudents += component.getStudentCount();
        }
        return totalStudents;
    }

    @Override
    public double getBudget() {
        double totalBudget = 0.0;
        for (NEU_Unit component : components) {
            totalBudget += component.getBudget();
        }
        return totalBudget;
    }
}