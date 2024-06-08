package base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyBaseTest {

  class MySub1 extends MyBase {}

  class MySub2 implements MyInterface {}

  @Test
  void testMySub1() {
    assertDoesNotThrow(() -> new MySub1().doSomeProcess());
  }

  @Test
  void testMySub2() {
    assertThrows(RuntimeException.class, () -> new MySub2().doSomeProcess());
  }

  @Test
  @DisplayName("Sleep for 3 seconds ")
  void testSleepFor3Seconds() throws InterruptedException {
    Thread.sleep(3000);
  }

  @Test
  @DisplayName("Sleep for 6 seconds ")
  void testSleepFor6Seconds() throws InterruptedException {
    Thread.sleep(6000);
  }
}
