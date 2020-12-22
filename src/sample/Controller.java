package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    public ListView<Korisnik> listKorisnici;
    public TextField lozinkaTxt;
    public TextField korinisckoImeTxt;
    public TextField emailTxt;
    public TextField prezimeTxt;
    public TextField imeTxt;

    private KorisnikModel model = new KorisnikModel();

    public Controller() {
        model.napuni();
    }

    @FXML
    public void initialize(){
        listKorisnici.setItems(model.getKorisnici());
        listKorisnici.getSelectionModel().selectedItemProperty().addListener((obs, oldKorisnik, newKorisnik) -> {
            model.setTrenutniKorisnik(newKorisnik);
            listKorisnici.refresh();
        });
        model.trenutniKorisnikProperty().addListener(
                (obs, oldKorisnik, newKorisnik) ->{
                    if(oldKorisnik != null){
                        imeTxt.textProperty().unbindBidirectional(oldKorisnik.imeProperty());
                        prezimeTxt.textProperty().unbindBidirectional(oldKorisnik.prezimeProperty());
                        emailTxt.textProperty().unbindBidirectional(oldKorisnik.emailProperty());
                        lozinkaTxt.textProperty().unbindBidirectional(oldKorisnik.sifraProperty());
                        korinisckoImeTxt.textProperty().unbindBidirectional(oldKorisnik.korisnickoImeProperty());
                    }
                    if(newKorisnik == null){
                        imeTxt.setText("");
                        prezimeTxt.setText("");
                        emailTxt.setText("");
                        lozinkaTxt.setText("");
                        korinisckoImeTxt.setText("");
                    }
                    else{
                        imeTxt.textProperty().bindBidirectional(newKorisnik.imeProperty());
                        prezimeTxt.textProperty().bindBidirectional(newKorisnik.prezimeProperty());
                        emailTxt.textProperty().bindBidirectional(newKorisnik.emailProperty());
                        lozinkaTxt.textProperty().bindBidirectional(newKorisnik.sifraProperty());
                        korinisckoImeTxt.textProperty().bindBidirectional(newKorisnik.korisnickoImeProperty());
                    }

                }
        );
    }

    public void bttnClick(ActionEvent actionEvent){
        System.exit(0);
    }

    public void actionDodaj(ActionEvent actionEvent) {
        model.dodajKorisnika(new Korisnik());
        model.setTrenutniKorisnik(model.getKorisnici().get(model.getKorisnici().size() - 1));
    }
}
