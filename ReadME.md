# Email Application

This project is a simple email application that manages user information, including generating email addresses and passwords.

## Overview

The Email Application features a `User` class that handles user-related functionalities:

- **User Management**: Manages basic user information and performs key actions related to email and password.
- **Email Generation**: Automatically creates an email address based on the user's details.
- **Password Generation**: Generates a random password for the user.

## Class: User

### Key Functionalities

- **Constructor**: Initializes the user with their first name and last name. Automatically sets the department, generates an email address, and creates a password.
- **Department Selection**: Prompts the user to select their department from a list of options and ensures valid input.
- **Email Generation**: Constructs an email address using the user’s name and department.
- **Password Creation**: Generates a random password for the user.
- **Customization**: Allows the user to manually set their password and modify mailbox capacity or email address.
- **Information Display**: Provides a method to get a string representation of the user’s details.

## Usage

1. **Create a User**: Instantiate the `User` class with the user’s first and last names.
2. **Select Department**: The system will prompt the user to select their department.
3. **Generate Email and Password**: The system will automatically generate an email address and a random password for the user.
4. **Customize**: Users can manually adjust their password, mailbox capacity, or email if needed.

## OOP Concepts

The project illustrates the following Object-Oriented Programming concepts:

- **Encapsulation**: Protects data by making attributes private and providing controlled access through methods.
- **Abstraction**: Hides the complexity of email and password generation from the user.
- **Composition**: Integrates multiple functionalities within the `User` class to manage user profiles effectively.

This documentation outlines the core functionalities and design principles of the email application. For detailed implementation, please refer to the source code.
