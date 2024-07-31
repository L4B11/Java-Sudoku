package sudokuSolver;

import sudoku.ISudoku;
import sudokuFigureController.ISudokuFigure;

public class SudokuSolver01 extends SudokuSolver {

	public SudokuSolver01(ISudoku IS, ISudokuFigure ISFM[]) {
		super(IS, ISFM);
	}

// убрать лишние мелкие числа исходя из постаавленных больших
// строки и столбцы
public void Solve() {
for (int i_1 = 1; i_1 < 10 ; i_1++){
	for(int i_2 = 1; i_2 < 10 ; i_2++){
		if (m_is.Get(i_1,i_2) != 0 ){
			for(int i = 1; i < 10;i++){
				m_is.Set(i_1, i, m_is.Get(i_1, i_2), m_is.V0);
				m_is.Set(i, i_2, m_is.Get(i_1, i_2), m_is.V0);
			}
			m_is.Set(i_1, i_2, m_is.Get(i_1, i_2), m_is.V1);
		}
	}
}
//квадраты
for(int u_1 = 0; u_1 < 3; u_1++){
	for(int u_2 = 0; u_2 < 3; u_2++){
		for(int i_1 = 1; i_1 < 4; i_1++){
			for(int i_2 = 1; i_2 < 4; i_2++){
				if(0 != m_is.Get(u_1*3+i_1, u_2*3+i_2)){
					for(int y_1 = 1; y_1 < 4; y_1++){
						for(int y_2 = 1; y_2 < 4; y_2++){
							m_is.Set(u_1*3+y_1, u_2*3+y_2, m_is.Get(u_1*3+i_1, u_2*3+i_2), m_is.V0);
						}
					}
					m_is.Set(u_1*3+i_1, u_2*3+i_2, m_is.Get(u_1*3+i_1, u_2*3+i_2), m_is.V1);
				}
			}
		}
	}
}
}

}