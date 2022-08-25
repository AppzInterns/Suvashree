Feature: Biskane user journey

 @BiskaneHomepage
 Scenario: Verify Biskane home page
 Given Lunch chrome browser
 When User open biskane url 
 And Print Current URL
 Then Validate the home page logo
 When Print all the menu links
 And Click on shop now
 Then Verify that url gets displayed
 And Print the url
 Then Verify the title of this page 
 And Navigate back to home page
 When Click on Search and enter text
 And Click on the search result
 Then Verify the name
 #And Close the browser
 
 @BiskaneSignup
 Scenario: Verify Biskane Signup
 Given Lunch chrome browser
 When User open biskane url 
 And Mouse hover on sign up menu
 When Click on Customer Signup link in Sign up dropdown
 Then Verify user is redirected to Customer Sign Up screen
 And Verify the form fields
 When Enter data in to First Name,Last Name and Email field
 Then Verify user is able to input data in First Name,Last Name and Email
 When User enter data in Password and Confirm Password
 Then Verify the password and confirm password field
 When Click on I agree to The Terms of Service button
 #Then Verify Sign up button is clickable or not
 When Enter data in to Contact Number field
 Then Verify data is entering or not
 
 #@BiskaneSignupPage
 Scenario: Verify validation message when user dont enter data in First Name field.
 Given Lunch chrome browser
 When User open biskane url 
 And Mouse hover on sign up menu
 When Click on Customer Signup link in Sign up dropdown
 Then Verify user is redirected to Customer Sign Up screen
 When User Dont enter data in First Name field
 #Then Verify the required validation message

 
 
 
 
 