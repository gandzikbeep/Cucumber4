Feature:  Search and place order for Vegetables

  Scenario: Search for items and validate results
    Given User is on Greencart Landing page
    When User searched for Beetroot Vegetable
    Then "Beetroot" results are displayed

  Scenario Outline: Search for items and then move to checkout page
    Given User is on Greencart Landing page
    When User searched for <Name> Vegetable
    And Added items to cart
    And User proceeded to Checkout page for purchase
    Then verify selected <Name> items are displayed in Check out page

    Examples:
      |Name	 |
      |Brinjal |
#      |Beetroot|