import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de dinero que deseas convertir: ");
        double peso = teclado.nextDouble();
        System.out.println("Elije una opción para convertir: ");
        int opcionMoneda = teclado.nextInt();

        //Variables:
        double dolar = 4136.83;
        double euro = 4419.52;
        double libra = 5223.23;
        double yen = 25.74;
        double won = 2.96;

        //Fórmulas:
        double pesoConversionDolar = peso / dolar;
        double pesoConversionEuro = peso / euro;
        double pesoConversionLibra = peso / libra;
        double pesoConversionYen = peso / yen;
        double pesoConversionWon = peso / won;

        //Mensajes:
        String mensajePesoDolar = String.format("El valor de %.2f Pesos es equivalente a %.2f Dolares.", peso, pesoConversionDolar);
        String mensajePesoEuro = String.format("El valor de %.2f Pesos es equivalente a %.2f Euros.", peso, pesoConversionEuro);
        String mensajePesoLibra = String.format("El valor de %.2f Pesos es equivalente a %.2f Libras.", peso, pesoConversionLibra);
        String mensajePesoYen = String.format("El valor de %.2f Pesos es equivalente a %.2f Yens.", peso, pesoConversionYen);
        String mensajePesoWon = String.format("El valor de %.2f Pesos es equivalente a %.2f Wons.", peso, pesoConversionWon);



        switch (opcionMoneda) {
            case 1:
                System.out.println(mensajePesoDolar);
                break;
            case 2:
                System.out.println(mensajePesoEuro);
                break;
            case 3:
                System.out.println(mensajePesoLibra);
                break;
            case 4:
                System.out.println(mensajePesoYen);
                break;
            case 5:
                System.out.println(mensajePesoWon);
                break;
            // otros casos posibles...
            default:
                System.out.println("Opción no válida. Seleccione otra opción.");
        }

    }
}


