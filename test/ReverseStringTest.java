import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ReverseStringTest {

  @ParameterizedTest

  @CsvFileSource(resources = "data.csv")
  void reverse(String expected, String str) {
    assertEquals(expected, ReverseString.reversedString(str) );
  }
}