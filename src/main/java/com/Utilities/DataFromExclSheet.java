package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataFromExclSheet {
	@DataProvider
	static Iterator<Object[]> getDataFromExcl() {
		Sheet sh = null;
		FileInputStream file;
		try {
			file = new FileInputStream("D:\\FrameWork\\src\\test\\java\\com\\testBase\\TestData.xlsx");
			sh = WorkbookFactory.create(file).getSheet("details");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Object[]> arr = new ArrayList<Object[]>();

		for (int i = 1; i <= sh.getLastRowNum(); i++) {
			Object[] obj = new Object[2];
			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
				String str = sh.getRow(i).getCell(j).getStringCellValue();
				obj[j] = str;

			}
			arr.add(obj);
		}
		return arr.iterator();
	}
/*
	public static void main(String[] args) {
		Iterator<Object[]> itr = getDataFromExcl();
		while (itr.hasNext()) {
			Object[] obj = itr.next();
			System.out.println(obj[0] + " " + obj[1]);

		}
	}
*/

}
