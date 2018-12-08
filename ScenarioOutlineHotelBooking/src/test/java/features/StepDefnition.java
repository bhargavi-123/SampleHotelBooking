package features;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefnition {

	static SamplePageFactory pageFactory=null;
	static WebDriver driver=null;
	

@Given("^user is successfully loged in$")
public void user_is_successfully_loged_in() throws Throwable {
  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bbhargav\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file:///C:/Users/bbhargav/Desktop/App/login.html");
	WebElement pass1 = driver.findElement(By.name("userName"));
	pass1.clear();
	pass1.sendKeys("capgemini");

	WebElement pass = driver.findElement(By.name("userPwd"));
	pass.clear();
	pass.sendKeys("capg1234");
	/*Thread.sleep(10000);*/
	WebElement pass2 = driver.findElement(By.className("btn"));
	pass2.click();
	/*Thread.sleep(10000);*/
	driver.navigate().to("file:///C:/Users/bbhargav/Desktop/App/hotelbooking.html");
}
/*
@Given("^User navigate to hotel booking page$")
public void user_navigate_to_hotel_booking_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    driver.navigate().to("file:///C:/Users/bbhargav/Desktop/App/hotelbooking.html");
    Thread.sleep(1000);
   
}*/

@Then("^check the heading of the page$")
public void check_the_heading_of_the_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

	String heading="Hotel Booking Form";
    if(pageFactory.getActualHeading().getText().equals(heading)) {
    	System.out.println("Heading matched");
    } else {
    	System.out.println("Not matched");
    }
    driver.close();
}

@Given("^user is on the hotel booking page$")
public void user_is_on_the_hotel_booking_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bbhargav\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	pageFactory=new SamplePageFactory(driver);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/bbhargav/Desktop/App/hotelbooking.html");
}

@When("^user enter all the mandatatory fields and click on conform booking$")
public void user_enter_all_the_mandatatory_fields_and_click_on_conform_booking() throws Throwable {
	pageFactory.setFname("Bhargavi");
	Thread.sleep(1000);
	pageFactory.setLname("saig");
	Thread.sleep(1000);
	pageFactory.setEmail("bhargavi@gmail.com");
	Thread.sleep(1000);
	pageFactory.setMobile("9879876543");
	Thread.sleep(1000);
	pageFactory.setCity("Chennai");
	Thread.sleep(1000);
	pageFactory.setState("Tamilnadu");
	Thread.sleep(1000);
	pageFactory.setPersons(3);
	Thread.sleep(1000);
	pageFactory.setCardholder("Ajitha gopal");
	Thread.sleep(1000);
	pageFactory.setDebit("6769805674542234");
	Thread.sleep(1000);
	pageFactory.setCvv("827");
	Thread.sleep(1000);
	pageFactory.setMonth("8");
	Thread.sleep(1000);
	pageFactory.setYear("2030");
	Thread.sleep(1000);
	pageFactory.setButton();
	Thread.sleep(1000);
  
}

@Then("^navigate to booking conformation page$")
public void navigate_to_booking_conformation_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   driver.navigate().to("file:///C:/Users/bbhargav/Desktop/App/success.html");
   Thread.sleep(1000);
   driver.close();
	
}

@When("^user doesnt enter firstname and click on conform booking$")
public void user_doesnt_enter_firstname_and_click_on_conform_booking() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pageFactory.setFname("");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
   
}

@Then("^display alert message$")
public void display_alert_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
	String alertmsg=driver.switchTo().alert().getText();
	Thread.sleep(1000);
	System.out.println("alertmsg:"+" "+alertmsg);
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	driver.close();
}

@When("^user doesnt enter lastname and click on conform booking$")
public void user_doesnt_enter_lastname_and_click_on_conform_booking() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
 
}

@When("^user doesnt enter email and click on conform booking$")
public void user_doesnt_enter_email_and_click_on_conform_booking() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
}

@When("^user doesnt enter mobileno and clicks on confirm bokking button$")
public void user_doesnt_enter_mobileno_and_clicks_on_confirm_bokking_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
	
}

@When("^user doesnt enter city  and clicks on confirm bokking button$")
public void user_doesnt_enter_city_and_clicks_on_confirm_bokking_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9879876543");
		Thread.sleep(1000);
		pageFactory.setCity("Select City");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
	
}

@When("^user doesnt enter state and  clicks on confirm bokking button$")
public void user_doesnt_enter_state_and_clicks_on_confirm_bokking_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9879876543");
		Thread.sleep(1000);
		pageFactory.setCity("Chennai");
		Thread.sleep(1000);
		pageFactory.setState("Select State");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
	
	
}

@When("^user doesnt choose noof guests staying and clicks on confirm bokking button$")
public void user_doesnt_choose_noof_guests_staying_and_clicks_on_confirm_bokking_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9879876543");
		Thread.sleep(1000);
		pageFactory.setCity("Chennai");
		Thread.sleep(1000);
		pageFactory.setState("Tamilnadu");
		Thread.sleep(1000);
		pageFactory.setPersons(0);
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
}

@When("^user doesnt enter cardholdername and clicks on confirm bokking button$")
public void user_doesnt_enter_cardholdername_and_clicks_on_confirm_bokking_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9879876543");
		Thread.sleep(1000);
		pageFactory.setCity("Chennai");
		Thread.sleep(1000);
		pageFactory.setState("Tamilnadu");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
}

