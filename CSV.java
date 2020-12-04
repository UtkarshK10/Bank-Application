package bankaccountapp;

import java.util.*;
import java.io.*;
public class CSV {
	//This function will read a CSV file and return as a list
	public static List<String[]> read(String file) {
		List<String[]>data=new LinkedList<String[]>();
		String dataRow;
		try {
			BufferedReader br=new BufferedReader(new FileReader(file));
			while((dataRow=br.readLine())!=null) {
			String[] dataRecords=dataRow.split(",");
			data.add(dataRecords);}
		}catch(FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("COULD NOT READ FILE");
			e.printStackTrace();
		}
		return data;
	}
}
