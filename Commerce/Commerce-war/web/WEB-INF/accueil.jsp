<%-- 
    Document   : accueil
    Created on : 4 nov. 2016, 15:17:44
    Author     : huang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Accueil</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body id="top">

			<!-- Banner -->
			<!--
				To use a video as your background, set data-video to the name of your video without
				its extension (eg. images/banner). Your video must be available in both .mp4 and .webm
				formats to work correctly.
			-->
				<section id="banner" data-video="images/banner">
					<div class="inner">
						<header>
							<h1>Vente de DvD</h1>
							
						</header>
						<a href="#main" class="more">Learn More</a>
					</div>
				</section>

			<!-- Main -->
				<div id="main">
					<div class="inner">

					<!-- Boxes -->
						<div class="thumbnails">

							<div class="box">
								<a  class="image fit"><img src="images/pic01.jpg" alt="" /></a>
								<div class="inner">
									<h3>Recherche de Dvd</h3>
									<a href="controleurDvd?action=rechercher" class="button fit" >Rechercher</a>
								</div>
							</div>

							<div class="box">
								<a  class="image fit"><img src="images/pic02.jpg" alt="" /></a>
								<div class="inner">
									<h3>Editer les Dvd</h3>
									<a href="controleurDvd?action=editer" class="button style2 fit" >Editer</a>
								</div>
							</div>

							
                                                    <div class="box">
								<a  class="image fit"><img src="images/pic03.jpg" alt="" /></a>
								<div >
									<h3>Ajouter un Auteur</h3>
									<a href="controleurDvd?action=ajoutAuteur" class="button style2 fit">Ajouter</a>
								</div>
							</div>
                                                    
                                                       <div class="box">
								<a  class="image fit"><img src="images/pic04.jpg" alt="" /></a>
								<div class="inner">
									<h3>Ajouter un Réalisateur</h3>
									<a href="controleurDvd?action=ajoutRealisateur" class="button style2 fit" >Editer</a>
								</div>
							</div>
                                                    
                                                      <div class="box">
								<a  class="image fit"><img src="images/pic05.jpg" alt="" /></a>
								<div class="inner">
									<h3>Ajouter un DVD</h3>
									<a href="controleurDvd?action=ajoutDvd" class="button style2 fit" >Editer</a>
								</div>
							</div>

							

							
								

						</div>

					</div>
				</div>

			<!-- Footer -->
				<footer id="footer">
					<div class="inner">
						
						<ul class="icons">
							<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
							<li><a href="#" class="icon fa-envelope"><span class="label">Email</span></a></li>
						</ul>
						</div>
				</footer>

		
                        
                        

	</body>
</html>
