package com.AssKiemThuNC;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFacebookDK {
	@AfterMethod
	public void afterTest() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.close();
	}
	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com";
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement element2 = driver.findElement(By.id("u_0_2"));	
		element2.click();
		
		driver.findElement(By.id("u_1_b")).sendKeys("Thanh");
		driver.findElement(By.id("u_1_d")).sendKeys("Binh");
		
		WebElement element = driver.findElement(By.id("u_1_s"));
		element.click();
		Thread.sleep(2000);

		String expected = "Facebook";
		String title = driver.getTitle();
		driver.close();
		if(expected.equalsIgnoreCase(title)) {
			System.out.println("Test1 successfull");
		}else {
			System.out.println("Test1 failure");
		}
	}
//	@Test
//	public void test2() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		String url = "https://www.facebook.com";
//		driver.manage().window().maximize();
//		driver.get(url);
//		
//		driver.findElement(By.id("email")).sendKeys("0973800896");
//		driver.findElement(By.id("pass")).sendKeys("abcxyz");
//		WebElement element = driver.findElement(By.id("u_0_b"));
//		element.click();
//		Thread.sleep(2000);
//		
//		String  error = driver.findElement(By.className("_9ay7")).getText().trim();
//		System.out.println(error);
//		String expected = "M?t kh?u b?n ?ã nh?p không chính xác. Quên m?t kh?u?";
//		
//		driver.close();
//		if(error.equalsIgnoreCase(expected)) {
//			System.out.println("Test2 successfull");
//		}else {
//			System.out.println("Test2 failure");
//		}
//	}
//	@Test
//	public void test3() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		String url = "https://www.facebook.com";
//		driver.manage().window().maximize();
//		driver.get(url);
//		
//		driver.findElement(By.id("email")).sendKeys("0973800896");
//		driver.findElement(By.id("pass")).sendKeys("");
//		WebElement element = driver.findElement(By.id("u_0_b"));
//		element.click();
//		Thread.sleep(2000);
//		
//		String  error = driver.findElement(By.className("_9ay7")).getText().trim();
//		System.out.println(error);
//		String expected = "M?t kh?u b?n ?ã nh?p không chính xác. Quên m?t kh?u?";
//
//		driver.close();
//		if(error.equalsIgnoreCase(expected)) {
//			System.out.println("Test3 successfull");
//		}else {
//			System.out.println("Test3 failure");
//		}
//	}
//	@Test
//	public void test4() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		String url = "https://www.facebook.com";
//		driver.manage().window().maximize();
//		driver.get(url);
//		
//		driver.findElement(By.id("email")).sendKeys("");
//		driver.findElement(By.id("pass")).sendKeys("");
//		WebElement element = driver.findElement(By.id("u_0_b"));
//		element.click();
//		Thread.sleep(2000);
//		
//		String  error = driver.findElement(By.className("_9ay7")).getText().trim();
//		System.out.println(error);
//		String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";
//
//		driver.close();
//		if(expected.equalsIgnoreCase(error)) {
//			System.out.println("Test4 successfull");
//			assertEquals(error, expected);
//		}else {
//			System.out.println("Test4 failure");
//		}
//	}
//		@Test
//		public void test5() throws InterruptedException {
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver = new ChromeDriver();
//			
//			String url = "https://www.facebook.com";
//			driver.manage().window().maximize();
//			driver.get(url);
//			
//			driver.findElement(By.id("email")).sendKeys("99999999999999");
//			driver.findElement(By.id("pass")).sendKeys("");
//			WebElement element = driver.findElement(By.id("u_0_b"));
//			element.click();
//			Thread.sleep(2000);
//			
//			String  error = driver.findElement(By.className("_9ay7")).getText().trim();
//			System.out.println(error);
//			String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";
//
//			driver.close();
//			if(expected.equalsIgnoreCase(error)) {
//				System.out.println("Test5 successfull");
//				assertEquals(error, expected);
//			}else {
//				System.out.println("Test5 failure");
//			}
//		}
//				@Test
//				public void test6() throws InterruptedException {
//					WebDriverManager.chromedriver().setup();
//					WebDriver driver = new ChromeDriver();
//					
//					String url = "https://www.facebook.com";
//					driver.manage().window().maximize();
//					driver.get(url);
//					
//					driver.findElement(By.id("email")).sendKeys("@#!abcd");
//					driver.findElement(By.id("pass")).sendKeys("");
//					WebElement element = driver.findElement(By.id("u_0_b"));
//					element.click();
//					Thread.sleep(2000);
//					
//					String  error = driver.findElement(By.className("_9ay7")).getText().trim();
//					System.out.println(error);
//					String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";
//
//					driver.close();
//					if(expected.equalsIgnoreCase(error)) {
//						System.out.println("Test6 successfull");
//						assertEquals(error, expected);
//					}else {
//						System.out.println("Test6 failure");
//					}
//				}
}
