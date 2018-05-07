import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class WriteCharsTest {

	@Test
	
	//I used the testing example given from classmate which checks the output of writeChars
	void test() {
		// WriteChars test = new WriteChars();

		// test for correct output
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		// print to console to be captured by PrintStream
		WriteChars.writeChars(8);

		// my expected output
		String expOutput = "<<<**>>>";

		// test expected output against what was printed to console
		assertEquals(outContent.toString(), expOutput);
	}

}
