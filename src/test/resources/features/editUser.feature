Feature: edit user function

  @wip
  Scenario: general test for edit user
    Given librarian is in the application dashboard
    When librarian click the Users button
    And librarian chooses one user randomly and click the Edit User button
    And librarian change the fullname information with "Arthur Schophenauer" and clicks the Save changes button
    Then librarian should get "The user updated." success message