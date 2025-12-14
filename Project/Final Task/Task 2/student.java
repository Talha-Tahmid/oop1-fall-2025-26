class Student {
    String name;
    int id;
    Contact contact;

    Student(String name, int id, Contact contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

    void showStudent() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        contact.showInfo();
        System.out.println("------------------");
    }
}
