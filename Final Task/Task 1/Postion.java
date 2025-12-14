class Position {
    String title;
    double salary;

    Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    void showPosition() {
        System.out.println("Title: " + title);
        System.out.println("Salary: " + salary);
    }
}
