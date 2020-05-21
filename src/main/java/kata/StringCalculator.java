package kata;

public class StringCalculator {

    public int add(final String numbers) {
        int sum = 0;
        if (numbers == null || numbers.isEmpty())
            return sum;
        final String[] strNumbers = numbers.split(",");
        for (final String strNumber : strNumbers) {
            sum += Integer.parseInt(strNumber);
        }

        return sum;
    }
}
