package unit01;

import java.io.IOException;
import java.io.PrintWriter; // 출력 스트림

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello") // 어노테이션, Annotation
// 문장이나 문서에 추가적인 정보를 기입하는 것을 말한다. 자바 프로그램에 영향을 주는 것이 아니라 컴파일할 때 환경 설정을 변경해 줄 것을 알려주는 주석 형태를 말한다.
// URL Mapping : 실제 서블릿 클래스를 공개하지 않기 위해서이다. 
// 실제 호출되는 서블릿 클래스는 HelloServlet이지만 외부에서 이 서블릿을 요청할 때에는 서블릿 클래스 이름이 아닌 서블릿 클래스와 매핑된 URL인 hello로 접근한다.
public class HelloServlet extends HttpServlet {
// 서블릿 클래스를 정의하는 것은 이미 정형화되어 있다. 
// 새롭게 서블릿 클래스를 정의하기 위해서는 javax.servlet.http 패키지에서 제공하는 HttpServlet 클래스를 상속받아 구현해야 하고
// 브라우저를 통해 외부에서 실행되기 때문에 접근 제한자는 반드시 public 이어야 한다.
	
	private static final long serialVersionUID = 1L; // 클래스를 구분하기 위한 값이다.
	// 객체의 직렬화와 같이 객체에 저장된 데이터를 일렬로 입출력할 때 JVM은 같은 클래스 이름과 버전 ID를 가진 객체를 출력합니다.
	// JVM은 버전 ID가 다른 객체의 직렬화된 형태와 연결하는 것을 거부합니다.
	// 클래스는 명시적으로 serialVersionUID 필드를 정의해 클래스 버전에 따른 고유 번호를 포함하기 때문입니다.
       

    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8"); // 클라이언트에게 응답할 페이지에 대한 환경 설정을 결정해 주어야 한다. text나 html로 보여주겠다는 의미이다.
		
/*
 * <<서블릿의 실행 방식>>
 * 일반적인 자바 클래스를 실행하기 위해서는 main 메소드가 있는 클래스에서 객체를 생성하여 실행해야 합니다.
 * 하지만 서블릿은 이런 방식으로 실행되지 않고 웹 서버가 실행을 해주는 독특한 방식을 갖습니다.
 * 서블릿은 Event-Driven Programming으로 사용자의 요청이 들어오면 동작(실행)을 시작합니다.
 * 요청이 들어오면 톰캣 서버가 서블릿 객체를 생성한 후에 init() 메소드를 호출한 후 요청 방식에 따라 doGet() 또는 doPost() 메소드가 호출됩니다.
 */
		
		PrintWriter out = response.getWriter(); 
// 출력 스트림인 PrintWriter 객체를 HttpServletResponse 객체의 getWriter()메소드로부터 얻어냅니다.
		out.print("<html><body><h1>"); // 하드코딩
		out.print("Hello Servlet");
		out.print("</h1></body></html>"); // 사용자에게 응답해줄 결과를 html로 만들어서 출력하는 문장.
		out.close(); // 자바에서 사용하는 모든 입출력 자원은 사용이 끝났으면 닫아주어야 한다.
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
}
