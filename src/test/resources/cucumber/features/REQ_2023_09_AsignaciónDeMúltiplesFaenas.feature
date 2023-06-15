Feature: Ejemplo de navegacion
  Como usuario quiero navegar por la aplicacion

  Scenario Outline: Navegacion de ejemplo
    Given estoy en la pagina de inicio de copec
    When hago click en el boton iniciar sesion
    And ingreso mi numero de telefono "<num>"
    Then el boton Siguiente se activa
    Examples:
      | num      |
      | 12345678 |