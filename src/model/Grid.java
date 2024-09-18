package model;

public class Grid {
	private int HEIGHT = 500;
	private int WIDTH = 500;
	
	private Cell[][] grid;
	
	public Grid() {
		grid = new Cell[HEIGHT][WIDTH];
		init();	
	}
	
	public Cell[][] getGrid(){
		return grid;
	}
	
	private void init() {
		populateGrid();
	}
	
	private void populateGrid() {
		for(int r = 0; r < HEIGHT; r++) {
			for(int c = 0; c < WIDTH; c++) {
				grid[r][c] = new Cell();
			}
		}
		grid[0][WIDTH/2].setState(1);
	}
	
	public String toString() {
		String out = "";
		for(int r = 0; r < HEIGHT; r++) {
			for(int c = 0; c < WIDTH; c++) {
				if(grid[r][c].getState() == 0) {
					out += " ";
				}else {
					out += "@";
				}
			}
			out += '\n';
		}
		return out;
	}
	
	public void rule110() {

		for (int r = 1; r < HEIGHT; r++) {
			for (int c = 1; c < WIDTH - 1; c++) {
				int prev = r - 1;
				int left = grid[prev][c - 1].getState();
				int center = grid[prev][c].getState();
				int right = grid[prev][c + 1].getState();

				if (left == 1 && center == 1 && right == 1) {
					grid[r][c].setState(0);
				} else if (left == 1 && center == 1 && right == 0) {
					grid[r][c].setState(1);
				} else if (left == 1 && center == 0 && right == 1) {
					grid[r][c].setState(1);
				} else if (left == 1 && center == 0 && right == 0) {
					grid[r][c].setState(0);
				} else if (left == 0 && center == 1 && right == 1) {
					grid[r][c].setState(1);
				} else if (left == 0 && center == 1 && right == 0) {
					grid[r][c].setState(1);
				} else if (left == 0 && center == 0 && right == 1) {
					grid[r][c].setState(1);
				} else {
					grid[r][c].setState(0);
				}
			}

		}
		
	}
}
