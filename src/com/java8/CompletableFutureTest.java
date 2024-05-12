package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class CompletableFutureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateAsync();

	}

	private static void calculateAsync() {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		List<String> list = new ArrayList<>();
		list.add("AR");
		list.add("BR");
		list.add("CR");

		Executors.newCachedThreadPool().submit(() -> {

			try {
				Thread.sleep(20);
				String joinstr = String.join(" ", list);
				completableFuture.complete(joinstr);
				return null;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

	}

}
