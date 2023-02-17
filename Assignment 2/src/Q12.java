interface College {
    String collegeName = "Walchand College of Engineering, Sangli";
}

class Teacher {
    String name;
    String qualification;

    public Teacher(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }
}

class Department extends Teacher {
    int deptNo;
    String deptName;

    public Department(String name, String qualification, int deptNo, String deptName) {
        super(name, qualification);
        this.deptNo = deptNo;
        this.deptName = deptName;
    }
}

public class Q12 {
    public static void main(String[] args) {
        Department dept = new Department("Ketan", "B.Tech", 101, "Computer Science & Engineering");
        System.out.println("College Name: " + College.collegeName);
        System.out.println("Teacher Name: " + dept.name);
        System.out.println("Teacher Qualification: " + dept.qualification);
        System.out.println("Department Number: " + dept.deptNo);
        System.out.println("Department Name: " + dept.deptName);
    }
}
