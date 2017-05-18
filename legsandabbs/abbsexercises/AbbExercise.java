package legsandabbs.abbsexercises;

public class AbbsExercise{
  String exercise;
  String detail;

  public AbbsExercise(String exercise, String detail){
    this.exercise = exercise;
    this.detail = detail;
  }

  public String toString(){
    return "Exercise: " + exercise + "\nDetail: " + detail;
  }
}
