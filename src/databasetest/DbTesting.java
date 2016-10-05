package databasetest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class DbTesting {
	WebDriver driver;

	
	
	/* Test Git hub */
	
	
	
	@Test
	public void dbTest() throws ClassNotFoundException, SQLException {
		
		System.out.println("Hello Github");

		Class.forName("com.mysql.jdbc.Driver");
		
		
		
		String url = "jdbc:mysql://www.cpimtg.in/:3306/cpimtg_db04";
	    // Get connection to DB.
		Connection conn = DriverManager.getConnection(url, "cpimtg_user04", "ur^AS#([-;v4");
	    // Create statement object which would be used in writing DDL and DML
	    // SQL statement.
		Statement st = conn.createStatement();
		
		ResultSet rs= st.executeQuery("SELECT * FROM `role` ");

	/*	Connection conn = DriverManager.getConnection("jdbc:mysql://103.231.100.253:3306/cpimtg_db04", "cpimtg_user04","ur^AS#([-;v4");

		Statement st = conn.createStatement();

		ResultSet rs= st.executeQuery("SELECT * FROM `role` ");
*/
		//List expectedList=new ArrayList();
		
		System.out.println("List of Users: ");

		while(rs.next()){

			System.out.println(rs.getString(2));

			//expectedList.add("List of Users: "+rs.getString(2));

		}
		//System.out.println(expectedList);
	}
	@BeforeTest
	public void beforeTest() {
		//  System.setProperty("webdriver.chrome.driver", "C:\\lib\\chromedriver.exe");
		//  driver=new ChromeDriver();
		// driver=new FirefoxDriver();

	}

	@AfterTest
	public void afterTest() {
	}

}
