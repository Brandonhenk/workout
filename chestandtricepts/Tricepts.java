package workout.chestandtricepts;
import chestandtricepts.triceptexercises.TriceptExercise;

public class Tricepts{
  TriceptExercise exercise1;
  TriceptExercise exercise2;
  TriceptExercise exercise3;
  TriceptExercise exercise4;

  public Chest(TriceptExercise exercise1, TriceptExercise exercise2, TriceptExercise exercise3, TriceptExercise exercise4){
    this.exercise1 = exercise1;
    this.exercise2 = exercise2;
    this.exercise3 = exercise3;
    this.exercise4 = exercise4;
  }

  public String toString(){
    return exercise1 + "\n" + exercise2 + "\n" + exercise3 + "\n" + exercise4;
  }
}
