Feature: Booking Management API Testing

  Background:
    # Define the base URL for all scenarios
    * url 'http://127.0.0.1:8900/booking'

  Scenario: Create a new booking
    Given path ''
    And request
      """
      {
        "date": "2024-11-20",
        "destination": "JFK",
        "origin": "LHR",
        "userId": 1
      }
      """
    When method POST
    Then status 201
    And match response == { id: '#number' }

  Scenario: Get all bookings for a user
    Given path ''
    And param user = 1
    When method GET
    Then status 200
    And match response == '#[]'

  Scenario: Get a booking by ID
    Given path '1'
    When method GET
    Then status 200
    And match response ==
      """
      {
        "id": 1,
        "date": "2024-11-20",
        "destination": "JFK",
        "origin": "LHR",
        "userId": 1
      }
      """
