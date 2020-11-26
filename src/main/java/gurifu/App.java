package gurifu;


public class App {
    public static void main(String[] args) {
        System.out.println(generateFizzBuzzString(100));
    }

    public static String generateFizzBuzzString(int maxCount) {
        String fizzBuzzStr = "";
        for (int i = 1; i <= maxCount; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzStr += "FizzBuzz,";
            } else if (i % 3 == 0) {
                fizzBuzzStr += "Fizz,";
            } else if (i % 5 == 0) {
                fizzBuzzStr += "Buzz,";
            } else {
                fizzBuzzStr += i + ",";
            }
        }
        return fizzBuzzStr;
    }


}

