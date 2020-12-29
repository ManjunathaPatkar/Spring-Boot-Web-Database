<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 28/12/20
  Time: 9:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JPS Databse</title>
</head>
<body>
<h1> Adding values to Database</h1>
<form action="addAlien">
    AID:<input type="number" name="aid"><br>
    ANAME:<input type="text" name="aname"><br>
    TECH:<input type="text" name="tech"><br>
    Submit :<button type="submit"></button>
</form>
<h1> Getting values from Database using AID</h1>
<form action="getAlien">
    AID:<input type="number" name="aid"><br>
    SUBMIT:<button type="submit"></button>
</form>
<h1> Deleting values from Database using AID</h1>
<form action="deletealien">
    AID:<input type="number" name="aid"><br>
    SUBMIT:<button type="submit"></button>
</form>
<h1> Updating values in Database using AID</h1>
<form action="updatealien">
    AID:<input type="number" name="aid"><br>
    NewName:<input type="text" name="aname"><br>
    Newtech:<input type="text" name="tech"><br>
    SUBMIT:<button type="submit"></button>
</form>
<h1>Find by tech name</h1>
<form action="getalientech">
    tech:<input type="text" name="tech"><br>
    SUBMIT:<button type="submit"></button>
</form>
<h1>Find values greater than given ID</h1>
<form action="greaterthanid">
    AID:<input type="number" name="aid">
    SUBMIT:<button type="submit"></button>
</form>
<h1>Finding by tech values and ordering based on aname(custom query)</h1>
<form action="getbyutechorderbyname">
    TECH:<input type="text" name="tech"><br>
    SUBMIT:<button type="button"></button>
</form>
</body>
</html>
