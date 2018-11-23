package Studies;

public class Studies {
  private   int professor_id;
  private   String name;
  private   int hours;
  private   double avg_mark;

    Studies(int professor_id, String name, int hours, double avg_mark){
        this.professor_id = professor_id;
        this.name = name;
        this.hours = hours;
        this.avg_mark = avg_mark;
    }

    public void setProfessor_id(int professor_id){
        this.professor_id = professor_id;
    }

    public int getProfessor_id(){
        return professor_id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHours(int hours){
        this.hours = hours;
    }

    public int getHours(){
        return hours;
    }

    public void setAvg_mark(double avg_mark){
        this.avg_mark = avg_mark;
    }

    public double getAvg_mark(){
        return avg_mark;
    }

}

