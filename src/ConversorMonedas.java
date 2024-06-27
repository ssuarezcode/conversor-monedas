import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {

        //Variables:

        double valor = 0;
        double dolar = 4136.83;
        double euro = 4419.52;
        double libra = 5223.23;
        double yen = 25.74;
        double won = 2.96;
        double conversion = 0;

        String mensajeOpciones = String.format("""                
                
                *** Selecciona la modeda a convetir ***
                
                1  - De Pesos a Dólares
                2  - De Pesos a Euros
                3  - De Pesos a Libras
                4  - De Pesos a Yen
                5  - De Pesos a Won Coreano
                6  - De Dólares a Pesos
                7  - De Euros a Pesos
                8  - De Libras a Pesos
                9  - De Yen a Pesos
                10 - De Won Coreano a Pesos
                11 - Salir
                
                """);

        String mensajeValor = "Ingresa la cantidad de dinero que deseas convertir: ";




        System.out.println(mensajeOpciones);

        Scanner teclado = new Scanner(System.in);
        int opcionMoneda = teclado.nextInt();

        switch (opcionMoneda) {

            case 1:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor / dolar;
                String mensajeConversion = String.format("El valor de %.2f es equivalente a %.5f Dolares.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 2:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor / euro;
                mensajeConversion = String.format("El valor de %.2f es equivalente a %.5f Euros.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 3:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor / libra;
                mensajeConversion = String.format("El valor de %.2f es equivalente a %.5f Libras.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 4:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor / yen;
                mensajeConversion = String.format("El valor de %.2f es equivalente a %.5f Yenes.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 5:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor / won;
                mensajeConversion = String.format("El valor de %.2f es equivalente a %.5f Wones.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 6:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor * dolar;
                mensajeConversion = String.format("El valor de %.2f Dolares es equivalente a %.5f Pesos.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 7:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor * euro;
                mensajeConversion = String.format("El valor de %.2f Euros es equivalente a %.5f Pesos.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 8:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor * libra;
                mensajeConversion = String.format("El valor de %.2f Libras es equivalente a %.5f Pesos.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 9:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor * yen;
                mensajeConversion = String.format("El valor de %.2f Yenes es equivalente a %.5f Pesos.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 10:
                System.out.println(mensajeValor);
                valor = teclado.nextDouble();
                conversion = valor * won;
                mensajeConversion = String.format("El valor de %.2f Wones es equivalente a %.5f Pesos.", valor, conversion);
                System.out.println(mensajeConversion);
                break;
            case 11:
                System.out.println("¡Gracias y hasta pronto!");
                break;

            default:
                System.out.println("Opción no válida. Seleccione otra opción.");
        }
    }
}