@When("^user doesnt enter debitcardnumber and clicks on confirm bokking button$")
public void user_doesnt_enter_debitcardnumber_and_clicks_on_confirm_bokking_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9879876543");
		Thread.sleep(1000);
		pageFactory.setCity("Chennai");
		Thread.sleep(1000);
		pageFactory.setState("Tamilnadu");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("Ajitha gopal");
		Thread.sleep(1000);
		pageFactory.setDebit("");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
}

@When("^user doesnt enter cvv  and clicks on confirm bokking button$")
public void user_doesnt_enter_cvv_and_clicks_on_confirm_bokking_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9879876543");
		Thread.sleep(1000);
		pageFactory.setCity("Chennai");
		Thread.sleep(1000);
		pageFactory.setState("Tamilnadu");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("Ajitha gopal");
		Thread.sleep(1000);
		pageFactory.setDebit("6769805674542234");
		Thread.sleep(1000);
		pageFactory.setCvv("");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
}

@When("^user doesnt enter expitarionmonth and clicks on confirm bokking button$")
public void user_doesnt_enter_expitarionmonth_and_clicks_on_confirm_bokking_button() throws Throwable {
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9879876543");
		Thread.sleep(1000);
		pageFactory.setCity("Chennai");
		Thread.sleep(1000);
		pageFactory.setState("Tamilnadu");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("Ajitha gopal");
		Thread.sleep(1000);
		pageFactory.setDebit("6769805674542234");
		Thread.sleep(1000);
		pageFactory.setCvv("827");
		Thread.sleep(1000);
		pageFactory.setMonth("");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
}

@When("^user doesnt enter expirationyear and clicks on confirm bokking button$")
public void user_doesnt_enter_expirationyear_and_clicks_on_confirm_bokking_button() throws Throwable {
   
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9879876543");
		Thread.sleep(1000);
		pageFactory.setCity("Chennai");
		Thread.sleep(1000);
		pageFactory.setState("Tamilnadu");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("Ajitha gopal");
		Thread.sleep(1000);
		pageFactory.setDebit("6769805674542234");
		Thread.sleep(1000);
		pageFactory.setCvv("827");
		Thread.sleep(1000);
		pageFactory.setMonth("8");
		Thread.sleep(1000);
		pageFactory.setYear("");
		Thread.sleep(1000);
		pageFactory.setButton();
		Thread.sleep(1000);
}


@When("^user enters invalid mobile no$")
public void user_enters_invalid_mobile_no(DataTable arg1) throws Throwable {
	pageFactory.setFname("Bhargavi");
		//Thread.sleep(1000);
	pageFactory.setLname("saig");
		//Thread.sleep(1000);
	pageFactory.setEmail("bhargavi@gmail.com");
		//Thread.sleep(1000);
		List<String> objList = arg1.asList(String.class);
		String data=null;
		for (String dataTemp:objList) {
			data=dataTemp;
			pageFactory.getMobile().clear();
			pageFactory.setMobile(dataTemp);
			Thread.sleep(1000);
			pageFactory.setButton();
			
			if (Pattern.matches("^[7-9]{1}[0-9]{9}$",data)) {
				System.out.println("Matching");
			} else {
				
				/*Alert alt = driver.switchTo().alert();*/
				String alertmsg=driver.switchTo().alert().getText();
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
			    System.out.println("not matched:"+" "+alertmsg);
			}			
			}
		pageFactory.setButton();
	
}

@When("^user doesnt enter valid  Email id$")
public void user_doesnt_enter_valid_Email_id(DataTable arg1) throws Throwable {
	pageFactory.setFname("Bhargavi");
		//Thread.sleep(1000);
	pageFactory.setLname("saig");
		  List<String> objList = arg1.asList(String.class);
			String data=null;
			for (String dataTemp:objList) {
				data=dataTemp;
				pageFactory.getEmail().clear();
				pageFactory.setEmail(dataTemp);
				pageFactory.setButton();
				if (Pattern.matches("[a-zA-Z][a-zA-z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z)]+)+",data)) {
					System.out.println("Matching ");
				} else {
					String alertmsg=driver.switchTo().alert().getText();
					Thread.sleep(1000);
					driver.switchTo().alert().accept();
					Thread.sleep(1000);
					System.out.println("not matched:"+" "+alertmsg);
					
				}
			}
	
	
}

@When("^user enters (\\d+)$")
public void user_enters(int guests) throws Throwable {
   
	pageFactory.setFname("Bhargavi");
		Thread.sleep(1000);
		pageFactory.setLname("saig");
		Thread.sleep(1000);
		pageFactory.setEmail("bhargavi@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9879876543");
		Thread.sleep(1000);
		pageFactory.setCity("Chennai");
		Thread.sleep(1000);
		pageFactory.setState("Tamilnadu");
		Thread.sleep(1000);
		pageFactory.setPersons(guests);
		Thread.sleep(1000);
	
}

@Then("^allocate rooms such that (\\d+) room for minimum (\\d+) guests$")
public void allocate_rooms_such_that_room_for_minimum_guests(int guests, int rooms) throws Throwable {
  
	if (guests <= 3) {
		System.out.println("no of Rooms:" + rooms);
		assertEquals(2, rooms);
	} else if (guests <= 6) {
		System.out.println("no of Rooms:" + rooms);
		assertEquals(3, rooms);
	} else if (guests <= 8) {
		System.out.println("no of Rooms:" + rooms);
		assertEquals(3, rooms);
	}

}


}
