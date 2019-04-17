package unit01; // 패키지를 만듭니다. 패키지는 비슷한 프로그램들을 묶을 때 유용합니다.

import java.io.IOException; // 입출력 시 예외처리를 위한 클래스로 doGet 메소드의 throws 절에서 IOException을 사용했기에 임포트합니다.
import java.io.PrintWriter; //클라이언트에 결과를 출력하기 위한 out 객체를 PrintWriter 클래스로 선언했기 때문에 임포트합니다.

import javax.servlet.ServletException; // 서블릿에서 발생하는 예외처리를 위한 클래스로 doGet 메소드의 throws 절에서 ServletException을 사용했기에 임포트합니다.
import javax.servlet.annotation.WebServlet; // 15줄의 @WebServlet을 사용하기 위해 임포트합니다.
import javax.servlet.http.HttpServlet; // HttpServlet 클래스를 16줄에서 사용하기 때문에 임포트합니다.
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; // 9~10은 doGet과 doPost 메소드의 매개변수에서 사용한 모든 클래스를 사용하기 위한 구문입니다.

/**
 * Servlet implementation class AdditonServlet01
 */
@WebServlet("/AdditonServlet01") // 서블릿을 요청할 때 직접 클래스를 요청하는 것이 아니고 @WebServlet() 안에 기술된 URL로 요청을 하는 것이기에 요청 URL을 정하는 것입니다.
public class AdditonServlet01 extends HttpServlet { // HttpServlet에는 웹 애플리케이션으로 동작하도록 하는 기본 동작 즉 요청에 대한 응답이 가능하도록 하는 내용이 기술되어 있기 때문에 상속받아야 합니다.
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditonServlet01() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
// 서블릿이 요청을 받으면 이벤트 처리 방식으로 자동으로 호출되는 메소드입니다. HttpServlet에 정의된 메소드인데, 이를 오버라이딩해서 개발자가 요청이 있을 경우 어떤 처리를 해야 하는지 명시해 주어야 합니다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Additon</title></head>");
		out.println("<body>");
		out.println(num1 + "+" + num2 + "=" + add);
		out.println("</body>");
		out.println("</html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

/*
 * get방식 : 주소 창을 타고 넘어가기 때문에 서버로 보내는 데이터를 사용자가 그대로 볼 수 있습니다. 그래서 보안에 취약합니다. 255자 이하의 적은 양의 데이터를 전송합니다.
 * post방식 : html header를 타고 넘어가기 때문에 보안에 강합니다. 255자 이상의 대용량의 데이터를 전송합니다.
 **/
