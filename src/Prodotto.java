import java.util.Random;

public class Prodotto {
    public int codice;
    public String nome;
    public String descrizione;
    public float prezzo;
    public float iva;

    // Costruttore che genera il codice in maniera random
    public Prodotto(int max){
        Random r = new Random();
        codice = r.nextInt(max);
    }

    // Metodo che espone il prezzo base del prodotto
    public float getBasePrice(){
        return prezzo;
    }

    // Metodo che calcola il prezzo compreso di iva
    public float setPriceWithIva(){
        iva = 22;
        return prezzo = prezzo + (prezzo*iva) / 100;
    }

    // Metodo che espone il nome esteso
    // concatenando codice e nome
    public String getExtendedProductName(){
        return nome = codice + "-" + nome;
    }
}
