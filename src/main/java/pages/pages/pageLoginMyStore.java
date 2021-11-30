package pages.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Objects;


import org.openqa.selenium.support.ui.Select;
import pages.objects.objectsSetup;
import pages.objects.objectsMyStore;

public class pageLoginMyStore {

    private WebDriver driver;
    @Given("Ingreso a la web My Store")
    public void ingresoALaWebMyStore() {
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        System.setProperty(objectsSetup.KEY, objectsSetup.DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // maximixar ventana
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationpractice.com/index.php");
    }

    @When("doy click en el botón Sign In")
    public void doyClickEnElBotónSignIn() {
        driver.findElement(objectsMyStore.BTN_SIGNIN).click();
    }

    @And("Ingreso mi correo {string}")
    public void ingresoMiCorreo(String arg0) {  //ya no iria email_create
        driver.findElement(objectsMyStore.TXT_EMAIL).sendKeys(arg0);
    }

    @And("doy click en el botón crear cuenta")
    public void doyClickEnElBotónCrearCuenta() throws InterruptedException {
        driver.findElement(objectsMyStore.BTN_CREAR).click();
    }
    @Then("valido el formulario")
    public void validoElFormulario() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

    @When("registro del correo {string}")
    public void registroDelCorreo(String correo) {
        driver.findElement(objectsMyStore.BTN_SIGNIN).click();
        driver.findElement(objectsMyStore.TXT_EMAIL).sendKeys(correo);
        driver.findElement(objectsMyStore.BTN_CREAR).click();
    }

    @And("lleno el formulario con mis datos personales {string} {string} {string} {string}")
    public void llenoElFormularioConMisDatosPersonales(String titulo, String nombre, String apellido, String clave) throws InterruptedException {
        driver.findElement(objectsMyStore.RBT_MAN).click();

        if (Objects.equals(titulo, "Hombre")){
            driver.findElement(objectsMyStore.RBT_MAN).click();
        }
        else {
            driver.findElement(objectsMyStore.RBT_WOM).click();
        }
        driver.findElement(objectsMyStore.TXT_NOMBRE).sendKeys(nombre);
        driver.findElement(objectsMyStore.TXT_APELLIDO).sendKeys(apellido);
        driver.findElement(objectsMyStore.TXT_CLAVE).sendKeys(clave);
//Select objDia = new Select(driver.findElement(objectsMyStore.LST_DIA));
//        objDia.selectByValue(dia);
    }

    @And("lleno la fecha de nacimiento {string} {string} {string}")
    public void llenoLaFechaDeNacimiento(String dia, String mes, String anio) {
        Select objDia = new Select(driver.findElement(objectsMyStore.LST_DIA));
        objDia.selectByValue(dia);

        Select objMes = new Select(driver.findElement(objectsMyStore.LST_MES));
        objMes.selectByValue(mes);

        Select objAnio = new Select(driver.findElement(objectsMyStore.LST_ANIO));
        objAnio.selectByValue(anio);

        driver.findElement(objectsMyStore.CHB_NEWS).click();
    }

    @And("ingreso los datos de la dirección {string} {string} {string} {string} {string} {string}")
    public void ingresoLosDatosDeLaDirección(String cia, String direccion1, String direccion2, String ciudad, String estado, String codPost) {
        driver.findElement(objectsMyStore.TXT_CIA).sendKeys(cia);
        driver.findElement(objectsMyStore.TXT_DIRECCION1).sendKeys(direccion1);
        driver.findElement(objectsMyStore.TXT_DIRECCION2).sendKeys(direccion2);
        driver.findElement(objectsMyStore.TXT_CIUDAD).sendKeys(ciudad);
        Select objEst = new Select(driver.findElement(objectsMyStore.LST_ESTADO));
        objEst.selectByVisibleText(estado);
        //objEst.selectByValue(estado);
        driver.findElement(objectsMyStore.TXT_CODPOST).sendKeys(codPost);

    }


    @And("ingreso mi {string} {string}")
    public void ingresoMi(String celular, String referencia) {
        driver.findElement(objectsMyStore.TXT_CELULAR).sendKeys(celular);
        driver.findElement(objectsMyStore.TXT_REFERENCIA).clear();
        driver.findElement(objectsMyStore.TXT_REFERENCIA).sendKeys(referencia);
    }

    @And("ingreso mi {string} {string} {string} {string}")
    public void ingresoMi(String infoadicional, String tefcasa, String celular, String referencia) {
        driver.findElement(objectsMyStore.TXT_INFADIC).sendKeys(infoadicional);
        driver.findElement(objectsMyStore.TXT_TEF_HOUSE).sendKeys(tefcasa);
        driver.findElement(objectsMyStore.TXT_CELULAR).sendKeys(celular);
        driver.findElement(objectsMyStore.TXT_REFERENCIA).clear();
        driver.findElement(objectsMyStore.TXT_REFERENCIA).sendKeys(referencia);
    }

    @Then("doy click en registrar y verifico mensaje validador")
    public void doyClickEnRegistrarYVerificoMensajeValidador() {
        driver.findElement(objectsMyStore.BTN_REGISTRAR).click();
        String mensajeEsperado = "Welcome to your account. Here you can manage all of your personal information and orders.";
        String validator = driver.findElement(objectsMyStore.MSJ_VAL).getText();
        //usamos el assert para comparar ambos String
        Assert.assertEquals(mensajeEsperado, validator);
        //enviamos mensaje por consola
        System.out.println(mensajeEsperado);
        System.out.println(validator);

        driver.findElement(objectsMyStore.BTN_LOGOUT).click();
        //driver.close();
    }

}
