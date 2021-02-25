public class FizzBuzzTranslate {
    static String translate(int number){
        if (number%3==0 && number%5==0){
            return "FizzBuzz";
        }else if (number%3==0 && number%10==3){
            return "Fizz";
        }else if (number%5==0 && number%10==5){
            return "Buzz";
        }else return "" + number;
    }
}
