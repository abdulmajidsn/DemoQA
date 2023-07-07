package testCases;

import org.openqa.selenium.By;

import utilities.Base;

public class TestBox extends Base{
//	WebDriver driver;
	String url = "https://demoqa.com";
public static void main(String[] args) throws InterruptedException {
Base base=new Base();
base.setUp();
base.enterUrl("https://demoqa.com");
driver.manage().window().maximize();
Thread.sleep(4000);

//driver.findElement(By.xpath("//div[@id='app']")).click();
//driver.findElement(By.cssSelector("div[class='element-list collapse show'] li[id='item-0'] span[class='text']")).click();
//driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abdulmajid");
//driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("majidsn@gmail.com");
//driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Azmag,India");
//driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("India");
//driver.findElement(By.xpath("//button[@id='submit']")).click();
driver.findElement(By.xpath("")).click();
driver.findElement(By.xpath("//*[text() = \"Text Box\"]")).click();
driver.findElement(By.xpath("//input[@placeholder = \"Full Name\"]")).click();
driver.findElement(By.xpath("//input[@placeholder = \"Full Name\"]")).clear();
driver.findElement(By.xpath("//input[@placeholder = \"Full Name\"]")).sendKeys("abdul Majid");
driver.findElement(By.xpath("//input[@placeholder = \"name@example.com\"]")).clear();
driver.findElement(By.xpath("//input[@placeholder = \"name@example.com\"]")).sendKeys("majid@gmail.com");
driver.findElement(By.xpath("//textarea[@placeholder = \"Current Address\"]")).clear();
driver.findElement(By.xpath("//textarea[@placeholder = \"Current Address\"]")).sendKeys("karmainii");
driver.findElement(By.id("permanentAddress")).clear();
driver.findElement(By.id("permanentAddress")).sendKeys("Karmaini");
driver.findElement(By.xpath("//*[text() = \"Submit\"]")).click();


driver.findElement(By.xpath("//*[text() = \"Check Box\"]")).click();
driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-close")).click();
driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-close")).click();
driver.findElement(By.cssSelector("li.rct-node.rct-node-leaf > span.rct-text > label > span.rct-checkbox > svg.rct-icon.rct-icon-uncheck")).click();
driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-close")).click();
driver.findElement(By.cssSelector("li.rct-node.rct-node-parent.rct-node-collapsed > span.rct-text > label > span.rct-checkbox > svg.rct-icon.rct-icon-uncheck")).click();
driver.findElement(By.xpath("//*[text() = \"Radio Button\"]")).click();
driver.findElement(By.xpath("//*[text() = \"Yes\"]")).click();
driver.findElement(By.xpath("//*[text() = \"Impressive\"]")).click();
driver.findElement(By.xpath("//*[text() = \"Web Tables\"]")).click();
driver.findElement(By.xpath("//*[text() = \"Add\"]")).click();
driver.findElement(By.xpath("//input[@placeholder = \"First Name\"]")).click();
driver.findElement(By.xpath("//input[@placeholder = \"First Name\"]")).clear();
driver.findElement(By.xpath("//input[@placeholder = \"First Name\"]")).sendKeys("abdul");
driver.findElement(By.xpath("//input[@placeholder = \"Last Name\"]")).clear();
driver.findElement(By.xpath("//input[@placeholder = \"Last Name\"]")).sendKeys("majid");
driver.findElement(By.xpath("//input[@placeholder = \"name@example.com\"]")).clear();
driver.findElement(By.xpath("//input[@placeholder = \"name@example.com\"]")).sendKeys("majid@gmail.com");
driver.findElement(By.xpath("//input[@placeholder = \"Age\"]")).clear();
driver.findElement(By.xpath("//input[@placeholder = \"Age\"]")).sendKeys("27");
driver.findElement(By.xpath("//input[@placeholder = \"Salary\"]")).clear();
driver.findElement(By.xpath("//input[@placeholder = \"Salary\"]")).sendKeys("28000");
driver.findElement(By.xpath("//input[@placeholder = \"Department\"]")).clear();
driver.findElement(By.xpath("//input[@placeholder = \"Department\"]")).sendKeys("Accountant");
driver.findElement(By.xpath("//*[text() = \"Submit\"]")).click();
driver.findElement(By.cssSelector("#delete-record-1 > svg > path")).click();
driver.findElement(By.xpath("//*[text() = \"Buttons\"]")).click();
driver.findElement(By.xpath("//*[text() = \"Double Click Me\"]")).click();
driver.findElement(By.xpath("//*[text() = \"Double Click Me\"]")).click();
driver.findElement(By.xpath("//*[text() = \"Double Click Me\"]")).click();
// ERROR: Caught exception [ERROR: Unsupported command [doubleClick | //*[text() = "Double Click Me"] | ]]
driver.findElement(By.xpath("//*[text() = \"Right Click Me\"]")).click();
// ERROR: Caught exception [ERROR: Unsupported command [contextMenuAt | //*[text() = "Right Click Me"] | 85,26]]
driver.findElement(By.xpath("//*[text() = \"Click Me\"]")).click();
driver.findElement(By.xpath("//*[text() = \"Links\"]")).click();
driver.findElement(By.xpath("//*[text() = \"Home\"]")).click();
// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
driver.get("https://demoqa.com/");
// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
driver.findElement(By.xpath("//*[text() = \"Created\"]")).click();
Thread.sleep(4000);
base.tearDown();
}

	
	
	
	
}
