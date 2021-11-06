import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Dec2HexTest {

    @Test
    void ZeroArgumentErrorThrow() {
        Throwable e = null;
        try {
            Dec2Hex.main(new String[]{});
        } catch (Throwable err){
            e = err;
        }

        Assertions.assertTrue(e instanceof ArrayIndexOutOfBoundsException);
    }
}
