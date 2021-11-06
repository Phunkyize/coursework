import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Dec2HexTest {


    //test for zero argument error throw as a requirement
    @Test
    void ZeroArgumentErrorThrow() {
        Throwable e = null;
        try {
            Dec2Hex.main(new String[]{});
        } catch (Throwable err){
            e = err;
        }

        //if caught error equals of type ArrayIndexOutOfBoundsException, test passed
        Assertions.assertFalse(e instanceof ArrayIndexOutOfBoundsException);
    }

    //test for non-integer input error caught but not thrown with correct message displayed
    @Test
    void NonIntegerInputHandling() {
        Throwable e = null;

        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));

        try {
            Dec2Hex.main(new String[]{"number"});
        } catch (Throwable err) {
            e = err;
        }

        //assert null if no error thrown - PASS if error handling working as intended
        Assertions.assertNull(e);

        //assert equals for console output - PASS if console output equals as follows
        Assertions.assertEquals("Provided input is not a number", newConsole.toString());

        //assert false for console output - PASS if console output doesn't contain the following message
        //indicates that conversion code will not execute for a non-integer number
        Assertions.assertFalse(newConsole.toString().contains("Converting the Decimal Value"));
    }
}
