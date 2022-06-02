package StreamApi.EmployeeAPI;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private Long Salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    public Employee(int id, String name, String dept, Long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
