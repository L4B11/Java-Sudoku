package sudokuFigureController;

import sudoku.ISudoku;

public class SudokuFigureControllerCol extends SudokuFigureController {

	public SudokuFigureControllerCol(ISudoku IS) {
		super(IS);
	}

	public void Set(int iFigureN, int iCellNInFigure, int iValue) {
		m_is.Set(iCellNInFigure, iFigureN, iValue);
	}

	public void Set(int iFigureN, int iCellNInFigure, int iDepth, int iValue) {
		m_is.Set(iCellNInFigure, iFigureN, iDepth, iValue);
	}

	public int Get(int iFigureN, int iCellNInFigure) {
		return m_is.Get(iCellNInFigure, iFigureN);
	}

	public int Get(int iFigureN, int iCellNInFigure, int iDepth) {
		return m_is.Get(iCellNInFigure, iFigureN, iDepth);
	}

}
