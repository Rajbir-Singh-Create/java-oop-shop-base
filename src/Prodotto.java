import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    public Prodotto(String nome, double prezzo, double iva){
        calcolaCodice();
        
        if (nome != null){
            this.nome = nome;
        } else {
            System.out.println("Inserisci un nome valido");
        }
        
        if (prezzo > 0){
            this.prezzo = prezzo;
        } else {
            System.out.println("Impossibile impostare un prezzo minore o uguale a 0");
        }

        if (iva == 1.04 || iva == 1.1 || iva == 1.22){
            this.iva = iva;    
        } else {
            System.out.println("Impossibile impostare un iva non convenzionale.");
        }
        
    }

    // Metodo che genera il codice in maniera random
    public void calcolaCodice(){
        Random r = new Random();
        this.codice = r.nextInt(100);
    }

    public int getCodice(){
        return this.codice;
    }

    // Metodo che espone il prezzo base del prodotto
    public double getBasePrice(){
        return this.prezzo;
    }

    // Metodo che calcola il prezzo compreso di iva
    public double getPriceWithIva(){
        return this.prezzo * this.iva;
    }

    // Metodo che espone il nome esteso
    // concatenando codice e nome
    public String getExtendedProductName(){
        return this.getCodice() + "-" + this.nome;
    }
}
