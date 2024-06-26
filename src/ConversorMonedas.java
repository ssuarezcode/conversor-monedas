public class ConversorMonedas {
    public static void main(String[] args) {
        //Variables:
        double peso = 1;
        double dolar = 4136.83;
        double euro = 4419.52;
        double libra = 5223.23;
        double yen = 25.74;
        double won = 2.96;

        //Fórmulas:
        double pesoConversionDolar = peso * dolar;

        double pesoConversionEuro = peso * euro;

        double pesoConversionLibra = peso * libra;

        double pesoConversionYen = peso * yen;

        double pesoConversionWon = peso * won;

        //Mensajes:
        String mensajePesoDolar = String.format("El valor de %.2f Pesos es equivalente a %.2f Dolares.", peso, pesoConversionDolar);
        System.out.println(mensajePesoDolar);

        String mensajePesoEuro = String.format("El valor de %.2f Pesos es equivalente a %.2f Euros.", peso, pesoConversionEuro);
        System.out.println(mensajePesoEuro);

        String mensajePesoLibra = String.format("El valor de %.2f Pesos es equivalente a %.2f Libras.", peso, pesoConversionLibra);
        System.out.println(mensajePesoLibra);

        String mensajePesoYen = String.format("El valor de %.2f Pesos es equivalente a %.2f Yens.", peso, pesoConversionYen);
        System.out.println(mensajePesoYen);

        String mensajePesoWon = String.format("El valor de %.2f Pesos es equivalente a %.2f Wons.", peso, pesoConversionWon);
        System.out.println(mensajePesoWon);
    }
}

