Feature: Pruebas funcionales requerimiento 07 Superusuario
  Como usuario quiero navegar por la aplicacion NPL

  Scenario Outline: Revisar Deudores en Mantenedor Administradores Clientes BackOffice
    Given estoy en la pagina de inicio de copec NPL BackOffice
    When hago click en el boton iniciar sesion NPL BackOffice
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec BackOffice
    And se da click en menu izquierdo mantenedores y luego en sub menu administradores de cliente
    Then se validan los siguientes campos del cliente
    And se busca el tipo de usuario "<TipoUsuario>"
    Then se valida el tipo de usuario el tipo de usuario y el deudor solicitante
    Examples:
      | User                            | Pass      | TipoUsuario |
      | sebastian.dominguez.ex@copec.cl | Copec000. | Mfs         |

  Scenario Outline: Asociar Deudores a Cliente en BackOffice
    Given estoy en la pagina de inicio de copec NPL BackOffice
    When hago click en el boton iniciar sesion NPL BackOffice
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec BackOffice
    And se da click en menu izquierdo mantenedores y luego en sub menu administradores de cliente
    And se validan los siguientes campos del cliente BackOffice
    And se busca el tipo de usuario "<TipoUsuario>"
    And se valida el tipo de usuario el tipo de usuario y el deudor solicitante BackOffice
    And se da click en super administrador para editar y se busca "<TipoUsuario>"
    Then se valida el deudor asociado al super administrador
    Examples:
      | User                            | Pass      | TipoUsuario |
      | sebastian.dominguez.ex@copec.cl | Copec000. | Mfs         |

  Scenario Outline: Cambiar Clientes y Faenas Web NPL
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se da click en boton cambiar cliente o faena
    Then se valida que se haya cambiado la faena de forma correcta
    Examples:
      | User                             | Pass      |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 |

  Scenario Outline: Editar Usuario Rol Super Administrador Web NPL
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se ingresa a administrar usuarios y se edita el usuario seleccionado "<Nombre>"
    Then se valida que se haya cambiado los campos correctamente
    Examples:
      | User                             | Pass      | Nombre     |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 | JaimePrueba|



  Scenario Outline: Crear Usuario con Rol Super Administrador Web NPL
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se ingresa a administrar usuarios y se edita el usuario seleccionado "<Nombre>"
    Then se valida que se haya cambiado los campos correctamente
    Examples:
      | User                             | Pass      | Nombre       | Apellido       |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 | NombrePrueba | ApellidoPrueba |

  Scenario Outline: Editar Perfil Usuario Rol Super Administrador Web NPL
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se ingresa a administrar usuarios y se edita el usuario seleccionado "<Nombre>"
    Then se valida que se haya cambiado los campos correctamente
    Examples:
      | User                             | Pass      | Nombre  |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 | Prueba2 |

  Scenario Outline: Revisar Perfil Usuario Deudores y Faenas Rol Super Administrador Web NPL
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se ingresa a administrar usuarios y se edita el usuario seleccionado "<Nombre>"
    Then se valida que se haya cambiado los campos correctamente
    Examples:
      | User                             | Pass      |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 |