Feature: API PetStore HappyPath with karate test
  Background:
    * url 'https://petstore.swagger.io/v2/user'
    * def jsonRequest = read('../json/user_new.json')
    * def jsonRequest2 = read('../json/user_update.json')
    * def jsonResponse3 = read('../json/message_404_notfounduser.json')

  Scenario: Buscar un usuario no existente error response code
    * print 'username is: ', jsonRequest.username
    Given path "testnot"
    When method get
    Then status 404
    And match response contains jsonResponse3

  Scenario: Buscar un usuario no existente error code
    * print 'username is: ', jsonRequest.username
    Given path "%$^$#$)-_("
    When method get
    Then status 400

  Scenario: Actualizar usuario no existente error response code
    * print 'user update is: ', jsonRequest2
    Given path "testnotexist"
    And request jsonRequest2
    When method put
    Then status 404
    And match response contains jsonResponse3

  Scenario: Eliminar usuario no existente error no muestra response
    Given path "testnotexist"
    When method delete
    Then status 404
    And match response contains jsonResponse3