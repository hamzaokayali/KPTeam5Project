package com.team5.tests;

import com.team5.pages.USKP04_ListOfUser_AddUserPage;
import com.team5.utilities.ConfigurationReader;
import com.team5.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class USKP04_ListOfUser_AddUserTests {

    USKP04_ListOfUser_AddUserPage page = new USKP04_ListOfUser_AddUserPage();

    @BeforeTest
    public void setUp(){
        Driver.getDriver().get(ConfigurationReader.getProperty("koalapalace_link"));
        Driver.getDriver().manage().window().maximize();
        page.userName.sendKeys("manager2");
        page.logInUserPassword.sendKeys("Man1ager2!" + Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void US_KP04_TC_01(){
      page.userName.sendKeys("mayag");
      page.password.sendKeys("Alisveli1.");
      page.email.sendKeys("alivseli@gmail.com");
      page.fullName.sendKeys("Ali Veli");
      page.phoneNo.sendKeys("0779875645");
      page.socialSecurityNumber.sendKeys("987789654");
      page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
      page.address.sendKeys("Cumhuriyet Sok. No: 10");
      page.workingSector.sendKeys("Lawyer");
      Select select2 = new Select(page.role);
      select2.selectByIndex(1);
      page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();


    }


    @Test
    public void US_KP04_TC_02(){
        page.userName.sendKeys("manag123234");
        page.password.sendKeys("Ma.!");
        page.email.sendKeys("aliveli123asd@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.passwordError.isDisplayed());
    }


    @Test
    public void US_KP04_TC_03(){
        page.userName.sendKeys("m12.");
        page.password.sendKeys("M.!");
        page.email.sendKeys("aliveli123as0d@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.passwordError.isDisplayed());
    }


    @Test
    public void US_KP04_TC_04(){
        page.userName.sendKeys("manager2123.");
        page.password.sendKeys("MANANAAAA!");
        page.email.sendKeys("aliveli1230d@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.passwordUpperLowerCaseError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_05(){
        page.userName.sendKeys("manager2123asdfds.");
        page.password.sendKeys("MANANAAAAa2ds!");
        page.email.sendKeys("aliveli1230dssd@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_06(){
        page.userName.sendKeys("mana34ge2123dfds.");
        page.password.sendKeys("mana4aan3aanaa2ds!");
        page.email.sendKeys("aliveli1s24330ftsd@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.passwordUpperLowerCaseError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_07(){
        page.userName.sendKeys("manage2123dfds.");
        page.password.sendKeys("Manaaanaanaa2ds!");
        page.email.sendKeys("aliveli1ss230ftsd@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_08(){
        page.userName.sendKeys("manage2123dfdss.");
        page.password.sendKeys("Manaaanaanaa2s");
        page.email.sendKeys("aliveli1ss2m30ftsdl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.passwordUpperLowerCaseError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_09(){
        page.userName.sendKeys("manage2123dfdsss.");
        page.password.sendKeys("Manaaanaanaa2s.");
        page.email.sendKeys("aliveli1ss2m30fxsdl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_10(){
        page.userName.sendKeys("manage2123dfdsass.");
        page.password.sendKeys("Manaaanaanaas.");
        page.email.sendKeys("aliveli1ss2m30faxsdl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.passwordUpperLowerCaseError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_11(){
        page.userName.sendKeys("manage2123ddsass.");
        page.password.sendKeys("Manaaanaanaas3.");
        page.email.sendKeys("aliveli1ss2m30xsdl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_12(){
        page.userName.sendKeys("mage213ddsass.");
        page.password.sendKeys("Manaaakaanaas3.");
        page.email.sendKeys("aliveli1ss2m30sdlgmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.emailError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_13(){
        page.userName.sendKeys("magxe213ddsass.");
        page.password.sendKeys("Manaaaxkaanaas3.");
        page.email.sendKeys("aliveli1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875645");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_14(){
        page.userName.sendKeys("mangxei213ddsass.");
        page.password.sendKeys("Mamnaiaaxkaanaas3.");
        page.email.sendKeys("alivelibi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("077987594");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.phoneError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_15(){
        page.userName.sendKeys("mangxei213ddsass.");
        page.password.sendKeys("Mamnaiaaxkaanaas3.");
        page.email.sendKeys("alivelibi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_16(){
        page.userName.sendKeys("mangersi213ddsass.");
        page.password.sendKeys("Maernaiaaxkaanaas3.");
        page.email.sendKeys("alivelkbi1sser30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("97789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.ssnError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_17(){
        page.userName.sendKeys("mangxei213ddsass.");
        page.password.sendKeys("Mamnaiaaxkaanaas3.");
        page.email.sendKeys("alivelibi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_18(){
        page.userName.sendKeys("ansjgxei213ddsass.");
        page.password.sendKeys("Mjmsnaiaaxkaanaas3.");
        page.email.sendKeys("aivejslibi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.fullNameError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_19(){
        page.userName.sendKeys("mannmgxei213ddsass.");
        page.password.sendKeys("Mamnamniaaxkaanaas3.");
        page.email.sendKeys("alivelmnibi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_20(){
        page.userName.sendKeys("mankgxei213ddsass.");
        page.password.sendKeys("Mabnnaiaaxkaanaas3.");
        page.email.sendKeys("alivelobbi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.drivingLicenceError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_21(){
        page.userName.sendKeys("mannrmgxei213ddsass.");
        page.password.sendKeys("Mamrnamniaaxkaanaas3.");
        page.email.sendKeys("alivelmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByVisibleText("Alaska");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_22(){
        page.userName.sendKeys("mannru1mgxei213ddsass.");
        page.password.sendKeys("Mamrunamni1aaxkaanaas3.");
        page.email.sendKeys("alivelmnr1uibi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789655");
        page.drivingLicense.sendKeys("123455");
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.countryError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_23(){
        page.userName.sendKeys("masnnrmgxei213ddsass.");
        page.password.sendKeys("Masmrnamniaaxkaanaas3.");
        page.email.sendKeys("alsivelmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_24(){
        page.userName.sendKeys("mea56rmgxei213ddsass.");
        page.password.sendKeys("Mae56namniaaxkaanaas3.");
        page.email.sendKeys("alivee56nribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(0);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.stateError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_25(){
        page.userName.sendKeys("masnn23rmgxei213ddsass.");
        page.password.sendKeys("Masmr23namniaaxkaanaas3.");
        page.email.sendKeys("alsi23velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_26(){
        page.userName.sendKeys("masnnr74mgxei213ddsass.");
        page.password.sendKeys("Masmr74namniaaxkaanaas3.");
        page.email.sendKeys("alsi74velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByIndex(1);
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(0);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(!page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_27(){
        page.userName.sendKeys("m2asnn23rmgxei213ddsass.");
        page.password.sendKeys("Ma2smr23namniaaxkaanaas3.");
        page.email.sendKeys("al2si23velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_28(){
        page.userName.sendKeys("m21asnn23rmgxei213ddsass.");
        page.password.sendKeys("Ma21smr23namniaaxkaanaas3.");
        page.email.sendKeys("alsi2213velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.addressError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_29(){
        page.userName.sendKeys("m2a5snn23rmgxei213ddsass.");
        page.password.sendKeys("Ma2sm5r23namniaaxkaanaas3.");
        page.email.sendKeys("al2si235velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_30(){
        page.userName.sendKeys("m2ssasnnui23rmgxei213ddsass.");
        page.password.sendKeys("Ma2sssmrui23namniaaxkaanaas3.");
        page.email.sendKeys("al2simm2ui3velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.2021");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.birthDateError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_31(){
        page.userName.sendKeys("snn23rmgxei213ddsass.");
        page.password.sendKeys("Lm5r23namniaaxkaanaas3.");
        page.email.sendKeys("i235velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_32(){
        page.userName.sendKeys("m2ann23gfhjgxei213ddsass.");
        page.password.sendKeys("Ma2fghm5r23nniaaxkaanaas3.");
        page.email.sendKeys("al2si23efglmnri1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.workingSectorError.isDisplayed());

    }


    @Test
    public void US_KP04_TC_33(){
        page.userName.sendKeys("snn23rmgxei213ddsass.");
        page.password.sendKeys("Lm5r23namniaaxkaanaas3.");
        page.email.sendKeys("i235velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(0);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.roleError.isDisplayed());

    }




    @Test
    public void US_KP04_TC_34(){
        page.userName.sendKeys("snn23rmgxei213ddsass.");
        page.password.sendKeys("Lm5r23namniaaxkaanaas3.");
        page.email.sendKeys("i235velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_35(){
        page.userName.sendKeys("snn2yt3rmgxei213ddsass.");
        page.password.sendKeys("Lmrt5r23namniaaxkaanaas3.");
        page.email.sendKeys("i235vertlmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }


    @Test
    public void US_KP04_TC_36(){
        page.userName.sendKeys("snn23rmgxei213ddsass.");
        page.password.sendKeys("Lm5r23namniaaxkaanaas3.");
        page.email.sendKeys("i235velmnribi1ss2m30sdxl@gmail.com");
        page.fullName.sendKeys("Ali Veli");
        page.phoneNo.sendKeys("0779875394");
        page.socialSecurityNumber.sendKeys("987789654");
        page.drivingLicense.sendKeys("123455");
        Select select = new Select(page.iDCountryDropdown);
        select.selectByVisibleText("United States");
        Select select1 = new Select(page.iDStateDropdown);
        select1.selectByIndex(1);
        page.address.sendKeys("Cumhuriyet Sok. No: 10");
        page.workingSector.sendKeys("Lawyer");
        Select select2 = new Select(page.role);
        select2.selectByIndex(1);
        page.birthDate.sendKeys("12.12.1980");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.btnSubmit.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(page.successfullAlert.isDisplayed());

    }

}
