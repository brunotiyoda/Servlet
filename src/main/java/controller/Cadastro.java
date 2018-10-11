package controller;

import banco.BancoDeDados;
import model.Empresa;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {

    /*@Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String nome = req.getParameter("nome");

        System.out.println(nome);

        PrintWriter writer = res.getWriter();
        writer.print("<html><body> " + nome + "</body></html>");
    }*/

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");

        Empresa empresa = new Empresa();
        empresa.setNome(nome);

        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.adiciona(empresa);

        PrintWriter writer = resp.getWriter();
        writer.print("<html><body> Empresa " + nome + " adicionada. </body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BancoDeDados bancoDeDados = new BancoDeDados();

        List<Empresa> empresas = bancoDeDados.getEmpresas();

        PrintWriter writer = resp.getWriter();
        writer.print("<html><body>");
        for (Empresa empresa: empresas) {
            writer.println("Empresa " + empresa.getNome() + ".<br>");
        }
        writer.print("</body></html>");
    }
}
