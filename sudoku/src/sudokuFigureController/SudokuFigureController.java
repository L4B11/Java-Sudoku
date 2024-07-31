package sudokuFigureController;

import sudoku.ISudoku;

public abstract class SudokuFigureController implements ISudokuFigure {
	ISudoku m_is;

	SudokuFigureController(ISudoku IS)
	{
		m_is = IS;
	}

}
