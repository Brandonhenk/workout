package backandbicepts.biceptexercises;
import backandbicepts.Bicepts;

public class BiceptExercise{
  String exercise;
  String detail;

  public BiceptExercise(String exercise, String detail){
    this.exercise = exercise;
    this.detail = detail;
  }

  public String toString(){
    return "Exercise: " + exercise + "\nDetail: " + detail;
  }

}
