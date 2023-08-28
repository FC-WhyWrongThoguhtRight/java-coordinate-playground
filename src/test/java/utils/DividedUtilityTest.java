package utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DividedUtilityTest {

    @Test
    void 괄호제거와_하이픈을_기준으로_문자열_나누기() {
        String input = "(10,10)-(14,15)-(20,8)";
        String[] DividedResults = DividedUtility.divideHyphenAndDeleteBracket(input);
        assertThat(DividedResults).contains("10,10");
        assertThat(DividedResults).contains("14,15");
        assertThat(DividedResults).contains("20,8");
    }

    @Test
    void 콤마를_기준으로_문자열_나누기() {
        String input = "20,8";
        String[] DividedResults = DividedUtility.divideComma(input);
        assertThat(DividedResults).contains("20");
        assertThat(DividedResults).contains("8");
    }
}