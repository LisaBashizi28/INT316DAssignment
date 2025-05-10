<%-- 
    Document   : login
    Created on : 10 May 2025, 12:25:17 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login_page</title>
    </head>
    <style>
            body {
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                background: linear-gradient(120deg, #2980b9, #6dd5fa);
                margin: 0;
                padding: 0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }

            h1 {
                text-align: right;
                color: #333;
                margin-top: 20px;
                       
            }

            table {
                width: 100%;
            }

            td {
                padding: 10px 5px;
                font-weight: bold;
                color: #444;
            }

            input[type="text"],
            input[type="password"] {
                width: 100%;
                padding: 8px;
                border: 1px solid #ccc;
                border-radius: 5px;
                font-size: 14px;
            }

            input[type="submit"] {
                width: 100%;
                padding: 10px;
                background-color: #2980b9;
                border: none;
                border-radius: 5px;
                color: white;
                font-size: 16px;
                cursor: pointer;
                margin-top: 20px;
            }

            input[type="submit"]:hover {
                background-color: #1c6692;
            }
        </style>
    <body>
        <h1>Login Form</h1>
        <form action="AddUserServle" method="POST">
            <table>
                <tr>
                    <td>ID</td>
                    <td><input type="text" name="id" required=""/></td>
                </tr>
                 <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" required=""/></td>
                </tr>
                 <tr>
                    <td>password</td>
                    <td><input type="password" name="password" required=""/></td>
                </tr>
                <tr>
                    <td>Role</td>
                    <td><input type="text" name="role" required=""/></td>
                </tr>
                <tr>
                    <td>SUBMIT</td>
                    <td><input type="submit" value="submit" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
