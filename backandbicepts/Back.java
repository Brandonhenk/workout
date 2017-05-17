package backandbicepts;

import backandbicepts.backexercises.BackExercise;

public class Back{

  BackExercise backExercise1;
  BackExercise backExercise2;
  BackExercise backExercise3;
  BackExercise backExercise4;
  BackExercise backExercise5;

  public Back(){
    this.backExercise1 = null;
    this.backExercise2 = null;
    this.backExercise3 = null;
    this.backExercise4 = null;
    this.backExercise5 = null;
  }

  public Back(BackExercise backExercise1, BackExercise backExercise2, BackExercise backExercise3, BackExercise backExercise4, BackExercise backExercise5){
    this.backExercise1 = backExercise1;
    this.backExercise2 = backExercise2;
    this.backExercise3 = backExercise3;
    this.backExercise4 = backExercise4;
    this.backExercise5 = backExercise5;
  }

  public String toString(){
    return backExercise1 + "\n" + backExercise2 + "\n" + backExercise3 + "\n" + backExercise4 + "\n" + backExercise5;
  }
}
