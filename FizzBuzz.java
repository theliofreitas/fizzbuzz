public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = checkNumber(i);
            System.out.println(output);
        }
    }

    public static String checkNumber(int number) {
        String result = "";

        if(number % 3 == 0){
            result += "Fizz";
        }
        if(number % 5 == 0){
            result += "Buzz";
        }
        if(result == ""){
            result = Integer.toString(number);
        }
        return result;
    }
    
}