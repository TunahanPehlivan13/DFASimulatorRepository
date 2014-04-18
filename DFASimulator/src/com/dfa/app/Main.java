package com.dfa.app;

public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Simulator simulator = new Simulator();
		
		System.out.println(simulator.simulateDFA("ababb"));
	}

}
