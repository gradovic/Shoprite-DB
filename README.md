# Shoprite-DB
A database to keep track of the workers at Shoprite (or any corporation).
# How to use
1) Create a war file and put it in your Tomcat webapps folder and open the app from Tomcat. You should see four fields: Username, Password, idToChange, and NewJob.
2) To log in as a non-admin: Use the username 'Bob' and the password 'password'. As a non-admin, you will see a list of employees, but you will not be able to do anything.
3) To log in as an admin: Use the username 'Andy' and the password 'password'. You can use the idToChange and NewJob fields to manipulate the database.
3a) If you leave the idToChange field blank, the program will return the database with no changes.
3b) If you enter an id number into the idToChange field and enter 'fire' into the NewJob field, it will remove the employee with that id from the table.
3c) If you enter 'add' into the NewJob field, it will create a new employee named "Annie Paulsen the Trainee" with the next available id number (the id you entered into the idToChange field does not matter).
3d) If you enter an id number into the idToChange field and enter anything except 'add' or 'fire' into the NewJob field, it will change the job of that id number to the term you entered into the NewJob field.
Note: All changes permanently affect the database.
# Notes about the code
1) LoginServlet takes the input from the website and uses it to call SQL functions in JdbcPostgresqlConnection, then display the output on the website.
2) JdbcPostgresqlConnection has all the SQL functions: viewAll, change, fire, and addEmployee.
3) App has the main function, but the code doesn't need it. I mainly use it to call functions from JdbcPostgresqlConnection and influence the database without having to open the Tomcat Server.
