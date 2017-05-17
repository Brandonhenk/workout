import backandbicepts.biceptexercises.*;
import backandbicepts.Bicepts;
import backandbicepts.backexercises.*;
import backandbicepts.Back;


public class Driver{
  public static void main(String[] args){
    HammerCurls c = new HammerCurls();
    StraitbarHell st = new StraitbarHell();
    PreacherCurl pc = new PreacherCurl();
    StandingDumbbellCurl sdc = new StandingDumbbellCurl();

    Bicepts bicepts = new Bicepts(c,st,pc,sdc);

    DeadLift dl = new DeadLift();
    PullUps pu = new PullUps();
    BentOverRows bor = new BentOverRows();
    PullDowns pd = new PullDowns();
    SeatedRow sr = new SeatedRow();

    Back back = new Back(dl,pu,bor,pd,sr);
    System.out.println(back.toString());
    System.out.println(bicepts.toString());

  }
}
