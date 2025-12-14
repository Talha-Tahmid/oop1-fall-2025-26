class School {
    String schoolName;
    Student[] students;

    School(String schoolName, int size) {
        this.schoolName = schoolName;
        students = new Student[size];
    }

    void addStudent(Student s, int index) {
        students[index] = s;
    }

    void showAllStudents() {
        System.out.println("School Name: " + schoolName);
        System.out.println("==================");

        for (Student s : students) {
            if (s != null) {
                s.showStudent();
            }
        }
    }
}
