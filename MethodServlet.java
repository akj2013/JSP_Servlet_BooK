package unit04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MethodServlet")
public class MethodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MethodServlet() {
        super();
        System.out.println("MethodServlet 클래스의 기본 생성자.");
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("init은 최초 한 번만 실행한다.");
	}

	public void destroy() {
		System.out.println("destroy는 최후 한 번만 실행한다.");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>get 방식으로 처리됨.</h1>");
		out.close();
		response.getWriter().append("Served at: ").append(request.getContextPath()); // 무슨 의미인가??
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>post 방식으로 처리됨.</h1>");
		out.close();
	}

}

/*
 * 쿼리 스트링이란?
 * 클라이언트에서 서블릿 클래스에 요청하는 방식에 대해서 살펴보았다면 사용자가 입력한 데이터가 서버로 보내져야 서버가 그 값으로 여러 가지 로직을 구현할 수 있기 때문에 이제 서블릿 클래스에서
 * 사용자가 입력한 값을 얻어오는 방법을 학습해 보도록 하겠습니다. 그럼 과연 서버는 사용자가 입력한 값을 어떻게 얻어 와야 할까요? 서버에서 클라이언트가 보낸 데이터를 얻어오기 위해서는 쿼리
 * 스트링이란 기술을 사용해야 합니다. 쿼리 스트링은 사용자가 입력한 데이터를 서버로 전달하는 가장 단순한 방법으로 널리 사용됩니다. 이 방법은 get 방식으로 요청했을 때 URL 주소 뒤에 입력
 * 데이터를 함께 제공하는 방법으로 다음과 같이 "리소스?이름=값"의 형식을 취합니다.
 * 		ParamServlet? id = pinksung & age = 15
 * 웹 프로그래밍에서는 데이터가 쿼리 스트링 형태로 서버로 전송되고 이렇게 전송된 데이터를 얻어오기 위해서 쿼리 스트링에서 언급한 이름을 알아야 데이터를 얻어올 수 있기 때문입니다. 
 * 더 나아가서 웹 프로그래밍을 하다 보면 쿼리 스트링 형태로 개발자가 직접 데이터를 넘겨주어야 할 경우가 있기 때문에 쿼리 스트링에 대해 좀더 자세히 알아보겠습니다.
 * 그럼 왜 데이터를 쿼리 스트링으로 전송하는 걸까요?
 * 웹 프로그램에서는 현재 페이지의 정보를 바로 다음 페이지에서 전혀 알 수 없습니다. 페이지가 이동되어 버리면 이전 페이지의 값들은 모두 잃게 됩니다. 하지만 프로그램을 만들다 보면 페이지 사이에
 * 정보 교환이 필요한 경우가 있는데 이를 위해서 웹 프로그래밍에서 제공하는 것이 쿼리 스트링입니다.
 * 쿼리 스트링은 브라우저 URL의 주소 입력란에서 확인할 수 있습니다. 
 * */
