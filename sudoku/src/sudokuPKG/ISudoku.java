package sudokuPKG;

public interface ISudoku {

	int V0 = 0;
	
	int V1 = 1;

	void Set(int q, int w, int e);
	void Set(int q, int w, int e,int r);
	
	int Get(int q, int w);
	int Get(int q, int w, int e);
	
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
