package week05;

public class SpacedLogger implements Logger{

  @Override
  public void log(String log) {
      System.out.println(log.replace("", " ").trim());
  }

  @Override
  public void error(String error) {
      System.out.println("Error: " + error.replace("", " ").trim());
  }



}
