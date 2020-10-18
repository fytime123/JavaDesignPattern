package com.liufuyi.design.memento;

public class PlayerOriginator {
	private int vitality; // 生命力
	private int aggressivity; // 攻击力
	private int defencivity; // 防御力

	public PlayerOriginator(final int vitality, final int aggressivity, final int defencivity) {
		this.vitality = vitality;
		this.aggressivity = aggressivity;
		this.defencivity = defencivity;
	}

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

	public Memento createMemento() {
		final Memento memento = new Memento();
		memento.setVitality(this.vitality);
		memento.setAggressivity(this.aggressivity);
		memento.setDefencivity(this.defencivity);
		return memento;
	}

	public void setMemento(final Memento memento) {
		this.vitality = memento.getVitality();
		this.aggressivity = memento.getAggressivity();
		this.defencivity = memento.getDefencivity();
	}

	public void showState() {
		System.out.print("vitality:" + this.vitality);
		System.out.print("; aggressivity:" + this.aggressivity);
		System.out.println("; defencivity:" + this.defencivity);
	}
}
