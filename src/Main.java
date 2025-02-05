public class Main {
    public static void main(String[] args) throws Exception {
        //* Pizza
        Prodotto pizza = new Prodotto("pizza al salame", 7.5, 1.22);

        System.out.println("codice prodotto: " + pizza.codice);

        System.out.println("nome esteso: " + pizza.getExtendedProductName());

        System.out.println("prezzo base: " + pizza.getBasePrice());

        System.out.println("prezzo con iva: " + pizza.getPriceWithIva());       
    }
}