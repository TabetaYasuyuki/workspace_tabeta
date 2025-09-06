

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/Session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(req,res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession(true);
		ArrayList<String> booklist = (ArrayList<String>)session.getAttribute("cart");
		if (booklist == null) {
			booklist = new ArrayList<String>();
		}else {
			req.setCharacterEncoding("utf-8");
			String book = req.getParameter("book");
			booklist.add(book);
		}
		session.setAttribute("cart",booklist);
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("""
				<html>
				<head>
				<title>注文画面</title>
				</head>
				<body>
					<h2>商品を選択してください</h2>
					<form action="/javaweb/session" method="post">
					<select name="book" size="1">
					<option value="超絶わかるJava">超絶わかるJava</option>
					<option value="小学生からはじめるJava">小学生からはじめるJava</option>
					<option value="Oracle試験100%合格本">Oracle試験100%合格本</option>
					</select><input type="submit" value="追加"/>
					</form>
					<h2>カートの中身</h2> """);
		for (int i = 0;i < booklist.size();i++) {
			out.println(booklist.get(i)+"</br>");
		}
		out.println("</body></html>");
				
		
	}

}
