package customer;

public class customer {
    private String name;
    private String age;
    private String address;
    private Double salary;

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public customer() {
    }

    public customer(String name, String age, String address, Double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }
}
