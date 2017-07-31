package fr.sopra.pox3.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.sopra.pox3.ejb.AuteurDAO;
import fr.sopra.pox3.ejb.MaisonDeDisqueDAO;
import fr.sopra.pox3.entities.Auteur;
import fr.sopra.pox3.entities.MaisonDeDisque;

@WebServlet("/index2.html")

public class JPA102Servlet extends HttpServlet {

	@EJB
	private AuteurDAO auteurDaO;
	@EJB
	private MaisonDeDisqueDAO maisonDeDisqueDAO;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("i'm here ");

		/*MaisonDeDisque maison = new MaisonDeDisque();
		maison.setId(9);
		Auteur auteur = new Auteur();
		auteur.setNom("Tata");
		auteur.setMaison(maison);

		auteurDaO.ajouterAuteur(auteur);*/
		
		MaisonDeDisque maison = maisonDeDisqueDAO.findById(9);
		System.out.println(maison.getNom());
		System.out.println(maison.getId());
		System.out.println(maison.getAuteurs().size());

		
	}
}
