package Com.DemoWebShop_POM_Utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage {

	public AddressesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addNewBtn;

	@FindBy(xpath = "//input[@value='Delete']")
	private List<WebElement> deleteBtn;

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public List<WebElement> getDeleteBtn() {
		return deleteBtn;
	}

}
