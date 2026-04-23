public class Main {
    static Course createMatCourse(Teacher teacher) {
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.10);
        mat.addTeacher(teacher);
        return mat;
    }

    static Course createFizikCourse(Teacher teacher) {
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.20);
        fizik.addTeacher(teacher);
        return fizik;
    }

    static Course createKimyaCourse(Teacher teacher) {
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.30);
        kimya.addTeacher(teacher);
        return kimya;
    }

    static Student createStudent(String name, String stuNo, Teacher t1, Teacher t2, Teacher t3) {
        return new Student(name, 4, stuNo, createMatCourse(t1), createFizikCourse(t2), createKimyaCourse(t3));
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        Student s1 = createStudent("Inek Saban", "140144015", t1, t2, t3);
        s1.addBulkExamNote(50, 20, 40);
        s1.addBulkVerbalNote(80, 90, 70);
        s1.isPass();

        Student s2 = createStudent("Guduk Necmi", "2211133", t1, t2, t3);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkVerbalNote(60, 80, 90);
        s2.isPass();

        Student s3 = createStudent("Hayta Ismail", "221121312", t1, t2, t3);
        s3.addBulkExamNote(50, 20, 40);
        s3.addBulkVerbalNote(40, 30, 20);
        s3.isPass();
    }
}
