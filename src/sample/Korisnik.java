package sample;

import javafx.beans.property.SimpleStringProperty;

public class  Korisnik {
    private SimpleStringProperty ime, prezime, email, korisnickoIme, sifra;

    public Korisnik() {
        this.ime = new SimpleStringProperty("");
        this.prezime = new SimpleStringProperty("");
        this.email = new SimpleStringProperty("");
        this.korisnickoIme = new SimpleStringProperty("");
        this.sifra = new SimpleStringProperty("");
    }

    public Korisnik(String ime, String prezime, String email, String korisnickoIme, String sifra) {
        this.ime = new SimpleStringProperty(ime);
        this.prezime = new SimpleStringProperty(prezime);
        this.email = new SimpleStringProperty(email);
        this.korisnickoIme = new SimpleStringProperty(korisnickoIme);
        this.sifra = new SimpleStringProperty(sifra);
    }

    public String getIme() {
        return ime.get();
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public String getPrezime() {
        return prezime.get();
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getKorisnickoIme() {
        return korisnickoIme.get();
    }

    public SimpleStringProperty korisnickoImeProperty() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme.set(korisnickoIme);
    }

    public String getSifra() {
        return sifra.get();
    }

    public SimpleStringProperty sifraProperty() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra.set(sifra);
    }

    @Override
    public String toString() {
        return ime.get() + " " + prezime.get();
    }
}
