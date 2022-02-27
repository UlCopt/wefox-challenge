Feature: Search and add a product to the cart

  Background:
    Given I navigate to Lego Store

  Scenario Outline: Search a product and add it to the cart
    When I search a product with <textSuggestion> and select the product with <name>
    Then I add to the cart
    Examples:
      |textSuggestion|name|
      |bb-8          |Llavero de BB-8|
