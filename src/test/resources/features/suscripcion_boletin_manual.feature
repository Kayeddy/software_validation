Feature: Verificar el proceso de suscripción al boletín de noticias en Falabella.com.co

  @manual
  Scenario: Verificar el proceso de suscripción al boletín de noticias
    Given un usuario desea suscribirse al boletín de noticias
    When el usuario ingresa su correo electrónico en la sección de suscripción al boletín
    Then el usuario recibe un correo electrónico de confirmación de suscripción al boletín
