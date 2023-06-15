package cucumber.definitions;

import cucumber.driver.DriverFactory;
import cucumber.driver.SharedDriver;
import cucumber.pages.LoginWebNPLPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class WebNPLDef {
    public LoginWebNPLPage loginWebNPLPage;
    private WebDriver driver;
    private String url_NPLWeb = "https://d3ho58rvzc7d2t.cloudfront.net/login?returnUrl=%2Fhome";

    public WebNPLDef(SharedDriver driver) {
        this.driver = DriverFactory.getDriver();
        loginWebNPLPage = new LoginWebNPLPage(this.driver);
    }
    @Given("estoy en la pagina de inicio de copec NPL Web")
    public void estoyEnLaPaginaDeInicioDeCopecNPLWeb() {
        driver.get(url_NPLWeb);
    }
    @When("hago click en el boton iniciar sesion NPL Web")
    public void hagoClickEnElBotonIniciarSesionNPLWeb() throws InterruptedException {
        loginWebNPLPage.ClickInicioSesionWeb();
    }
    @And("ingreso usuario {string} y su contrasena {string} de copec Web")
    public void ingresoUsuarioYSuContrasenaDeCopecWeb(String User, String Pass) throws InterruptedException {
        loginWebNPLPage.LoginNplWeb(User, Pass);
    }
    @And("selecciona faena correspondiente cargada al cliente y se da click en ingresar")
    public void seleccionaFaenaCorrespondienteCargadaAlClienteYSeDaClickEnIngresar() throws InterruptedException {
        loginWebNPLPage.clickTextListFaena();
        loginWebNPLPage.clickBotonIngresarFaena();
    }
    @And("se realiza el ingreso de la muestra con sus respectivos campos: {string}, {string} y la {string}")
    public void seRealizaElIngresoDeLaMuestraConSusRespectivosCamposYLa(String NroComponente, String NroEnvase, String FechaTomaMuestra) throws InterruptedException {
        loginWebNPLPage.clickMuestras();
        loginWebNPLPage.SendKeysTexBoxComponente(NroComponente);
        loginWebNPLPage.clickIconoLupaBuscarComponente();
        loginWebNPLPage.clickTextAgregarMuestra();
        loginWebNPLPage.SendKeysTexboxNumeroEnvaseMuestra(NroEnvase);
        loginWebNPLPage.SendKeysTexBoxFechaTomaMuestra(FechaTomaMuestra);
        loginWebNPLPage.ScrollPages();
        loginWebNPLPage.clickBotonIngresarMuestra();
    }
    @And("se realiza el ingreso de la muestra desde el icono box con sus respectivos campos: {string}, {string} y la {string}")
    public void seRealizaElIngresoDeLaMuestraDesdeElIconoBoxConSusRespectivosCamposYLa(String NroComponente, String NroEnvase, String FechaTomaMuestra) throws InterruptedException {
        loginWebNPLPage.clickBotonIconoBoxAgregarMuestra();
        loginWebNPLPage.SendKeysTexBoxComponente(NroComponente);
        loginWebNPLPage.clickIconoLupaBuscarComponente();
        loginWebNPLPage.clickTextAgregarMuestra();
        loginWebNPLPage.SendKeysTexboxNumeroEnvaseMuestra(NroEnvase);
        loginWebNPLPage.SendKeysTexBoxFechaTomaMuestra(FechaTomaMuestra);
        loginWebNPLPage.ScrollPages();
        loginWebNPLPage.clickBotonIngresarMuestra();
    }
    @And("se realiza el ingreso de la muestra desde el icono ingresar muestra con sus respectivos campos: {string}, {string} y la {string}")
    public void seRealizaElIngresoDeLaMuestraDesdeElIconoIngresarMuestraConSusRespectivosCamposYLa(String NroComponente, String NroEnvase, String FechaTomaMuestra) throws InterruptedException {
        loginWebNPLPage.clickBotonMenuAgregarMuestra();
        loginWebNPLPage.SendKeysTexBoxComponente(NroComponente);
        loginWebNPLPage.clickIconoLupaBuscarComponente();
        loginWebNPLPage.clickTextAgregarMuestra();
        loginWebNPLPage.SendKeysTexboxNumeroEnvaseMuestra(NroEnvase);
        loginWebNPLPage.SendKeysTexBoxFechaTomaMuestra(FechaTomaMuestra);
        loginWebNPLPage.ScrollPages();
        loginWebNPLPage.clickBotonIngresarMuestra();
    }
    @And("se realiza el ingreso de la muestra desde el icono mas agregar muestra con sus respectivos campos: {string}, {string} y la {string}")
    public void seRealizaElIngresoDeLaMuestraDesdeElIconoMasAgregarMuestraConSusRespectivosCamposYLa(String NroComponente, String NroEnvase, String FechaTomaMuestra) throws InterruptedException {
        loginWebNPLPage.clickBotonIconoMasAgregarMuestra();
        loginWebNPLPage.SendKeysTexBoxComponente(NroComponente);
        loginWebNPLPage.clickIconoLupaBuscarComponente();
        loginWebNPLPage.clickTextAgregarMuestra();
        loginWebNPLPage.SendKeysTexboxNumeroEnvaseMuestra(NroEnvase);
        loginWebNPLPage.SendKeysTexBoxFechaTomaMuestra(FechaTomaMuestra);
        loginWebNPLPage.ScrollPages();
        loginWebNPLPage.clickBotonIngresarMuestra();
    }
    @And("se realiza el envio de la muestra")
    public void seRealizaElEnvioDeLaMuestra() throws InterruptedException {
        loginWebNPLPage.clickBotonIrALaCajaDeMuestra();
        loginWebNPLPage.clickBotonEnviarLasUnaMuestra();
        loginWebNPLPage.clickBotonSiEnviar();
    }
    @Then("se valida la descarga de la solicitud de la muestra")
    public void seValidaLaDescargaDeLaSolicitudDeLaMuestra() throws InterruptedException {
        loginWebNPLPage.getTextTextLaCajaDeMuestra();
        loginWebNPLPage.clickBotonDescargarSolicitud();
    }

    @And("Se ingresa al menu muestras y solicitudes se busca por {string}")
    public void seIngresaAlMenuMuestrasYSolicitudesSeBuscaPor(String NroFrasco) throws InterruptedException {
        loginWebNPLPage.clickTextMuestrasYSolicitudes();
        loginWebNPLPage.SendKeysTextBoxBuscarPorNumeroFrasco(NroFrasco);
        loginWebNPLPage.clickIconoLupa();
    }
    @Then("se valida la descarga de la muestra aprobada en BackOffice")
    public void seValidaLaDescargaDeLaMuestraAprobadaEnBackOffice() throws InterruptedException {
        loginWebNPLPage.clickIconoTresPuntos();
        loginWebNPLPage.clickTextDescargarInforme();
    }

    @And("se da click en boton cambiar cliente o faena")
    public void seDaClickEnBotonCambiarClienteOFaena() throws InterruptedException {
        loginWebNPLPage.clickBotonCambiarClienteFaena();
        loginWebNPLPage.clickTextListFaenaCambio();
        loginWebNPLPage.clickBotonIngresarFaena();
    }

    @Then("se valida que se haya cambiado la faena de forma correcta")
    public void seValidaQueSeHayaCambiadoLaFaenaDeFormaCorrecta() throws InterruptedException {
        loginWebNPLPage.getTextTextIngresaste();
        loginWebNPLPage.clickTextMenuMuestras();
        loginWebNPLPage.clickTextMenuEquiposyComponentes();
        loginWebNPLPage.clickTextMenuMuestrasySolicitudes();
        loginWebNPLPage.clickTextMenuReportes();
    }
    @And("se ingresa a administrar usuarios y se edita el usuario seleccionado {string}")
    public void seIngresaAAdministrarUsuariosYSeEditaElUsuarioSeleccionado(String Nombre) throws InterruptedException {
        loginWebNPLPage.clickIconoUsuario();
        loginWebNPLPage.clickTextAdministracionUsuarios();
        loginWebNPLPage.clickIconoLapizEditarUsuario();
        loginWebNPLPage.sendKeysTextEditarNombre(Nombre);
        loginWebNPLPage.clickTextListFaenaEditar();
        loginWebNPLPage.clickFaenaEditar();
        loginWebNPLPage.clickBotonGuardarCambios();
    }
    @Then("se valida que se haya cambiado los campos correctamente")
    public void seValidaQueSeHayaCambiadoLosCamposCorrectamente() throws InterruptedException {
        loginWebNPLPage.getTextTextNombreCambio();
    }
}
