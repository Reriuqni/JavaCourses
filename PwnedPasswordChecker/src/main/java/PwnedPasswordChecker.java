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

    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        processRequest(httpServletRequest, httpServletResponse);
    }

    @Override
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        processRequest(httpServletRequest, httpServletResponse);
    }

    private void processRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        String passToCheck = httpServletRequest.getParameter("password");
        int count = service.getCountOfHashedPassword(passToCheck);
        StringBuilder response = new StringBuilder();
        response.append("<!doctype html><html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">" +
                "<meta charset=\"utf-8\"><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\">" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>" +
                "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>" +
                "<link rel=\"stylesheet\" href=\"css/style.css\"><title>PwnedPasswordChecker</title>" +
                "</head><body><div class=\"page-header\">" +
                "<h1 align=\"center\">PwnedPasswordChecker <small>Anonymous password checker</small></h1>" +
                "</div><div class=\"jumbotron\"><div class=\"container-fluid\"><center>");
        if (count != 0) {
            response.append("<div class=\"panel panel-danger\"><div class=\"panel-heading\">" +
                    "<h3 class=\"panel-title\">Oops!</h3></div>" +
                    "<div class=\"panel-body\"> Your password found <strong>" + count + "</strong> times! It's better to change it.</div></div>");
        } else {
            response.append("<div class=\"panel panel-success\"><div class=\"panel-heading\">" +
                    "<h3 class=\"panel-title\">OK</h3></div>" +
                    "<div class=\"panel-body\">Looks like your password wasn't leaked!</div></div>");
        }
        response.append("</center></div></div><div class=\"fixed-footer\"><div class=\"container-fluid\"><div class=\"row\">" +
                "<div class=\"col-md-3 text-center\"><span class=\"glyphicon glyphicon-copyright-mark\"></span> 2018 nick</div>\n" +
                "<div class=\"col-md-3 text-center\">This service doesn't collect any kind of personal infomation.<br/> We polite your privacy.</div>\n" +
                "<div class=\"col-md-3 text-center\">Extra credits to JavaCoursesBrovary Team.<br/> Guys, you rock!</div>\n" +
                "<div class=\"col-md-3 text-center\"><a href=\"https://javacoursesbrovary.slack.com/\"><span class=\"glyphicon glyphicon-globe\"></span> JavaCoursesBrovary</a></div>\n" +
                "</div></div></div></body></html>");

        httpServletResponse.getWriter().print(response.toString());
    }
}
