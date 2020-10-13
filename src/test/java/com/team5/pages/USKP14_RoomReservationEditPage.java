package com.team5.pages;

import com.team5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USKP14_RoomReservationEditPage {

    public USKP14_RoomReservationEditPage(){ PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy ( id = "UserName")
    public WebElement logiIn_UserName;

    @FindBy ( id = "Password")
    public WebElement logiIn_Password;

    @FindBy ( xpath = "//button[@class='btn btn-success uppercase']")
    public WebElement logiIn_LoginButton;




    @FindBy ( id = "IDHotelRoom")
    public WebElement roomReservationEdit_IDHotelRoomDrapDown;

    @FindBy ( id = "IDUser")
    public WebElement roomReservationEdit_IDUserDrapDown;

    @FindBy ( id = "Price")
    public WebElement roomReservationEdit_Price;

    @FindBy ( id = "DateStart")
    public WebElement roomReservationEdit_DateStart;

    @FindBy ( id = "DateEnd")
    public WebElement roomReservationEdit_DateEnd;

    @FindBy ( id = "AdultAmount")
    public WebElement roomReservationEdit_AdultAmount;

    @FindBy ( id = "ChildrenAmount")
    public WebElement roomReservationEdit_ChildrenAmount;

    @FindBy ( id = "ContactNameSurname")
    public WebElement roomReservationEdit_ContactNameSurname;

    @FindBy ( id = "ContactPhone")
    public WebElement roomReservationEdit_ContactPhone;

    @FindBy ( id = "ContactEmail")
    public WebElement roomReservationEdit_ContactEmail;

    @FindBy ( id = "Notes")
    public WebElement roomReservationEdit_Notes;

    @FindBy ( id = "Approved")
    public WebElement roomReservationEdit_Approved;

    @FindBy ( id = "IsPaid")
    public WebElement roomReservationEdit_IsPaid;

    @FindBy ( xpath = "//button[@class='btn green']")
    public WebElement roomReservationEdit_SaveButton;


    @FindBy ( xpath = "//div[@class='bootbox-body']")
    public WebElement roomReservationEdit_DegisiklikleriKaydEt;


}

