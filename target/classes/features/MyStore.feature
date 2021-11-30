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
    And     ingreso los datos de la dirección "<cia>" "<direccion1>" "<direccion2>" "<ciudad>" "<estado>" "<cod_postal>"
    And     ingreso mi "<infoad>" "<tefcasa>" "<cel>" "<ref>"
    Then    doy click en registrar y verifico mensaje validador

      Examples:
    |email                 |titulo  |nombres |apellidos  |clave|dia|mes|anio  |cia   |direccion1             |direccion2          | ciudad |estado  |cod_postal|infoad    |tefcasa  |cel         |ref                     |
    |tsoft17@tsoftlatam.com|Hombre  |Miguel  |Carranza   |12345|27 |7  |2000  |TSOFT |Dionisio derteano 168  |Embarcadero 11      |Lima    |Texas   |16513     |casa verde|012987654|990444333   |al frente de la polleria|