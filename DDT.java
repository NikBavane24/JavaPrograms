package Selenium_package;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream f1=new FileInputStream("C:\\Users\\Win-10\\eclipse-workspace\\Newrepo\\Selenium_Pracktice\\src\\Selenium_package\\Excel1");
		Workbook w1=WorkbookFactory.create(f1);
		Sheet s1=w1.getSheet("login");
		Row r1=s1.getRow(1);
		Cell c1=r1.getCell(0);
		String Uname=c1.getStringCellValue();
		System.out.println(Uname);
		String Password= w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(Password);
		

	}

}
