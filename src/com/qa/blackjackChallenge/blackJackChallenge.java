package com.qa.blackjackChallenge;

public class blackJackChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(play(-2, 21));
		System.out.println(play(20, 18));
		System.out.println(play(1, 22));
		System.out.println(play(22, 23));
	}

	public static int play(int x, int y) {

		if (x > 21 && y > 21) {
			return 0;
		} else if (x < 1 || y < 1) {
			System.out.println("Numbers need to be greater than 0.");
			return 0;
		} else if (x > y && x < 22) {
			return x;
		} else if (y > x && y < 22) {
			return y;
		} else if (x < 22 && y > 21) {
			return x;
		} else if (y < 22 && x > 21) {
			return y;
		} else {
			return 0;
		}

	}

}
