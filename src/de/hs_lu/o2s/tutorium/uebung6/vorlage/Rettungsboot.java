package de.hs_lu.o2s.tutorium.uebung6.vorlage;

public class Rettungsboot extends Boot {

	private int sitzplaetze;

	public Rettungsboot(String name, double preis, int sitzplaetze) {
		super(name, preis);
		this.sitzplaetze = sitzplaetze;
	}

	public int getSitzplaetze() {
		return this.sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) {
		this.sitzplaetze = sitzplaetze;
	}
}
