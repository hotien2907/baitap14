package baitap2;

class Student {
    private int studentId;
    private String name;
    private double score;

    public Student(int studentId, String name, double score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}

