package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SamplePageFactory {

	WebDriver wd;

	public SamplePageFactory(WebDriver wd) {
		this.wd = wd;
	    PageFactory.initElements(wd, this);
	}

	public SamplePageFactory() {
		
	}
	
	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement fname;

	@FindBy(xpath = "//*[@id='txtLastName']")
	@CacheLookup
	WebElement lname;

	@FindBy(how = How.NAME, using = "Email")
	@CacheLookup
	WebElement email;

	@FindBy(css = "input[pattern='[789][0-9]{9}']")
	@CacheLookup
	WebElement mobile;

	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement city;

	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement state;

	@FindBy(how = How.NAME, using = "persons")
	@CacheLookup
	WebElement persons;
	


	@FindBy(xpath = "//*[@id='rooms']")
	@CacheLookup
	WebElement rooms;

	@FindBy(how = How.ID, using = "txtCardholderName")
	@CacheLookup
	WebElement cardholder;

	@FindBy(id = "txtDebit")
	@CacheLookup
	WebElement debit;

	@FindBy(name = "cvv")
	@CacheLookup
	WebElement cvv;

	@FindBy(id = "txtMonth")
	@CacheLookup
	WebElement month;

	@FindBy(id = "txtYear")
	@CacheLookup
	WebElement year;

	@FindBy(how = How.ID, using = "btnPayment")
	@CacheLookup
	WebElement button;
	
	@FindBy(xpath="/html/body/div/h2")
	@CacheLookup
	WebElement actualHeading;
	

	// step 2 : Setters
	public void setFname(String fNameTemp) {
		fname.sendKeys(fNameTemp);
	}

	public void setButton() {
		button.click();
	}

	public void setLname(String lNameTemp) {
		lname.sendKeys(lNameTemp);
	}

	public void setEmail(String emailTemp) {
		email.sendKeys(emailTemp);
	}

	public void setMobile(String mobileTemp) {
		mobile.sendKeys(mobileTemp);
	}

	public void setCity(String cityTemp) {
		Select cityData = new Select(city);
		cityData.selectByVisibleText(cityTemp);
	}

	public void setState(String stateTemp) {
		Select stateData = new Select(state);
		stateData.selectByVisibleText(stateTemp);
	}

	public void setPersons(int noOfPErsons) {
		
		Select data =new Select(persons);
		data.selectByIndex(noOfPErsons);
	}

	public void setCardholder(String cardholderName) {
		cardholder.sendKeys(cardholderName);
	}

	public void setDebit(String debitNum) {
		debit.sendKeys(debitNum);
	}

	public void setCvv(String cvvPin) {
		cvv.sendKeys(cvvPin);
	}

	public void setMonth(String monthTemp) {
		month.sendKeys(monthTemp);
	}

	public void setYear(String yearTemp) {
		year.sendKeys(yearTemp);
	}

	// getters
	public WebElement getFname() {
		return fname;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	
	public WebElement getPersons() {
		return persons;
	}

	
	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCardholder() {
		return cardholder;
	}

	public WebElement getDebit() {
		return debit;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getActualHeading() {
		return actualHeading;
	}

	public void setActualHeading(String heading) {
		actualHeading.sendKeys(heading);
	}
	

}

	
	
	

