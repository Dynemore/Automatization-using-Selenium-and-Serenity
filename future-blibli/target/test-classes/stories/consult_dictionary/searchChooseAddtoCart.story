Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Go to blibli homepage and Login
Given open home page
When I login to blibli
Then I can see my name in the site

Given Already Logged in
When I search product 'beras' on search column
And I choose product of the first column
And I add the product to the bag
Then I see my bag contained

Given Continue to pay
When insert BCA klik user id
Then I see thank you page