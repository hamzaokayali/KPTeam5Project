package com.team5.pages;

import com.team5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USKP04_ListOfUser_AddUserPage {

    public USKP04_ListOfUser_AddUserPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@class='form-control form-control-solid placeholder-no-fix required']")
    public WebElement logInUserName;

    @FindBy(id = "Password")
    public WebElement logInUserPassword;

    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(id = "txtPassword")
    public WebElement password;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "NameSurname")
    public WebElement fullName;

    @FindBy(id = "PhoneNo")
    public WebElement phoneNo;

    @FindBy(id = "SSN")
    public WebElement socialSecurityNumber;

    @FindBy(id = "DrivingLicense")
    public WebElement drivingLicense;

    @FindBy(id = "IDCountry")
    public WebElement iDCountryDropdown;

    @FindBy(id = "IDState")
    public WebElement iDStateDropdown;

    @FindBy(id = "Address")
    public WebElement address;

    @FindBy(id = "BirthDate")
    public WebElement birthDate;

    @FindBy(id = "WorkingSector")
    public WebElement workingSector;

    @FindBy(id = "IDRole")
    public WebElement role;

    @FindBy(id = "btnSubmit")
    public WebElement btnSubmit;

    @FindBy(xpath = "//span[@for='txtPassword']")
    public WebElement passwordError;

    @FindBy(xpath = "//span[@for='Email']")
    public WebElement emailError;

    @FindBy(xpath = "//span[@for='PhoneNo']")
    public WebElement phoneError;

    @FindBy(xpath = "//span[@for='SSN']")
    public WebElement ssnError;

    @FindBy(xpath = "//span[@for='NameSurname']")
    public WebElement fullNameError;

    @FindBy(xpath = "//span[@for='DrivingLicense']")
    public WebElement drivingLicenceError;

    @FindBy(xpath = "//span[@for='IDCountry']")
    public WebElement countryError;

    @FindBy(xpath = "//span[@for='Address']")
    public WebElement addressError;

    @FindBy(xpath = "//span[@for='WorkingSector']")
    public WebElement workingSectorError;

    @FindBy(xpath = "//span[@for='IDState']")
    public WebElement stateError;

    @FindBy(xpath = "//span[@for='txtPassword']")
    public WebElement passwordUpperLowerCaseError;

    @FindBy(xpath = "//span[@for='BirthDate']")
    public WebElement birthDateError;

    @FindBy(xpath = "//span[@for='IDRole']")
    public WebElement roleError;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successfullAlert;



}
