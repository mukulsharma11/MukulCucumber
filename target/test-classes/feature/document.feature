Feature: Amazon Document
  I want to use this document to test amazon
  
  @login
  Scenario: validate userid
    Given I want to open "chrome" with url "https://www.amazon.in"
    And click sign in
    When I enter valid usereid "9810926239"
    And click continue buton
    Then I should get password textbox
   
  @login 
  Scenario: validate password
    Given userid is valid
    When i enter password "RMinfotech12#"
    Then i should login
  
    @search
    Scenario Outline: Search Products
     Given browser "chrome" is open with url "https://www.amazon.in"
     When i search for <product> in price <price>
     Then results must come
     
     Examples:
     | product | price |
     | shirt | 600 |
     | pant | 1200 |
     | tie | 700 |