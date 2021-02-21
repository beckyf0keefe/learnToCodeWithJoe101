public class FizzBuzz {
    public String blah = "hello";

    public static String convert(int number){
        String result = "";
        if (isDivisibleBy(3, number))
            result += "Fizz";
        if(isDivisibleBy(5, number))
            result += "Buzz";
        if(result.equals("")) return String.valueOf(number);
        return result;
    }

    private static boolean isDivisibleBy(int divisor, int number) {
        return number % divisor == 0;
    }

    public static String print(int upTo) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < upTo; i++)
            result.append(convert(i)).append("\n");
        result.append(convert(upTo));
        return result.toString();
    }
}
