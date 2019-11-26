package main.web;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/files")
public class EJBServlet extends HttpServlet {

    public EJBServlet() {
    }

    @EJB
    Recursion recursion;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final String dir = "/Users/a1/Desktop";


        File file = new File (dir);
        recursion.pathToFolders (file);

        request.setAttribute ("files", recursion.pathToFolders (file));
        request.getRequestDispatcher ("/files.jsp").include (request, response);
    }
}
