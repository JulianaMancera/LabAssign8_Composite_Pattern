public class NEU_APP {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Dr. Sam", "Information Technology", 65000);
        Teacher teacher2 = new Teacher("Prof. Jerry", "Computer Science", 75000);

        Student student1 = new Student("Mark Tuan", "STU010" , 15000);
        Student student2 = new Student("Jackson Wang", "STU020", 15000);
        Student student3 = new Student("Bang Chan", "STU0325", 13000);

        //Create Departments
        Department csDept = new Department("Computer Science");
        csDept.add(teacher2);
        csDept.add(student1);
        csDept.add(student2);

        Department itDept = new Department("Information Technology");
        itDept.add(teacher1);
        itDept.add(student3);

        //Create College
        College cicsCollege = new College("College of Informatics and Computing Studies\n");
        cicsCollege.add(csDept);
        cicsCollege.add(itDept);

        //Create University
        College university = new College("New Era University");
        university.add(cicsCollege);

        // Display details
        System.out.println("\n~ University Organizational Units ~");
        university.displayDetails();

        // Display student count
        System.out.println("\nTotal Students " + university.getStudentCount());

        //Display budget
        System.out.println("Total Budget: $" + university.getBudget() + "\n");
    }
}
