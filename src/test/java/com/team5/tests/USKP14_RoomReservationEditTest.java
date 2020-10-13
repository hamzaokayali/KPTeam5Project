package com.team5.tests;

import com.team5.pages.USKP14_RoomReservationEditPage;
import com.team5.utilities.ConfigurationReader;
import com.team5.utilities.Driver;
import com.team5.utilities.TestBaseFinal;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class USKP14_RoomReservationEditTest extends TestBaseFinal {

    @BeforeMethod
    public void giris (){
        Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        WebElement userName = Driver.getDriver().findElement(By.id("UserName"));
        userName.sendKeys("manager2");

        WebElement password = Driver.getDriver().findElement(By.id("Password"));
        password.sendKeys("Man1ager2!" + Keys.ENTER);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    //===================================================

    @Test
    public void UserStoryTC14_TestCase01 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Reservation edilen Room'u edit etme");

       // extentTest.info("Sayfa adresine gidelim.");
       // Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();


        extentTest.info("Select nesnesi üretelim.");
        Select sec = new Select(userStory_tc14.roomReservationEdit_IDHotelRoomDrapDown);

        extentTest.info("Room kutusunda bulunan tüm rezervasionları listeliyelim");
        List <WebElement> IDHotelRoom = sec.getOptions();
                for (WebElement w: IDHotelRoom){
                    System.out.println(w.getText());
        }

        System.out.println(" ===========================");
        extentTest.info("Secigimiz rezervasion gorunuyor mu?");
        WebElement gorunuyorMu = sec.getFirstSelectedOption();
        System.out.println(gorunuyorMu.getText());
        Assert.assertTrue(gorunuyorMu.isDisplayed());

        extentTest.info("Reservasiyon edilen odayı degistirelim");
        sec.selectByVisibleText("Team5");

       extentTest.info("Degisiklikleri kayd edelim");
       userStory_tc14.roomReservationEdit_SaveButton.click();

      extentTest.info("Degisikliklerin kayd edildigini onayla");
      Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


    //============================================================


    @Test
    public void UserStoryTC14_TestCase02 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Reservationu yapan kisiyi edit edilmesi");

      //  extentTest.info("Sayfa adresine gidelim.");
      //  Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();


        extentTest.info("Select nesnesi üretelim.");
        Select sec = new Select(userStory_tc14.roomReservationEdit_IDUserDrapDown);

        extentTest.info("User bolumundeki tum kullanıcıları listeyelim");
        List <WebElement> IDUserListe = sec.getAllSelectedOptions();
        for (WebElement w: IDUserListe){
            System.out.println(w.getText());
        }

        extentTest.info("Secigimiz user gorunuyor mu?");
        WebElement gorunuyorMu = sec.getFirstSelectedOption();
        System.out.println(gorunuyorMu.getText());
        Assert.assertTrue(gorunuyorMu.isDisplayed());

        extentTest.info("Reservasiyon eden kisiyi degistirelim");
        sec.selectByVisibleText("kunden01");

       extentTest.info("Degisiklikleri kayd edelim");
      userStory_tc14.roomReservationEdit_SaveButton.click();

       extentTest.info("Degisikliklerin kayd edildigini onayla");
        Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


    //============================================================


    @Test
    public void UserStoryTC14_TestCase03 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Reservationu edilen odanin fiyatini edit edilmesi");

      //  extentTest.info("Sayfa adresine gidelim.");
      //  Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        extentTest.info("Rezerve edilen odanin fiyati gorunuyor mu?");
       boolean gorunuyorMu = userStory_tc14.roomReservationEdit_Price.isDisplayed();
        System.out.println(gorunuyorMu);

        extentTest.info("Reserve edilen odanın fiyatini degistirelim");
       userStory_tc14.roomReservationEdit_Price.clear();
        userStory_tc14.roomReservationEdit_Price.sendKeys("250");

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

     extentTest.info("Degisikliklerin kayd edildigini onayla");
     Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());


}

    //============================================================

    @Test
    public void UserStoryTC14_TestCase04 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Reservationu giris tarihini edit edilmesi");

        extentTest.info("Sayfa adresine gidelim.");
        Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        extentTest.info("Rezerve edilen odanin giris tarihi gorunuyor mu?");
        boolean gorunuyorMu = userStory_tc14.roomReservationEdit_DateStart.isDisplayed();
        System.out.println(gorunuyorMu);


        extentTest.info("Reserve edilen odanın giris tarihini degistirelim");
        userStory_tc14.roomReservationEdit_DateStart.sendKeys("10/14/2020");

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

     extentTest.info("Degisikliklerin kayd edildigini onayla");
     Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


    //============================================================

    @Test
    public void UserStoryTC14_TestCase05 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Reservationu cikis tarihini edit edilmesi");

     //   extentTest.info("Sayfa adresine gidelim.");
     //   Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        extentTest.info("Rezerve edilen odanin cikis tarihi gorunuyor mu?");
        boolean gorunuyorMu = userStory_tc14.roomReservationEdit_DateEnd.isDisplayed();
        System.out.println(gorunuyorMu);


        extentTest.info("Reserve edilen odanın cikis tarihini degistirelim");
        userStory_tc14.roomReservationEdit_DateEnd.sendKeys("10/24/2020");

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

      extentTest.info("Degisikliklerin kayd edildigini onayla");
      Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


    //============================================================



    @Test
    public void UserStoryTC14_TestCase06 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Reservationu cikis tarihini giris tarihinden once alma");

      //  extentTest.info("Sayfa adresine gidelim.");
      //  Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        boolean gorunuyorMu = userStory_tc14.roomReservationEdit_DateStart.isDisplayed();
        System.out.println(gorunuyorMu);

        extentTest.info("Reserve edilen odanın giris tarihini degistirelim");
        userStory_tc14.roomReservationEdit_DateStart.clear();
        userStory_tc14.roomReservationEdit_DateStart.sendKeys("10/14/2020");

        boolean gorunuyorMuCikis = userStory_tc14.roomReservationEdit_DateStart.isDisplayed();
        System.out.println(gorunuyorMuCikis);

        extentTest.info("Reserve edilen odanın cikis tarihini degistirelim");
        userStory_tc14.roomReservationEdit_DateEnd.clear();
        userStory_tc14.roomReservationEdit_DateEnd.sendKeys("10/01/2020");

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

       extentTest.info("Degisikliklerin kayd edildigini onayla");
       Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }

    // ================================================


    @Test
    public void UserStoryTC14_TestCase07 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Reservation edilen odanin yetiskin sayisi edit edilmesi");

     //   extentTest.info("Sayfa adresine gidelim.");
     //   Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        extentTest.info("Rezerve edilen oda da yetiskin sayisi gorunuyor mu?");
       boolean gorunuyorMu = userStory_tc14.roomReservationEdit_AdultAmount.isDisplayed();
       System.out.println(gorunuyorMu);



        extentTest.info("Reserve edilen odanin yetiskin sayisini degistirelim");
        userStory_tc14.roomReservationEdit_AdultAmount.clear();
        userStory_tc14.roomReservationEdit_DateEnd.sendKeys("2");

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

      extentTest.info("Degisikliklerin kayd edildigini onayla");
      Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


    //============================================================

    @Test
    public void UserStoryTC14_TestCase08 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Reservation edilen odanin cocuk sayisi edit edilmesi");

     //   extentTest.info("Sayfa adresine gidelim.");
     //   Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        extentTest.info("Rezerve edilen oda da cocuk sayisi gorunuyor mu?");
        boolean gorunuyorMu = userStory_tc14.roomReservationEdit_ChildrenAmount.isDisplayed();
        System.out.println(gorunuyorMu);


        extentTest.info("Reserve edilen odanin Cocuk sayisini degistirelim");
        userStory_tc14.roomReservationEdit_ChildrenAmount.clear();
        userStory_tc14.roomReservationEdit_ChildrenAmount.sendKeys("1");

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

      extentTest.info("Degisikliklerin kayd edildigini onayla");
       Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


    //============================================================

    @Test
    public void UserStoryTC14_TestCase09 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Reservation edilen odanin iletisim kisiyi edit edilmesi");

      //  extentTest.info("Sayfa adresine gidelim.");
      //  Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        extentTest.info("Rezerve edilen odanin iltesime gecilecek kisi gorunuyor mu?");
        boolean gorunuyorMu = userStory_tc14.roomReservationEdit_ContactNameSurname.isDisplayed();
        System.out.println(gorunuyorMu);


        extentTest.info("Reserve edilen odanin Cocuk sayisini degistirelim");
        userStory_tc14.roomReservationEdit_ContactNameSurname.clear();
        userStory_tc14.roomReservationEdit_ContactNameSurname.sendKeys("Fethi Kaya");

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

      extentTest.info("Degisikliklerin kayd edildigini onayla");
      Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


    //============================================================

    @Test
    public void UserStoryTC14_TestCase10 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Telefon numarasini ve email adresini edit edilmesi");

      //  extentTest.info("Sayfa adresine gidelim.");
      //  Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        extentTest.info("Telefon numarasi gorunuyor mu?");
        boolean gorunuyorMu = userStory_tc14.roomReservationEdit_ContactPhone.isDisplayed();
        System.out.println(gorunuyorMu);


        extentTest.info("Telefon numarisini degistirelim");
        userStory_tc14.roomReservationEdit_ContactPhone.clear();
        userStory_tc14.roomReservationEdit_ContactPhone.sendKeys("015275694875");


        extentTest.info("Email Adresi gorunuyor mu?");
        boolean gorunuyorMuEmail = userStory_tc14.roomReservationEdit_ContactEmail.isDisplayed();
        System.out.println(gorunuyorMuEmail);

        extentTest.info("email adresini degistirelim");
        userStory_tc14.roomReservationEdit_ContactEmail.clear();
        userStory_tc14.roomReservationEdit_ContactEmail.sendKeys("kayafethi@gmail.com");

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

      extentTest.info("Degisikliklerin kayd edildigini onayla");
     Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


    //============================================================

    @Test
    public void UserStoryTC14_TestCase11 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Rezerve onay checkbox edit edilmesi");

     //   extentTest.info("Sayfa adresine gidelim.");
     //   Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        extentTest.info("Rezerve onay checkbox secili mi?");
       Assert.assertTrue(userStory_tc14.roomReservationEdit_Approved.isEnabled());

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

     extentTest.info("Degisikliklerin kayd edildigini onayla");
     Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


    //============================================================


    @Test
    public void UserStoryTC14_TestCase12 (){

        extentTest = extentReports.createTest("room reservation edit",
                "Ucret udeme checkbox edit edilmesi");

     //   extentTest.info("Sayfa adresine gidelim.");
     //   Driver.getDriver().get(ConfigurationReader.getProperty("editroomreservation_link_US14"));

        extentTest.info("UserStory_TC14_Page nesnesi üretlim.");
        USKP14_RoomReservationEditPage userStory_tc14 = new USKP14_RoomReservationEditPage();

        extentTest.info("Ucret odeme checkbox secili mi?");
        Assert.assertTrue(userStory_tc14.roomReservationEdit_IsPaid.isEnabled());

        extentTest.info("Degisiklikleri kayd edelim");
        userStory_tc14.roomReservationEdit_SaveButton.click();

    extentTest.info("Degisikliklerin kayd edildigini onayla");
    Assert.assertTrue(userStory_tc14.roomReservationEdit_DegisiklikleriKaydEt.isDisplayed());

    }


//============================================================

}