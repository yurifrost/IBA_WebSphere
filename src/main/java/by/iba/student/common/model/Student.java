package by.iba.student.common.model;

public class Student {
    private String first_name;
    private String second_name;
    private String father_name;
    private int group_num;
    private double avg_mark;

    public Student(String first_name, String second_name, String father_name, int group_num, double avg_mark) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.father_name = father_name;
        this.group_num = group_num;
        this.avg_mark = avg_mark;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public int getGroup_num() {
        return group_num;
    }

    public void setGroup_num(int group_num) {
        this.group_num = group_num;
    }

    public double getAvg_mark() {
        return avg_mark;
    }

    public void setAvg_mark(double avg_mark) {
        this.avg_mark = avg_mark;
    }
}
