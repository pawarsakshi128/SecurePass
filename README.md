# Secure Pass - Team SAS's

Secure Pass is a simple web application that allows users to analyze their password, generate strong passwords of variable lengths and also perform password cracking simulation through a login form.

## Features

- Analyze Password Strength.
- Generate strong passwords of variable lengths (minimum length: 8 characters).
- Secure password generation using a combination of uppercase letters, lowercase letters, digits, and special characters.
- Password Cracking Simulation.
- Education Module spreading Cyber Security Awareness.
- Simple and intuitive user interface.

## Technologies Used

- **Frontend:** HTML, CSS, JavaScript
- **Backend:** Spring Boot, Java
- **Simulation:** Burp Suite(Dictionary Attack)
- **Password Generation:** SecureRandom class in Java

## Getting Started

1. **Clone the Repository:**

2. **Run the Spring Boot Application:**
- Import the project into your favorite IDE (like IntelliJ IDEA, Eclipse).
- Run the main class `Application.java` to start the Spring Boot application.

3. **Open the Frontend:**
- Navigate to the `index.html` file in the `src/main/resources/static` directory.
- Open the `index.html` file in your browser.

4. **Analyze Password:**
- Enter the password you want to analyze and hit the enter button.
- This feature analyzes your password on the basis of weak, moderate and strong.
- Output will be displayed in the output field.

5. **Generate Passwords:**
- Enter the desired length of the password you want to generate (minimum 8 characters).
- Click on the "Generate" button to generate a strong password.
- The generated password will be displayed in the output field.

6. **Password Cracking Simulation:**
- This feature helps you perform live password simultaion through a login form.
- A small amount of data is provided to run this feature and perform a dictionary attack.
- Make sure that you host this website on a localhost while using this feature.


## License

This project is licensed under the MIT License - see the [LICENSE] file for details.

