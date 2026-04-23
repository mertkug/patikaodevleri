public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void addBulkVerbalNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.verbalNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalNote = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == -1 || this.fizik.note == -1 || this.kimya.note == -1
                || this.mat.verbalNote == -1 || this.fizik.verbalNote == -1 || this.kimya.verbalNote == -1) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sinifi Gecti.");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAverage() {
        this.average = (this.mat.calcCourseAverage() + this.fizik.calcCourseAverage() + this.kimya.calcCourseAverage()) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Sinav Notu : " + this.mat.note);
        System.out.println("Matematik Sozlu Notu : " + this.mat.verbalNote);
        System.out.println("Matematik Ders Ortalamasi : " + this.mat.calcCourseAverage());
        System.out.println("Fizik Sinav Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu Notu : " + this.fizik.verbalNote);
        System.out.println("Fizik Ders Ortalamasi : " + this.fizik.calcCourseAverage());
        System.out.println("Kimya Sinav Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu Notu : " + this.kimya.verbalNote);
        System.out.println("Kimya Ders Ortalamasi : " + this.kimya.calcCourseAverage());
    }
}
