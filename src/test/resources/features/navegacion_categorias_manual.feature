Feature: Verificar la navegación entre categorías de productos en Falabella.com.co

  @manual
  Scenario: Verificar la navegación entre categorías de productos
    Given un usuario navega por el sitio web de Falabella.com.co
    When el usuario selecciona una categoría de productos en el menú principal
    Then la página de la categoría seleccionada se muestra con los productos correspondientes
