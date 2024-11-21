package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
WebDriver driver;
@FindBy(xpath="//div[@class='a-row a-spacing-base a-spacing-top-small ewc-go-to-cart celwidget']")
WebElement gotocart;
@FindBy(xpath="(//span[@class='a-size-small sc-action-delete'])[1]")
WebElement deletefromcart;
public void gotocart()
{
	gotocart.click();
}
public void deletefromcart()
{
	deletefromcart.click();
}

	public Cart_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
}
}
