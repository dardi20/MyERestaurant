<%@page import="org.MyRestaurant.entity.product.Product"%>
<%@page import="java.util.List"%>
<%@page import="org.MyRestaurant.entity.Client"%>
<%@include file="include/header.jsp"%>
<section class="layout_padding">
	<div class="col-md-5 col-lg-6 offset-md-5 offset-lg-2">
		<h1>Checkout</h1>

		<%
		Client client = (Client) (request.getAttribute("client"));
		out.print("Client name: " + client.getName() + "<br />");
		out.print("Client adress: " + client.getAdress() + "<br />");
		out.print("Client cel: " + client.getCel() + "<br />");
		out.print("Client email: " + client.getEmail() + "<br />");
		List<Product> productList = (List) (request.getAttribute("orderlist"));
		for (Product product : productList) {
			out.print(product.getProductId() + " " + product.getName() + "   " + product.getPrice() + "EUR <br />");
		}
		out.print("Total: " + request.getAttribute("totalSum") + "EUR" + "<br />");
		%>
	</div>


</section>
<%@include file="include/footer.jsp"%>
