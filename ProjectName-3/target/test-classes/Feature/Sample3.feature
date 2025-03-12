Feature:

Scenario: To check Login functionality of the application
    Given User opens the Browser
    And User navigates to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" the webpage
    When User Enters Login Credentials
    |TestData.xlsx|
    And User Clicks login button
    Then User checks the functionality of login
    And User closes the browser
    
    
