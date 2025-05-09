import java.util.ArrayList;
import java.util.List;

public class College implements NEU_Unit{

    private String name;
    private List<NEU_Unit> components = new ArrayList<>();

    public College(String name){
        this.name = name;
    }

    public void addComponent(NEU_Unit component){
        component.add(component);
    }

    public void removeComponent(NEU_Unit component){
        component.remove(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (NEU_Unit component : components) {
            totalBudget += component.getBudget();
        }
        return totalBudget;
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (NEU_Unit component : components) {
            count += component.getStudentCount();
        }
        return count;
    }

    @Override
    public void displayDetails(int indentLevel) {
        String indent = "  ".repeat(indentLevel);
        System.out.println(indent + "College: " + name);
        System.out.println(indent + "Budget: $" + String.format("%.2f", getBudget()));
        System.out.println(indent + "Total Students: " + getStudentCount());
        System.out.println(indent + "Components:");
        for (NEU_Unit component : components) {
            component.displayDetails(indentLevel + 1);
        }
    }

}
