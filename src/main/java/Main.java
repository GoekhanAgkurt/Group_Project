public class Main {
    public static void main(String[] args) {
        int finalResult = resultOfAddition(10, 20);
        String finalText = resultText(205, 505);
        System.out.println(finalResult);
        System.out.println(finalText);
    }



    public static int resultOfAddition(int firstValue, int secondValue) {
        int result = firstValue + secondValue;
        return result;
    }



    public static String resultText(int firstValue, int secondValue) {
        int result = firstValue + secondValue;
        return "Summe: " + result;
    }
}
