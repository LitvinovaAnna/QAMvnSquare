package ru.netology.javaqa.javaqamvn.sqrservice.SqrService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/values.csv")

    public void shouldCalcExact(int expected, int from, int to) {

        SqrService service = new SqrService();

        //int expected = 4;
        int actual = service.calcSqr(from, to);

        Assertions.assertEquals(expected, actual);
    }
}
