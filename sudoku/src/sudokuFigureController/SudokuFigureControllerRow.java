package sudokuFigureController;

import sudoku.ISudoku;

public class SudokuFigureControllerRow extends SudokuFigureController {

	public SudokuFigureControllerRow(ISudoku IS) {
		super(IS);
	}

	public void Set(int iFigureN, int iCellNInFigure, int iValue) {
		m_is.Set(iFigureN, iCellNInFigure, iValue);
	}

	public void Set(int iFigureN, int iCellNInFigure, int iDepth, int iValue) {
		m_is.Set(iFigureN, iCellNInFigure, iDepth, iValue);
	}

	public int Get(int iFigureN, int iCellNInFigure) {
		return m_is.Get(iFigureN, iCellNInFigure);
	}

	public int Get(int iFigureN, int iCellNInFigure, int iDepth) {
		return m_is.Get(iFigureN, iCellNInFigure, iDepth);
	}

}
