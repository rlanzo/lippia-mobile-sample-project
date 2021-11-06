Feature: El usuario se encuentra en el Home

  Scenario Outline: El usuario edita un proyecto deshabilita/habilita billable
    When el usuario ingresa los datos para acceder: mail<email> y password <password>
    When el usuario hace click en el Menu Hamburguesa
    When el usuario hace click en el boton de Time Tracker
    When el usuario hace click en Agregar Tarea
    And el usuario completa el Add Entry <Hora>,<miniuto>,<Hora1>,<Minuto1>
    And el usuario selecciona el project a donde se van agregar las horas
    And el usuario completa el nombre de las horas <nombreHoras>
    Then el usuario observa la tarea creada <nombreHoras>

    @romis
    Examples:
      | email                   | password   | Hora | miniuto | Hora1 | Minuto1 | nombreHoras     |
      | romina.dilanzo@gire.com | Romina1234 | 11   | 20      | 20    | 20      | Horas cargas OK |
