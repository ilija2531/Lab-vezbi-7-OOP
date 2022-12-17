package zadaca3;

public class SportskiKlub implements Comparable <SportskiKlub> {
	
	private String ime;
	private String sport;
	private int brnaclenovi;
	
	
	public SportskiKlub(String ime, String sport, int brnaclenovi) {
			this.ime = ime;
			this.sport = sport;
			this.brnaclenovi = brnaclenovi;
		
	}
	
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public int getBrnaclenovi() {
		return brnaclenovi;
	}
	public void setBrnaclenovi(int brnaclenovi) {
		this.brnaclenovi = brnaclenovi;
	}
	
	public int compareTo(SportskiKlub obj) {
		SportskiKlub a =(SportskiKlub) obj;
		if(this.ime.equals(obj)) {
			return 0;
			
		}
		else {
			return this.ime.compareTo(a.ime);
		}
	}
}

