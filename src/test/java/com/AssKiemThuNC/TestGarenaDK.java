package com.AssKiemThuNC;




import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGarenaDK {
	@AfterMethod
	public void afterTest() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://sso.garena.com/ui/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("sso_register_form_account")).sendKeys("Thanh");
			driver.findElement(By.id("sso_register_form_password")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_password_confirm")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_email")).sendKeys("thanhbinhgtv@gmail.com");
			
			WebElement element = driver.findElement(By.id("confirm-btn"));
			
			element.click();
			Thread.sleep(2000);
	
			String  error = driver.findElement(By.className("errorMsg")).getText().trim();
			System.out.println(error);
			String expected = "Username should be between 6-155 characters.";
			
			driver.close();
			if(error.equalsIgnoreCase(expected)) {
				assertEquals(error, expected);
				System.out.println("ok 1");
			}else {
				Assert.assertFalse(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test2() throws InterruptedException {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://sso.garena.com/ui/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("sso_register_form_account")).sendKeys("Thanhbinh");
			driver.findElement(By.id("sso_register_form_password")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_password_confirm")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_email")).sendKeys("thanhbinhgtv@gmail.com");
			WebElement element = driver.findElement(By.id("confirm-btn"));
			
			element.click();
			Thread.sleep(2000);
	
			String  error = driver.findElement(By.className("errorMsg")).getText().trim();
			System.out.println(error);
			String expected = "This username has been taken. Please try another.";
			
			driver.close();
			if(error.equalsIgnoreCase(expected)) {
				assertEquals(error, expected);
				
			}else {
				Assert.assertFalse(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test3() throws InterruptedException {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://sso.garena.com/ui/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("sso_register_form_account")).sendKeys("!@#$%^&");
			driver.findElement(By.id("sso_register_form_password")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_password_confirm")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_email")).sendKeys("");
			WebElement element = driver.findElement(By.id("confirm-btn"));
			
			element.click();
			Thread.sleep(2000);
	
			String  error = driver.findElement(By.className("errorMsg")).getText().trim();
			System.out.println(error);
			String expected = "Username should be alphanumberic (a-Z, 0-9). You may include underscore (_), hyphen(-) and dot(.). It has to start and end with an alphabet or a number, and contain at least one alphabet.";
			
			driver.close();
			if(error.equalsIgnoreCase(expected)) {
				assertEquals(error, expected);
				System.out.println("ok 3");
			}else {
				Assert.assertFalse(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test4() throws InterruptedException {
		try {	
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://sso.garena.com/ui/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("sso_register_form_account")).sendKeys("!@#$%^&");
			driver.findElement(By.id("sso_register_form_password")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_password_confirm")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_email")).sendKeys("thanhbinhgtv@gmail.com");
			WebElement element = driver.findElement(By.id("confirm-btn"));
			
			element.click();
			Thread.sleep(2000);
	
			String  error = driver.findElement(By.className("errorMsg")).getText().trim();
			System.out.println(error);
			String expected = "Username should be alphanumberic (a-Z, 0-9). You may include underscore (_), hyphen(-) and dot(.). It has to start and end with an alphabet or a number, and contain at least one alphabet.";
			
			driver.close();
			if(error.equalsIgnoreCase(expected)) {
				assertEquals(error, expected);
				System.out.println("ok 4");
			}else {
				Assert.assertFalse(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void test5() throws InterruptedException {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://sso.garena.com/ui/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("sso_register_form_account")).sendKeys("!@#$%^&");
			driver.findElement(By.id("sso_register_form_password")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_password_confirm")).sendKeys("Binh123411");
			driver.findElement(By.id("sso_register_form_email")).sendKeys("thanhbinhgtv@gmail.com");
			WebElement element = driver.findElement(By.id("confirm-btn"));
			
			element.click();
			Thread.sleep(2000);
	
			String  error = driver.findElement(By.className("errorMsg")).getText().trim();
			System.out.println(error);
			String expected = "Username should be alphanumberic (a-Z, 0-9). You may include underscore (_), hyphen(-) and dot(.). It has to start and end with an alphabet or a number, and contain at least one alphabet.";
			
			driver.close();
			if(error.equalsIgnoreCase(expected)) {
				assertEquals(error, expected);
				System.out.println("ok 5");
			}else {
				Assert.assertFalse(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test6() throws InterruptedException {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://sso.garena.com/ui/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("sso_register_form_account")).sendKeys("");
			driver.findElement(By.id("sso_register_form_password")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_password_confirm")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_email")).sendKeys("thanhbinhgtv@gmail.com");
			WebElement element = driver.findElement(By.id("confirm-btn"));
			
			element.click();
			Thread.sleep(2000);
	
			String  error = driver.findElement(By.className("errorMsg")).getText().trim();
			System.out.println(error);
			String expected = "Invalid or empty username.";
			
			driver.close();
			if(error.equalsIgnoreCase(expected)) {
				assertEquals(error, expected);
				System.out.println("ok 6");
			}else {
				Assert.assertFalse(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test8() throws InterruptedException {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://sso.garena.com/ui/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("sso_register_form_account")).sendKeys("Thanh Binh");
			driver.findElement(By.id("sso_register_form_password")).sendKeys("Binh 1234");
			driver.findElement(By.id("sso_register_form_password_confirm")).sendKeys("Binh1234");
			driver.findElement(By.id("sso_register_form_email")).sendKeys("thanhbinhgtv@gmail.com");
			WebElement element = driver.findElement(By.id("confirm-btn"));
			
			element.click();
			Thread.sleep(2000);
	
			String  error = driver.findElement(By.className("errorMsg")).getText().trim();
			System.out.println(error);
			String expected = "Username should be alphanumberic (a-Z, 0-9). You may include underscore (_), hyphen(-) and dot(.). It has to start and end with an alphabet or a number, and contain at least one alphabet.";
			
			driver.close();
			if(error.equalsIgnoreCase(expected)) {
				assertEquals(error, expected);
				System.out.println("ok 7");
			}else {
				Assert.assertFalse(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test9() throws InterruptedException {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://sso.garena.com/ui/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("sso_register_form_account")).sendKeys("!@#$%^&");
			driver.findElement(By.id("sso_register_form_password")).sendKeys("!@#$%^&");
			driver.findElement(By.id("sso_register_form_password_confirm")).sendKeys("Binh123411");
			driver.findElement(By.id("sso_register_form_email")).sendKeys("thanhbinhgtv@gmail.com");
			WebElement element = driver.findElement(By.id("confirm-btn"));
			
			element.click();
			Thread.sleep(2000);
	
			String  error = driver.findElement(By.className("errorMsg")).getText().trim();
			System.out.println(error);
			String expected = "Username should be alphanumberic (a-Z, 0-9). You may include underscore (_), hyphen(-) and dot(.). It has to start and end with an alphabet or a number, and contain at least one alphabet.";
			
			driver.close();
			if(error.equalsIgnoreCase(expected)) {
				assertEquals(error, expected);
				System.out.println("ok 8");
			}else {
				Assert.assertFalse(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test10() throws InterruptedException {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://sso.garena.com/ui/register";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("sso_register_form_account")).sendKeys("    ");
			driver.findElement(By.id("sso_register_form_password")).sendKeys("   ");
			driver.findElement(By.id("sso_register_form_password_confirm")).sendKeys("Binh123411");
			driver.findElement(By.id("sso_register_form_email")).sendKeys("thanhbinhgtv@gmail.com");
			WebElement element = driver.findElement(By.id("confirm-btn"));
			
			element.click();
			Thread.sleep(2000);
	
			String  error = driver.findElement(By.className("errorMsg")).getText().trim();
			System.out.println(error);
			String expected = "Username should be alphanumberic (a-Z, 0-9). You may include underscore (_), hyphen(-) and dot(.). It has to start and end with an alphabet or a number, and contain at least one alphabet.";
			
			driver.close();
			if(error.equalsIgnoreCase(expected)) {
				assertEquals(error, expected);
				System.out.println("ok 9");
			}else {
				Assert.assertFalse(true);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
