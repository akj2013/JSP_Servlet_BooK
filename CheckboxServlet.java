// HTML 문서에서 선택된 체크 박스 값을 처리하는 서블릿 클래스이다.

package unit09;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CheckboxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		String items[] = request.getParameterValues("item");
		// 지정한 이름을 가진 파라미터의 모든 값을 배열 형태로 얻어오기 때문에 동일한 이름으로 여러 번 값이 전송되어도 이를 처리할 수 있습니다.
		if(items == null) {
			out.print("선택한 항목이 없습니다.");
		} else {
			out.println("당신이 선택한 항목입니다.<hr>");
			for (String item : items) {
				out.print(item + " ");
			}
		}
		out.println("<br><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
