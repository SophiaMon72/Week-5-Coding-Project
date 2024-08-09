package week05;

public class App {
  
  public static void main(String[] args) {
      
      Logger log1 = new AsteriskLogger();
      Logger log2 = new SpacedLogger();
      
      log1.log("awesome");
      log1.error("awesome");
      
      log2.log("so cool");
      log2.error("so cool");
  }

}
