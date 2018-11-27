package by.iba.student.common.model;

public class Professor {
    private String firstName;
    private String secondName;
    private String fatherName;
    private String birthday;
    private double averageMark;

    public Professor(String firstName, String secondName, String fatherName, String birthday, double averageMark) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.birthday = birthday;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
}
