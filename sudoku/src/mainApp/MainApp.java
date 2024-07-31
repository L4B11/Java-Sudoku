package mainApp;
import java.util.Scanner;

import sudoku.ISudoku;
import sudokuTools.sudoku_fill;
import sudokuTools.sudoku_print;
import sudokuFigureController.SudokuFigureController;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class MainApp {
	public static void LoadSudokuFromFile(ISudoku is, String SudokuFileName) {
		BufferedReader br = null;
		try	{
			System.out.println("not Error; " + SudokuFileName);

			br = new BufferedReader(new FileReader(SudokuFileName));
			String line;
			int u = 0;
			while((line = br.readLine()) != null ) {
				if (line.indexOf(";") != -1) {
					line = line.substring(0, line.indexOf(";"));
				}else{
					u++;
				}
				line = line.trim();
				String[] stArr = line.split(",");
				for (int i = 0 ; i < stArr.length; i++) {
					stArr[i] = stArr[i].trim();
					if (stArr[i].length() != 0) {
						is.Set(u, i+1, Integer.parseInt(stArr[i]));
					}
				}
			}
			br.close();
		}catch(IOException e){
			System.out.println("Error" + e);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		sudoku.sudoku_MAS_9x9 sm9x9 = new sudoku.sudoku_MAS_9x9();
		sudokuTools.sudoku_print sp = new sudokuTools.sudoku_print();
		sudokuTools.sudoku_fill sf = new sudokuTools.sudoku_fill();
		sudokuSolver.ISudokuSolver ssmas[] = new sudokuSolver.SudokuSolver[6];
		sudokuFigureController.SudokuFigureController sfcmas[] = new sudokuFigureController.SudokuFigureController[3]; 

		sfcmas[0] = new sudokuFigureController.SudokuFigureControllerCol(sm9x9);
		sfcmas[1] = new sudokuFigureController.SudokuFigureControllerRow(sm9x9);
//		sfcmas[2] = new sudokuFigureController.SudokuFigureControllerSqr(sm9x9);

		ssmas[0] = new sudokuSolver.SudokuSolver00(sm9x9);
		ssmas[1] = new sudokuSolver.SudokuSolver01(sm9x9, sfcmas);
		ssmas[2] = new sudokuSolver.SudokuSolver02(sm9x9);
		ssmas[3] = new sudokuSolver.SudokuSolver03(sm9x9);
		ssmas[4] = new sudokuSolver.SudokuSolver04(sm9x9);
		ssmas[5] = new sudokuSolver.SudokuSolver05(sm9x9);
		
		

LoadSudokuFromFile(sm9x9, "D:/jws/Sudoka_2_2.txt");
sf.fill(sm9x9);
sp.print(sm9x9, false);

System.out.println("������� ������:"+sm9x9.GetCX());
for(int i = 0; i < 1;){
/*
for(;;){
System.out.println("�����");
int s = in.nextInt();
if(s == 9){
break;
}
if(s != 9){
ssmas[s].Solve();
}
}
*/
for(;;){

/*
for(int y1 = 1;y1 < 10;y1++) {
	for(int y2 = 1;y2 < 10;y2++) {
		System.out.println();
		for(int y3 = 0;y3 < 10;y3++) {
			System.out.print(sm9x9.Get(y1, y2, y3));
		}
	}
}
*/
System.out.println("1-����������;");
System.out.println("2-������� ���������;");
System.out.println("3-������ ���������;");
int a = in.nextInt();
if(a == 1){
break;
}else{
if(a == 2){
sp.print(sm9x9, true);
}else{
if(a == 3){
sp.print(sm9x9, true);
System.out.println("������� ������, ����� �������, ����� �����");
int x = in.nextInt();
int y = in.nextInt();
int v = in.nextInt();
sm9x9.Set(x,y,v);
}else{
System.out.println("�� ����� ����������� �������");
}
}
}
}
for (int ii= 0; ii<ssmas.length; ii++){
ssmas[ii].Solve();
}
System.out.println("������� ������:"+sm9x9.GetCX());
if( sm9x9.Get(0, 0) == 81 ){
break;
}
}
System.out.println(sm9x9.Get(0, 0));
sp.print(sm9x9, false);
}
}