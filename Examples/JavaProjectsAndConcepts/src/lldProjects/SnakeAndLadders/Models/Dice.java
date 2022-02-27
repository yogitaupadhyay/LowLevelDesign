package lldProjects.SnakeAndLadders.Models;

public class Dice {
	public int throwDice() {

		int num = ((int) (Math.random() * 10)) % 6 + 1;
		return num;
	}
}
