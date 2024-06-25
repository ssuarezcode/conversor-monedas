public class ConversorTemperatura {
    public static void main(String[] args) {
        int celsius = 22;
        int temperatura = (int) ((celsius * 1.8) + 32);
        double farenheit = (double) temperatura;

        System.out.println(farenheit);
    }
}
