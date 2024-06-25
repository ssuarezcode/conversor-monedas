public class ConversorTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 22.0;
        double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %.1f Celsius es equivalente a %.1f Farenheit", temperaturaCelsius, temperaturaFarenheit);

        System.out.println(mensaje);

        int farenheitEntero = (int) temperaturaFarenheit;
        System.out.println(farenheitEntero);
    }
}
