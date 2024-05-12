package com.ds.cache;

public class Cache {

	public String getCache() {

		if (Constants.CONSTANT_MAP.get("StData") == null) {

			Constants.CONSTANT_MAP.put("StData", "Data Set in Constant");

			System.out.println(Constants.CONSTANT_MAP.get("StData")+"step1 ====>set in  constant");

		}

		else {

			System.out.println(Constants.CONSTANT_MAP.get("StData")+"Get from constant ====");
		}
		
		return "Java Solution with best practises";
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cache cache = new Cache();
		cache.getCache();

	}

}
