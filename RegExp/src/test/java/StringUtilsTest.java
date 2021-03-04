import org.junit.jupiter.api.Test;
import org.junit.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class StringUtilsTest {

    @Test
    public void emptyIsDigit(){
        assertFalse(StringUtils.isDigit(""));
    }
    @Test
    public void digIsDigit(){
        assertTrue(StringUtils.isDigit("7"));
    }
    @Test
    public void spaceIsDigit(){
        assertFalse(StringUtils.isDigit(" "));
    }
    @Test
    public void letterIsDigit() {
        assertFalse(StringUtils.isDigit("a"));
    }
    @Test
    public void stringIsDigit(){
        assertFalse(StringUtils.isDigit("a5"));
    }
    @Test
    public void numberIsDigit(){
        assertFalse(StringUtils.isDigit("14"));
    }
    @Test
    public void fixedTests() {
        assertFalse(StringUtils.isDigit("pasd"));
        assertFalse(StringUtils.isDigit("a771a"));
        //assertTrue(StringUtils.isDigit("8925")); //Tested, Failed => OK
        assertFalse(StringUtils.isDigit("8925"));
    }
}