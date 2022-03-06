class Solution {

	boolean func(String s, String p, int i, int j) {
		System.out.println(i + " " + j);
		if (i == p.length() && j == s.length())
			return true;
		while (i < p.length() && j < s.length()) {
			if (p.charAt(i) == '.') {
				i++;
				j++;
			} else if (p.charAt(i) == '*') {
				int m = s.length() - j;
				for (int k = 0; k <= m; k++) {
					if (func(s, p, i + 1, j + k))
						return true;
				}
			} else {
				if (p.charAt(i++) != s.charAt(j++))
					return false;

			}
		}
		if (i == p.length() && j == s.length())
			return true;

		return false;
	}

	public boolean isMatch(String s, String p) {

		return func(s, p, 0, 0);

	}
}