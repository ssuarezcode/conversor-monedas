public class ConversorTemperatura {
    public static void main(String[] args) {
        //Variable de temperatura en Celsius:
        double temperaturaCelsius = 22.0;

        //Fórmula de conversión de Celsius a Farenheit:
        double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;

        //Mensaje con el resultado de la temperatura en Celsius y su conversión a Farenheit:
        String mensaje = String.format("La temperatura de %.1f Celsius es equivalente a %.1f Farenheit", temperaturaCelsius, temperaturaFarenheit);
        System.out.println(mensaje);

        //Casteo de double a int para mostrar el valor de la temperatura en números enteros:
        int farenheitEntero = (int) temperaturaFarenheit;
        System.out.println("La temperatura en Farenheit entera es: " + farenheitEntero);
    }
}
