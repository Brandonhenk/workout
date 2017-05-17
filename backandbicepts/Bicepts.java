package backandbicepts;
import backandbicepts.biceptexercises.BiceptExercise;


public class Bicepts{

  BiceptExercise biceptExercise1;
  BiceptExercise biceptExercise2;
  BiceptExercise biceptExercise3;
  BiceptExercise biceptExercise4;

  public Bicepts(BiceptExercise biceptExercise1, BiceptExercise biceptExercise2, BiceptExercise biceptExercise3, BiceptExercise biceptExercise4){
    this.biceptExercise1 = biceptExercise1;
    this.biceptExercise2 = biceptExercise2;
    this.biceptExercise3 = biceptExercise3;
    this.biceptExercise4 = biceptExercise4;

  }

  public String toString(){
    return biceptExercise1 + "\n" + biceptExercise2 + "\n" + biceptExercise3 + "\n" + biceptExercise4;
  }

}
