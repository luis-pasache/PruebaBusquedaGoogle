Feature: Funcionalidad entrar ultimo link de una busqueda en google
  Scenario: Realizar la busqueda
    Given estando en la pagina de busqueda
    When ingresa y realiza la busqueda "automatizacion"
    Then entramos al ultimo link