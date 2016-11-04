<%-- 
    Document   : ajout
    Created on : 4 nov. 2016, 15:51:42
    Author     : huang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
       <head>
		<title>Accueil</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body id="top">
            <form action="controleurDvd?action=ajoutAuteurbase" method="POST" >
                <input type="text" value="Entrer nom Auteur" name="nom" />
                <input type="text" value="Entrer prenom Auteur" name="prenom" />
                <input type="submit" value="Valider"/>
            </form>
    </body>
</html>
