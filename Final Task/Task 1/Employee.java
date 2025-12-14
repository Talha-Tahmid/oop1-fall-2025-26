class Employee {
    String name;
    int empId;
    Position position;

    Employee(String name, int empId, Position position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    void showEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        position.showPosition();
        System.out.println("---------------------");
    }
}
