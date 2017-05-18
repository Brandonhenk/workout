package chestandtricepts.chestexercises;
import chestandtricepts.Chest;

public class ChestExercise{
  String exercise;
  String detail;

  public ChestExercise(String exercise, String detail){
    this.exercise = exercise;
    this.detail = detail;
  }

  public String toString(){
    return "Exercise: " + exercise + "\nDetail: " + detail;
  }
}
