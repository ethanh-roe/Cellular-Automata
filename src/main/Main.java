package main;

import model.Cell;
import model.Grid;

public class Main {
	
	public static void main(String args[]) {
		
		Grid grid = new Grid();
		long before = System.currentTimeMillis();
		grid.rule110();
		long after = System.currentTimeMillis();
		System.out.println(grid.toString());
		System.out.println("Took " + (after - before) + "ms");
	}
	
	

}
