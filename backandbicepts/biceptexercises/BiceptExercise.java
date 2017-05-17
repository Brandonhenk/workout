package backandbicepts.biceptexercises;
import backandbicepts.Bicepts;

public class BiceptExercise{
  String exercise;
  String detail;

  public BiceptExercise(String biceptExercise, String detail){
    this.exercise = biceptExercise;
    this.detail = detail;
  }

  public String toString(){
    return "Exercise: " + exercise + "\nDetail: " + detail;
  }

}
