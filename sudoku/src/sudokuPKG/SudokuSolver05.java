package sudokuPKG;

import sudokuPKG.ISudoku;

public class SudokuSolver05 extends SudokuSolver {
// записывает начина€ с 1 номера клеток с парами
private int masa[];
// кол-во пар
private int x;
// временна€ переменна€
private int q;
//
private boolean chek;
private int w1;
private int w2;

public SudokuSolver05(ISudoku IS) {
super(IS);
masa = new int [m_is.GetColMaxCX()+1];
x = 0;
q = 0;
chek = true;
w1 = 0;
w2 = 0;
}

// убрать все мелкие эл-ты если стоит пара возм-х эл-ов
public void Solve() {
/*
// —троки
for(int i_1 = 1;i_1 < 10;i_1++){
for(int i = 1; i < 10; i++){
masa[i] = 0;
}
x = 0;
for(int i_2 = 1;i_2 < 10;i_2++){
if(0 == m_is.Get(i_1, i_2)){
for(int i = 1; i < 10; i++){
if(m_is.V1 == m_is.Get(i_1, i_2, i)){
q++;
}
}
}
if(2 == q){
x++;
masa[x] = i_2;
}
q = 0;
}
if(x > 1){
for(int u = 1; u < x; u++){
for(int i = 1;i < x-u+1;i++){
chek = true;
w1 = 0;
w2 = 0;
for(int y = 1; y < 10; y++){
if(m_is.Get(i_1, masa[u], y) != m_is.Get(i_1, masa[u+1], y)){
chek = false;
}
if(m_is.Get(i_1, masa[u], y) == m_is.V1){
if(w1 == 0){
w1 = y;
}else{
w2 = y;
}
}
}
if(true == chek){
for(int y = 1;y < 10;y++){
if(y != masa[u] && y != masa[u+1]){
m_is.Set(i_1, y, w1, m_is.V0);
m_is.Set(i_1, y, w2, m_is.V0);
}
}
}
}
}
}
}
for(int i_1 = 1;i_1 < 10;i_1++){
for(int i = 1; i < 10; i++){
masa[i] = 0;
}
x = 0;
for(int i_2 = 1;i_2 < 10;i_2++){
if(0 == m_is.Get(i_2, i_1)){
for(int i = 1; i < 10; i++){
if(m_is.V1 == m_is.Get(i_2, i_1, i)){
q++;
}
}
}
if(2 == q){
x++;
masa[x] = i_2;
}
q = 0;
}
if(x > 1){
for(int u = 1; u < x; u++){
for(int i = 1;i < x-u+1;i++){
chek = true;
w1 = 0;
w2 = 0;
for(int y = 1; y < 10; y++){
if(m_is.Get(masa[u], i_1, y) != m_is.Get(masa[u+1], i_1, y)){
chek = false;
}
if(m_is.Get(masa[u], i_1, y) == m_is.V1){
if(w1 == 0){
w1 = y;
}else{
w2 = y;
}
}
}
if(true == chek){
for(int y = 1;y < 10;y++){
if(y != masa[u] && y != masa[u+1]){
m_is.Set(y, i_1, w1, m_is.V0);
m_is.Set(y, i_1, w2, m_is.V0);
}
}
}
}
}
}
}
// квадрат(недоделан)
for(int u_1 = 0; u_1 < 3;u_1++){
for(int u_2 = 0; u_2 < 3;u_2++){
for(int i_1 = 1; i_1 < 9;i_1++){
for(int i_2 = 1; i_2 < 9-i_1;i_2++){
x = 0;
for(int i = 1; i < 10; i++){

}
}
}
}
}
*/
}

}