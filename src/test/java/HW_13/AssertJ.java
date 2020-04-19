package HW_13;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;


public class AssertJ {

    @Test
    public void assertJTest() {
        assertThat(Man.name).isEqualTo("Super")
                            .isNotEmpty()
                            .doesNotContainAnyWhitespaces();
        assertThat(Man.age).isBetween(20, 40);
        assertThatNullPointerException().isThrownBy(() -> { throw new NullPointerException("Null"); })
                                        .withMessage("Null")
                                        .withMessageContaining("Null");
        assertThatCode(() -> System.out.println(Man.age)).doesNotThrowAnyException();
    }

    public static class Man {
        static String name = "Super", surname = "Man";
        static int age = 30;
    }

}


