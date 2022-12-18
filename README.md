# JavaAutomationScripts

#SESSION 1 TASK 1
This is a Java program that uses the Selenium WebDriver to launch the Chrome browser and open a webpage with the given URL. It then retrieves the title of the webpage and compares it to an expected title. If the titles match, it prints "Test Passed!" If they don't match, it prints "Test Failed". Finally, it closes the browser.

The System.setProperty method is used to specify the location of the ChromeDriver executable, which is used by Selenium to interact with the Chrome browser. The WebDriver interface is then used to create an instance of the ChromeDriver class, which is stored in the driver variable.

The manage().window().maximize() method is used to maximize the browser window.

The get method is used to navigate to the specified URL, and the getTitle method is used to retrieve the title of the webpage.

The if statement is used to compare the actual title to the expected title, and the contentEquals method is used to compare the two strings.

Finally, the quit method is used to close the browser.

#SESSION 1 TASK 2
This is a Java program that uses the Selenium WebDriver to launch the Chrome browser and open a webpage with the given URL. It then clicks on the "Contact us" link on the webpage, fills out a form, and submits it. It then retrieves a success message and compares it to an expected message. If the messages match, it prints "Form submitted successfully". If they don't match, it prints "Error message". Finally, it closes the browser.

The System.setProperty method is used to specify the location of the ChromeDriver executable, which is used by Selenium to interact with the Chrome browser. The WebDriver interface is then used to create an instance of the ChromeDriver class, which is stored in the driver variable.

The manage().window().maximize() method is used to maximize the browser window.

The get method is used to navigate to the specified URL.

The findElement method is used to locate an element on the webpage using its XPath, and the click method is used to click on the element.

The manage().timeouts().implicitlyWait method is used to set a wait time for the browser to find elements on the webpage. The Thread.sleep method is also used to pause the program for a given amount of time.

The sendKeys method is used to enter text into form fields.

The click method is used to submit the form.

The getText method is used to retrieve the text of an element on the webpage, and the contentEquals method is used to compare the success message to the expected message.

Finally, the quit method is used to close the browser.

#SESSION 2 TASK 1

This is a Java program that uses the Selenium WebDriver to launch the Chrome browser and open a webpage with the given URL. It then finds a list of radio buttons on the webpage, clicks on the first radio button, and checks if it is selected. It then retrieves the names of the radio buttons and prints them to the console.

The System.setProperty method is used to specify the location of the ChromeDriver executable, which is used by Selenium to interact with the Chrome browser. The WebDriver interface is then used to create an instance of the ChromeDriver class, which is stored in the driver variable.

The manage().window().maximize() method is used to maximize the browser window.

The get method is used to navigate to the specified URL.

The findElements method is used to locate a list of elements on the webpage using their class name, and the size method is used to get the number of elements in the list.

The get method is used to retrieve a specific element from the list, and the click method is used to click on the element.

The isSelected method is used to check if the radio button is selected.

The findElement method is used to locate an element on the webpage using a CSS selector, and the getText method is used to retrieve the text of the element.

The for loop is used to iterate through the list of radio buttons and print their names.

#SESSION 2 TASK 2
This is a Java program that uses the Selenium WebDriver to launch the Chrome browser and open a webpage with the given URL. It then clicks on the login button, enters text into the "From" field, selects a city from the suggestion list, and clicks on a date. It then enters text into the "To" field, selects a city from the suggestion list, and clicks on the search button.

The System.setProperty method is used to specify the location of the ChromeDriver executable, which is used by Selenium to interact with the Chrome browser. The WebDriver interface is then used to create an instance of the ChromeDriver class, which is stored in the driver variable.

The manage().window().maximize() method is used to maximize the browser window.

The get method is used to navigate to the specified URL.

The switchTo().frame method is used to switch to an iframe on the webpage, and the click method is used to click on the close button.

The switchTo().defaultContent method is used to switch back to the main window.

The findElement method is used to locate an element on the webpage using its class name, and the click method is used to click on the element.

The sendKeys method is used to enter text into a form field.

The findElements method is used to locate a list of elements on the webpage using their class name.

The for loop is used to iterate through the list of elements and print their text.

The get method is used to retrieve a specific element from the list and click on it.

The click method is used to click on a date on the calendar.

The findElement method is used to locate an element on the webpage using its XPath, and the click method is used to click on the element.

#SESSION 3 TASK 1

This is a Java program that uses the Selenium WebDriver to launch the Chrome browser and open a webpage with the given URL. It then clicks on a button to open a new window, switches to the new window, and clicks on a link to navigate to a new webpage. It then retrieves a list of elements containing course names and prints the size of the list and the name of the second course in the list. It then compares the expected and actual names of the second course and prints a message based on the comparison.

The program then switches back to the original window and opens a new tab. It navigates to a new webpage in the new tab and enters the name of the second course into a search box. It then submits the search and retrieves a list of elements containing search results. It prints the name of the first search result and compares it to the expected course name.

#SESSION 3 TASK 2

Trying to automate a form submission on the "https://demoqa.com/automation-practice-form" website. The code is iterating through the firstname, lastname, email, and mobileno arrays and entering the values from these arrays into the corresponding fields on the form. It is also selecting the gender radio button and entering the date of birth. Finally, it is clicking the "Submit" button to submit the form.
