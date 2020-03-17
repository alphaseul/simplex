package simplex;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;

public class AppTest {

	 private hello salut = new hello();

	  @SuppressWarnings("deprecation")
	@Test
	  public void greeterSaysHello() {
	    assertThat(salut.sayHello(), containsString("Hello"));
	  }
}
