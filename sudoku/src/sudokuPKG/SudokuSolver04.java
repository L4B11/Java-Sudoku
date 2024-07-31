package sudokuPKG;

import sudokuPKG.ISudoku;

public class SudokuSolver04 extends SudokuSolver {
private int masa[];

public SudokuSolver04(ISudoku IS) {
super(IS);
masa = new int [m_is.GetColMaxCX()+1];
}

public void Solve() {
// последний эл-т в строке
for(int i_1 = 1; i_1 < 10;i_1++){
for(int i = 1; i < 10;i++){
masa[i] = 0;
}
for(int i_2 = 1; i_2 < 10;i_2++){
for(int i = 1; i < 10; i++){
if( m_is.V1 == m_is.Get(i_1, i_2, i)){
masa[i]++;
}
}
if( 0 != m_is.Get(i_1, i_2)){
masa[m_is.Get(i_1, i_2)] = 2;
}
}
for(int i = 1; i < 10; i++){
if(masa[i] == 1){
for(int i_2 = 1; i_2 < 10; i_2++){
if(m_is.Get(i_1, i_2, i) == m_is.V1){
m_is.Set(i_1,i_2,i);
}
}
}
}
}
// последний эл-т в столбце
for(int i_1 = 1; i_1 < 10;i_1++){
for(int i = 1; i < 10;i++){
masa[i] = 0;
}
for(int i_2 = 1; i_2 < 10;i_2++){
for(int i = 1; i < 10; i++){
if( m_is.V1 == m_is.Get(i_2, i_1, i)){
masa[i]++;
}
}
if( 0 != m_is.Get(i_2, i_1, 0)){
masa[m_is.Get(i_2, i_1, 0)] = 2;
}
}
for(int i = 1; i < 10; i++){
if(masa[i] == 1){
for(int i_2 = 1; i_2 < 10; i_2++){
if(m_is.Get(i_2, i_1, i) == m_is.V1){
m_is.Set(i_2,i_1,i);
}
}
}
}
}
}
}