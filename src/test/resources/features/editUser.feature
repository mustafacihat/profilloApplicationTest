Feature: edit user function


  Scenario: general test for edit user with FULLNAME
    Given librarian is in the application dashboard
    When librarian click the Users button
    And librarian chooses one user randomly and click the Edit User button
    And librarian change the fullname information with "Arthur Schophenauer" and clicks the Save changes button
    Then librarian should get "The user updated." success message


  Scenario: general test for edit user with PASSWORD
    Given librarian is in the application dashboard
    When librarian click the Users button
    And librarian chooses one user randomly and click the Edit User button
    And librarian change the password information with "password123" and clicks the Save changes button
    Then librarian should get "The user updated." success message


  Scenario: general test for edit user with EMAIL
    Given librarian is in the application dashboard
    When librarian click the Users button
    And librarian chooses one user randomly and click the Edit User button
    And librarian change the email information with "test123@gmail.com" and clicks the Save changes button
    Then librarian should get "The user updated." success message


  Scenario: general test for edit user with USER GROUP
    Given librarian is in the application dashboard
    When librarian click the Users button
    And librarian chooses one user randomly and click the Edit User button
    And librarian change the userGroup  with other one and clicks the Save changes button
    Then librarian should get "The user updated." success message
  @wip
  Scenario: general test for edit user with STATUS
    Given librarian is in the application dashboard
    When librarian click the Users button
    And librarian chooses one user randomly and click the Edit User button
    And librarian change the status  with other one and clicks the Save changes button
    Then librarian should get "The user updated." success message


  Scenario: general test for edit user with START DATE
    Given librarian is in the application dashboard
    When librarian click the Users button
    And librarian chooses one user randomly and click the Edit User button
    And librarian change the start date information with "2021-01-21" and clicks the Save changes button
    Then librarian should get "The user updated." success message


  Scenario: general test for edit user with END DATE
    Given librarian is in the application dashboard
    When librarian click the Users button
    And librarian chooses one user randomly and click the Edit User button
    And librarian change the end date information with "2021-01-01" and clicks the Save changes button
    Then librarian should get "The user updated." success message


  Scenario: general test for edit user with ADDRESS
    Given librarian is in the application dashboard
    When librarian click the Users button
    And librarian chooses one user randomly and click the Edit User button
    And librarian change the address  information with "Jasque Nouma Avenue, Residence Nancel Penard, Appartemant 58, Paris" and clicks the Save changes button
    Then librarian should get "The user updated." success message



