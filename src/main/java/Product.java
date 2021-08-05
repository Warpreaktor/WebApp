import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Product extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);
    private int id;
    private String title;
    private int cost;

}
