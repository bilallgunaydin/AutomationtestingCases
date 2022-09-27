Feature: Home Page Test

  Background:
        Given Navigate to Website
        And   click on Shop Menu
        And   click on Home menu button

    Scenario: Home Page with three Sliders only
        And   Test whether the Home page has Three Sliders only
        Then  The Home page must contains only three sliders

    Scenario: Home Page with three Arrivals only
        And   Test whether the Home page has Three Arrivals only
        Then  The Home page must contains only three Arrivals

    Scenario: Home page - Images in Arrivals should navigate
        And   Click the Selenium Ruby text
        And   Click the Selenium Ruby Image
        And   Close the Selenium Ruby Image
        Then  Image should be clickable and shoul navigate to next page where user can add that book to his basket

    Scenario: Home page - Arrivals-Images-Description
        And   Click the Selenium Ruby text
        And   Click the Selenium Ruby Image
        And   Close the Selenium Ruby Image
        And   Click on Description tab for the book you clicked on
        Then  There should be a description regarding that book the user clicked on

    Scenario: Home page - Arrivals-Images-Reviews
        And   Click the Selenium Ruby text
        And   Click the Selenium Ruby Image
        And   Close the Selenium Ruby Image
        And   Now clock on Reviews tab for the book you clicked on
        And   Rate a five star
        And   Write "The book is best" comment on Your Review
        And   type name "name"
        And   type email "email@gmail.com"
        And   click save checkbox Button
        And   click submit Button
        Then  There should be a Reviews regarding that book the user clicked on

    Scenario: Home page - Arrivals-Images-Add to Basket
        And   Click the Selenium Ruby text
        And   Click the Selenium Ruby Image
        And   Close the Selenium Ruby Image
        And   Click on the Add To Basket button which adds that book to your basket
        And   User can view that Book in the Menu item with price.
        Then  User can add a book by clicking on Add To Basket button which adds that book in to his Basket

    Scenario: Home page - Arrivals-Add to Basket with more books
        And   Click the Selenium Ruby text
        And   Click on the Add To Basket button which adds that book to your basket
        And   Select more books than the books in stock.Ex if the stock has 20 books, try to add 21.
        And   Click the add to basket button
        Then  Now it throws an error prompt like you must enter a value between 1 and 9908

    Scenario: Home page - Arrivals-Add to Basket-Items
        And   Click the Selenium Ruby text
        And   Click on the Add To Basket button which adds that book to your basket
        And   User can view that Book in the Menu item with price.
        And   Now click on Item link which navigates to proceed to check out page.
        Then  User can click on the Item link in menu item after adding the book in to the basket which leads to the check out page

    Scenario: Home page - Arrivals-Add to Basket-Items-Coupon
        And   Click the Selenium Ruby text
        And   Click on the Add To Basket button which adds that book to your basket
        And   User can view that Book in the Menu item with price.
        And   Now click on Item link which navigates to proceed to check out page.
        And   Click Have a coupon link
        And   Enter the Coupon code as "krishnasakinala" to get 50rps off on the total.
        And   click aplly coupon button
        Then  User can able to apply coupon by entering "Coupon: krishnasakinala" in the coupon textbox which give 50rps off on the total price

    Scenario: Home page - Home-Arrivals-Add to Basket-Items-Coupon value<45
        And   Click the Mastering Javascript Text
        And   Click on the Add To Basket button which adds that book to your basket
        And   User can view that Book in the Menu item with price.
        And   Now click on Item link which navigates to proceed to check out page.
        And   Click Have a coupon link
        And   Enter the Coupon code as "krishnasakinala" to get 50rps off on the total.
        And   click aplly coupon button
        Then  User can not able to apply coupon by entering 'krishnasakinala' in the coupon textbox which give 50rps off on the total price because the coupon is applicable for the book price > 450 rps

    Scenario: Home page - Home-Arrivals-Add To Basket-Items-Remove book
        And   Click the Mastering Javascript Text
        And   Click on the Add To Basket button which adds that book to your basket
        And   User can view that Book in the Menu item with price.
        And   Now click on Remove this icon in Check out page which removes that book from the grid.
        Then  User has the feasibility to remove the book at the time of check out also

    Scenario: Home page - Home-Arrivals-AddToBasket-Items-Add Book
        And   Click the Mastering Javascript Text
        And   Click on the Add To Basket button which adds that book to your basket
        And   User can view that Book in the Menu item with price.
        And   Click on textbox value under quantity in Check out page to add or subtract books.
        And   Now click on Update Basket to reflect those changes
        Then  User has the feasibility to Update Basket at the time of check out.

    Scenario: Home page - Home-Arrivals-Add to Basket-Items-Check-out-Book Final price
        And   Click the Mastering Javascript Text
        And   Click on the Add To Basket button which adds that book to your basket
        And   User can view that Book in the Menu item with price.
        And   Now click on Item link which navigates to proceed to check out page.
        Then  User has the feasibility to find the total price of the books at to find the total price of the books at the time of check out







