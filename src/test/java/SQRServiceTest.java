import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.Homework_5.SQRCalc.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/checkCases.csv")
    public void testCheckCases(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.SQRCalc(min, max);

        Assertions.assertEquals(expected, actual);
    }
}