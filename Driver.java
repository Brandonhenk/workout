import backandbicepts.biceptexercises.*;
import backandbicepts.Bicepts;

public class Driver{
  public static void main(String[] args){
    HammerCurls c = new HammerCurls();
    StraitbarHell st = new StraitbarHell();
    PreacherCurl pc = new PreacherCurl();
    StandingDumbbellCurl sdc = new StandingDumbbellCurl();

    Bicepts bicepts = new Bicepts(c,st,pc,sdc);
    System.out.println(bicepts.toString());

  }
}
