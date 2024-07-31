package sudokuPKG;

public class sudoku_fill {
	public void fill(sudoku_MAS_9x9 sm9x9) {
		for(int i1 = 1; i1 <= sm9x9.GetRowMaxCX(); i1++) {
			for(int i2 = 1; i2 <= sm9x9.GetColMaxCX(); i2++) {
				for(int i3 = 1; i3 <= sm9x9.GetSizMaxCX(); i3++) {
					sm9x9.Set(i1, i2, i3, sm9x9.V1);
				}
			}
		}
	}

}
