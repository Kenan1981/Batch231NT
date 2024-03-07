package yeniHastane;

import Hastane_Projesi.Hastane;

public class Doktor extends Hastane {

	private String isim;
	private String soyIsim;
	private String unvan;
	private String isimSoyadUnvan;

	public String getIsimSoyadUnvan() {
		return isimSoyadUnvan;
	}

	public void setIsimSoyadUnvan(String isimSoyadUnvan) {
		this.isimSoyadUnvan = isimSoyadUnvan;
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
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	

}
