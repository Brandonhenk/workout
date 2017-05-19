package builders;

import backandbicepts.backexercises.*;
import backandbicepts.biceptexercises.*;
import common.utils.prompter.TerminalPrompterBuilder;
import interfaces.*;
import builders.Workout;
import backandbicepts.*;


public class BackandBiceptWorkoutBuilder implements BackandBiceptWorkoutInterface{

  private BackExercise backExercise1;
  private BackExercise backExercise2;
  private BackExercise backExercise3;
  private BackExercise backExercise4;
  private BackExercise backExercise5;
  private BiceptExercise biceptExercise1;
  private BiceptExercise biceptExercise2;
  private BiceptExercise biceptExercise3;
  private BiceptExercise biceptExercise4;

  int exercise1count = 1;
  public BackandBiceptWorkoutInterface askForExercise1(){

    TerminalPrompterBuilder exercise1Builder = new TerminalPrompterBuilder();

    try{
      exercise1count = exercise1Builder.addType("1st Back Exercise")
        .addOption(new BentOverRows())
        .addOption(new DeadLift())
        .addOption(new PullDowns())
        .addOption(new PullUps())
        .addOption(new SeatedRow())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    backExercise1 = (BackExercise)exercise1Builder.getOptions().get(exercise1count -1);
    return this;
  }

  int exercise2count = 1;
  public BackandBiceptWorkoutInterface askForExercise2(){

    TerminalPrompterBuilder exercise2Builder = new TerminalPrompterBuilder();

    try{
      exercise2count = exercise2Builder.addType("2nd Back Exercise")
        .addOption(new BentOverRows())
        .addOption(new DeadLift())
        .addOption(new PullDowns())
        .addOption(new PullUps())
        .addOption(new SeatedRow())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    backExercise2 = (BackExercise)exercise2Builder.getOptions().get(exercise2count -1);
    return this;
  }

  int exercise3count = 1;
  public BackandBiceptWorkoutInterface askForExercise3(){

    TerminalPrompterBuilder exercise3Builder = new TerminalPrompterBuilder();

    try{
      exercise1count = exercise3Builder.addType("3rd Back Exercise")
        .addOption(new BentOverRows())
        .addOption(new DeadLift())
        .addOption(new PullDowns())
        .addOption(new PullUps())
        .addOption(new SeatedRow())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    backExercise3 = (BackExercise)exercise3Builder.getOptions().get(exercise3count -1);
    return this;
  }

  int exercise4count = 1;
  public BackandBiceptWorkoutInterface askForExercise4(){

    TerminalPrompterBuilder exercise4Builder = new TerminalPrompterBuilder();

    try{
      exercise4count = exercise4Builder.addType("4th Back Exercise")
        .addOption(new BentOverRows())
        .addOption(new DeadLift())
        .addOption(new PullDowns())
        .addOption(new PullUps())
        .addOption(new SeatedRow())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    backExercise4 = (BackExercise)exercise4Builder.getOptions().get(exercise4count -1);
    return this;
  }

  int exercise5count = 1;
  public BackandBiceptWorkoutInterface askForExercise5(){

    TerminalPrompterBuilder exercise5Builder = new TerminalPrompterBuilder();

    try{
      exercise5count = exercise5Builder.addType("5th Back Exercise")
        .addOption(new BentOverRows())
        .addOption(new DeadLift())
        .addOption(new PullDowns())
        .addOption(new PullUps())
        .addOption(new SeatedRow())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    backExercise5 = (BackExercise)exercise5Builder.getOptions().get(exercise5count -1);
    return this;
  }

  int exercise6count = 1;
  public BackandBiceptWorkoutInterface askForExercise6(){

    TerminalPrompterBuilder exercise6Builder = new TerminalPrompterBuilder();

    try{
      exercise6count = exercise6Builder.addType("1st Bicept Exercise")
        .addOption(new HammerCurls())
        .addOption(new PreacherCurl())
        .addOption(new StandingDumbbellCurl())
        .addOption(new StraitbarHell())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    biceptExercise1 = (BiceptExercise)exercise6Builder.getOptions().get(exercise6count -1);
    return this;
  }

  int exercise7count = 1;
  public BackandBiceptWorkoutInterface askForExercise7(){

    TerminalPrompterBuilder exercise7Builder = new TerminalPrompterBuilder();

    try{
      exercise7count = exercise7Builder.addType("2nd Bicept Exercise")
        .addOption(new HammerCurls())
        .addOption(new PreacherCurl())
        .addOption(new StandingDumbbellCurl())
        .addOption(new StraitbarHell())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    biceptExercise2 = (BiceptExercise)exercise7Builder.getOptions().get(exercise7count -1);
    return this;
  }

  int exercise8count = 1;
  public BackandBiceptWorkoutInterface askForExercise8(){

    TerminalPrompterBuilder exercise8Builder = new TerminalPrompterBuilder();

    try{
      exercise6count = exercise8Builder.addType("3rd Bicept Exercise")
        .addOption(new HammerCurls())
        .addOption(new PreacherCurl())
        .addOption(new StandingDumbbellCurl())
        .addOption(new StraitbarHell())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    biceptExercise3 = (BiceptExercise)exercise8Builder.getOptions().get(exercise8count -1);
    return this;
  }

  int exercise9count = 1;
  public BackandBiceptWorkoutInterface askForExercise9(){

    TerminalPrompterBuilder exercise9Builder = new TerminalPrompterBuilder();

    try{
      exercise9count = exercise9Builder.addType("4th Bicept Exercise")
        .addOption(new HammerCurls())
        .addOption(new PreacherCurl())
        .addOption(new StandingDumbbellCurl())
        .addOption(new StraitbarHell())
        .sort()
        .build()
        .ask();
    } catch(Exception e){
      e.printStackTrace();
      System.exit(1);
    }
    biceptExercise4 = (BiceptExercise)exercise9Builder.getOptions().get(exercise9count -1);
    return this;
  }

  public Workout build(){
    Back back = new Back(backExercise1, backExercise2, backExercise3, backExercise4, backExercise5);
    Bicepts bicepts = new Bicepts(biceptExercise1, biceptExercise2, biceptExercise3, biceptExercise4);
    Workout workout = new Workout(back, bicepts);
    return workout;
  }

  public static void main(String[] args){
    BackandBiceptWorkoutBuilder babwb = new BackandBiceptWorkoutBuilder();
    babwb.askForExercise1();
    babwb.askForExercise2();
    babwb.askForExercise3();
    babwb.askForExercise4();
    babwb.askForExercise5();
    babwb.askForExercise6();
    babwb.askForExercise7();
    babwb.askForExercise8();
    babwb.askForExercise9();
    System.out.println(babwb.build());
  }




}
