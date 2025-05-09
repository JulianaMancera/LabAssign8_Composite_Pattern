public class Student implements NEU_Unit{
    private String name;
    private String studentID;
    private double tuitionFee;
    
    public Student (String name, String studentID, double tuitionFee){
        this.name = name;
        this.studentID = studentID;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails(){
        System.out.println("Student: " + name);
        System.out.println("ID " +studentID);
        System.out.println("Tuition: $" + tuitionFee);
        System.out.println("==================");
    }

    @Override
    public int getStudentCount(){
        return 1;
    }

    @Override
    public double getBudget(){
        return -tuitionFee;
    }
}
