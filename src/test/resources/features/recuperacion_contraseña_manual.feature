Feature: Verificar el proceso de recuperación de contraseña en Falabella.com.co

  @manual
  Scenario: Verificar el proceso de recuperación de contraseña
    Given un usuario ha olvidado su contraseña
    When el usuario ingresa su correo electrónico en la página de recuperación de contraseña
    Then el usuario recibe un correo electrónico con instrucciones para restablecer su contraseña
