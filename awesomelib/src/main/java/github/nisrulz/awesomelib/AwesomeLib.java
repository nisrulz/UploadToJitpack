package github.nisrulz.awesomelib;

public class AwesomeLib {
  private static AwesomeLib ourInstance = new AwesomeLib();

  public static AwesomeLib getInstance() {
    return ourInstance;
  }

  private AwesomeLib() {
  }

  public String makeAwesome(String data) {
    return "Awesome " + data;
  }
}
