package net.exacode.embedded;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/" })
public class TimeServlet extends HttpServlet {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		logger.info("Received request");
		PrintWriter writer = response.getWriter();
		writer.println("TimeServlet executed.");
		writer.print("Current time: ");
		writer.println(new Date());
	}
}
