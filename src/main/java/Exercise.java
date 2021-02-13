import org.apache.commons.lang3.StringUtils;

public class Exercise {

    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("Type something: ");
        String userInput = input.getString();

        boolean result = StringUtils.isNumeric(userInput);
        System.out.println("result = " + result);

        String swapped = StringUtils.swapCase(userInput);
        System.out.println("swapped " + swapped);

        String reversed = StringUtils.reverse(userInput);
        System.out.println("reversed: " +  reversed);

    }
}