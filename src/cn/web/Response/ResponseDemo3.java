package cn.web.Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResponseDemo3", value = "/responseDemo3")
public class ResponseDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置获取流的编码 ISO-8859-1
//        response.setCharacterEncoding("gbk");
        //告诉浏览器，服务器发出的消息体数据的编码，建议浏览器使用该编码（可以直接设置流的编码，也可以设置浏览器使用的编码）
//        response.setHeader("content-type","text/html;charset=utf-8");
        //设置编码的简便方法
        response.setContentType("text/html;charset=utf-8");

        //1.获取字符输出流
        PrintWriter pw = response.getWriter();
        //2.输出数据
        pw.write("<h1>你好 response</h1>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
