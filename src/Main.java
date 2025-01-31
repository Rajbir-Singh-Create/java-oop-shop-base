public class Main {
    public static void main(String[] args) throws Exception {
        Prodotto pizza = new Prodotto(100);

        pizza.nome = "Pizza al salame";
        pizza.prezzo = 7.5f;

        System.out.println("codice prodotto: " + pizza.codice);

        pizza.getBasePrice();
        System.out.println("prezzo base: " + pizza.prezzo);

        pizza.setPriceWithIva();
        System.out.println("prezzo con iva: " + pizza.prezzo);
    
        pizza.getExtendedProductName();
        System.out.println("nome esteso: " + pizza.nome);
    }
}
