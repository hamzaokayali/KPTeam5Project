package com.team5.pages;


import com.team5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USKP10_HotelRoomCreatePage {

    public USKP10_HotelRoomCreatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="UserName")
    public WebElement loginPageUserNameKutusu;

    @FindBy (id="Password")
    public WebElement loginPagePasswordKutusu;

    @FindBy (id="btnSubmit")
    public WebElement loginPageLoginButton;


    @FindBy (id="IDHotel")
    public WebElement hotelRoomCreateIDHotelDropDown;

    @FindBy (id="Code")
    public WebElement hotelRoomCreateCodeKutusu;

    @FindBy (id="Name")
    public WebElement hotelRoomCreateNameKutusu;

    @FindBy (id="Location")
    public WebElement hotelRoomCreateLocationKutusu;

    @FindBy (xpath = "//*[@id='cke_1_contents']/textarea")
    public WebElement hotelRoomCreateDescriptionAlani;

    @FindBy (id="Price")
    public WebElement hotelRoomCreatePriceKutusu;

    @FindBy (id="IDGroupRoomType")
    public WebElement hotelRoomCreateRoomTypeDropDown;

    @FindBy (id="MaxAdultCount")
    public WebElement hotelRoomCreateMaxAdultKutusu;

    @FindBy (id="MaxChildCount")
    public WebElement hotelRoomCreateMaxChildrenKutusu;

    @FindBy (id="uniform-IsAvailable")
    public WebElement hotelRoomCreateApproved;

    @FindBy (id="btnSubmit")
    public WebElement hotelRoomCreateSaveButton;

    @FindBy ( className = "bootbox-body")
    public WebElement hotelRoomCreateBasariliYazisi;

    @FindBy (xpath = "//label[@class='error']")
    public WebElement hotelRoomCreateHataMesajlari;

    @FindBy (className = "bootbox-body")
    public WebElement hotelRoomCreateBosluklariDoldurun;



}
