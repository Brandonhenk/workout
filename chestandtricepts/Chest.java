package chestandtricepts;
import chestandtricepts.triceptexercises.ChestExercise;

public class Chest{

  ChestExercise exercise1;
  ChestExercise exercise2;
  ChestExercise exercise3;
  ChestExercise exercise4;
  ChestExercise exercise5;

  public Chest(ChestExercise exercise1, ChestExercise exercise2, ChestExercise exercise3, ChestExercise exercise4, ChestExercise exercise5){
    this.exercise1 = exercise1;
    this.exercise2 = exercise2;
    this.exercise3 = exercise3;
    this.exercise4 = exercise4;
    this.exercise5 = exercise5;
  }

  public String toString(){
    return exercise1 + "\n" + exercise2 + "\n" + exercise3 + "\n" + exercise4 + "\n" + exercise5;
  }

}
