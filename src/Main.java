public class Main {
    public static void main(String[] args) throws Exception {
        //* Pizza
        Prodotto pizza = new Prodotto(100);

        pizza.nome = "Pizza al salame";
        // pizza.prezzo = 7.5f;

        System.out.println("codice prodotto: " + pizza.codice);

        pizza.getBasePrice(7.5f);
        System.out.println("prezzo base: " + pizza.prezzo);

        pizza.setPriceWithIva();
        System.out.println("prezzo con iva: " + pizza.prezzo);
    
        pizza.getExtendedProductName();
        System.out.println("nome esteso: " + pizza.nome);


        //* Birra
        Prodotto birra = new Prodotto(100);

        birra.nome = "Birra artigianale";

        System.out.println("codice prodotto: " + birra.codice);

        birra.getBasePrice(4.5f);
        System.out.println("prezzo base: " + birra.prezzo);

        // birra.setPriceWithIva();
        System.out.println("prezzo con iva: " + birra.setPriceWithIva());
    
        birra.getExtendedProductName();
        System.out.println("nome esteso: " + birra.nome);
    }
}
