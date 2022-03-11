Feature: OpenCart Login Function 
 
    Scenario: Valid Login
    Given User is on Homepage
    And User Navigates to Login Page
    When User enters "trainer1@rjpinfotek.com" and "testuser"
    Then User Navigate to My Account Page

	Scenario: Search Item
    Given Should display My Account Page
    When User search an Item
    		| phone |
    Then Should display search result page 
    
	Scenario: Add to cart
    Given Should display search result page
    And User Add Item to cart
    Then Item must be available in Cart  
    
 