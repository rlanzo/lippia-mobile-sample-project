Feature: El usuario se loguea a la aplicacion y realiza diferentes actividades

  Scenario Outline: El usuario hace el login a la aplicacion.
    When el usuario ingresa los datos para acceder: mail<email> y password <password>
    Then el usuario se encuentra logueado y ve el titulo <texto>

    @romis
    Examples:
      | email                   | password   | texto        |
      | romina.dilanzo@gire.com | Romina1234 | Time entries |
