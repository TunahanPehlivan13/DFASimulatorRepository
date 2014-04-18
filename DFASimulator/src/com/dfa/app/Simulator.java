package com.dfa.app;

public class Simulator 
{
	private int kTransitionTable[][] = {
			{1, 0},
			{1, 2},
			{1, 3},
			{1, 0},
	};
	
	private boolean kAcceptTable[] = {
			false,
			false,
			false,
			true
	};
	
	public boolean simulateDFA(String input)
	{
		int state = 0;
		input = input.replaceAll("a", "0");
		input = input.replaceAll("b", "1");
		
		for(char ch : input.toCharArray())
			state = kTransitionTable[state][Integer.parseInt(ch + "")];
		
		return kAcceptTable[state];
	}
}
