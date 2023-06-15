package cucumber.definitions;

import cucumber.driver.DriverFactory;
import cucumber.driver.SharedDriver;
import cucumber.pages.LoginWebNPLBackOfficePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class WebNPLBackOfficeDef {
    public LoginWebNPLBackOfficePage loginWebNPLBackOfficePage;
    private WebDriver driver;
    private String url_NPLWebBackOffice = "https://d34iygdbaj3g1n.cloudfront.net/login";

    public WebNPLBackOfficeDef(SharedDriver driver) {
        this.driver = DriverFactory.getDriver();
        loginWebNPLBackOfficePage = new LoginWebNPLBackOfficePage(this.driver);
    }
    @Given("estoy en la pagina de inicio de copec NPL BackOffice")
    public void estoyEnLaPaginaDeInicioDeCopecNPLBackOffice() {
        driver.get(url_NPLWebBackOffice);
    }
    @When("hago click en el boton iniciar sesion NPL BackOffice")
    public void hagoClickEnElBotonIniciarSesionNPLBackOffice() throws InterruptedException {
        loginWebNPLBackOfficePage.ClickInicioSesionBackOffice();
    }
    @And("ingreso usuario {string} y su contrasena {string} de copec BackOffice")
    public void ingresoUsuarioYSuContrasenaDeCopecBackOffice(String User, String Pass) throws InterruptedException {
        loginWebNPLBackOfficePage.LoginNplBackoffice(User, Pass);
    }
    @And("se realiza la recepcion de solicitud en BackOffice {string} el {string}")
    public void seRealizaLaRecepcionDeSolicitudEnBackOfficeNroSolicitud(String NroSolicitud, String NroFrasco) throws InterruptedException {
        loginWebNPLBackOfficePage.clickTextRecepcionDeSolicitudes();
        loginWebNPLBackOfficePage.clickBotonRecibirSolicitudDeAnalisis();
        loginWebNPLBackOfficePage.sendKeysTextBoxNumeroDeSolicitudDeAnalisis(NroSolicitud);
        loginWebNPLBackOfficePage.clickBotonContinuar();
        loginWebNPLBackOfficePage.clickTextListTransportista();
        loginWebNPLBackOfficePage.clickTextList();
        loginWebNPLBackOfficePage.clickBotonRecibir();
        loginWebNPLBackOfficePage.clickTextRecepcionarFrasco();
        loginWebNPLBackOfficePage.sendKeysTextBoxNumeroFrasco(NroFrasco);
        loginWebNPLBackOfficePage.clickBotonContinuarNumeroFrasco();
        loginWebNPLBackOfficePage.clickTextListObservaciones();
        loginWebNPLBackOfficePage.clickTextSinObservaciones();
        loginWebNPLBackOfficePage.clickTextListSeleccionarUnLote();
        loginWebNPLBackOfficePage.clickTextNuevoLote();
        loginWebNPLBackOfficePage.clickBotonRecepcionarFrasco();
        loginWebNPLBackOfficePage.clickTextVerSolicitudDeAnalisis();
        loginWebNPLBackOfficePage.clickTextNumeroFrasco();
        loginWebNPLBackOfficePage.clickIconoXCerrarMuestra();
        loginWebNPLBackOfficePage.clickIconoCerrarSolicitudDeAnalisis();
    }

    @And("se realiza el envio del lote de analisis de la muestra")
    public void seRealizaElEnvioDelLoteDeAnalisisDeLaMuestra() throws InterruptedException {
        loginWebNPLBackOfficePage.clickTextLotesDeAnalisis();
        loginWebNPLBackOfficePage.clickTextSolicitudDeAnalisis();
        loginWebNPLBackOfficePage.clickCheckLoteDeAnalsis();
        loginWebNPLBackOfficePage.clickBotonEnviarLoteAlLaboratorio();
        loginWebNPLBackOfficePage.clickBotonSiEnviarLaboratorio();
    }
    @And("se ingresan los componentes a la mesutra uno x uno {string}")
    public void seIngresanLosComponentesALaMesutraUnoXUno(String NroResultado) throws InterruptedException {
        loginWebNPLBackOfficePage.clickTextEnAnalisis();
        loginWebNPLBackOfficePage.clickTextClienteLoteDeAnalisis();
        loginWebNPLBackOfficePage.clickTextMuestraNumeroLaboratorio();
        loginWebNPLBackOfficePage.clickIconoMasMuestrasPendientes();
        //loginWebNPLBackOfficePage.MuestrasPendientesIniciar(NroResultado);
        loginWebNPLBackOfficePage.clickIconoMenosMuestrasPendientes();
        loginWebNPLBackOfficePage.clickIconoXMuestra();
    }
    @And("se ingresan los componentes a la muestra uno x uno {string}")
    public void seIngresanLosComponentesALaMuestraUnoXUno(String NroResultado) throws InterruptedException {
        loginWebNPLBackOfficePage.clickTextEnAnalisis();
        loginWebNPLBackOfficePage.clickTextClienteLoteDeAnalisis();
        loginWebNPLBackOfficePage.clickTextMuestraNumeroLaboratorio();
        loginWebNPLBackOfficePage.clickIconoMasMuestrasPendientes();
        loginWebNPLBackOfficePage.MuestrasPendientesIniciar(NroResultado);
        loginWebNPLBackOfficePage.clickIconoMenosMuestrasPendientes();
        loginWebNPLBackOfficePage.clickIconoXMuestra();
    }
    @Then("se da click en menu muestras y se aprueba la muestra ingresada")
    public void seDaClickEnMenuMuestrasYSeApruebaLaMuestraIngresada() throws InterruptedException {
        loginWebNPLBackOfficePage.clickTextMuestras();
        loginWebNPLBackOfficePage.clickTextPorAprobar();
        loginWebNPLBackOfficePage.clickTextFrasco();
        loginWebNPLBackOfficePage.clickTextNumeroDeFrasco();
        loginWebNPLBackOfficePage.clickBotonAprobar();
        loginWebNPLBackOfficePage.getTextTextInformeAprobado();
        loginWebNPLBackOfficePage.clickIconoXPorAProbar();
    }
    @And("se da click en menu izquierdo mantenedores y luego en sub menu administradores de cliente")
    public void seDaClickEnMenuIzquierdoMantenedoresYLuegoEnSubMenuAdministradoresDeCliente() throws InterruptedException {
        loginWebNPLBackOfficePage.clickTextMantenedores();
        loginWebNPLBackOfficePage.clickTextSubMenuAdministradoresClientes();
    }
    @Then("se validan los siguientes campos del cliente")
    public void seValidanLosSiguientesCamposDelCliente() throws InterruptedException {
        loginWebNPLBackOfficePage.getTextCamposClientes();
    }
    @And("se busca el tipo de usuario {string}")
    public void seBuscaElTipoDeUsuario(String TipoUsuario) throws InterruptedException {
        loginWebNPLBackOfficePage.sendKeysIconoLupaCliente(TipoUsuario);
    }
    @Then("se valida el tipo de usuario el tipo de usuario y el deudor solicitante")
    public void seValidaElTipoDeUsuarioElTipoDeUsuarioYElDeudorSolicitante() throws InterruptedException {
        loginWebNPLBackOfficePage.getTextUsuarioyDeudor();
    }
    @And("se validan los siguientes campos del cliente BackOffice")
    public void seValidanLosSiguientesCamposDelClienteBackOffice() throws InterruptedException {
        loginWebNPLBackOfficePage.getTextCamposClientes();
    }
    @And("se valida el tipo de usuario el tipo de usuario y el deudor solicitante BackOffice")
    public void seValidaElTipoDeUsuarioElTipoDeUsuarioYElDeudorSolicitanteBackOffice() throws InterruptedException {
        loginWebNPLBackOfficePage.getTextUsuarioyDeudor();
    }
    @And("se da click en super administrador para editar y se busca {string}")
    public void seDaClickEnSuperAdministradorParaEditarYSeAgregaYSeBusca( String TipoUsuario) throws InterruptedException {
        loginWebNPLBackOfficePage.clickTextTipoUsuario();
        loginWebNPLBackOfficePage.clickIconoFlechaDeudorSolicitante();
        loginWebNPLBackOfficePage.clickTextListDeudor();
        loginWebNPLBackOfficePage.clickTextClienteDeudor();
        loginWebNPLBackOfficePage.clickTextListSolicitante();
        loginWebNPLBackOfficePage.clickSeleccionarTodo();
        loginWebNPLBackOfficePage.clickTextAgregarCliente();
        loginWebNPLBackOfficePage.clickBotonActualizarCliente();
        loginWebNPLBackOfficePage.sendKeysIconoLupaCliente(TipoUsuario);
        loginWebNPLBackOfficePage.sendKeysIconoLupaCliente(TipoUsuario);
    }
    @Then("se valida el deudor asociado al super administrador")
    public void seValidaElDeudorAsociadoAlSuperAdministrador() throws InterruptedException {
        loginWebNPLBackOfficePage.getTextDeudorSolicitanteAgregado();
    }
}