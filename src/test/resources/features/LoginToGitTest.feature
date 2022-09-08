Feature: Test scenario for Git

  Scenario: Login to Github

    Given User is on "Login Page"

    When User enters username as "shibiza" and password on "Login Page"

    Then User is successfully navigated to the "https://github.com/"
       And User info "shibiza" on "Home Page" is present on navigation panel