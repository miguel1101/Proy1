Feature: Ejemplo Web My Store

  @CP01
  Scenario Outline: Ingreso de correo para registro en web My Store
    Given   Ingreso a la web My Store
    When    doy click en el botón Sign In
    And     Ingreso mi correo "<email>"
    And     doy click en el botón crear cuenta
    Then    valido el formulario

      Examples:
      |email           |
      |tsoft1@gmail.com|


  @CP02
  Scenario Outline: Registro en Web MyStore
    Given   Ingreso a la web My Store
    When    registro del correo "<email>"
    And     lleno el formulario con mis datos personales "<titulo>" "<nombres>" "<apellidos>" "<clave>"
    And     lleno la fecha de nacimiento "<dia>" "<mes>" "<anio>"
    And     ingreso los datos de la dirección "<cia>" "<direccion>" "<ciudad>" "<estado>" "<cod_postal>"
    And     ingreso mi "<cel>" "<ref>"
    Then    doy click en registrar y verifico mensaje validador

      Examples:
    |email                 |titulo  |nombres |apellidos  |clave|dia|mes|anio  |cia   |direccion              |ciudad |estado   |cod_postal|cel         |ref                     |
    |tsoft09@tsoftlatam.com|Hombre  |Miguel  |Carranza   |12345|27 |7  |2000  |TSOFT |Dionisio derteano 168  |Lima   |Texas    |16513     |990444333   |al frente de la polleria|