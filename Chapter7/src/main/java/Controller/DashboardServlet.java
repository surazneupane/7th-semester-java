package Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DashboardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getSession().getAttribute("loggedInUserId") == null) {
            resp.sendRedirect("/login");
        } else {

            RequestDispatcher requestDispatcher =
                    req.getRequestDispatcher("views/dashboard.jsp");

            Cookie cookie = new Cookie("email", req.getSession().
                    getAttribute("loggedInUserEmail").toString());

            cookie.setMaxAge(60 * 60 * 24);

            resp.addCookie(cookie);

            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().invalidate();
        resp.sendRedirect("/");
    }
}
