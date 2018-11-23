package by.iba.student.common.marks;

public class Marks {

    private int study_id;
    private int student_id;
    private String date;
    private String professor_id;
    private int mark;
    private String comments;

    public Marks(int study_id, int student_id, String date, String professor_id, int mark, String comments){
        this.comments = comments;
        this.date = date;
        this.mark = mark;
        this.professor_id = professor_id;
        this.student_id = student_id;
        this.study_id = study_id;
    }

    public void setStudy_id(int study_id){
        this.study_id = study_id;
    }

    public int getStudy_id(){
        return study_id;
    }

    public void setStudent_id(int student_id){
        this.student_id = student_id;
    }

    public int getStudent_id(){
        return student_id;
    }

    public void setDate(String date){
        this.date = date;
    }

   /* public String getDate(){

    }*/

}
