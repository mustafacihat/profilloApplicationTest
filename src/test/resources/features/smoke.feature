@NOW-19
Feature: 

	
	@NOW-17
	Scenario: test1
		
		Given librarian is in the application dashboard
		When librarian click the Users button
		And librarian chooses one user randomly and click the Edit User button
		And librarian change the fullname information with "Arthur Schophenauer" and clicks the Save changes button
		Then librarian should get "The user updated." success message	

	
	@NOW-18
	Scenario: test2
		Given librarian is in the application dashboard
		When librarian click the Users button
		And librarian chooses one user randomly and click the Edit User button
		And librarian change the password information with "password123" and clicks the Save changes button
		Then librarian should get "The user updated." success message