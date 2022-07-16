import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.MavenSqr.services.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")

    public void checkLimit(int expected, int underLimit, int upperLimit) {
        SQRService service = new SQRService();

        int actual = service.rangeLimit(underLimit, upperLimit);

        Assertions.assertEquals(expected, actual);
    }
}
