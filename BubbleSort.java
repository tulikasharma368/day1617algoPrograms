package dataStructureProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BubbleSort {
	void process() {
		String str = getFromFile("C:\\Users\\Tulika Sharma\\Desktop\\text.txt");
		String[] arr = str.split("\\s");
		sort(arr);
	}
	
	public void sort(String[] str) {
		String temp;
		System.out.println("Sorted array: ");
		for (int j = 0; j < str.length; j++) {
		   	   for (int i = j + 1; i < str.length; i++) {
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			   }
			   System.out.print(str[j]+" ");
			}
	}
	
	public static String getFromFile(String path) {
		BufferedReader bufferReader = null;
		String str = "";
		try {
			bufferReader = new BufferedReader(new FileReader(path));
			str = bufferReader.readLine();
			bufferReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	public static void main(String[] args){
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.process();
	}
}
