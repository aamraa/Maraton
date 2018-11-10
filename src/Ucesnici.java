
public class Ucesnici {
private String imeUcesnika;
private int vrijemeKojeJeOstvario;

public Ucesnici () {
	
}
public Ucesnici (String imeUcesnika, int vrijeme) {
this.imeUcesnika = imeUcesnika;
this.vrijemeKojeJeOstvario = vrijeme;
}
public String getImeUcesnika() {
	return imeUcesnika;
}
public void setImeUcesnika(String imeUcesnika) {
	this.imeUcesnika = imeUcesnika;
}
public int getVrijemeKojeJeOstvario() {
	return vrijemeKojeJeOstvario;
}
public void setVrijemeKojeJeOstvario(int vrijemeKojeJeOstvario) {
	this.vrijemeKojeJeOstvario = vrijemeKojeJeOstvario;
}

}

