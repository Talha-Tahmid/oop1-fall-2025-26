public class Main {
    public static void main(String[] args) {

        Contact c1 = new Contact("01711111111", "a@gmail.com");
        Contact c2 = new Contact("01822222222", "b@gmail.com");

        Student s1 = new Student("Rahim", 101, c1);
        Student s2 = new Student("Karim", 102, c2);

        School school = new School("AIUB", 5);
        school.addStudent(s1, 0);
        school.addStudent(s2, 1);

        school.showAllStudents();
    }
}
