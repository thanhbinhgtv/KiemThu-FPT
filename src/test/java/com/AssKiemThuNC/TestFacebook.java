package com.AssKiemThuNC;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFacebook {
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
		
		driver.findElement(By.id("email")).sendKeys("0973800896");
		driver.findElement(By.id("pass")).sendKeys("Cheathcheatm12");
		WebElement element = driver.findElement(By.id("u_0_b"));
		
		element.click();
		Thread.sleep(2000);

		String expected = "Facebook";
		String title = driver.getTitle();
		driver.close();
		if(title != null) {
			assertEquals(title, expected);
			System.out.println("ok 1");
		}
	}
	@Test
	public void test2() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com";
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("0973800896");
		driver.findElement(By.id("pass")).sendKeys("abcxyz");
		WebElement element = driver.findElement(By.id("u_0_b"));
		element.click();
		Thread.sleep(2000);
		
		String  error = String.valueOf(driver.findElement(By.className("_9ay7")).getText().trim());
		System.out.println(error);
		String expected = "The password that you've entered is incorrect. Forgotten password?";
		
		driver.close();
		if(error != null) {
			assertEquals(error, expected);
			System.out.println("ok 2");
		}
	}
	@Test
	public void test3() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com";
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("0973800896");
		driver.findElement(By.id("pass")).sendKeys("");
		WebElement element = driver.findElement(By.id("u_0_b"));
		element.click();
		Thread.sleep(2000);
		
		String  error = driver.findElement(By.className("_9ay7")).getText().trim();
		System.out.println(error);
		String expected = "M?t kh?u b?n ?ã nh?p không chính xác. Quên m?t kh?u?";

		driver.close();
		if(error != null) {
			assertEquals(error, expected);
			System.out.println("ok 3");
		}
	}
	@Test
	public void test4() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.facebook.com";
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("pass")).sendKeys("");
		WebElement element = driver.findElement(By.id("u_0_b"));
		element.click();
		Thread.sleep(2000);
		
		String  error = driver.findElement(By.className("_9ay7")).getText().trim();
		System.out.println(error);
		String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";

		driver.close();
		if(error != null) {
			assertEquals(error, expected);
			System.out.println("ok 4");
		}
	}
		@Test
		public void test5() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			String url = "https://www.facebook.com";
			driver.manage().window().maximize();
			driver.get(url);
			
			driver.findElement(By.id("email")).sendKeys("99999999999999");
			driver.findElement(By.id("pass")).sendKeys("");
			WebElement element = driver.findElement(By.id("u_0_b"));
			element.click();
			Thread.sleep(2000);
			
			String  error = driver.findElement(By.className("_9ay7")).getText().trim();
			System.out.println(error);
			String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";

			driver.close();
			if(error != null) {
				assertEquals(error, expected);
				System.out.println("ok 5");
			}
		}
				@Test
				public void test6() throws InterruptedException {
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					
					String url = "https://www.facebook.com";
					driver.manage().window().maximize();
					driver.get(url);
					
					driver.findElement(By.id("email")).sendKeys("@#!abcd");
					driver.findElement(By.id("pass")).sendKeys("");
					WebElement element = driver.findElement(By.id("u_0_b"));
					element.click();
					Thread.sleep(2000);
					
					String  error = driver.findElement(By.className("_9ay7")).getText().trim();
					System.out.println(error);
					String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";

					driver.close();
					if(error != null) {
						assertEquals(error, expected);
						System.out.println("ok 6");
					}
				}
				@Test
				public void test7() throws InterruptedException {
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					
					String url = "https://www.facebook.com";
					driver.manage().window().maximize();
					driver.get(url);
					
					driver.findElement(By.id("email")).sendKeys("abcd xyza");
					driver.findElement(By.id("pass")).sendKeys("");
					WebElement element = driver.findElement(By.id("u_0_b"));
					element.click();
					Thread.sleep(2000);
					
					String  error = driver.findElement(By.className("_9ay7")).getText().trim();
					System.out.println(error);
					String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";

					driver.close();
					if(error != null) {
						assertEquals(error, expected);
						System.out.println("ok 7");
					}
				}
				@Test
				public void test8() throws InterruptedException {
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					
					String url = "https://www.facebook.com";
					driver.manage().window().maximize();
					driver.get(url);
					
					driver.findElement(By.id("email")).sendKeys("9999999  9999999");
					driver.findElement(By.id("pass")).sendKeys("");
					WebElement element = driver.findElement(By.id("u_0_b"));
					element.click();
					Thread.sleep(2000);
					
					String  error = driver.findElement(By.className("_9ay7")).getText().trim();
					System.out.println(error);
					String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";

					driver.close();
					if(error != null) {
						assertEquals(error, expected);
						System.out.println("ok 8");
					}
				}
				@Test
				public void test9() throws InterruptedException {
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					
					String url = "https://www.facebook.com";
					driver.manage().window().maximize();
					driver.get(url);
					
					driver.findElement(By.id("email")).sendKeys("");
					driver.findElement(By.id("pass")).sendKeys("%&%E$#");
					WebElement element = driver.findElement(By.id("u_0_b"));
					element.click();
					Thread.sleep(2000);
					
					String  error = driver.findElement(By.className("_9ay7")).getText().trim();
					System.out.println(error);
					String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";

					driver.close();
					if(error != null) {
						assertEquals(error, expected);
						System.out.println("ok 9");
					}
				}
				@Test
				public void test10() throws InterruptedException {
					WebDriverManager.chromedriver().setup();
					WebDriver driver = new ChromeDriver();
					
					String url = "https://www.facebook.com";
					driver.manage().window().maximize();
					driver.get(url);
					
					driver.findElement(By.id("email")).sendKeys("ThanhBinh");
					driver.findElement(By.id("pass")).sendKeys("#$%*^$%");
					WebElement element = driver.findElement(By.id("u_0_b"));
					element.click();
					Thread.sleep(2000);
					
					String  error = driver.findElement(By.className("_9ay7")).getText().trim();
					System.out.println(error);
					String expected = "Email ho?c s? ?i?n tho?i b?n ?ã nh?p không kh?p v?i b?t k? tài kho?n nào. ??ng ký tài kho?n.";

					driver.close();
					if(error != null) {
						assertEquals(error, expected);
						System.out.println("ok 10");
					}
				}
}
