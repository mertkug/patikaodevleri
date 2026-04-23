public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    double verbalRate;

    public Course(String name, String code, String prefix, double verbalRate) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbalRate = verbalRate;
        this.note = -1;
        this.verbalNote = -1;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Islem basarili");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamistir.");
        }
    }

    public double calcCourseAverage() {
        return (this.note * (1 - this.verbalRate)) + (this.verbalNote * this.verbalRate);
    }
}
