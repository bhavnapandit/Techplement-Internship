package employeeManagementSytem;

public class Employee {
    private int Id;
    private String name;
    private int age;
    private String Address;
    private Double  salary;
    private String  department;
    

    public Employee(int id, String name, int age, String address, Double salary, String department) {
        Id = id;
        this.name = name;
        this.age = age;
        Address = address;
        this.salary = salary;
        this.department = department;
    }
    
    public int getId() {
        return Id;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setId(int id) {
        Id = id;
    }
   
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public Employee(int id, String name, int age, String address) {
        Id = id;
        this.name = name;
        this.age = age;
        Address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
   
    @Override
    public String toString() {
        return "Employee [Id=" + Id + ", name=" + name + ", age=" + age + ", Address=" + Address + ", salary=" + salary
                + ", department=" + department + "]";
    }
}
