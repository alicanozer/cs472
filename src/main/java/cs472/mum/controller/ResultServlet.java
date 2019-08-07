package cs472.mum.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/result")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Map<String, Integer> values = (Map<String, Integer>)session.getAttribute("values");

        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Test</title></head><body>");
        if (values.containsKey("number1") && values.containsKey("number2"))
            out.print("<p>"+values.get("number1")+" + "+values.get("number2")+" = "+(values.get("number1")+values.get("number2"))+"</p>");

        if (values.containsKey("number3") && values.containsKey("number4"))
            out.print("<p>"+values.get("number3")+" * "+values.get("number4")+" = "+(values.get("number3")*values.get("number4"))+"</p>");
        out.print("</body></html>");
    }
}
