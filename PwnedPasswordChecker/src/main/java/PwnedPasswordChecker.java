/**
 * PwnedPassword checker
 * Uses third-party service https://haveibeenpwned.com/Passwords
 *
 * This util does not collect any kind of personal information!
 *
 * @author nick
 * @version 0.1
 */

/**
 * Servlet we use in pair with index.jsp to do our work
 */

import service.PwnedPasswordService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/checkpass")
public class PwnedPasswordChecker extends HttpServlet {

   private PwnedPasswordService service;

    @Override
    public void init() throws ServletException {
        service = new PwnedPasswordService();
    }

   public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        processRequest(httpServletRequest, httpServletResponse);
    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        processRequest(httpServletRequest, httpServletResponse);
    }

    private void processRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.getWriter().print(service.checkHashedPassword(httpServletRequest.getParameter("password")));

    }
}
