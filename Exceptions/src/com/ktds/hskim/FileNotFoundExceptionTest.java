package com.ktds.hskim;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;;

public class FileNotFoundExceptionTest {
	
	public void start() {
		
		// File file = new File(파일의 경로);
		File file = new File("D:\\abcd.efg");
		try {
			InputStream is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileNotFoundExceptionTest test = new FileNotFoundExceptionTest();
		test.start();
	}
}