Feature: Filtrar productos por categoría en Falabella.com.co

  Scenario: Filtrar productos en la categoría de Tecnología
    Given un usuario está en la página principal de Falabella.com.co
    When el usuario selecciona la categoría "Tecnología" en el menú principal
    Then se muestra una lista de productos de la categoría "Tecnología"
