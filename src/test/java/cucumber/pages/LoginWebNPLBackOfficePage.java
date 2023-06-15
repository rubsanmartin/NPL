package cucumber.pages;

import cucumber.driver.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.TreeMap;

public class LoginWebNPLBackOfficePage extends BasePage {
    WebDriver driver;

    //Declaración de Elementos Web NPL BackOffice
    @FindBy(xpath = "//*[text()='Login']")
    WebElement LoginTextBackoffice;
    @FindBy(xpath = "//*[contains(text(),'Ingresar')]")
    WebElement BotonIngresaLoginBackoffice;
    @FindBy(xpath = "//button[@id='google-login-button']")
    WebElement BotonGoogleLogin;
    @FindBy(xpath = "//div[@class='BHzsHc']")
    WebElement BotonUsarOtraCuentaGoogle;
    @FindBy(xpath = "//input[@class='whsOnd zHQkBf']")
    WebElement TextBoxCorreoGoogle;
    @FindBy(xpath = "//*[text()='Siguiente']")
    WebElement BotonSiguienteGoogle;
    @FindBy(xpath = "//input[@class='whsOnd zHQkBf']")
    WebElement TextBoxContrasenaGoogle;
    @FindBy(xpath = "//*[text()='Siguiente']")
    WebElement BotonSiguienteGoogleDos;
    @FindBy(xpath = "//*[contains(text(),'Recepción de solicitudes')]")
    WebElement TextRecepcionDeSolicitudes;
    @FindBy(xpath = "//button[@class='btn btn--small btn--first']")
    WebElement BotonRecibirSolicitudDeAnalisis;
    @FindBy(name = "input")
    WebElement TextBoxNumeroDeSolicitudDeAnalisis;
    @FindBy(xpath = "//a[@class='btn btn--small btn--first']")
    WebElement BotonContinuar;
    @FindBy(xpath = "//div[@class='ng-input']")
    WebElement TextListTransportista;
    @FindBy(xpath = "/html/body/ng-dropdown-panel/div/div[2]/div[3]")
    WebElement TextList;
    @FindBy(xpath = "//a[@class='btn btn--small btn--success']")
    WebElement BotonRecibir;
    @FindBy(xpath = "//*[text()='Recepcionar frasco']")
    WebElement TextRecepcionarFrasco;
    @FindBy(name = "digitOne")
    WebElement TextBoxNumeroFrasco;
    @FindBy(xpath = "//*[text()='continuar']")
    WebElement BotonContinuarNumeroFrasco;
    @FindBy(xpath = "//div[@class='ng-input']")
    WebElement TextListObservaciones;
    @FindBy(xpath = "/html/body/ng-dropdown-panel/div/div[2]/div[1]")
    WebElement TextSinObservaciones;
    @FindBy(xpath = "/html/body/div[1]/div[4]/div/mat-dialog-container/app-receive-bottle-observation/div/div[2]/form/div[2]/ng-select/div/div/div[2]")
    WebElement TextListSeleccionarUnLote;
    @FindBy(xpath = "//*[text()='Nuevo lote']")
    WebElement TextNuevoLote;
    @FindBy(xpath = "//button[@class='btn btn--small btn--success ms-md-3 order-0 order-md-1 mb-3 mb-md-0']")
    WebElement BotonRecepcionarFrasco;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/section/main/section/app-reception/div/div[2]/button")
    WebElement TextElFrasco;
    @FindBy(xpath = "//*[@id=\"mat-dialog-7\"]/app-receive-bottle-success/div/div[1]/a/em")
    WebElement IconoXCerrarFrasco;
    @FindBy(xpath = "//a[@class='link ms-md-3 order-2 order-md-1 mb-3 mb-md-0']")
    WebElement TextVerSolicitudDeAnalisis;
    @FindBy(xpath = "//a[@class='link']")
    WebElement TextNumeroFrasco;
    @FindBy(xpath = "/html/body/div[1]/div[4]/div/mat-dialog-container/app-sample-detail/div/div[1]/a/em")
    WebElement IconoXCerrarMuestra;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-detail/div[1]/div[2]/a/em")
    WebElement IconoCerrarSolicitudDeAnalisis;
    @FindBy(xpath = "//*[text()='Lotes de análisis']")
    WebElement TextLotesDeAnalisis;
    @FindBy(xpath = "//*[text()='2285']") //+ 1 siempre
    WebElement TextSolicitudDeAnalisis;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/section/main/section/app-detail-batch/section/div[1]/table/tbody/tr/td[1]/mat-checkbox/label/span[1]")
    WebElement CheckLoteDeAnalsis;
    @FindBy(xpath = "//button[@class='btn btn--small btn--first mb-4 mb-md-0 order-1 order-md-3']")
    WebElement BotonEnviarLoteAlLaboratorio;
    @FindBy(xpath = "//a[@class='btn btn--success btn--small ms-md-3 order-0 order-md-1 mb-3 mb-md-0']")
    WebElement BotonSiEnviarLaboratorio;
    @FindBy(xpath = "//*[text()='En análisis']")
    WebElement TextEnAnalisis;
    @FindBy(xpath = "//*[text()='274']")//+ 1 siempre
    WebElement TextClienteLoteDeAnalisis;
    @FindBy(xpath = "//div[@class='card__info']")
    WebElement TextMuestraNumeroLaboratorio;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-sample-detail/div/div[2]/mat-accordion[3]/mat-expansion-panel/mat-expansion-panel-header/span/mat-panel-title/em")
    WebElement IconoMasMuestrasPendientes;
    @FindBy(xpath = "//*[@class='txt--first txt--uppercase txt--md']")//span[@class='txt--first txt--uppercase txt--md']
    WebElement TextPlanPlus;
    @FindBy(xpath = "//*[@class='bi bi-play-fill']") // //*[text()='iniciar']   //dd[@class='description__definition txt--action ng-star-inserted']
            WebElement BotonIniciar;
    @FindBy(xpath = "//*[text()='Ingreso manual']")
            WebElement TextIngresoManual;
    @FindBy(id = "particles")
            WebElement TexBoxResultado;
    @FindBy(xpath = "//*[text()=' Guardar ']")
            WebElement BotonGuardar;
    @FindBy(xpath = "//*[contains(text(),'No Detecta')]")//*[text()='No Detecta']
            WebElement CheckNoDetecta;
    @FindBy(xpath = "//label[@for='mat-radio-9-input']//span[@class='mat-radio-label-content']")
            WebElement CheckNoDetecta1;
    @FindBy(xpath = "//em[@class='bi bi-dash-square-fill ng-star-inserted']")
            WebElement IconoMenosMuestrasPendientes;
    @FindBy(xpath = "//em[@class='bi bi-x-lg']")
            WebElement IconoXMuestra;
    @FindBy(xpath = "//*[text()='Muestras']")
            WebElement TextMuestras;
    @FindBy(xpath = "//*[text()='Por aprobar']")
            WebElement TextPorAprobar;
    @FindBy(xpath = "/html/body/app-root/app-main-layout/section/main/section/app-list-samples/section/mat-tab-group/div/mat-tab-body[2]/div/div[1]/input")
            WebElement TextBoxBuscarPorTerminos;
    @FindBy(xpath = "//*[text()=' 199801651 ']") //Rut del ingreso de la muestra
            WebElement TextNumeroDeFrasco;
    @FindBy(xpath = "//button[@class='btn btn--small btn--success ng-star-inserted']")
            WebElement BotonAprobar;
    @FindBy(xpath = "//*[text()='Informe aprobado']")
            WebElement TextInformeAprobado;
    @FindBy(xpath = "//em[@class='bi bi-x-lg']")
            WebElement IconoXPorAProbar;
    @FindBy(xpath = "//*[text()='Nº frasco']")//*[text()='Nº frasco']
            WebElement TextFrasco;
    @FindBy(xpath = "//*[contains(text(),'Mantenedores')]")
            WebElement TextMantenedores;
    @FindBy(xpath = "//*[contains(text(),'Administradores clientes')]")
            WebElement TextSubMenuAdministradoresClientes;
    @FindBy(xpath = "//*[contains(text(),'Nombre')]")
            WebElement TextNombreCliente;
    @FindBy(xpath = "//*[contains(text(),'Apellido')]")
            WebElement TextApellidoCliente;
    @FindBy(xpath = "//*[contains(text(),'Email')]")
            WebElement TextCorreoCliente;
    @FindBy(xpath = "//*[contains(text(),'Tipo de usuario')]")
            WebElement TextTipoUsuarioCliente;
    @FindBy(xpath = "//*[contains(text(),'Teléfono')]")
            WebElement TextTelefonoCliente;
    @FindBy(xpath = "//*[contains(text(),'Deudor y solicitante')]")
            WebElement TextDeudorSolicitanteCliente;
    @FindBy(xpath = "//input[contains(@placeholder,'Buscar')]")
            WebElement IconoLupaCliente;
    @FindBy(xpath = "//*[contains(text(),'Super administrador')]")
            WebElement TextTipoUsuario;
    @FindBy(xpath = "//*[contains(text(),'COPEC S.A. - OF. ZONA NORTE')]")
            WebElement TextDeudorSolicitante;
    @FindBy(xpath = "//mat-panel-title[contains(.,'Deudor y solicitante')]")
            WebElement IconoFlechaDeudorSolicitante;
    @FindBy(name = "client")
            WebElement TextListDeudor;
    @FindBy(xpath = "//span[contains(@ng-reflect-ng-item-label,'TERPEL COMERCIAL DEL PERU S.R.')]")
            WebElement TextClienteDeudor;
    @FindBy(name = "chore")
            WebElement TextListSolicitante;
    @FindBy(xpath="//label[contains(.,'Seleccionar todo')]")
            WebElement SeleccionarTodo;
    @FindBy(xpath = "//*[contains(text(),'Actualizar')]")
            WebElement BotonActualizarCliente;
    @FindBy(xpath = "//*[contains(text(),'Agregar')]")
            WebElement TextAgregarCliente;
    @FindBy(xpath = "//*[contains(text(),'TERPEL COMERCIAL DEL PERU S.R.L. - EXTRANJEROS')]")
            WebElement TextDeudorSolicitanteAgregado;

