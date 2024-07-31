package sudokuPKG;

import sudokuPKG.ISudoku;

public class SudokuSolver03 extends SudokuSolver {

public SudokuSolver03(ISudoku IS) {
super(IS);
}

// убрать все мелкие эл-ты если стоит основной
public void Solve() {
	for(int i1 = 1; i1 <= m_is.GetRowMaxCX();i1++) {
		for(int i2 = 1; i2 <= m_is.GetColMaxCX();i2++) {
			if(m_is.Get(i1, i2) != 0) {
				for(int i3 = 1; i3 <= m_is.GetSizMaxCX();i3++) {
					m_is.Set(i1, i2, i3, m_is.V0);
				}
				m_is.Set(i1, i2, m_is.Get(i1, i2), m_is.V1);
			}
		}
	}
}

}