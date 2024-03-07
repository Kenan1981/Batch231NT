package yeniHastane;

import Hastane_Projesi.Hastane;

public class Hasta extends Hastane {

	private String isim;
	private String soyIsim;
	private int hastaID;
	private Durum hastaDurumu;
	private String isimSoyisimId;


	public String getIsimSoyisimId() {
		return isimSoyisimId;
	}

	public void setIsimSoyisimId(String isimSoyisimId) {
		this.isimSoyisimId = isimSoyisimId;
	}


	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	public int getHastaID() {
		return hastaID;
	}
	public void setHastaID(int hastaID) {
		this.hastaID = hastaID;
	}
	public Durum getHastaDurumu() {
		return hastaDurumu;
	}
	public void setHastaDurumu(Durum hastaDurumu) {
		this.hastaDurumu = hastaDurumu;
	}
	

}
