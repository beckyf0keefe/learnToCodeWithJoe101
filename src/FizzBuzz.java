public class FizzBuzz {
    public String convert(int number){
        if (number % 3 == 0)
            return "Fizz";
        if(number == 5)
            return "Buzz";
        return String.valueOf(number);
    }
}
