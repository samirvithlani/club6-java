package com.io.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("abc.txt");
			int c = 0;
//			int c = reader.read();
//			System.out.println((char)c);

			while ((c = reader.read()) != -1) {

				System.out.print((char) c);
			}

			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
