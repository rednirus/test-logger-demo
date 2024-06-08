package base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  @DisplayName("App test 1")
  void testSleepFor3Seconds() {
    System.out.println("Display ONE ");
  }

  @Test
  @DisplayName("App test 2")
  void testSleepFor6Seconds() {
    System.out.println("Display Two ");
  }
}
