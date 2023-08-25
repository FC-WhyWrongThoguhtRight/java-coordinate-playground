package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateUtilityTest {

    @Test
    void validateLength() {
        boolean testTrue = ValidateUtility.validateLength(23);
        boolean testFalse = ValidateUtility.validateLength(25);

        Assertions.assertTrue(testTrue);
        Assertions.assertFalse(testFalse);
    }
}