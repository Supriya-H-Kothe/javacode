package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass10_Amazonelogin_xpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin%26adgrpid%3D171770161190%26hvpone%3D%26hvptwo%3D%26hvadid%3D714840681071%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6698041916236605227%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007789%26hvtargid%3Dkwd-3704926535%26hydadcr%3D18657_2389208%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field auth-require-claim-validation']")).sendKeys("supriya27@gmail.com");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();

	}

}
