package sudoku;

public interface ISudoku {

	int V0 = 0;
	
	int V1 = 1;

	void Set(int ix, int iy, int iv);
	void Set(int ix, int iy, int iz, int iv);
	
	int Get(int ix, int iy);
	int Get(int ix, int iy, int iz);
	
	int GetCX();
	
	int GetMaxCX();
	
	int GetRowMaxCX();
	
	int GetRowCX(int q);
	
	int GetColMaxCX();
	
	int GetColCX(int q);

	int GetSizMaxCX();
	
	int GetSizCX(int q);	
	
	int GetBlocks();
	
}