    //Métodos Web NPL BackOffice
    public LoginWebNPLBackOfficePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ClickInicioSesionBackOffice() throws InterruptedException {
        Thread.sleep(10000);
        this.waitForElementToBeClickable(BotonIngresaLoginBackoffice);
        BotonIngresaLoginBackoffice.click();
    }
    public void LoginNplBackoffice(String Usuario, String Clave) throws InterruptedException {
        Thread.sleep(5000);
        if (LoginTextBackoffice.isDisplayed()) {
            this.waitForElementToBeClickable(BotonGoogleLogin);
            BotonGoogleLogin.click();

            this.waitForElementToBeVisible(TextBoxCorreoGoogle);
            TextBoxCorreoGoogle.sendKeys(Usuario);

            this.waitForElementToBeClickable(BotonSiguienteGoogle);
            BotonSiguienteGoogle.click();

            Thread.sleep(10000);
            this.waitForElementToBeVisible(TextBoxContrasenaGoogle);
            TextBoxContrasenaGoogle.sendKeys(Clave);
            Thread.sleep(5000);
            this.waitForElementToBeClickable(BotonSiguienteGoogleDos);
            BotonSiguienteGoogleDos.click();

            System.out.println("Login Correcto");

        } else {
            System.out.println("Login Incorrecto");
        }
    }
    public void clickTextRecepcionDeSolicitudes() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextRecepcionDeSolicitudes);
        TextRecepcionDeSolicitudes.click();
    }
    public void clickBotonRecibirSolicitudDeAnalisis() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonRecibirSolicitudDeAnalisis);
        BotonRecibirSolicitudDeAnalisis.click();
    }
    public void sendKeysTextBoxNumeroDeSolicitudDeAnalisis(String NroSolicitud) throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextBoxNumeroDeSolicitudDeAnalisis);
        TextBoxNumeroDeSolicitudDeAnalisis.click();
        Thread.sleep(5000);
        TextBoxNumeroDeSolicitudDeAnalisis.sendKeys(NroSolicitud);
    }
    public void clickBotonContinuar() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonContinuar);
        BotonContinuar.click();
    }
    public void clickTextListTransportista() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextListTransportista);
        TextListTransportista.click();
    }
    public void clickTextList() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextList);
        TextList.click();
        // Select ListText = new Select (findElement(By.xpath("//font[@style='vertical-align: inherit;']")));
        // ListText.selectByVisibleText("Jaacs");
        //ListText.selectByIndex(2);
    }
    public void clickBotonRecibir() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonRecibir);
        BotonRecibir.click();
    }
    public void clickTextRecepcionarFrasco() throws InterruptedException {
        Thread.sleep(12000);
        this.waitForElementToBeClickable(TextRecepcionarFrasco);
        TextRecepcionarFrasco.click();
    }
    public void sendKeysTextBoxNumeroFrasco(String NroFrasco) throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeVisible(TextBoxNumeroFrasco);
        TextBoxNumeroFrasco.sendKeys(NroFrasco);
    }
    public void clickBotonContinuarNumeroFrasco() throws InterruptedException {
        Thread.sleep(10000);
        this.waitForElementToBeClickable(BotonContinuarNumeroFrasco);
        BotonContinuarNumeroFrasco.click();
    }
    public void clickTextListObservaciones() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextListObservaciones);
        TextListObservaciones.click();
    }
    public void clickTextSinObservaciones() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextSinObservaciones);
        TextSinObservaciones.click();
    }
    public void clickTextListSeleccionarUnLote() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextListSeleccionarUnLote);
        TextListSeleccionarUnLote.click();
    }
    public void clickTextNuevoLote() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextNuevoLote);
        TextNuevoLote.click();
    }
    public void clickBotonRecepcionarFrasco() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(BotonRecepcionarFrasco);
        BotonRecepcionarFrasco.click();
    }
    public void getTextTextElFrasco() {
        Assert.assertEquals("Recibir solicitud de análisis",TextElFrasco.getText());
    }
    public void clickIconoXCerrarFrasco() {
        this.waitForElementToBeClickable(IconoXCerrarFrasco);
        IconoXCerrarFrasco.click();
    }
    public void clickTextVerSolicitudDeAnalisis() throws InterruptedException {
        Thread.sleep(14000);
        this.waitForElementToBeClickable(TextVerSolicitudDeAnalisis);
        TextVerSolicitudDeAnalisis.click();
    }
    public void clickTextNumeroFrasco() throws InterruptedException {
        Thread.sleep(12000);
        this.waitForElementToBeClickable(TextNumeroFrasco);
        TextNumeroFrasco.click();
    }
    public void clickIconoXCerrarMuestra() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(IconoXCerrarMuestra);
        IconoXCerrarMuestra.click();
    }
    public void clickIconoCerrarSolicitudDeAnalisis() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(IconoCerrarSolicitudDeAnalisis);
        IconoCerrarSolicitudDeAnalisis.click();
    }
    public void clickTextLotesDeAnalisis() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(TextLotesDeAnalisis);
        TextLotesDeAnalisis.click();
    }
    public void clickTextSolicitudDeAnalisis() throws InterruptedException {
        Thread.sleep(14000);
        this.waitForElementToBeClickable(TextSolicitudDeAnalisis);
        TextSolicitudDeAnalisis.click();
    }
    public void clickCheckLoteDeAnalsis() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(CheckLoteDeAnalsis);
        CheckLoteDeAnalsis.click();
    }
    public void clickBotonEnviarLoteAlLaboratorio() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(BotonEnviarLoteAlLaboratorio);
        BotonEnviarLoteAlLaboratorio.click();
    }
    public void clickBotonSiEnviarLaboratorio() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(BotonSiEnviarLaboratorio);
        BotonSiEnviarLaboratorio.click();
    }
    public void clickTextEnAnalisis() throws InterruptedException {
        Thread.sleep(17000);
        this.waitForElementToBeClickable(TextEnAnalisis);
        TextEnAnalisis.click();
    }
    public void clickTextClienteLoteDeAnalisis() throws InterruptedException {
        Thread.sleep(10000);
        this.waitForElementToBeClickable(TextClienteLoteDeAnalisis);
        TextClienteLoteDeAnalisis.click();
    }
    public void clickTextMuestraNumeroLaboratorio() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextMuestraNumeroLaboratorio);
        TextMuestraNumeroLaboratorio.click();
    }
    public void clickIconoMasMuestrasPendientes() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(IconoMasMuestrasPendientes);
        IconoMasMuestrasPendientes.click();
    }
    public void MuestrasPendientesIniciar(String NroResultado) throws InterruptedException {
        if (TextPlanPlus.isDisplayed()) {
            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Punto de Inflmacion Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Agua(Destilacion) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Dilucion por Combustible Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Oxidacion Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Viscocidad a 100 °C Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Nitracion Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Silicio (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Cromo (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Calcio (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Niquel (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Hierro (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Estano (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Magnesio (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Molibdeno (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Cobre (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Zinc (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Sodio (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Vanadio (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Plomo (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Plata (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Potasio (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Aluminio (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Fosforo (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Boro (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Titanio (RDE) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Numero Total Basico (TBN) Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(CheckNoDetecta);
            CheckNoDetecta.click();
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Humedad 0,05 Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Indice de Hollin Correcto");
            Thread.sleep(7000);

            this.waitForElementToBeClickable(BotonIniciar);
            BotonIniciar.click();
            Thread.sleep(7000);
            this.waitForElementToBeClickable(TextIngresoManual);
            TextIngresoManual.click();
            Thread.sleep(7000);
            this.waitForElementToBeVisible(TexBoxResultado);
            TexBoxResultado.sendKeys(NroResultado);
            //type("1", TexBoxResultado);
            Thread.sleep(7000);
            this.waitForElementToBeClickable(BotonGuardar);
            BotonGuardar.click();
            System.out.println("Iniciar Pq Index (Index Number) Correcto");
            Thread.sleep(7000);

        } else {
            System.out.println("Iniciar Incorrecto");
        }
    }
    public void clickIconoMenosMuestrasPendientes() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(IconoMenosMuestrasPendientes);
        IconoMenosMuestrasPendientes.click();
    }
    public void clickIconoXMuestra() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(IconoXMuestra);
        IconoXMuestra.click();
    }
    public void clickTextMuestras() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextMuestras);
        TextMuestras.click();
    }
    public void clickTextPorAprobar() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextPorAprobar);
        TextPorAprobar.click();
    }
    /*public void SendKeysTextBoxBuscarPorTerminos() {
        type("102466993", TextBoxBuscarPorTerminos);
    }*/
    public void clickTextFrasco() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextFrasco);
        TextFrasco.click();
    }
    public void clickTextNumeroDeFrasco() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextNumeroDeFrasco);
        TextNumeroDeFrasco.click();
    }
    public void clickBotonAprobar() throws InterruptedException {
        Thread.sleep(15000);
        this.waitForElementToBeClickable(BotonAprobar);
        BotonAprobar.click();
    }
    public void getTextTextInformeAprobado() throws InterruptedException {
        Thread.sleep(7000);
        Assert.assertEquals("Informe aprobado", TextInformeAprobado.getText());
    }
    public void clickIconoXPorAProbar() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(IconoXPorAProbar);
        IconoXPorAProbar.click();
    }
    public void clickTextMantenedores() throws InterruptedException {
        Thread.sleep(10000);
        this.waitForElementToBeClickable(TextMantenedores);
        TextMantenedores.click();
    }
    public void clickTextSubMenuAdministradoresClientes() throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeClickable(TextSubMenuAdministradoresClientes);
        TextSubMenuAdministradoresClientes.click();
    }
    public void getTextCamposClientes() throws InterruptedException {
        Thread.sleep(7000);
        Assert.assertEquals("NOMBRE", TextNombreCliente.getText());
        Thread.sleep(4000);
        Assert.assertEquals("APELLIDO", TextApellidoCliente.getText());
        Thread.sleep(4000);
        Assert.assertEquals("EMAIL", TextCorreoCliente.getText());
        Thread.sleep(4000);
        Assert.assertEquals("TIPO DE USUARIO", TextTipoUsuarioCliente.getText());
        Thread.sleep(4000);
        Assert.assertEquals("TELÉFONO", TextTelefonoCliente.getText());
        Thread.sleep(4000);
        Assert.assertEquals("DEUDOR Y SOLICITANTE", TextDeudorSolicitanteCliente.getText());
    }
    public void sendKeysIconoLupaCliente(String Buscar) throws InterruptedException {
        Thread.sleep(7000);
        this.waitForElementToBeVisible(IconoLupaCliente);
        IconoLupaCliente.clear();
        IconoLupaCliente.sendKeys(Buscar);
    }
    public void getTextUsuarioyDeudor() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Super administrador", TextTipoUsuario.getText());
        Thread.sleep(2000);
        Assert.assertEquals("COPEC S.A. - OF. ZONA NORTE", TextDeudorSolicitante.getText());
    }
    public void clickTextTipoUsuario() throws InterruptedException {
        Thread.sleep(3000);
        this.waitForElementToBeClickable(TextTipoUsuario);
        TextTipoUsuario.click();
    }
    public void clickIconoFlechaDeudorSolicitante() throws InterruptedException {
        Thread.sleep(5000);
        this.waitForElementToBeClickable(IconoFlechaDeudorSolicitante);
        IconoFlechaDeudorSolicitante.click();
    }
    public void clickTextListDeudor() throws InterruptedException {
        Thread.sleep(4000);
        this.waitForElementToBeClickable(TextListDeudor);
        TextListDeudor.click();
    }
    public void clickTextClienteDeudor() throws InterruptedException {
        Thread.sleep(4000);
        this.waitForElementToBeClickable(TextClienteDeudor);
        TextClienteDeudor.click();
    }
    public void clickTextListSolicitante() throws InterruptedException {
        Thread.sleep(4000);
        this.waitForElementToBeClickable(TextListSolicitante);
        TextListSolicitante.click();
    }
    public void clickSeleccionarTodo() throws InterruptedException {
        Thread.sleep(3000);
        this.waitForElementToBeClickable(SeleccionarTodo);
        SeleccionarTodo.click();
    }
    public void clickTextAgregarCliente() throws InterruptedException {
        Thread.sleep(3000);
        this.waitForElementToBeClickable(TextAgregarCliente);
        TextAgregarCliente.click();
    }
    public void clickBotonActualizarCliente(){
        this.waitForElementToBeClickable(BotonActualizarCliente);
        BotonActualizarCliente.click();
    }
    public void getTextDeudorSolicitanteAgregado() throws InterruptedException {
        Thread.sleep(7000);
        Assert.assertEquals("TERPEL COMERCIAL DEL PERU S.R.L. - EXTRANJEROS", TextDeudorSolicitanteAgregado.getText());
    }
}