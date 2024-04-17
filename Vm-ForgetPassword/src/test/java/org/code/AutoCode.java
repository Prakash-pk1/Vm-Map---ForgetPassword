package org.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoCode {
	WebDriver driver;
	
	
	@Given("User is on VM Maps acoount Sign In page")
	public void user_is_on_vm_maps_acoount_sign_in_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.vmmaps.com/");
		
	}
	@When("User enter valid email and invalid password")
	public void user_enter_valid_email_and_invalid_password() {
		driver.findElement(By.id("login-email")).sendKeys("prakashsekar786@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("18urcz05");
		
	}
	@Then("User click Login button")
	public void user_click_login_button() {
		driver.findElement(By.id("login-submit-text")).click();
		
	}
	@Then("User Should see the Invalid parameter message")
	public void user_should_see_the_invalid_parameter_message() throws InterruptedException {
		WebElement msg = driver.findElement(By.id("signinFormError"));
		Thread.sleep(3000);
		String text = msg.getText();
		System.out.println("*****"+text+"*****");
		
	}
	@Then("User forget the login password then click ForgetPassword button")
	public void user_forget_the_login_password_then_click_forget_password_button() {
		driver.findElement(By.id("Forgot-Password")).click();
		
	}
	@Then("User Should see the OTP Verify for Email page")
	public void user_should_see_the_otp_verify_for_email_page() {
		System.out.println("***User Enter The OTP Then Change The Password Down Of The Page***");
		
	}
	
	@When("User enter Invalid email and Random password")
	public void user_enter_invalid_email_and_random_password() {
		driver.findElement(By.id("login-email")).sendKeys("gyby@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("fdxtufyg7");
		
	}
	
	@Then("User click ForgetPassword button")
	public void user_click_forget_password_button() {
		driver.findElement(By.id("Forgot-Password")).click();
		
	}
	@Then("User Should see the fail message")
	public void user_should_see_the_fail_message() throws InterruptedException {
		WebElement fail = driver.findElement(By.id("snackbars"));
		Thread.sleep(1500);
		String text = fail.getText();
		System.out.println("*****"+text+"*****");
		
	}
}
