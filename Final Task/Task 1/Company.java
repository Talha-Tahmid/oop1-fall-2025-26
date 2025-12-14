class Company {
    String companyName;
    Employee[] employees;

    Company(String companyName, int size) {
        this.companyName = companyName;
        employees = new Employee[size];
    }

    void addEmployee(Employee e, int index) {
        employees[index] = e;
    }

    void showAllEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("=======================");
        for (Employee e : employees) {
            if (e != null) {
                e.showEmployee();
            }
        }
    }
}
