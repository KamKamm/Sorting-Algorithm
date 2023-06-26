import java.util.Arrays;

public class SortingAlgorithm {
    public static String sortArray(String input) {
        String[] tokens = input.split(",");
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(numbers);

        StringBuilder sortedOutput = new StringBuilder();
        for (int number : numbers) {
            sortedOutput.append(number).append(",");
        }
        if (sortedOutput.length() > 0) {
            sortedOutput.setLength(sortedOutput.length() - 1);
        }
        return sortedOutput.toString();
    }
}
