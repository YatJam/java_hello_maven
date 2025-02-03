import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.hellomaven.model.Health;

public class HealthTest {

  private Health health;

  @Before
  public void before(){
    health = new Health();
  }

  @Test
  public void canGetMessage(){
    assertEquals("I am alive", health.getMessage());
  }

  @Test
  public void canChangeMessage(){
    health.setHealthMessage("I am still here");
    assertEquals("I am still here", health.getMessage());
  }
}
