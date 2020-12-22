package sample;


import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisnikModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    private SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<>();

    public void napuni(){
        korisnici.add(new Korisnik("Amer", "Klinic", "aklini1@etf.unsa.ba", "aklinic1", "kooko"));
        korisnici.add(new Korisnik("Neko", "Nekic", "nnekic1@etf.unsa.ba", "nnekic1", "koodwko"));
        korisnici.add(new Korisnik("Meko", "Mekic", "mmekic1@etf.unsa.ba", "mmekic1", "koodwdiwjw"));
        trenutniKorisnik.set(null);
    }

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }
    public void dodajKorisnika(Korisnik korisnik){
        korisnici.add(korisnik);
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }
}
