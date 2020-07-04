public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            output += checkNumber(i, 3, "Fizz");
            output += checkNumber(i, 5, "Buzz");
            System.out.println(output.isEmpty() ? i : output);
        }
    }

    public static String checkNumber(int number, int divisor, String output) {
        if(number % divisor == 0){
            return output;
        }
        return "";
    }
    
}