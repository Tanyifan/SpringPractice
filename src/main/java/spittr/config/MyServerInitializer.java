package spittr.config;

import org.springframework.web.WebApplicationInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;


/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/15
 */
public class MyServerInitializer implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        Dynamic myServlet = servletContext.addServlet("myServlet",MyServlet.class);//注册servlet
//        myServlet.addMapping("/custom/**");
    }
}
