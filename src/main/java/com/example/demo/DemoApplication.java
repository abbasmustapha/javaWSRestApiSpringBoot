package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=lLSeMoN2uZM&list=PLK4Lw8AJ60B0I9kNfv35r2dzId9CDx8ll&index=15&ab_channel=Let%27sCode
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearchImpl.binarySearch(new int[] {12,5,22,7,9,2,6,26,49}, 8);
		System.out.println(result);
		SpringApplication.run(DemoApplication.class, args);
	}

}
