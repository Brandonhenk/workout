package backandbicepts.backexercises;

public class BackExercise{

  String exercise;
  String detail;

  public BackExercise(String exercise, String detail){
    this.exercise = exercise;
    this.detail = detail;
  }

  public String toString(){
    return "Exercise: " + exercise + "\nDetail: " + detail;
  }
}
