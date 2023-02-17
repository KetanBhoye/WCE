import java.util.Scanner;

class Student {
    String PRN, Name;
    int Age;

    Student(String prn, String name, int age) {
        PRN = prn;
        Name = name;
        Age = age;
    }
}

class UGStudent extends Student {
    int Semester;
    double Fees;

    UGStudent(String prn, String name, int age, int semester, double fees) {
        super(prn, name, age);
        Semester = semester;
        Fees = fees;
    }
}

class PGStudent extends Student {
    int Semester;
    double Stipend;

    PGStudent(String prn, String name, int age, int semester, double stipend) {
        super(prn, name, age);
        Semester = semester;
        Stipend = stipend;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UGStudent[] ugStudents = new UGStudent[5];
        PGStudent[] pgStudents = new PGStudent[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for UG student " + (i + 1) + ":");
            System.out.print("PRN: ");
            String prn = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            System.out.print("Fees: ");
            double fees = scanner.nextDouble();
            ugStudents[i] = new UGStudent(prn, name, age, semester, fees);

            System.out.println("Enter details for PG student " + (i + 1) + ":");
            System.out.print("PRN: ");
            prn = scanner.next();
            System.out.print("Name: ");
            name = scanner.next();
            System.out.print("Age: ");
            age = scanner.nextInt();
            System.out.print("Semester: ");
            semester = scanner.nextInt();
            System.out.print("Stipend: ");
            double stipend = scanner.nextDouble();
            pgStudents[i] = new PGStudent(prn, name, age, semester, stipend);
        }

        double[] ugAgeSums = new double[8];
        int[] ugStudentCounts = new int[8];
        double[] pgAgeSums = new double[8];
        int[] pgStudentCounts = new int[8];

        for (int i = 0; i < 5; i++) {
            UGStudent ugStudent = ugStudents[i];
            PGStudent pgStudent = pgStudents[i];

            int ugSemester = ugStudent.Semester;
            int pgSemester = pgStudent.Semester;

            ugAgeSums[ugSemester] += ugStudent.Age;
            ugStudentCounts[ugSemester]++;

            pgAgeSums[pgSemester] += pgStudent.Age;
            pgStudentCounts[pgSemester]++;
        }

        System.out.println("Semester-wise average age for UG students:");
        for (int i = 1; i <= 7; i++) {
            if (ugStudentCounts[i] > 0) {
                double avgAge = ugAgeSums[i] / ugStudentCounts[i];
                System.out.println("Semester " + i + ": " + avgAge);
            }
        }

        System.out.println("Semester-wise average age for UG students:");
        for (int i = 1; i <= 7; i++) {
            if (ugStudentCounts[i] > 0) {
                double avgAge = ugAgeSums[i] / ugStudentCounts[i];
                System.out.println("Semester " + i + ": " + avgAge);
            }
        }
    }
}
