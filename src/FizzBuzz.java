public class FizzBuzz {
    public String convert(int number){
        String result = "";
        if (isDivisibleBy(3, number))
            result += "Fizz";
        if(isDivisibleBy(5, number))
            result += "Buzz";
        if(result.equals("")) return String.valueOf(number);
        return result;
    }

    private boolean isDivisibleBy(int divisor, int number) {
        return number % divisor == 0;
    }
}
