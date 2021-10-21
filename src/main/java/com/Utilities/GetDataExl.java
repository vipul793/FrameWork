package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataExl {
	public static void main(String[] args) {
		Sheet sh = null;
		FileInputStream file;
		try {
			file = new FileInputStream("D:\\FrameWork\\src\\test\\java\\com\\testBase\\TestData.xlsx");
			sh = WorkbookFactory.create(file).getSheet("details");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*
		for (int i = 1; i <= sh.getLastRowNum(); i++) {

			for (int j = 0; j < sh.getRow(i).getLastCellNum(); j++) {
				String str = null;
				if (sh.getRow(i).getCell(j).getCellType().toString().equals("STRING")) {
					str = sh.getRow(i).getCell(j).getStringCellValue();
					
				} else if (sh.getRow(i).getCell(j).getCellType().toString().equals("NUMERIC")) {
					double num = sh.getRow(i).getCell(j).getNumericCellValue();
					str = num + "";
				}
				System.out.print(str + " ");

			}
			System.out.println();
		}*/
		int row = sh.getLastRowNum();
		int cell = sh.getRow(1).getLastCellNum();
		DataFormatter format = new DataFormatter();
		// String s = format.formatCellValue(sheet.getRow(4).getCell(1));
		// System.out.println(s);

		// To get all the values in sheet String as well as numeric
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= cell; j++) {
				String s = format.formatCellValue(sh.getRow(i).getCell(j));
				System.out.print(s + " ");

			}
			System.out.println();
		}
	}

}
