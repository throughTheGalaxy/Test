package klausur;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WunderController{
	
	@FXML private TextArea txtGefaesse;
	@FXML private TextField txtPreisinhalt;
	@FXML private TextField txtLaenge;
	@FXML private TextField txtHoehe;
	@FXML private ChoiceBox<String> chbForm;
	@FXML private Label lblMeldung;
	@FXML private TextField txtGesamtpreis;
	
	private HausTausenderWunder htw = new HausTausenderWunder();
	
	@FXML
	private void initialize() {
		ObservableList<String> obs;
		obs = FXCollections.observableArrayList(new String[] {"Zylinder", "Quader", "Pyramide"});
		chbForm.setItems(obs);
		chbForm.getSelectionModel().selectFirst();
	}
	
	private void listeAktualisieren(String text)
	{
		Platform.runLater(() ->
		{
			txtGefaesse.setText(text);
		});
	}
	
	/**
	 * startet die Produktion
	 */
	public void starten()
	{
		double preisInhalt;
		double laenge;
		double hoehe;
		try {
		preisInhalt = Double.parseDouble(txtPreisinhalt.getText());
		laenge = Double.parseDouble(txtLaenge.getText());
		hoehe = Double.parseDouble(txtHoehe.getText());
		Gefaessfabrik fabrik = null;
		htw.produktionStarten(fabrik, preisInhalt, laenge, hoehe);
		lblMeldung.setText("Produktion läuft");
		}
		catch (NumberFormatException e)
		{
			lblMeldung.setText("Keine Zahl!");
		}
	}
	
	/**
	 * stoppt die Produktion
	 */
	public void stoppen()
	{
		htw.produktionStoppen();
	}
	
	/**
	 * kauft ein Gefäß
	 */
	public void kaufen()
	{
		try {
			double l = Double.parseDouble(txtLaenge.getText());
			double h = Double.parseDouble(txtHoehe.getText());
			double p = Double.parseDouble(txtPreisinhalt.getText());
	
			String form = chbForm.getValue();
			Gefaess g = null;
			switch(form)
			{
			case "Zylinder": g = new Zylinder(p, l, h);
							 break;
			case "Quader": g = new Quader(p, l, h);
			 				break;
			case "Pyramide": g = new Pyramide(p, l, h);
			 				break;
			}
			htw.gefaessKaufen(g);
		} catch (NichtVorhandenException e) {
			lblMeldung.setText("Gefaess nicht vorhanden!");
			return;
		}
		catch(NumberFormatException e)
		{
			lblMeldung.setText("Keine Zahl");
			return;
		}
		lblMeldung.setText("");
	}
	
	
}
