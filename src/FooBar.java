public class FooBar {
    public static String convert(int number){
        String result = "";
        if(number%3==0)
            result += "Foo";
        if(String.valueOf(number).contains("3"))
            result += "Foo";
        if(number==5)
            result += "Bar";
        if(String.valueOf(number).contains("5"))
            result += "Bar";
        if(number==7)
            result += "Qix";
        if(String.valueOf(number).contains("7"))
            result += "Qix";
        if(result.equals(""))
            result = String.valueOf(number);
        return result;
    }
}
