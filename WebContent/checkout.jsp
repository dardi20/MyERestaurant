<%@page import="org.MyRestaurant.entity.product.Product"%>
<%@page import="java.util.List"%>
<%@page import="org.MyRestaurant.entity.Client"%>
<%@include file="include/header.jsp"%>

<div class="row info_main_row">
	<div class="col-md-6 col-lg-3">
		<div class="info_links">

			<h1>Checkout</h1>

			<%
			Client client = (Client) (request.getAttribute("client"));
			out.print("Client name: " + client.getName() + "<br />");
			out.print("Client adress: " + client.getAdress() + "<br />");
			out.print("Client cel: " + client.getCel() + "<br />");
			List<Product> productList = (List) (request.getAttribute("orderlist"));
			for (Product product : productList) {
				out.print(product.getProductId() + " " + product.getName() + "   " + product.getPrice() + "EUR <br />");
			}
			out.print("Total: " + request.getAttribute("totalSum") + "EUR" + "<br />");
			%>
		</div>

	</div>
</div>

<%@include file="include/footer.jsp"%>
