# Automation-Testing

## Automation Testing Using Selenium

### Explanation:

The Java code is an example of automated testing using Selenium WebDriver. 

### Steps:

Setting Up WebDriver:
The code sets the system property to specify the location of the ChromeDriver executable file. It initializes a new instance of the ChromeDriver, which controls the Chrome browser.

<br>
Opening a Webpage:
The WebDriver navigates to the specified URL: "https://the-internet.herokuapp.com/login".

<br>
Locating Web Elements:
It finds the username input field using its ID attribute and stores it in the username WebElement variable. Similarly, it finds the password input field and the login button using their respective locators (ID and CSS selector).

<br>
Interacting with Web Elements:
It verifies if the username and password input fields are displayed and enabled using the isDisplayed() and isEnabled() methods. It then enters the username "tomsmith" into the username input field and "SuperSecretPassword!" into the password input field using the sendKeys() method.

<br>
Performing Actions:
After entering the credentials, it clicks on the login button using the click() method.

<br>
Extracting Text:
It extracts the text from a '<div>' element on the page using a CSS selector and stores it in a string variable s. Finally, it prints the extracted text to the console.
