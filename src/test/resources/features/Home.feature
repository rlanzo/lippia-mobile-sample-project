Feature: El usuario se encuentra en el Home

  Scenario Outline: El usuario edita un proyecto deshabilita/habilita billable
    When el usuario ingresa los datos para acceder: mail<email> y password <password>
    When el usuario hace click en el Menu Hamburguesa
    When el usuario hace click en Proyect
    And el usuario hace click en seleccionar Proyect
    When el usuario hace click en deshabilitaHabilita Billable
    Then el usuario deshabilita Habilita y vuelve al menu del proyecto, visualiza nuevamente su nombre <texto>

    Examples:
      | email                   | password   | texto   |
      | romina.dilanzo@gire.com | Romina1234 | Romina1 |
