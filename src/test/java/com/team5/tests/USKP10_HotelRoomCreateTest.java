package com.team5.tests;

import com.team5.pages.USKP10_HotelRoomCreatePage;
import com.team5.utilities.ConfigurationReader;
import com.team5.utilities.Driver;
import com.team5.utilities.TestBaseFinal;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class USKP10_HotelRoomCreateTest extends TestBaseFinal {

    USKP10_HotelRoomCreatePage page=new USKP10_HotelRoomCreatePage();


    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/Account/Logon");
        page.loginPageUserNameKutusu.sendKeys("manager2");
        page.loginPagePasswordKutusu.sendKeys("Man1ager2!");
        page.loginPageLoginButton.click();
    }


    @Test
    public void TC_0001_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0001_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda IdHotel 2. index secilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0002_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0002_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda IdHotel 8. index secilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 8. indexi secildi");
        Select select2=new Select(page.hotelRoomCreateIDHotelDropDown);
        select2.selectByIndex(8);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0003_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0003_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda IdHotel 0. index secilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 0. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(0);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Select Hotel yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0004_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0004_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Code bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue1"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //BUG var ayni kodla kayit yapmamsi gerekiyor.
    public void TC_0005_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0005_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Code bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue2"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0006_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0006_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Name bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0007_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0007_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Name bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue1"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Name kismina invalid data ile kayit yapilamamasi gerekiyor ama kayit yapiliyor
    public void TC_0008_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0008_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Name bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue2"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan invalid deger yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Name kismina invalid data ile kayit yapilamamasi gerekiyor ama kayit yapiliyor
    public void TC_0009_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0009_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Name bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue3"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan invalid deger yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0010_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0010_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Name bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue4"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Kayit basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0011_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0011_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Location bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue1"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Kayit basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Location kismina invalid data ile kayit yapilamamasi gerekiyor
    public void TC_0012_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0012_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Location bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue2"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan invalid deger yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0013_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0013_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Location bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue3"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Kayit basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0014_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0014_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Description bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Kayit basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Description kismina invalid data ile kayit yapilamamasi gerekiyor
    public void TC_0015_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0015_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Description bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue1"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan invalid deger yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Description kismina invalid data ile kayit yapilamamasi gerekiyor
    public void TC_0016_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0016_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Description bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue2"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan invalid deger yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0017_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0017_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Price bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Kayit basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0018_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0018_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Price bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue1"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Kayit basarili yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0019_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0019_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Price bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue2"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Fill All Fields Please  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBosluklariDoldurun.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBosluklariDoldurun.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0020_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0020_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Price bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue3"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Fill All Fields Please  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBosluklariDoldurun.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBosluklariDoldurun.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0021_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0021_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Room Type 2.index in secilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Basarili  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0022_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0022_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Room Type 0.index in secilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(0);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Roomtype  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0023_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0023_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda Room Type 9.index in secilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(9);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Basarili  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0024_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0020_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda MaxAdult bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Basarili  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Maxadult kismina invalid data ile kayit yapilamamasi gerekiyor
    public void TC_0025_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0025_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda MaxAdult bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue1"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan MaxAdult  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0026_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0026_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda MaxAdult bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(1);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue2"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Basarili  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Maxaddult kismina invalid data ile kayit yapilamamasi gerekiyor
    public void TC_0027_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0027_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda MaxAdult bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue3"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Max adult  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test
    public void TC_0028_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0028_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda MaxChild bolumune valid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Basarili  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateBasariliYazisi.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Maxchild kismina invalid data ile kayit yapilamamasi gerekiyor
    public void TC_0029_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0029_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda MaxChild bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(1);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue2"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue1"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Yatak sayisi eksik  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Maxchild kismina invalid data ile kayit yapilamamasi gerekiyor
    public void TC_0030_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0030_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda MaxChild bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue2"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue2"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Yatak sayisi eksik  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

    @Test //Maxchild kismina invalid data ile kayit yapilamamasi gerekiyor
    public void TC_0031_HotelRoomCreate(){
        extentTest=extentReports.createTest("TC_0031_Kaolapalace HotelRoomCreate","HotelRoomCreate sayfasinda MaxChild bolumune invalid deger girilmesi");

        extentTest.info("Sayfa adresine git");
        Driver.getDriver().get("https://www.kaolapalace-qa-environment.com/admin/HotelroomAdmin/Create");

        extentTest.info("Select class dan obje olusturup IdHotel kutusundan 2. indexi secildi");
        Select select=new Select(page.hotelRoomCreateIDHotelDropDown);
        select.selectByIndex(2);

        extentTest.info("Code kutusuna valid deger gonderildi");
        page.hotelRoomCreateCodeKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_codevalue"));

        extentTest.info("Name kutusuna valid deger gonderildi");
        page.hotelRoomCreateNameKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_namevalue"));


        extentTest.info("Location kutusuna valid deger gonderildi");
        page.hotelRoomCreateLocationKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_locationvalue"));

        extentTest.info("Description kutusuna valid deger gonderildi");
        page.hotelRoomCreateDescriptionAlani.sendKeys(ConfigurationReader.getProperty("uskp10_descriptionvalue"));

        extentTest.info("Price kutusuna valid deger gonderildi");
        page.hotelRoomCreatePriceKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_pricevalue"));

        Select select1=new Select(page.hotelRoomCreateRoomTypeDropDown);
        select1.selectByIndex(2);

        extentTest.info("Maxadult kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxAdultKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxadultvalue2"));

        extentTest.info("Maxchildren kutusuna valid deger gonderildi");
        page.hotelRoomCreateMaxChildrenKutusu.sendKeys(ConfigurationReader.getProperty("uskp10_maxchildrenvalue3"));

        extentTest.info("Save butonuna tikliyoruz");
        page.hotelRoomCreateSaveButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Ekrana cikan Yatak sayisi eksik  yazisini ekrana yazdiriyoruz ");
        System.out.println(page.hotelRoomCreateHataMesajlari.getText());

        extentTest.info("Kayidin basarili olup olmamasini dogrulatiyoruz");
        Assert.assertTrue(page.hotelRoomCreateHataMesajlari.isDisplayed());

        extentTest.pass("Testimiz Basarili");

    }

}