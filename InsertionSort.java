package dataStructureProblems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InsertionSort {

	void process() {
		String str = getFromFile("C:\\Users\\Tulika Sharma\\Desktop\\text.txt");
		String[] arr = str.split("\\s");
		sort(arr);
		//System.out.println(ans);
	}
	
	public void sort(String[] ans) {
		for (int i = 0; i < ans.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (ans[j].compareTo(ans[j - 1]) < 0) {
                    String temp = ans[j];
                    ans[j] = ans[j - 1];
                    ans[j - 1] = temp;
                }
            }
        }
		System.out.println("Sorted Array: ");
		for(String i:ans) {
			System.out.print(i+"\t");
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
		InsertionSort InsertionSort = new InsertionSort();
		InsertionSort.process();
	}
}
