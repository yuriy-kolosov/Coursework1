public class Employee {
    //                      Сотрудник
    String name;
    String middleName;
    String lastName;

    char departmentName;
    int salary;
    int id;             // id сотрудника

    public Employee(String name, String middleName, String lastName, char departmentName, int salary, int id) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        this.salary = salary;
        this.id = Main.idEmployer++;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getDepartmentName() {
        return departmentName;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartmentName(char departmentName) {
        this.departmentName = departmentName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                " номер: " + id + "; " +
                " имя: " + name + "; \t" +
                " отчество: " + middleName + "; \t" +
                " фамилия: " + lastName + "; \t" +
                " отдел: " + departmentName + "; \t" +
                " з/п: " + salary + " руб.";
    }

}
