package yogita.Models;

import java.util.HashMap;
import java.util.Map;

public class Board {

	public static int[] board = new int[101];
	public static Map<Integer, Integer> snakes = new HashMap<Integer, Integer>();
	public static Map<Integer, Integer> ladders = new HashMap<Integer, Integer>();

	static {
		// 1- snake(8), 2- ladder(8)
		board[98] = board[95] = board[93] = board[87] = board[62] = board[64] = board[54] = board[17] = 1;
		board[80] = board[72] = board[51] = board[21] = board[28] = board[1] = board[4] = board[9] = 2;

		// snakes.put(start, end)

		snakes.put(98, 79);
		snakes.put(95, 75);
		snakes.put(93, 73);
		snakes.put(87, 36);
		snakes.put(62, 18);
		snakes.put(64, 60);
		snakes.put(54, 34);
		snakes.put(17, 7);

		// ladder.put(start, end)
		ladders.put(80, 99);
		ladders.put(72, 91);
		ladders.put(51, 67);
		ladders.put(21, 42);
		ladders.put(28, 84);
		ladders.put(1, 38);
		ladders.put(4, 14);
		ladders.put(9, 31);

	}

}
