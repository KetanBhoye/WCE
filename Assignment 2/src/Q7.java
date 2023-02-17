class Department1 {
    protected String departmentName;

    public Department1(String departmentName) {
        this.departmentName = departmentName;
    }
}

class Employee extends Department1 {
    protected String employeeName;

    public Employee(String departmentName, String employeeName) {
        super(departmentName);
        this.employeeName = employeeName;
    }
}

class Allowance extends Employee {
    private double amount;

    public Allowance(String departmentName, String employeeName, double amount) {
        super(departmentName, employeeName);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Allowance a1 = new Allowance("Finance", "Ketan", 1000.0);
        Allowance a2 = new Allowance("Finance", "Vijay", 1500.0);
        Allowance a3 = new Allowance("Marketing", "Manish", 2000.0);

        Allowance[] allowances = {a1, a2, a3};

        // Print all allowances for Finance department
        System.out.println("Allowances for Finance department:");
        for (Allowance a : allowances) {
            if (a.departmentName.equals("Finance")) {
                System.out.println(a.employeeName + " - " + a.getAmount());
            }
        }

        // Print total allowance for Finance department
        double totalAllowance = 0.0;
        for (Allowance a : allowances) {
            if (a.departmentName.equals("Finance")) {
                totalAllowance += a.getAmount();
            }
        }
        System.out.println("Total allowance for Finance department: " + totalAllowance);
    }
}
