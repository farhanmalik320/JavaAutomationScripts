# JavaAutomationScripts

This is a Java program that uses the Selenium WebDriver to launch the Chrome browser and open a webpage with the given URL. It then retrieves the title of the webpage and compares it to an expected title. If the titles match, it prints "Test Passed!" If they don't match, it prints "Test Failed". Finally, it closes the browser.

The System.setProperty method is used to specify the location of the ChromeDriver executable, which is used by Selenium to interact with the Chrome browser. The WebDriver interface is then used to create an instance of the ChromeDriver class, which is stored in the driver variable.

The manage().window().maximize() method is used to maximize the browser window.

The get method is used to navigate to the specified URL, and the getTitle method is used to retrieve the title of the webpage.

The if statement is used to compare the actual title to the expected title, and the contentEquals method is used to compare the two strings.

Finally, the quit method is used to close the browser.
