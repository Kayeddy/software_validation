Feature: Verificar la funcionalidad de seguimiento de pedidos en Falabella.com.co

  @manual
  Scenario: Verificar la funcionalidad de seguimiento de pedidos
    Given un usuario ha realizado un pedido en Falabella.com.co
    When el usuario ingresa el número de pedido en la sección de seguimiento de pedidos
    Then el usuario puede ver el estado actual y el historial del pedido
