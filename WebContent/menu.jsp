<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="org.MyRestaurant.entity.product.Product"%>

<%@include file="include/header.jsp"%>
<section class="layout_padding">
	<div class="col-md-5 col-lg-6 offset-md-5 offset-lg-2">
		<strong>Menu</strong>
		<table border="1">
			<thead>
				<th>ProductId</th>
				<th>Name</th>
				<th>Price</th>
			</thead>
			<%
			List<Product> productList = (List) (request.getAttribute("productList"));
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
</section>

<%@include file="include/footer.jsp"%>