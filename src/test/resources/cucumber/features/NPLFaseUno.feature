Feature: Pruebas funcionales de la fase uno en NPL
  Como usuario quiero navegar por la aplicacion NPL

  Scenario Outline: Muestras Ingreso Muestra Backoffice Para Aprobar Nueva Plataforma Laboratorio
    Given estoy en la pagina de inicio de copec NPL BackOffice
    When hago click en el boton iniciar sesion NPL BackOffice
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec BackOffice
    And se realiza la recepcion de solicitud en BackOffice "<NroSolicitud>" el "<NroFrasco>"
    And se realiza el envio del lote de analisis de la muestra
    And se ingresan los componentes a la muestra uno x uno "<NroResultado>"
    Then se da click en menu muestras y se aprueba la muestra ingresada
    Examples:
      | User                            | Pass      | NroSolicitud | NroFrasco | NroResultado |
      | sebastian.dominguez.ex@copec.cl | Copec000. | 2285         | 199801651 | 1            |

  Scenario Outline: Muestras Ingreso Muestra Web Con Envio De Muestra A Backoffice En Nueva Plataforma Laboratorio
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se realiza el ingreso de la muestra con sus respectivos campos: "<NroComponente>", "<NroEnvase>" y la "<FechaTomaMuestra>"
    And se realiza el envio de la muestra
    Then se valida la descarga de la solicitud de la muestra
    Examples:
      | User                             | Pass      | NroComponente | NroEnvase | FechaTomaMuestra |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 | md            | 199801651 | 07062023         |

  Scenario Outline: Muestras Ingreso Muestra Web Con Muestra Aprobada En Nueva Plataforma Laboratorio
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And Se ingresa al menu muestras y solicitudes se busca por "<NroFrasco>"
    Then se valida la descarga de la muestra aprobada en BackOffice
    Examples:
      | User                             | Pass      | NroFrasco |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 | 199801651 |

  Scenario Outline: Muestras Ingreso Muestra Web y Backoffice En Nueva Plataforma Laboratorio
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se realiza el ingreso de la muestra con sus respectivos campos: "<NroComponente>", "<NroEnvase>" y la "<FechaTomaMuestra>"
    And se realiza el envio de la muestra
    Then se valida la descarga de la solicitud de la muestra
    Given estoy en la pagina de inicio de copec NPL BackOffice
    When hago click en el boton iniciar sesion NPL BackOffice
    And ingreso usuario "<User2>" y su contrasena "<Pass2>" de copec BackOffice
    And se realiza la recepcion de solicitud en BackOffice "<NroSolicitud>" el "<NroFrasco>"
    And se realiza el envio del lote de analisis de la muestra
    And se ingresan los componentes a la muestra uno x uno "<NroResultado>"
    Then se da click en menu muestras y se aprueba la muestra ingresada
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And Se ingresa al menu muestras y solicitudes se busca por "<NroFrasco2>"
    Then se valida la descarga de la muestra aprobada en BackOffice
    Examples:
      | User                             | Pass      | NroComponente | NroEnvase | FechaTomaMuestra | User2                           | Pass2     | NroSolicitud | NroFrasco | NroResultado | NroFrasco2 |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 | md            | 199801651 | 07062023         | sebastian.dominguez.ex@copec.cl | Copec000. | 2285         | 199801651 | 1            | 199801651  |

  Scenario Outline: Muestras Ingreso Muestra Web y Backoffice En Nueva Plataforma Laboratorio Icono Box
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se realiza el ingreso de la muestra desde el icono box con sus respectivos campos: "<NroComponente>", "<NroEnvase>" y la "<FechaTomaMuestra>"
    And se realiza el envio de la muestra
    Then se valida la descarga de la solicitud de la muestra
    Given estoy en la pagina de inicio de copec NPL BackOffice
    When hago click en el boton iniciar sesion NPL BackOffice
    And ingreso usuario "<User2>" y su contrasena "<Pass2>" de copec BackOffice
    And se realiza la recepcion de solicitud en BackOffice "<NroSolicitud>" el "<NroFrasco>"
    And se realiza el envio del lote de analisis de la muestra
    And se ingresan los componentes a la muestra uno x uno "<NroResultado>"
    Then se da click en menu muestras y se aprueba la muestra ingresada
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And Se ingresa al menu muestras y solicitudes se busca por "<NroFrasco2>"
    Then se valida la descarga de la muestra aprobada en BackOffice
    Examples:
      | User                             | Pass      | NroComponente | NroEnvase | FechaTomaMuestra | User2                           | Pass2     | NroSolicitud | NroFrasco | NroResultado | NroFrasco2 |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 | md            | 199801651 | 07062023         | sebastian.dominguez.ex@copec.cl | Copec000. | 2285         | 199801651 | 1            | 199801651  |

  Scenario Outline: Muestras Ingreso Muestra Web y Backoffice En Nueva Plataforma Laboratorio Icono Ingresar Muestra Desde Menu
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se realiza el ingreso de la muestra desde el icono ingresar muestra con sus respectivos campos: "<NroComponente>", "<NroEnvase>" y la "<FechaTomaMuestra>"
    And se realiza el envio de la muestra
    Then se valida la descarga de la solicitud de la muestra
    Given estoy en la pagina de inicio de copec NPL BackOffice
    When hago click en el boton iniciar sesion NPL BackOffice
    And ingreso usuario "<User2>" y su contrasena "<Pass2>" de copec BackOffice
    And se realiza la recepcion de solicitud en BackOffice "<NroSolicitud>" el "<NroFrasco>"
    And se realiza el envio del lote de analisis de la muestra
    And se ingresan los componentes a la muestra uno x uno "<NroResultado>"
    Then se da click en menu muestras y se aprueba la muestra ingresada
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And Se ingresa al menu muestras y solicitudes se busca por "<NroFrasco2>"
    Then se valida la descarga de la muestra aprobada en BackOffice
    Examples:
      | User                             | Pass      | NroComponente | NroEnvase | FechaTomaMuestra | User2                           | Pass2     | NroSolicitud | NroFrasco | NroResultado | NroFrasco2 |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 | md            | 199801651 | 07062023         | sebastian.dominguez.ex@copec.cl | Copec000. | 2285         | 199801651 | 1            | 199801651  |

  Scenario Outline: Muestras Ingreso Muestra Web y Backoffice En Nueva Plataforma Laboratorio Mas Ingresar Muestra
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And se realiza el ingreso de la muestra desde el icono mas agregar muestra con sus respectivos campos: "<NroComponente>", "<NroEnvase>" y la "<FechaTomaMuestra>"
    And se realiza el envio de la muestra
    Then se valida la descarga de la solicitud de la muestra
    Given estoy en la pagina de inicio de copec NPL BackOffice
    When hago click en el boton iniciar sesion NPL BackOffice
    And ingreso usuario "<User2>" y su contrasena "<Pass2>" de copec BackOffice
    And se realiza la recepcion de solicitud en BackOffice "<NroSolicitud>" el "<NroFrasco>"
    And se realiza el envio del lote de analisis de la muestra
    And se ingresan los componentes a la muestra uno x uno "<NroResultado>"
    Then se da click en menu muestras y se aprueba la muestra ingresada
    Given estoy en la pagina de inicio de copec NPL Web
    When hago click en el boton iniciar sesion NPL Web
    And ingreso usuario "<User>" y su contrasena "<Pass>" de copec Web
    And selecciona faena correspondiente cargada al cliente y se da click en ingresar
    And Se ingresa al menu muestras y solicitudes se busca por "<NroFrasco2>"
    Then se valida la descarga de la muestra aprobada en BackOffice
    Examples:
      | User                             | Pass      | NroComponente | NroEnvase | FechaTomaMuestra | User2                           | Pass2     | NroSolicitud | NroFrasco | NroResultado | NroFrasco2 |
      | MARCELOFUENZALIDASILVA@GMAIL.COM | copec2022 | md            | 199801651 | 07062023         | sebastian.dominguez.ex@copec.cl | Copec000. | 2285         | 199801651 | 1            | 199801651  |
