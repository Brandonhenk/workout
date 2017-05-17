package backandbicepts;

import backandbicepts.BackExercises;

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
    this.setBackExercise1(backExercise1);
    this.setBackExercise2(backExercise2);
    this.setBackExercise3(backExercise3);
    this.setBackExercise4(backExercise4);
    this.setBackExercise5(backExercise5);
  }
