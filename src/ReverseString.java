import java.util.Locale.Builder;

public class ReverseString {

  public static String reversedString(String str) {
    StringBuilder builder = new StringBuilder();
      builder.append(str);
      builder = builder.reverse();
    return builder.toString();
  }
}
