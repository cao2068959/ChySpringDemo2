package chy;

import chy.controller.MyController;
import chy.spring.context.ChyAppilicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("+++++++++++++++++++++++");
        super.service(req, resp);
    }

    public String xxx(){
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Pattern compile = Pattern.compile("execution\\((.*)\\)");
        Matcher matcher = compile.matcher("execution(dfsfsdf fsddad 3434)");
        System.out.println(matcher.find());
        System.out.println(matcher.group(1));

        Class<Test> testClass = Test.class;
        Method xxx = testClass.getDeclaredMethod("xxx");
        System.out.println(xxx.toString());
        ChyAppilicationContext chyAppilicationContext = new ChyAppilicationContext("application.properties");
        MyController bean = chyAppilicationContext.getBean(MyController.class);
        bean.test(1,"22",null);
    }

}
