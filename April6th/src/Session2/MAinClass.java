package Session2;

public class MAinClass {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setEmpName("Sanjh");
        emp1.setEmpId(101);

        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getEmpId());
    }
}

// Encapsulation

class Employee {
    private String empName;
    private int empId;

    // setter
    public void setEmpName(String name) {
        this.empName = name;
    }
    // getter
    public String getEmpName() {
        return this.empName;
    }

    public void setEmpId(int id) {
        this.empId = id;
    }

    public int getEmpId() {
        return this.empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                '}';
    }
}
