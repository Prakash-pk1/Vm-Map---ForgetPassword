Feature: Verify the Forget Password functionality of VM Maps Account

Scenario: User click ForgetPassword button with Email

Given User is on VM Maps acoount Sign In page

When User enter valid email and invalid password

Then User click Login button

And User Should see the Invalid parameter message

And User forget the login password then click ForgetPassword button

Then User Should see the OTP Verify for Email page

Scenario: User click ForgetPassword button with Invalid Email

Given User is on VM Maps acoount Sign In page

When User enter Invalid email and Random password

Then User click Login button

And User Should see the Invalid parameter message

And User click ForgetPassword button

Then User Should see the fail message
