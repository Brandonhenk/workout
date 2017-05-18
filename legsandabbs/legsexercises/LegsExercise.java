package legsandabbs.legsexercises;

public class LegsExercise{
  String exercise;
  String detail;

  public LegsExercise(String exercise, String detail){
    this.exercise = exercise;
    this.detail = detail;
  }

  public String toString(){
    return "Exercise: " + exercise + "\nDetail: " + detail;
  }
}
