package pages.objects;

import org.openqa.selenium.By;


public class objectsMyStore {
    private objectsMyStore(){

    }
        //localizadores
        //PAGE1
        public static By BTN_SIGNIN     = By.className("login");
        //PAGE2
        public static By TXT_EMAIL      = By.id("email_create");
        public static By BTN_CREAR      = By.id("SubmitCreate");
        //PAGE3
        public static By RBT_MAN        = By.id("id_gender1");
        public static By RBT_WOM        = By.id("id_gender2");
        public static By TXT_NOMBRE     = By.id("customer_firstname");
        public static By TXT_APELLIDO   = By.id("customer_lastname");
        public static By TXT_CLAVE      = By.id("passwd");
        public static By LST_DIA        = By.id("days");
        public static By LST_MES        = By.id("months");
        public static By LST_ANIO       = By.id("years");
        public static By CHB_NEWS       = By.id("newsletter");
        public static By TXT_CIA        = By.id("company");
        public static By TXT_DIRECCION1 = By.id("address1");
        public static By TXT_DIRECCION2 = By.id("address2");
        public static By TXT_CIUDAD     = By.id("city");
        public static By LST_ESTADO     = By.id("id_state");
        public static By TXT_CODPOST    = By.id("postcode");
        public static By TXT_INFADIC    = By.id("other");
        public static By TXT_TEF_HOUSE  = By.id("phone");
        public static By TXT_CELULAR    = By.id("phone_mobile");
        public static By TXT_REFERENCIA = By.id("alias");
        public static By BTN_REGISTRAR  = By.id("submitAccount");
        public static By MSJ_VAL        = By.className("info-account");
        public static By BTN_LOGOUT     = By.className("logout");


/*
        //YOUR ADDRESS
        public static By TXT_NOMBRE = By.id("firstname");
        public static By TXT_APELLIDO = By.id("lastname");
        public static By TXT_CIA = By.id("company");
        public static By TXT_DIR1 = By.id("address1");
        public static By TXT_DIR2 = By.id("address2");
        public static By TXT_CITY = By.id("city");
        public static By TXT_CP = By.id("postcode");
        public static By TXT_OTR = By.id("other");
        public static By TXT_TEF = By.id("phone");
        public static By TXT_CEL = By.id("phone_mobile");
        public static By TXT_ALIAS = By.id("alias");
        public static By BTN_REGISTRO = By.id("submitAccount");

 */
}
