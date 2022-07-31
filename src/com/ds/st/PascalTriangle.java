package com.ds.st;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	class Solution {
		public List<List<Integer>> generate(int numRows) {

			if (numRows == 0)
				return new ArrayList();
			List<List<Integer>> result = new ArrayList();

			for (int i = 1; i < numRows; i++) {

				List<Integer> rows = new ArrayList<>();

				for (int j = 0; j < i; j++) {

					if (j == 0 || j == i - 1) {

						rows.add(1);

					} else {
						rows.add(result.get(i - 2).get(j) + result.get(i - 2).get(j - 1));
					}

				}

				result.add(rows);

			}
			return result;

		}
	}

}
