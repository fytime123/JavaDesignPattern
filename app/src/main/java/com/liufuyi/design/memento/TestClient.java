package com.liufuyi.design.memento;

public class TestClient {

	public static void main(final String[] args) {
		
		final PlayerOriginator player = new PlayerOriginator(100, 100, 100);
		System.out.print("玩家的原始属性是: ");
		player.showState();

		final Caretaker taker = new Caretaker();
		taker.setMemento(player.createMemento());

		player.setVitality(70);
		player.setAggressivity(60);
		player.setDefencivity(20);

		System.out.print("玩家与Boss的战斗后，玩家的属性是");
		player.showState();

		// reset player's attribute
		player.setMemento(taker.getMemento());
		System.out.print("重置后，玩家的属性是");
		player.showState();

	}
}
