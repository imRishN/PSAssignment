package com.sapient.week5;

public class TicTac {
	public static void main(String[] args) {

		TicTacGame t = new TicTacGame();
		TicRunner tic = new TicRunner(t);
		TacRunner tac = new TacRunner(t);
		tic.start();
		tac.start();
	}
}

class TicRunner extends Thread {

	TicTacGame t;

	public TicRunner(TicTacGame t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		int i = 0;
		while (i <= 10) {
			t.f1();
			i++;
		}
	}
}

class TacRunner extends Thread {

	TicTacGame t;

	public TacRunner(TicTacGame t) {
		// TODO Auto-generated constructor stub
		this.t = t;
	}

	@Override
	public void run() {
		int i = 0;
		while (i <= 10) {
			t.f2();
			i++;
		}
	}
}

class TicTacGame {

	public synchronized void f1() {
		try {
			notify();
			System.out.print("Tic-");
			wait();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public synchronized void f2() {
		try {
			notify();
			System.out.println("Tac");
			wait();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
