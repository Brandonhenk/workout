package builders;
import backandbicepts.*;

public class Workout{

  private Bicepts bicepts;
  private Back back;

  public Workout(Back back, Bicepts bicepts){
    this.bicepts = bicepts;
    this.back = back;
  }

  public String toString(){
    return back + "\n" + bicepts;
  }

}
