package cn.web.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requestDemo2")
public class RequestDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求头
//        Enumeration<String> headernames = request.getHeaderNames();
//        while(headernames.hasMoreElements()){
//            String name = headernames.nextElement();
//            String value = request.getHeader(name);
//            System.out.println(name+ "-----" + value);
//        }

//        String agent = request.getHeader("user-agent");
//        if(agent.contains("Chrome")){
//            System.out.println("Chrome");
//        }else if (agent.contains("Firefox")){
//            System.out.println("FireFox");
//        }else if(agent.contains("Edge")){
//            System.out.println("Edge");
//        }
        System.out.println(request.getHeader("user-agent"));
    }
}
