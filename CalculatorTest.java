import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    public static void main(String[] args) {
        List<Float> numbers = new ArrayList<>();
        numbers.add(2.0f);
        numbers.add(3.0f);

        List<String> operations = new ArrayList<>();
        operations.add("+");

        Calculator.Calculate(numbers, operations);

        if (Calculator.finalResult == 5.0f) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
    }
}