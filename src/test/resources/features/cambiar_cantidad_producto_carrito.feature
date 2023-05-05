Feature: Cambiar la cantidad de un producto en el carrito de compras en Falabella.com.co

  Scenario: Cambiar la cantidad de un producto en el carrito de compras
    Given un usuario ha añadido un producto al carrito de compras
    When el usuario cambia la cantidad del producto en el carrito a "2"
    Then la cantidad del producto en el carrito se actualiza a "2" y el precio total se ajusta en consecuencia
