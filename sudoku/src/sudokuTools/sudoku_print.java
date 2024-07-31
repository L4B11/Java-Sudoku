package sudokuTools;

import sudoku.sudoku_MAS_9x9;

public class sudoku_print {

	public void print(sudoku_MAS_9x9 sm9x9, boolean b) {
		for(int i1 = 1; i1 <= sm9x9.GetRowMaxCX(); i1++) {
			System.out.print(sm9x9.Get(i1,1));
			for(int i2 = 2; i2 <= sm9x9.GetColMaxCX(); i2++) {
				System.out.print("|" + sm9x9.Get(i1, i2));
			}
			System.out.println();
		}
		if(b == true) {
			for(int i1 = 1; i1 <= sm9x9.GetRowMaxCX(); i1++) {
				for(int i2 = 1; i2 <= sm9x9.GetColMaxCX(); i2++) {
					if(sm9x9.Get(i1, i2, 1) == sm9x9.V1) {
						System.out.print(1);
					}else {
						System.out.print(0);
					}
					for(int i3 = 2; i3 <= sm9x9.GetSizMaxCX(); i3++) {
						if(sm9x9.Get(i1, i2, i3) == sm9x9.V1) {
							System.out.print("," + i3);
						}else {
							System.out.print("," + sm9x9.V0);
						}
					}
					if(i2 != sm9x9.GetColMaxCX()) System.out.print("|");
				}
				System.out.println();
			}
		}
	}

}
