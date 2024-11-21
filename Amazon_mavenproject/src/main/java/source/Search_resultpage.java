package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_resultpage {
	WebDriver driver;
	@FindBy(xpath = "//a[@class='a-link-normal s-no-outline']")
	WebElement shoe_link;
	@FindBy(id = "add-to-wishlist-button-group")
	WebElement wishlist;
	@FindBy(id = "continue-shopping")
	WebElement continueshoping;
	@FindBy(id = "add-to-cart-button")
	WebElement addtocart;

	public void selectshoe() {
		shoe_link.click();
	}

	public void addtowishlist() {
		wishlist.click();
	}

	public void continue_shoping() {
		continueshoping.click();
	}

	public void add_cart() {
		addtocart.click();
	}

	public Search_resultpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
