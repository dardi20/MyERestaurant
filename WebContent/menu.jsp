<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="org.MyRestaurant.entity.product.Product"%>

<%@include file="include/header.jsp"%>

<div class="row info_main_row">
	<div class="col-md-6 col-lg-3">
		<div class="info_links">
			<strong>Menu</strong>
			<table border="1">
				<thead>
					<th>ProductId</th>
					<th>Name</th>
					<th>Price</th>
				</thead>
				<%
				List<Product> productList = (List)(request.getAttribute("productList"));
				for (int i = 0; i < productList.size(); i++) {

					out.print("<tr>");
					out.print("<td>" + productList.get(i).getProductId() + "</td>");
					out.print("<td>" + productList.get(i).getName() + "</td>");
					out.print("<td>" + productList.get(i).getPrice() + "</td>");
					out.print("</tr>");
				}
				%>
			</table>
		</div>
	</div>
</div>


<%@include file="include/footer.jsp"%>