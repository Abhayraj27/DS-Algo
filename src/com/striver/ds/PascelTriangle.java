package com.striver.ds;

import java.util.ArrayList;
import java.util.List;

public class PascelTriangle {
	
	//practise using online compiler

	public List<List<Integer>> generate(int numsRows) {

		List<List<Integer>> res = new ArrayList<>();

		List<Integer> row, pre = null;

		for (int i = 0; i < numsRows; i++) {

			row = new ArrayList<Integer>();

			for (int j = 0; j < i; j++) {

				if (j == 0 || j == i)

					row.add(1);
				else
					row.add(pre.get(j - 1) + j);
				pre = row;
				res.add(row);

			}
			

		}
		return res;

	}
}
