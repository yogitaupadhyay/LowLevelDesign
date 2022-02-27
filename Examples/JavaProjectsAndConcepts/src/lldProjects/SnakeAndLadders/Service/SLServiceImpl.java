package lldProjects.SnakeAndLadders.Service;

import lldProjects.SnakeAndLadders.Models.Board;
import lldProjects.SnakeAndLadders.Models.Dice;
import lldProjects.SnakeAndLadders.Models.Players;

public class SLServiceImpl implements SLService {

	private int getTurn(int turn, int np, boolean[] playersOutOfGame) {
		do {
			turn = (turn + 1) % np;
			if (turn == 0) {
				turn = np;
			}

		} while (playersOutOfGame[turn - 1] == true);

		return turn;
	}

	public int[] play(int np, int PlayerWhoWillStart) {

		boolean[] playersOutOfGame = new boolean[np];
		int[] res = new int[np];
		int count = 1;
		Players[] players = new Players[np];
		for (int i = 0; i < np; i++) {
			players[i] = new Players();
		}
		Dice dice = new Dice();

		int turn = PlayerWhoWillStart;

		while (np > 1) {
			int num = dice.throwDice();
			System.out.println("Player " + turn + " ["+players[turn-1].getPosition()+"] threw dice and got: " + num);
			int p = players[turn - 1].getPosition();

			if (p + num <= 100) {
				p = p + num;
				if (Board.board[p] == 1) {
					// snake bites
					p = Board.snakes.get(p);
					System.out.println("..ah snake bite back to: " + p);

				} else if (Board.board[p] == 2) {
					// got a ladder
					p = Board.ladders.get(p);
					System.out.println("..got a ladder, up to: " + p);
				}
				players[turn - 1].setPosition(p);
				
				if (p == 100) {
					//reached destination
					System.out.println("Player " + turn + " won.:):), place: " + count);
					playersOutOfGame[turn - 1] = true;
					res[turn - 1] = count++;
					turn = getTurn(turn, np, playersOutOfGame);
					np--;
					continue;
				}
			}

			if (num != 6) {
				turn = getTurn(turn, np, playersOutOfGame);
			}
		}
		return res;

	}

}
