<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Yahooo!!!!</title>
</head>
<body>
<h1>Simple Interest Calculator</h1>
<form action="calculation" method="post">
    <p>
        Principal Amount: <input type="number" name="principalAmount"/>
    </p>
    <p>
        No. of Year: <input type="number" name="year"/>
    </p>
     <p>
        Rate Of Interest: <input type="number" name="ROI"/>
    </p>
    <p>
        <p>
        <input type="submit" value="Calculate"/>
    </p>
    </p>
    </form>
    <h2>The Simple Interest is: ${message}</h2></body>
</html>