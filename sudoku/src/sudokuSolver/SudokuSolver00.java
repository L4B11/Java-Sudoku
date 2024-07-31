package sudokuSolver;

import sudoku.ISudoku;

public class SudokuSolver00 extends SudokuSolver {
	private int masa[];

	public SudokuSolver00(ISudoku IS) {
		super(IS);
		masa = new int [m_is.GetColMaxCX()+1];
	}

	// последний возможный элемент в каждом квадрате(не нужен т.к остается 1 мелкая и ставится в основу)
	public void Solve() {
	}

}