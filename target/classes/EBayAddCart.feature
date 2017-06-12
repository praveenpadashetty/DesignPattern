@EBayFeature
Feature: Test EBay add to cart feature 
Background: Launch application 
	Given Launch the ebay application "http://www.ebay.in/" 
	Then Verify that page is launched 
	
Scenario: Search the item 
	When  Search for the item "iphone 6" 
	Then  Select any item and add to cart 
	Then  Verify add cart for the added item 
	
Scenario Outline: Search few more items 
	When  Search for the item "<item>" 
	Then  Select any item and add to cart 
	Then  Verify add cart for the added item 
	
	Examples: 
		|item|
		|iphone 6S|
		|iphone 7|