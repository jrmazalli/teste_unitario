package digitalinnovationone.com.teste;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AssertJTest {

	@Test
	public void checkEquality() {
		Person person = new Person("Mazalli","Junior");
		Person personClose = person;
		
		assertThat(person).isEqualTo(personClose);
	}
}
