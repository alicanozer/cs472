package cs472.mum.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/simple")
public class SimpleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, Integer> values = new HashMap<>();

        if(!request.getParameter("number1").equals(""))
            values.put("number1", Integer.parseInt(request.getParameter("number1")));

        if(!request.getParameter("number2").equals(""))
            values.put("number2", Integer.parseInt(request.getParameter("number2")));

        if(!request.getParameter("number3").equals(""))
            values.put("number3", Integer.parseInt(request.getParameter("number3")));

        if(!request.getParameter("number4").equals(""))
            values.put("number4", Integer.parseInt(request.getParameter("number4")));

        HttpSession session = request.getSession();
        session.setAttribute("values", values);
        response.sendRedirect("./result");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Simple Calculator</title></head><body>");
        out.print("<a>Simple Calculator</a><br/><br/>");
        out.print("<form method='post'>");
        out.print("<input type='number' name='number1' />+");
        out.print("<input type='number' name='number2' /><br />");
        out.print("<input type='number' name='number3' />*");
        out.print("<input type='number' name='number4' /><br />");
        out.print("<input type='submit' value='Submit'/>");
        out.print("</form>");
        out.print("</body></html>");
    }

}
