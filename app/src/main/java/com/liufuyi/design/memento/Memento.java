package com.liufuyi.design.memento;

public class Memento {
	private int vitality;
	private int aggressivity;
	private int defencivity;

	public int getVitality() {
		return vitality;
	}

	public void setVitality(final int vitality) {
		this.vitality = vitality;
	}

	public int getAggressivity() {
		return aggressivity;
	}

	public void setAggressivity(final int aggressivity) {
		this.aggressivity = aggressivity;
	}

	public int getDefencivity() {
		return defencivity;
	}

	public void setDefencivity(final int defencivity) {
		this.defencivity = defencivity;
	}
}
