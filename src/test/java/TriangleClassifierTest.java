import com.esde.type.TriangleType;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.esde.classifier.TriangleClassifier.classifyTriangle;

public class TriangleClassifierTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0, NOT_TRIANGLE",
            "1, 1, 2, NOT_TRIANGLE",
            "1, 2, 3, NOT_TRIANGLE",
            "0, 4, 5, NOT_TRIANGLE"
    })
    public void testNotTriangleClassification(int a, int b, int c, TriangleType expectedType){
        assertEquals(expectedType, classifyTriangle(a, b ,c));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 1, EQUILATERAL_TRIANGLE",
            "5, 5, 5, EQUILATERAL_TRIANGLE"
    })
    public void testEquilateralTriangleClassification(int a, int b, int c, TriangleType expectedType){
        assertEquals(expectedType, classifyTriangle(a, b ,c));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 8, ISOSCELES_TRIANGLE",
            "2, 2, 3, ISOSCELES_TRIANGLE",
    })
    public void testIsoscelesTriangleClassification(int a, int b, int c, TriangleType expectedType){
        assertEquals(expectedType, classifyTriangle(a, b ,c));
    }

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, SCALENE_TRIANGLE",
            "7, 10, 5, SCALENE_TRIANGLE"
    })
    public void testScaleneTriangleClassification(int a, int b, int c, TriangleType expectedType){
        assertEquals(expectedType, classifyTriangle(a, b ,c));
    }

}
