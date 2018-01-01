package cn.et.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.et.web.entity.News;
import cn.et.web.service.NewsManager;

/**
 * Servlet implementation class NewsContent
 */
public class NewsContent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsContent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		//获取ServletContext对象 获取在web.xml文件中设置的spring.xml文件位置的全局变量
		ServletContext sc = this.getServletContext();
		//创建Spring容器的实例
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		//获取业务逻辑层
		NewsManager nm = ac.getBean(NewsManager.class);
		String id = request.getParameter("id");
		News news = nm.getNewsById(id);
		request.setAttribute("news", news);
		request.getRequestDispatcher("/new.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
