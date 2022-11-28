<%@page import="org.MyRestaurant.entity.product.Product"%>
<%@page import="java.util.List"%>
<%@include file="include/header.jsp"%>
<section class="layout_padding">
	<div class="col-md-5 col-lg-6 offset-md-5 offset-lg-2">

		<div class="heading_container">
			<h2>Make an order</h2>
		</div>
		<form action="${pageContext.request.contextPath}/order" method="post">
			<div>
				<input type="text" name="name" placeholder="Full Name " />
			</div>
			<div>
				<input type="text" name="celNumber" placeholder="Phone number" />
			</div>
			<div>
				<input type="email" placeholder="Email" />
			</div>

			<div class="heading_container">
				<h3>Pick from the menu</h3>
			</div>
			<%
			List<Product> productList = (List) (request.getAttribute("menuList"));
			for (int i = 0; i < productList.size(); i++) {
				out.print("<div><label><input type=\"checkbox\" name=\"orderItems\" id = \"product\"  value = \""
				+ productList.get(i).getProductId() + "\"/>" + productList.get(i).getName() + " ¦ "
				+ productList.get(i).getPrice() + " EUR" + "</label></div>");
			}
			%>
			<div class="d-flex ">
				<button type="submit">Check out</button>
			</div>
		</form>
	</div>
</section>
<%@include file="include/footer.jsp"%>