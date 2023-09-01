package excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class allinksamzoninexcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		FileInputStream fis = new FileInputStream("./ex/book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
	}


}
