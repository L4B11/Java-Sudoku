package sudokuFigureController;

public interface ISudokuFigure {
	void Set(int iFigureN, int iCellNInFigure, int iValue);
	void Set(int iFigureN, int iCellNInFigure, int iDepth, int iValue);

	int Get(int iFigureN, int iCellNInFigure);
	int Get(int iFigureN, int iCellNInFigure, int iDepth);
}
