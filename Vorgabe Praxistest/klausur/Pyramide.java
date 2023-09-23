package klausur;

/**
 * Pyramidenförmiges Gefäß mit quadratischer Grundfläche
 * @author Doro
 *
 */
public class Pyramide extends Gefaess {

	/**
	 * Länge einer Seite der Grundfläche in cm
	 */
	private double seitenlaenge;
	/**
	 * Höhe der Pyramide in cm
	 */
	private double hoehe;

	/**
	 * erstellt ein Pyramiden-Gefäß mit den angegegeben Werten
	 * @param preisInhalt
	 * @param seitenlaenge
	 * @param hoehe
	 */
	public Pyramide(double preisInhalt, double seitenlaenge, double hoehe) {
		super(preisInhalt);
		this.seitenlaenge = seitenlaenge;
		this.hoehe = hoehe;
	}
}
