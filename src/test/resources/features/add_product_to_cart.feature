Feature: Agregar productos al carrito de compras

  Como usuario de Falabella
  Quiero buscar un producto y agregarlo al carrito de compras
  Para comprarlo posteriormente

  Scenario: Buscar un producto y agregarlo al carrito de compras
    Given el usuario está en la página principal de Falabella
    When el usuario busca un producto específico "televisor"
    And selecciona el producto deseado de la lista de resultados
    And agrega el producto al carrito de compras
    Then el producto debería estar en el carrito de compras