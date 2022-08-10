package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LC20_ValidParenthesesTest {

    @Test
    void isBalanced(){
        var test = new LC20_ValidParentheses();
        assertTrue(test.isValid("{}()[]"));
        assertFalse(test.isValid("}()[]"));
        assertTrue(test.isValid("{}[]"));
        assertTrue(test.isValid("{}"));
        assertTrue(test.isValid("[]"));
        assertFalse(test.isValid("["));
        assertFalse(test.isValid("}"));
        assertFalse(test.isValid("({{{{{}}}}}){{{)))}}})[}{}{}{[][][][]))))"));
        assertFalse(test.isValid("([)]"));
    }

}