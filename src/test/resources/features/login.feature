Feature: login functionality


  Scenario Outline: login with valid credentials <username> and <password>
    Given the user is in the login page
    When the user enters "<username>" and "<password>"
    Then the user should be in application dashboard
    Examples:
      | username            | password |
      | librarian27@library | ZM9JMdIK |
      | librarian28@library | wVFVnaCO |
      | librarian29@library | PZ7IQ8G5 |
      | librarian30@library | e3BxcFKE |
      | librarian31@library | pogXBhac |
      | librarian32@library | sRALQfSE |
      | librarian33@library | df6NfMib |
      | librarian35@library | qMgZFGfc |
      | student47@library   | 3lUpdof3 |
      | student48@library   | b0zgv1ab |
      | student49@library   | npSk3tsr |
      | student50@library   | so9lCgZf |
      | student51@library   | wFe76AL0 |
      | student52@library   | eiJolZ4e |


  Scenario Outline: login function test with invalid credentials (negative) <username> and <password>
    Given the user is in the login page
    When the user enters "<username>" and "<password>"
    Then the user should be in login page
    Examples:
      | username            | password |
      | librarian27@library | ZM912345 |
      | tailor28@library    | wVFVnaCO |
      |                     | PZ7IQ8G5 |
      | librarian30@library |          |
      |                     |          |
      | student50@library   | so9ltttt |
      | player55@library    | wFe76AL0 |
      | student52@library   |          |
      |                     | so9lCgZf |













