# CS-305-Final-Project-
Final pproject

1. Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?
The client was Artemis Financial, a financial services company focused on providing secure digital tools for its clients. They needed a secure web application that could hash data and communicate over HTTPS. The primary issue they asked me to address was the lack of encryption, unverified communication, and dependency vulnerabilities in the software application.

2. What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?
I successfully identified outdated and vulnerable dependencies using OWASP Dependency-Check and refactored the application to use SHA-256 hashing and HTTPS communication through a self-signed certificate. Coding securely prevents exploitation, protects sensitive data, and ensures trust with users. Software security also helps a company avoid costly breaches and maintain compliance with regulations, ultimately supporting long-term success.

3. Which part of the vulnerability assessment was challenging or helpful to you?
A challenging part was interpreting the OWASP Dependency-Check report to determine which vulnerabilities required action versus those that could be considered false positives. It was helpful to use an automated tool along with manual review to get a clearer picture of the application’s security status.

4. How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?
I increased security by:
	•	Using SHA-256 for data hashing
	•	Implementing a self-signed SSL certificate to enable HTTPS
	•	Refactoring code to improve clarity and reduce risk
	•	Scanning all dependencies for vulnerabilities

In the future, I would use a combination of tools like OWASP Dependency-Check, static analysis tools, and manual code review to assess and prioritize security risks.

7. Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?
I would show this project to demonstrate my ability to:
	•	Apply secure software development practices
	•	Use cryptographic hashing and certificate-based HTTPS
	•	Perform a vulnerability assessment and mitigation
	•	Work with Java/Spring Boot and OWASP tools
This project highlights both technical skills and awareness of real-world security concerns, which are essential in software development and cybersecurity roles.
