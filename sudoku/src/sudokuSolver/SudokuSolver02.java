package sudokuSolver;

import sudoku.ISudoku;

public class SudokuSolver02 extends SudokuSolver {
private int x;
private int n;
public SudokuSolver02(ISudoku IS) {
super(IS);

}

// поставить последнее число в основную клетку
public void Solve() {
for (int i_1 = 1; i_1 < 10 ; i_1++){
for(int i_2 = 1; i_2 < 10 ; i_2++){
x = 0;
if(m_is.Get(i_1, i_2, 0) == 0){
for (int i = 1;i < 10;i++){
if (m_is.V1 == m_is.Get(i_1, i_2, i)){
x++;
n = i;
}
}
if(x == 1){
m_is.Set(i_1,i_2,n);
}
}
}
}
}

}