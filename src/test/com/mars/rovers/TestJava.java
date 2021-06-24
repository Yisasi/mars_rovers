package test.com.mars.rovers;


import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.mars.rovers.*;


public class TestJava {
	
	 static List<String> expected=Arrays.asList("1 3 N", "5 1 E");
	
	
	 @Test
	public void testApp() {
		
		App.main(null);
		 assertIterableEquals(expected, App.result); // Passes
	
}

}