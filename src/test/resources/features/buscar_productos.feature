Feature: Realizar una búsqueda de productos en Falabella.com.co

  Scenario: Buscar productos por término de búsqueda
    Given un usuario está en la página principal de Falabella.com.co
    When el usuario introduce un término de búsqueda "televisor" en la barra de búsqueda y presiona Enter
    Then se muestra una lista de resultados relacionados con el término de búsqueda "televisor"
