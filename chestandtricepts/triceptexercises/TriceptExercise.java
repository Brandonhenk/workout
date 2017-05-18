package chestandtricepts.triceptexercises;
import chestandtricepts.Tricepts;

public class TriceptExercise{

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
