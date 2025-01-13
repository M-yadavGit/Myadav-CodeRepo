package com.Demowebshop.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.DemowebShop.generic.Lib.Flib;
import com.DemowebShop.generic.Lib.IAutoConstant;

public class SearchTest implements IAutoConstant{
	@Test
	public void toWrite() throws EncryptedDocumentException, IOException {
	Flib l=new Flib();
	l.toWriteDataIntoExcelSheet(EXCEL_PATH, TOWRITE, 1, 1,"Mithlesh");
	}
}
