package cn.web.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet( "/requestDemo5")
public class RequestDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        post获取请求参数
//        String name = request.getParameter("username");
//        System.out.println("POST");
//        System.out.println(name);
//        String[] hobbies = request.getParameterValues("hobby");
//        for (String hobby : hobbies) {
//            System.out.println(hobby);
//        }
//        Enumeration<String> names = request.getParameterNames();
//        while(names.hasMoreElements()){
//            String name = names.nextElement();
//            System.out.println(name);
//            System.out.println(request.getParameter(name));
//            System.out.println("-----");
//        }
        Map<String, String[]> names = request.getParameterMap();
        Set<String> keyset = names.keySet();
        for (String name: keyset) {
            String[] values = names.get(name);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("--------------");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        System.out.println("GET");
        System.out.println(name);
    }
}
