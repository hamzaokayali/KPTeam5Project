package com.team5.tests;

import com.team5.pages.USKP13_Rezervasyon_EklemePage;
import com.team5.utilities.ConfigurationReader;
import com.team5.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class USKP13_Rezervasyon_EklemeTest {

    @Test
    public void TC_001(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);
        System.out.println(iduserSayisi);


        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste1.size();
        Assert.assertTrue(idHotelRooms>1);
        System.out.println(idHotelRooms);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price")+ Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart")+Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd")+Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount")+Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount")+Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name")+Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone")+Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email")+Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes")+Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basariliyazisi.isDisplayed());

    }
    @Test
    public void TC_002(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());


    }
    @Test
    public void TC_003(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());


    }
    @Test
    public void TC_004() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());

    }
    @Test
    public void TC_005(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());

    }

    @Test
        public void TC_006(){
            Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
            USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

            uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
            uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
            uskp13_rezervasyon_eklemePage.Loginbutonu.click();

            Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
            select.selectByIndex(1);
            List<WebElement> liste= select.getOptions();
            int iduserSayisi= liste.size();
            Assert.assertTrue(iduserSayisi>1);

            Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
            select1.selectByIndex(4);
            List<WebElement> liste1= select1.getOptions();
            int idHotelRooms= liste.size();
            Assert.assertTrue(idHotelRooms>1);

            uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1")+ Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart1")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd1")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.approvedkutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.savebutonu.click();
            Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());
        }

    @Test
    public void TC_007(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());


    }


    @Test
        public void TC_008(){
            Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
            USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

            uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
            uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
            uskp13_rezervasyon_eklemePage.Loginbutonu.click();

            Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
            select.selectByIndex(1);
            List<WebElement> liste= select.getOptions();
            int iduserSayisi= liste.size();
            Assert.assertTrue(iduserSayisi>1);

            Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
            select1.selectByIndex(4);
            List<WebElement> liste1= select1.getOptions();
            int idHotelRooms= liste.size();
            Assert.assertTrue(idHotelRooms>1);

            uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1")+ Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount1")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.approvedkutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.savebutonu.click();
            Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());

        }
    @Test
    public void TC_009(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());


    }

    @Test
        public void TC_0010(){
            Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
            USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

            uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
            uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
            uskp13_rezervasyon_eklemePage.Loginbutonu.click();

            Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
            select.selectByIndex(1);
            List<WebElement> liste= select.getOptions();
            int iduserSayisi= liste.size();
            Assert.assertTrue(iduserSayisi>1);

            Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
            select1.selectByIndex(4);
            List<WebElement> liste1= select1.getOptions();
            int idHotelRooms= liste.size();
            Assert.assertTrue(idHotelRooms>1);

            uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1")+ Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount1")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.approvedkutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.savebutonu.click();
            Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());

        }
    @Test
    public void TC_011(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());


    }

    @Test
        public void TC_0012(){ Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
            USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

            uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
            uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
            uskp13_rezervasyon_eklemePage.Loginbutonu.click();

            Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
            select.selectByIndex(1);
            List<WebElement> liste= select.getOptions();
            int iduserSayisi= liste.size();
            Assert.assertTrue(iduserSayisi>1);

            Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
            select1.selectByIndex(4);
            List<WebElement> liste1= select1.getOptions();
            int idHotelRooms= liste.size();
            Assert.assertTrue(idHotelRooms>1);

            uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1")+ Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name1")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.approvedkutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.savebutonu.click();
            Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());

        }
        @Test
        public void TC_0013(){
            Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
            USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

            uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
            uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
            uskp13_rezervasyon_eklemePage.Loginbutonu.click();

            Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
            select.selectByIndex(1);
            List<WebElement> liste= select.getOptions();
            int iduserSayisi= liste.size();
            Assert.assertTrue(iduserSayisi>1);

            Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
            select1.selectByIndex(4);
            List<WebElement> liste1= select1.getOptions();
            int idHotelRooms= liste.size();
            Assert.assertTrue(idHotelRooms>1);

            uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1")+ Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone1")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.approvedkutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.savebutonu.click();
            Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());

        }
        @Test
        public void TC_0014(){
            Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
            USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

            uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
            uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
            uskp13_rezervasyon_eklemePage.Loginbutonu.click();

            Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
            select.selectByIndex(1);
            List<WebElement> liste= select.getOptions();
            int iduserSayisi= liste.size();
            Assert.assertTrue(iduserSayisi>1);

            Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
            select1.selectByIndex(4);
            List<WebElement> liste1= select1.getOptions();
            int idHotelRooms= liste.size();
            Assert.assertTrue(idHotelRooms>1);
            uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1")+ Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email1")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes")+Keys.ENTER);
            uskp13_rezervasyon_eklemePage.approvedkutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            uskp13_rezervasyon_eklemePage.savebutonu.click();
            Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());

        }
    @Test
    public void TC_015(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());


    }
    @Test
    public void TC_016(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());

    }
    @Test
    public void TC_017(){
        Driver.getDriver().get(ConfigurationReader.getProperty("hotelreservation"));
        USKP13_Rezervasyon_EklemePage uskp13_rezervasyon_eklemePage = new USKP13_Rezervasyon_EklemePage();

        uskp13_rezervasyon_eklemePage.username.sendKeys(ConfigurationReader.getProperty("userName"));
        uskp13_rezervasyon_eklemePage.password.sendKeys(ConfigurationReader.getProperty("password"));
        uskp13_rezervasyon_eklemePage.Loginbutonu.click();

        Select select = new Select(uskp13_rezervasyon_eklemePage.idUsersDropDown);
        select.selectByIndex(1);
        List<WebElement> liste= select.getOptions();
        int iduserSayisi= liste.size();
        Assert.assertTrue(iduserSayisi>1);

        Select select1 = new Select(uskp13_rezervasyon_eklemePage.idHotelRoomsDropDown);
        select1.selectByIndex(4);
        List<WebElement> liste1= select1.getOptions();
        int idHotelRooms= liste.size();
        Assert.assertTrue(idHotelRooms>1);

        uskp13_rezervasyon_eklemePage.priceKutusu.sendKeys(ConfigurationReader.getProperty("price1") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateStartKutusu.sendKeys(ConfigurationReader.getProperty("dateStart") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.dateEndKutusu.sendKeys(ConfigurationReader.getProperty("dateEnd") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.adultAmountKutusu.sendKeys(ConfigurationReader.getProperty("adultAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.childrenAmountKutusu.sendKeys(ConfigurationReader.getProperty("childerenAmount") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactNameSurnameKutusu.sendKeys(ConfigurationReader.getProperty("name") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactPhoneKutusu.sendKeys(ConfigurationReader.getProperty("phone") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.contactEmailKutusu.sendKeys(ConfigurationReader.getProperty("email") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.noteskutusu.sendKeys(ConfigurationReader.getProperty("notes") + Keys.ENTER);
        uskp13_rezervasyon_eklemePage.approvedkutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.isPaidKutusu.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uskp13_rezervasyon_eklemePage.savebutonu.click();
        Assert.assertTrue(uskp13_rezervasyon_eklemePage.basarisizyazisi.isDisplayed());

    }

}



