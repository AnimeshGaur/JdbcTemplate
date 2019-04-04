<%@page import="java.util.List"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="dao.ProductDaoImpl"%>
<%
	ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
	ProductDaoImpl p = (ProductDaoImpl) ac.getBean("ProductDaoImpl");

	List list=  p.getCourseNotes(null, request.getParameter("sid"), request.getParameter("name"), request.getParameter("email"), request.getParameter("address"), request.getParameter("pincode"), request.getParameter("mobile"));
	
	
	%>