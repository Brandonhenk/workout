package legsandabbs;

public class Abbs{

  AbbsExercise exercise1;
  AbbsExercise exercise2;
  AbbsExercise exercise3;

  public Abbs(AbbsExercise exercise1, AbbsExercise exercise2, AbbsExercise exercise3){
    this.exercise1 = exercise1;
    this.exercise2 = exercise2;
    this.exercise3 = exercise3;
  }

  public String toString(){
    return exercise1 + "\n" + exercise2 + "\n" + exercise3;
  }

}
