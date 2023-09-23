package klausur;

/**
 * Diese Klasse stellt den Laden "Haus Tausender Wunder" dar, der
 * viele tolle Gefäße produziert und aus dem Lager heraus verkauft
 * @author Doro
 *
 */
public class HausTausenderWunder {
	
	/**
	 * startet die Endlosproduktion von Gefäßen der angegebenen Größe 
	 * mit Hilfe der Fabrik und fügt die erstellten Gefäße in die
	 * Lagerverwaltung ein
	 * @param fabrik
	 * @param preisInhalt
	 * @param laenge
	 * @param hoehe
	 */
	public void produktionStarten(Gefaessfabrik fabrik,
			double preisInhalt, double laenge, double hoehe)
	{
	}
	
	/**
	 * stoppt alle laufenden Produktionen
	 */
	public void produktionStoppen()
	{
	}
	
	/**
	 * entnimmt das Gefäß g aus der Lagerverwaltung
	 * @param g
	 * @throws NichtVorhandenException, wenn g nicht im Lager vorhanden ist
	 */
	public void gefaessKaufen(Gefaess g) throws NichtVorhandenException
	{
	}
	
	/**
	 * fügt das Gefäß g in die Lagerverwaltung ein
	 * @param g
	 */
	protected void gefaessEinfuegen(Gefaess g)
	{
		if(g != null)
		{
			
		}
	}
	
	/**
	 * liefert einen textuelle Liste aller Gefäße mit ihrer Anzahl zurück
	 * @return
	 */
	public String getGefaessliste()
	{
		return null;
	}
}
