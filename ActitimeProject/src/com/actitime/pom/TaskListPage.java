package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage{
@FindBy(className = "addNewButton")
private WebElement addNewButton;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerButton;
@FindBy(id="customerLightBox_nameField")
private WebElement custNameTbx;
@FindBy(id="customerLightBox_descriptionField")
private WebElement custDescTbx;
@FindBy(xpath="//button[contains(text(),'Select an active customer ')]")
private WebElement companyDropdown;
@FindBy(linkText = "Our Company")
private WebElement ourCompanyOpt;
@FindBy(id="customerLightBox_commitBtn")
private WebElement createCustomerBtn;
@FindBy(xpath="//div[@class='tasksTable hasSelectedCustomer']/div[@class='header']/div[@class='title ellipsis']")
private WebElement createdCustomerName;
@FindBy(id="logoutLink")
private WebElement logoutBtn;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setLogout() {
	logoutBtn.click();
}
public WebElement getAddNewButton() {
	return addNewButton;
}
public WebElement getNewCustomerButton() {
	return newCustomerButton;
}
public WebElement getCustNameTbx() {
	return custNameTbx;
}
public WebElement getCustDescTbx() {
	return custDescTbx;
}
public WebElement getCompanyDropdown() {
	return companyDropdown;
}
public WebElement getOurCompanyOpt() {
	return ourCompanyOpt;
}
public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}
public WebElement getCreatedCustomerName() {
	return createdCustomerName;
}


///////////////////Delete customer////////////////////////

@FindBy(id="username")
private WebElement untbx;
@FindBy(name="pwd")
private WebElement pwdtbx;
@FindBy(xpath ="//div[text()='Login ']" )
private WebElement loginbtn;
@FindBy(linkText ="TASKS")
private WebElement taskbtn;
@FindBy(xpath ="//input[contains(@placeholder,'Start typing name ...')]" )
private WebElement startbtn;
@FindBy(xpath = "//input[contains(@placeholder,'Start typing name ...')]")
private WebElement sendkeysbtn;
@FindBy(xpath="//span[@class='highlightToken']/../..//div[@class='editButton available']")
private WebElement editbtn;
@FindBy(xpath ="//div[text()='ACTIONS']")
private WebElement actionbtn;
@FindBy(xpath ="//div[text()='Delete']" )
private WebElement deletebtn;
@FindBy(xpath="//span[text()='Delete permanently']")
private WebElement deletepermanentlybtn;
@FindBy(xpath ="//div[@class=\"toast\"]" )
private WebElement messagebtn;

public WebElement getUntbx() {
	return untbx;
}
public WebElement getPwtbx() {
	return pwdtbx;
}
public WebElement getLogin() {
	return loginbtn;
}
public WebElement getTaskbtn() {
	return taskbtn;
}
public WebElement getStartbtn() {
	return startbtn;
}
public WebElement getSendkeysbtn() {
	return sendkeysbtn;
}
public WebElement getEditbtn() {
	return editbtn;
}
public WebElement getActionbtn() {
	return actionbtn;
}
public WebElement getDeletebtn() {
	return deletebtn;
}
public WebElement getDeletepermanentlybtn() {
	return deletepermanentlybtn;
}
public WebElement getMessagebtn() {
	return messagebtn;
}

//////////////////Create Project/////////////////

//@FindBy(id="username")
//private WebElement untbx;
//@FindBy(name="pwd")
//private WebElement pwdtbx;
//@FindBy(xpath ="//div[text()='Login ']" )
//private WebElement loginbtn;
//@FindBy(linkText ="TASKS")
//private WebElement taskbtn;
@FindBy(xpath = "//div[text()='Add New']")
private WebElement addnewbtn;
@FindBy(xpath ="//div[text()='+ New Project']" )
private WebElement newprjbtn;
@FindBy(id = "projectPopup_projectNameField")
private WebElement projnamebtn;
@FindBy(id="ext-gen23")
private WebElement custbtn;
@FindBy(id ="ext-gen110" )
private WebElement dropdownbtn;
@FindBy(id = "projectPopup_projectDescriptionField")
private WebElement discbtn;
@FindBy(xpath = "//span[text()='Create Project']")
private WebElement createbtn;

public WebElement getAddnewbtn() {
	return addnewbtn;
}
public WebElement getNewprjbtn() {
	return newprjbtn;
}
public WebElement getProjnamebtn() {
return projnamebtn;
}
public WebElement getCustbtn() {
	return custbtn;
}
public WebElement getDropdownbtn() {
	return dropdownbtn;
}
public WebElement getDiscbtn() {
	return discbtn;
}
public WebElement getCreatebtn() {
	return createbtn;
}
}