package com.yedam.inheritance;

public class AnimalExe {
	public static void main(String[] args) {
		Animal a1 = new Bird();
		a1.breathe();
		a1.sound();
		a1 = new Fish();
		a1.sound();
		
	}
}
