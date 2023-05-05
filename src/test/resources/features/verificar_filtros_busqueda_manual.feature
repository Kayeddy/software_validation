Feature: Verificar la funcionalidad de los filtros de búsqueda de productos en Falabella.com.co

  @manual
  Scenario: Verificar la funcionalidad de los filtros de búsqueda de productos en la página de resultados
    Given un usuario realiza una búsqueda de productos en Falabella.com.co
    When el usuario aplica un filtro de búsqueda, como "Marca" o "Rango de precios"
    Then los resultados de búsqueda se actualizan de acuerdo con los filtros aplicados
    And los filtros aplicados se muestran en la sección de filtros activos
