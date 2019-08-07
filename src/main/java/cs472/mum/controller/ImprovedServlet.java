package cs472.mum.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/improved")
public class ImprovedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String n1 = request.getParameter("number1");
        String n2 = request.getParameter("number2");
        String n3 = request.getParameter("number3");
        String n4 = request.getParameter("number4");
        String res1= new String(""),res2=new String("");
        try {
            res1 = String.valueOf((Integer.parseInt(n1) + (Integer.parseInt(n2))));
        }catch (Exception e){};
        try {
            res2 = String.valueOf((Integer.parseInt(n3) * (Integer.parseInt(n4))));
        }catch (Exception e){};

        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Improved Calculator</title></head><body>");
        out.print("<a>Improved Calculator</a><br/><br/>");

        out.print("<form method='post'>");
        out.print("<input type='number' name='number1' value='"+n1+"'/>+");
        out.print("<input type='number' name='number2' value='"+n2+"'/>=");
        out.print("<input type='number' name='result1' value='"+res1+"'/><br/>");
        out.print("<input type='number' name='number3' value='"+n3+"'/>*");
        out.print("<input type='number' name='number4' value='"+n4+"'/>=");
        out.print("<input type='number' name='result2' value='"+res2+"'/><br/>");
        out.print("<input type='submit' value='Submit'/>");
        out.print("</form>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Improved Calculator</title></head><body>");
        out.print("<a>Improved Calculator</a><br/><br/>");

        out.print("<form method='post'>");
        out.print("<input type='number' name='number1'/>+");
        out.print("<input type='number' name='number2'/>=");
        out.print("<input type='number' name='result1'/><br/>");
        out.print("<input type='number' name='number3'/>*");
        out.print("<input type='number' name='number4'/>=");
        out.print("<input type='number' name='result2'/><br/>");
        out.print("<input type='submit' value='Submit'/>");
        out.print("</form>");
    }
}
