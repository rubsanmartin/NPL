package cucumber.pages;

import cucumber.driver.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebNPLPage extends BasePage{
    WebDriver driver;

    //Elementos Web NPL
    @FindBy(xpath = "/html/body/main/main/div[1]/div/div/h2")
            WebElement LoginText;
    @FindBy(xpath = "//*[@id=\"contenido\"]/button")
            WebElement BotonIngresarLogin;
    @FindBy(name = "loginId")
            WebElement TextBoxNombreLogin;
    @FindBy(name = "password")
            WebElement TextBoxContrasenaLogin;
    @FindBy(xpath = "/html/body/main/main/div[1]/div/div/main/form/div/button")
            WebElement BotonInicioSesion;
    @FindBy(xpath = "//*[@id=\"inicio\"]/div/div[2]/div[1]/img")
            WebElement ImagenHomePage;
    @FindBy(xpath = "//span[text()='Muestras']")
           WebElement TextMuestras;
    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
            WebElement TexBoxComponente;
    @FindBy(xpath = "//*[@id='agregar-muestra-buscador']/form/div[1]/button")
            WebElement IconoLupaBuscarComponente;
    @FindBy(xpath = "//button[@class='btn btn-link ng-star-inserted']")
            WebElement TextAgregarMuestra;
    @FindBy(id = "numeroEnvaseMuestra")
            WebElement TexboxNumeroEnvaseMuestra;

    //Ejemplo Xpath medio //*[contains(text(),'valor')]
    //Ejemplo Xpath avanzando //*[@type='email' or @name='password']
    //Ejemplo Xpath avanzando //*[@type='email' and @name='username']
    @FindBy(id = "fechaTomaMuestra")
            WebElement TexBoxFechaTomaMuestra;
    @FindBy(xpath = "//*[text()='Ingresar la muestra']")
            WebElement BotonIngresarMuestra;
    @FindBy(xpath = "//button[@class='btn btn-lg btn-light']")
            WebElement BotonIrALaCajaDeMuestra;
    @FindBy(xpath = "//button[@class='btn btn-success btn-lg']")
            WebElement BotonEnviarLasUnaMuestra;
    @FindBy(xpath = "//button[@class='btn btn-success ng-star-inserted']")
            WebElement BotonSiEnviar;
    @FindBy(xpath = "//*[contains(text(),'La caja de muestras está lista')]")
            WebElement TextLaCajaDeMuestra;
    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary']")
            WebElement BotonDescargarSolicitud;
    @FindBy(xpath = "//a[@class='btn btn-primary d-flex align-items-center']")
            WebElement BotonIconoMasAgregarMuestra;
    @FindBy(xpath = "//img[@src='../../../assets/images/icono-agregar-box.svg']")
            WebElement BotonMenuAgregarMuestra;
    @FindBy(xpath = "//i[@class='bi bi-box-seam']")
            WebElement BotonIconoBoxAgregarMuestra;
    @FindBy(xpath = "//*[text()='Muestras y Solicitudes']")
            WebElement TextMuestrasYSolicitudes;
    @FindBy(xpath = "/html/body/app-root/div/div/main/div/mantenedor-solicitud-de-analisis/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[1]/input")
            WebElement TextBoxBuscarPorNumeroFrasco;
    @FindBy(xpath = "//em[@class='bi bi-search']")
            WebElement IconoLupa;
    @FindBy(xpath = "//i[@class='bi bi-three-dots-vertical']")
            WebElement IconoTresPuntos;
    @FindBy(xpath = "//*[text()='Descargar informe']")
            WebElement TextDescargarInforme;
    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary']")
            WebElement BotonAgregarMuestra;
    @FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[2]")
            WebElement TextListFaena;
    @FindBy(xpath = "(//span[contains(@class,'ng-option-label ng-star-inserted')])[7]")
            WebElement SelectListFaena;
    @FindBy(xpath = "//button[contains(@class,'btn btn-primary d-flex align-items-center')]")
            WebElement BotonIngresarFaena;
    @FindBy(xpath = "//*[contains(text(),'Cambiar cliente o faena')]")
            WebElement BotonCambiarClienteFaena;
    @FindBy(xpath = "(//span[contains(@class,'ng-option-label ng-star-inserted')])[2]")
            WebElement TextListFaenaCambio;
    @FindBy(xpath = "//p[contains(.,'Ingresaste a: [ joy global (chile) s.a. - ex minepro ]')]")
            WebElement TextIngresaste;
    @FindBy(xpath = "//*[contains(text(),'Muestras')]")
            WebElement TextMenuMuestras;
    @FindBy(xpath = "//*[contains(text(),'Equipos y Componentes')]")
            WebElement TextMenuEquiposyComponentes;
    @FindBy(xpath = "//*[contains(text(),'Muestras y Solicitudes')]")
            WebElement TextMenuMuestrasySolicitudes;
    @FindBy(xpath = "//*[contains(text(),'Reportes')]")
            WebElement TextMenuReportes;
    @FindBy(className = "avatar img-fluid rounded me-md-1")
            WebElement IconoUsuario;
    @FindBy(xpath = "//a[@href='/administracion-usuarios']")
            WebElement TextAdministracionUsuarios;
    @FindBy(xpath = "(//i[contains(@class,'bi bi-pencil')])[1]")
            WebElement IconoLapizEditarUsuario;
    @FindBy(id = "nombre")
            WebElement TextEditarNombre;
    @FindBy(xpath = "//span[contains(@class,'ng-arrow-wrapper')]")
            WebElement TextListFaenaEditar;
    @FindBy(xpath = "//button[contains(.,'Guardar cambios')]")
            WebElement FaenaEditar;
    @FindBy(xpath = "//button[contains(.,'Guardar cambios')]")
            WebElement BotonGuardarCambios;
    @FindBy(xpath = "//td[contains(.,'Jaimeprueba')]")
            WebElement TextNombreCambio;

    //Métodos Web NPL
    public LoginWebNPLPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickInicioSesionWeb() throws InterruptedException {
        Thread.sleep(10000);
        this.waitForElementToBeClickable(BotonIngresarLogin);
        BotonIngresarLogin.click();
    }
    public void LoginNplWeb(String Usuario, String Clave) throws InterruptedException{
        Thread.sleep(5000);
        if (LoginText.isDisplayed()) {
            this.waitForElementToBeVisible(TextBoxNombreLogin);
            TextBoxNombreLogin.sendKeys(Usuario);
            //type("MARCELOFUENZALIDASILVA@GMAIL.COM", TextBoxNombreLogin);
            Thread.sleep(5000);

            this.waitForElementToBeVisible(TextBoxContrasenaLogin);
            TextBoxContrasenaLogin.sendKeys(Clave);
            // type("copec2022", TextBoxContrasenaLogin);
            Thread.sleep(5000);

            this.waitForElementToBeClickable(BotonInicioSesion);
            BotonInicioSesion.click();

            System.out.println("Login Correcto");

        } else {
            System.out.println("Login Incorrecto");
        }
    }
    public void HomeNPL() {
        this.waitForElementToBeVisible(ImagenHomePage);
        ImagenHomePage.isDisplayed();
    }
    //Flujo NPL (Elementos)
    public void clickTextListFaena() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextListFaena);
        TextListFaena.click();
        Thread.sleep(5000);
        this.waitForElementToBeClickable(SelectListFaena);
        SelectListFaena.click();
    }
    public void clickBotonIngresarFaena() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonIngresarFaena);
        BotonIngresarFaena.click();
    }
    public void clickMuestras() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextMuestras);
        TextMuestras.click();
    }
    public void SendKeysTexBoxComponente(String NroComponente) throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeVisible(TexBoxComponente);
        TexBoxComponente.sendKeys(NroComponente);
        //type("md", TexBoxComponente);
    }
    public void clickBotonAgregarMuestra() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonAgregarMuestra);
        BotonAgregarMuestra.click();
    }
    public void clickIconoLupaBuscarComponente() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(IconoLupaBuscarComponente);
        IconoLupaBuscarComponente.click();
    }
    public void clickTextAgregarMuestra() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextAgregarMuestra);
        TextAgregarMuestra.click();
    }
    public void SendKeysTexboxNumeroEnvaseMuestra(String NroEnvase) throws InterruptedException {
        Thread.sleep(10000);
        this.waitForElementToBeVisible(TexboxNumeroEnvaseMuestra);
        TexboxNumeroEnvaseMuestra.sendKeys(NroEnvase);
        //type("102466993", TexboxNumeroEnvaseMuestra);
    }
    public void SendKeysTexBoxFechaTomaMuestra(String FechaTomaMuestra) throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeVisible(TexBoxFechaTomaMuestra);
        TexBoxFechaTomaMuestra.sendKeys(FechaTomaMuestra);
        //type("10032023", TexBoxFechaTomaMuestra);
    }
    public void clickBotonIngresarMuestra() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonIngresarMuestra);
        BotonIngresarMuestra.click();
    }
    public void clickBotonIrALaCajaDeMuestra() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonIrALaCajaDeMuestra);
        BotonIrALaCajaDeMuestra.click();
    }
    public void clickBotonEnviarLasUnaMuestra() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonEnviarLasUnaMuestra);
        BotonEnviarLasUnaMuestra.click();
    }
    public void clickBotonSiEnviar() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonSiEnviar);
        BotonSiEnviar.click();
    }
    public void clickBotonDescargarSolicitud() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonDescargarSolicitud);
        BotonDescargarSolicitud.click();
        Thread.sleep(12000);
    }
    public void getTextTextLaCajaDeMuestra() throws InterruptedException {
        Thread.sleep(18000);
        Assert.assertEquals("La caja de muestras está lista",TextLaCajaDeMuestra.getText());
    }
    public void ScrollPages() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }
    public void clickBotonIconoMasAgregarMuestra() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonIconoMasAgregarMuestra);
        BotonIconoMasAgregarMuestra.click();
    }
    public void clickBotonMenuAgregarMuestra() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonMenuAgregarMuestra);
        BotonMenuAgregarMuestra.click();
    }
    public void clickBotonIconoBoxAgregarMuestra() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(BotonIconoBoxAgregarMuestra);
        BotonIconoBoxAgregarMuestra.click();
    }
    public void clickTextMuestrasYSolicitudes() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextMuestrasYSolicitudes);
        TextMuestrasYSolicitudes.click();
    }
    public void SendKeysTextBoxBuscarPorNumeroFrasco(String BuscarNroFrasco) throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeVisible(TextBoxBuscarPorNumeroFrasco);
        TextBoxBuscarPorNumeroFrasco.sendKeys(BuscarNroFrasco);
        //type("102466993", TextBoxBuscarPorNumeroFrasco);
    }
    public void clickIconoLupa() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(IconoLupa);
        IconoLupa.click();
    }
    public void clickIconoTresPuntos() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(IconoTresPuntos);
        IconoTresPuntos.click();
    }
    public void clickTextDescargarInforme() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextDescargarInforme);
        TextDescargarInforme.click();
    }
    public void clickBotonCambiarClienteFaena() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonCambiarClienteFaena);
        BotonCambiarClienteFaena.click();
    }
    public void clickTextListFaenaCambio() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextListFaena);
        TextListFaena.click();
        Thread.sleep(3000);
        this.waitForElementToBeClickable(TextListFaenaCambio);
        TextListFaenaCambio.click();
    }
    public void getTextTextIngresaste() throws InterruptedException {
        Thread.sleep(4000);
        Assert.assertEquals("Ingresaste a: [ joy global (chile) s.a. - ex minepro ]",TextIngresaste.getText());
    }
    public void clickTextMenuMuestras() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextMenuMuestras);
        TextMenuMuestras.click();
    }
    public void clickTextMenuEquiposyComponentes() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextMenuEquiposyComponentes);
        TextMenuEquiposyComponentes.click();
    }
    public void clickTextMenuMuestrasySolicitudes() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextMenuMuestrasySolicitudes);
        TextMenuMuestrasySolicitudes.click();
    }
    public void clickTextMenuReportes() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextMenuReportes);
        TextMenuReportes.click();
    }
    public void clickIconoUsuario() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(IconoUsuario);
        IconoUsuario.click();
    }
    public void clickTextAdministracionUsuarios() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextAdministracionUsuarios);
        TextAdministracionUsuarios.click();
    }
    public void clickIconoLapizEditarUsuario() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(IconoLapizEditarUsuario);
        IconoLapizEditarUsuario.click();
    }
    public void sendKeysTextEditarNombre(String Nombre) throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextEditarNombre);
        TextEditarNombre.clear();
        TextEditarNombre.sendKeys(Nombre);
    }
    public void clickTextListFaenaEditar() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextListFaenaEditar);
        TextListFaenaEditar.click();
    }
    public void clickFaenaEditar() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(FaenaEditar);
        FaenaEditar.click();
    }
    public void clickBotonGuardarCambios() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonGuardarCambios);
        BotonGuardarCambios.click();
    }
    public void getTextTextNombreCambio() throws InterruptedException {
        Thread.sleep(7000);
        Assert.assertEquals("Jaimeprueba",TextNombreCambio.getText());
    }
}
