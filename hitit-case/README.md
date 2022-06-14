# Intro
This project covers a basic CRUD program using thymeleaf and spring boot to manage a data base

For this we start using a boilerplate generated in https://start.spring.io/ using
- Data JPA
- Thymeleaf
- Spring Boot Web
- Spring Boot Devtools
- MySql Connector

## Reading
The program reads from the database a list of passengers and show them in a list ordered by its last name in desc order.

![alt text](https://i.imgur.com/jeXErgX.png)

## Creating a new passenger
To add a new passenger you must click the *Add Employee* button and you will get redirected to a form to fill the new passenger data,
when done clicking the save button will save the passenger in the data base and you will get redirected to the main list.

![alt text](https://i.imgur.com/9ITtClm.png)

## Updating an passenger
To update an passenger you can click in the update button which will send you to the update form where you will get every field pre-filled
with the passenger data and you can change any text you want and click save when done and you will get redirected to the main list.

![alt text](https://i.imgur.com/yxYDxUi.png)

## Deleting an passenger
When clicking the delete button you will get a pop up asking for confirmation and if you click on agree that passenger will be deleted from
the database and the list will be updated.

![alt text](https://i.imgur.com/Utji3Vl.png)
