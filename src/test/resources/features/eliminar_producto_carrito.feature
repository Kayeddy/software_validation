Feature: Eliminar un producto del carrito de compras en Falabella.com.co

  Scenario: Eliminar un producto del carrito de compras
    Given un usuario ha añadido un producto al carrito de compras
    When el usuario elimina el producto del carrito
    Then el producto es eliminado del carrito y el carrito se actualiza
