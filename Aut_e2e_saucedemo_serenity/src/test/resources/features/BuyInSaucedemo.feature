Feature: Op2 Automatizacion (Prueba E2E) de un flujo de compra en la página saucedemo

  Background:
   # Given what the user enter to page https://www.saucedemo.com/
   
    Scenario: Buy products in Store
    Given what standard_user enter to the home page
    When he add two products to the cart
    And he view to the cart
    Then he complete the purchase form
    And he finish Checkout
