package com.ktds.jmj;

public class GoHome {
	
	public void start () {
		GoHomeProgram program = new GoHomeProgram();
		program.startProgram();
	}

	public static void main(String[] args) {
		
		GoHome gohome = new GoHome();
		gohome.start();

	}
}
