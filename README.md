# Flipkart Test Automation Scripts

This repository contains automated test scripts for the Flipkart e-commerce website, developed using Java and Selenium WebDriver. The project is designed to test various functionalities of the Flipkart platform, ensuring a smooth user experience through manual and automated test validations.

## 🛠️ Technologies Used

- **Java** – Programming language for writing the test scripts  
- **Selenium WebDriver** – Automation framework for web UI testing  
- **TestNG** – Test framework used for running test cases (if applicable)  
- **Maven** – Build and dependency management  
- **ChromeDriver** – WebDriver for Google Chrome browser  

## 📁 Project Structure

FlipCart_Test_Sripts/ ├── src/ │ └── test/ │ └── java/ │ ├── testcases/ │ ├── pages/ │ └── utilities/ ├── testng.xml ├── pom.xml └── README.md


- **testcases**: Contains all the test scripts for Flipkart features.  
- **pages**: Implements Page Object Model (POM) to organize web elements and actions.  
- **utilities**: Helper classes for reusable components like waits, configs, etc.  
- **testng.xml**: (If applicable) Used to run test suites.  
- **pom.xml**: Maven configuration file for managing dependencies.  

## ✅ Features Covered

- User login and logout  
- Product search and filtering  
- Add to cart functionality  
- Checkout and payment simulation (as applicable)  
- Validation of product details  
- Error handling and alert validation  

## 🚀 Getting Started

### Prerequisites

- Java (JDK 8 or higher)   
- Chrome Browser  
- ChromeDriver  
- IDE (e.g., IntelliJ, Eclipse)  

### Clone the Repository

```bash
git clone https://github.com/Kumarms5421/FlipCart_Test_Sripts.git
cd FlipCart_Test_Sripts

🧪 Best Practices Followed
Page Object Model (POM) for maintainable and scalable test scripts

Maven for dependency management

Cross-browser testing capability (if configured)

Modular test case design

📌 To Do
Add support for data-driven testing (Excel or JSON)

Integrate with CI/CD (Jenkins/GitHub Actions)

Enhance reporting (Allure/ExtentReports)

Add screenshots on failure

📄 License
This project is open-source and available under the MIT License.

Run Tests

mvn clean test


