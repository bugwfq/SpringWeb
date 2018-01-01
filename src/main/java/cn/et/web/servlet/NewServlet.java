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
 * Servlet implementation class NewServlet
 */
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String content = request.getParameter("content");
		//��ȡServletContext���� ��ȡ��web.xml�ļ������õ�spring.xml�ļ�λ�õ�ȫ�ֱ���
		ServletContext sc = this.getServletContext();
		//����Spring������ʵ��
		ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);
		NewsManager nm = ac.getBean(NewsManager.class);
		List<News> list = nm.getNewsByContent(content, null);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
