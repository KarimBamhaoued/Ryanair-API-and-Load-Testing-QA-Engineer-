Feature: User Management

  Background:
    # Define the base URL for all scenarios related to user management
    * url 'http://127.0.0.1:8900/user'

  Scenario: Create a new user
    Given path ''
    And request
      """
      {
        "email": "user@example.com",
        "name": "John",
        "surname": "Doe"
      }
      """
    When method post
    Then status 201
    And match response ==
      """
      {
        "email": "user@example.com",
        "name": "John",
        "surname": "Doe",
        "id": '#number'
      }
      """

  Scenario: Get all users
    Given path ''
    When method get
    Then status 200
    And match response == '#[]'

  Scenario: Get a user by ID
    Given path '1'
    When method get
    Then status 200
    And match response ==
      """
      {
        "id": 1,
        "email": "user@example.com",
        "name": "John",
        "surname": "Doe"
      }
      """
