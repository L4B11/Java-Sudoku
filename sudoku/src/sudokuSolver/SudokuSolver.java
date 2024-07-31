package sudokuSolver;

import sudoku.ISudoku;
import sudokuFigureController.ISudokuFigure;

public abstract class SudokuSolver implements ISudokuSolver {

	ISudoku m_is = null;
	ISudokuFigure m_isfm[] = null;
	
	public SudokuSolver(ISudoku IS) {
		m_is = IS;
	}

	public SudokuSolver(ISudoku IS, ISudokuFigure ISFM[]) {
		m_is = IS;
		m_isfm = ISFM;
	}

}
