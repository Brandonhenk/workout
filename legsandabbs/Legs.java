package legsandabbs;

public class Legs{

  LegsExercise exercise1;
  LegsExercise exercise2;
  LegsExercise exercise3;
  LegsExercise exercise4;
  LegsExercise exercise5;

  public Abbs(LegsExercise exercise1, LegsExercise exercise2, LegsExercise exercise3, LegsExercise exercise4, LegsExercise exercise5){
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
