package sudokuPKG;

import java.util.Scanner;

import sudokuPKG.ISudoku;

public class sudoku_MAS_9x9 implements ISudoku
{
// ix строка iy столбец iz числа iv значение
private int mas[][][];
private boolean chek;
private final int iMaxRowCX = 9; // строка
private final int iMaxColCX = 9; // столбец
private final int iMaxSizCX = (int) Math.sqrt(iMaxColCX*iMaxRowCX); // столбец
private final int iMaxCX = iMaxRowCX * iMaxColCX;
private final int iBlocksPerColRow = 3;

public sudoku_MAS_9x9() {
	mas = new int[iMaxColCX+1][iMaxRowCX+1][iMaxSizCX+1];
	// сначала строка, потом столбец, потом число (0 = пусто)
	for (int i_1 = 0; i_1 < (iMaxColCX+1); i_1++) {
		for (int i_2 = 0; i_2 < (iMaxRowCX+1); i_2++) {
			for (int i_3 = 0; i_3 < (iMaxRowCX+1); i_3++) {
				mas[i_1][i_2][i_3] = ISudoku.V0;
			}
		}
	}
}

public int Get(int ix, int iy, int iz) {
	return mas[ix][iy][iz];
}

public void Set(int ix, int iy, int iz, int iv) {
	if(ix == 0 || iy == 0){
	}
	if(iz == 0){
		if(mas[ix][iy][0] == 0){
			mas[ix][iy][0] = iv;
			mas[ix][0][0]++;
			mas[0][iy][0]++;
			mas[0][0][0]++;
			for(int i = 1;i < 10;i++){
				mas[ix][iy][i] = ISudoku.V0;
			}
		}
	}else{
		mas[ix][iy][iz] = iv;
	}
} 

public int Get(int ix, int iy) {
	return this.Get(ix, iy, 0);
}

public void Set(int ix, int iy, int iv) {
	this.Set(ix, iy, 0, iv);
}

public int GetCX() {
	return mas[0][0][0];
}

public int GetMaxCX() {
	return iMaxCX;
}

public int GetRowMaxCX() {
	return iMaxRowCX;
}

public int GetSixMaxCX() {
	return iMaxSizCX;
}

public int GetRowCX(int ix) {
	return mas[ix][0][0];
}

public int GetColMaxCX() {
	return iMaxColCX;
}

public int GetColCX(int iy) {
	return mas[0][iy][0];
}

public int GetBlocks() {
	return iBlocksPerColRow;
}

public int GetSizMaxCX() {
	return iMaxSizCX;
}

public int GetSizCX(int iv) {
	return mas[0][0][iv];
}
}