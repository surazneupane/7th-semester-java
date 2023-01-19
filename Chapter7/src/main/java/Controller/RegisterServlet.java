package Controller;

import Model.User;
import Service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher =
                req.getRequestDispatcher("views/register.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setName(req.getParameter("name"));
        user.setEmail(req.getParameter("email"));
        user.setPassword(req.getParameter("password"));
        try {
            HttpSession httpSession = req.getSession();
            if (userService.insert(user)) {
                httpSession.setAttribute("message",
                        "Account Created Successfully!");
                resp.sendRedirect("/");
            } else {
                httpSession.setAttribute("message",
                        "Something error occured!");
                resp.sendRedirect("/register");
            }
        } catch (Exception e) {
        }
    }

}
