
package Controleur;



import ejb.SessionDvd;
import java.io.*;
import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;


/**
 * Le contrôleur Dvd.
 */


@WebServlet(name = "ControleurDvd", urlPatterns = {"/controleurDvd"})


public class controleurDvd extends HttpServlet {

    @EJB
    private SessionDvd dvd;

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {


        PrintWriter out = response.getWriter();


        String action = request.getParameter("action");
   
        try {
            if (action == null) {
                actionAfficher(request, response);
            } else if (action.equals("ajoutAuteur")) {
                actionAjoutAuteur(request, response);
            }else if (action.equals("ajoutAuteurbase")) {
                actionAjoutAuteurbase(request, response);
            } else {
                getServletContext().getRequestDispatcher(
                        "/WEB-INF/controleurErreur.jsp").forward(
                                request, response);
            }
        }  catch (Exception ex) {
            Logger.getLogger(controleurDvd.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }
    
    
    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {


        PrintWriter out = response.getWriter();


        String action = request.getParameter("action");


        try {
            if (action == null) {
                actionAfficher(request, response);
            } else if (action.equals("ajoutAuteur")) {
                actionAjoutAuteur(request, response);
            }else if (action.equals("ajoutAuteurbase")) {
                actionAjoutAuteurbase(request, response);
            } else {
                getServletContext().getRequestDispatcher(
                        "/WEB-INF/controleurErreur.jsp").forward(
                                request, response);
            }
        }catch (Exception ex) {
            Logger.getLogger(controleurDvd.class.getName()).log(
                    Level.SEVERE, null, ex);
        }
    }

    private void actionAjoutAuteur(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           getServletContext().getRequestDispatcher(
                "/WEB-INF/ajoutAuteur.jsp").forward(request, response);
    }
    

    private void actionAfficher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher(
                "/WEB-INF/accueil.jsp").forward(request, response);
    }

    private void actionAjoutAuteurbase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        
    dvd.ajoutAuteur(nom, prenom);
    
    getServletContext().getRequestDispatcher(
                "/WEB-INF/ajoutAuteur.jsp").forward(request, response);
    
    }
}
