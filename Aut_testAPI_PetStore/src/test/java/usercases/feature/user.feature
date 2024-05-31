Feature: API PetStore HappyPath with karate test
  Background:
    * url 'https://petstore.swagger.io/v2/user'
    * def jsonRequest = read('../json/user_new.json')
    * def jsonRequest2 = read('../json/user_update.json')
    * def jsonResponse = read('../json/message_new_user.json')
    * def jsonResponse2 = read('../json/message_delete_user.json')

  Scenario: Crear un usuario en la tienda
    * print 'user is: ', jsonRequest
    Given url 'https://petstore.swagger.io/v2/user'
    And request jsonRequest
    When method post
    Then status 200
    And match response contains jsonResponse

  Scenario: Buscar un usuario creado
    * print 'username is: ', jsonRequest.username
    Given path jsonRequest.username
    When method get
    Then status 200
    And match response contains jsonRequest

  Scenario: Actualizar el usuario ingresado su nombre y correo
    * print 'user update is: ', jsonRequest2
    Given path jsonRequest.username
    And request jsonRequest2
    When method put
    Then status 200
    And match response contains jsonResponse

  Scenario: Buscar el usuario actualizado
    * print 'usernameUpdate is: ', jsonRequest2.username
    Given path jsonRequest2.username
    When method get
    Then status 200
    And match response contains jsonRequest2

  Scenario: Eliminar el usuario actualizado
    * print 'user is: ', jsonRequest2.status
    Given path jsonRequest2.username
    When method delete
    Then status 200
    And match response contains jsonResponse2