package com.team5.pages;

import com.team5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class USKP13_Rezervasyon_EklemePage {

    public USKP13_Rezervasyon_EklemePage(){ PageFactory.initElements(Driver.getDriver(), this);
}
   @FindBy(id = "UserName")
   public WebElement username;

    @FindBy(id = "Password")
    public  WebElement password;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement Loginbutonu;

    @FindBy(id = "IDUser")
    public WebElement idUsersDropDown;


    @FindBy(id = "IDHotelRoom")
    public WebElement idHotelRoomsDropDown;

    @FindBy(id = "Price")
    public WebElement priceKutusu;

    @FindBy(id = "DateStart")
    public WebElement dateStartKutusu;

    @FindBy(id = "DateEnd")
    public WebElement dateEndKutusu;

    @FindBy(id = "AdultAmount")
    public WebElement adultAmountKutusu;

    @FindBy(id = "ChildrenAmount")
    public WebElement childrenAmountKutusu;

    @FindBy(id = "ContactNameSurname")
    public WebElement contactNameSurnameKutusu;

    @FindBy(id = "ContactPhone")
    public WebElement contactPhoneKutusu;

    @FindBy(id = "ContactEmail")
    public WebElement contactEmailKutusu;

    @FindBy(id = "Notes")
    public WebElement noteskutusu;

    @FindBy(id = "Approved")
    public WebElement approvedkutusu;

    @FindBy(id = "IsPaid")
    public WebElement isPaidKutusu;

    @FindBy(id = "btnSubmit")
    public WebElement savebutonu;

    @FindBy(xpath = "//div[@class='modal-footer']")
    public WebElement basariliyazisi;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement basarisizyazisi;


}
