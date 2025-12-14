public class Main {
    public static void main(String[] args) {

        Position p1 = new Position("Manager", 50000);
        Position p2 = new Position("Engineer", 35000);

        Employee e1 = new Employee("Alice", 201, p1);
        Employee e2 = new Employee("Bob", 202, p2);

        Company company = new Company("TechSoft Ltd.", 5);

        company.addEmployee(e1, 0);
        company.addEmployee(e2, 1);

        company.showAllEmployees();
    }
}
