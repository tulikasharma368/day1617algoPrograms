package dataStructureProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordBinarySearch {
	
	static void process() {
		String str = getFromFile("C:\\Users\\Tulika Sharma\\Desktop\\text.txt");
		String[] arr = str.split("\\s");
		//System.out.println(str); input string
		System.out.println("Enter the word to be searched"); //user input
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		String word = null;
		try {
			word = inp.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr)); print sorted array
		//System.out.println(arr.getClass().getSimpleName()); type of array
		int val = binarySearch(arr,word);
		if(val==-1)
			System.out.println("Not present");
		else
			System.out.println("String present at position: "+ (val+1));
		System.out.println("String: " + str);
	}

	private static int binarySearch(String[] arr, String x) {
		int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = x.compareTo(arr[m]);
            // Check if x is present at mid
            if (res == 0)
                return m;
            // If x greater, ignore left half
            if (res > 0)
                l = m + 1;
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
        return -1;
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
		WordBinarySearch wordBinarySearch = new WordBinarySearch();
		wordBinarySearch.process();
	}
}
