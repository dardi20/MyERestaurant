<%@page import="org.MyRestaurant.entity.product.Product"%>
<%@page import="java.util.List"%>
<%@include file="include/header.jsp"%>

<div class="row info_main_row">
	<div class="col-md-6 col-lg-3">
		<div class="info_links">

			<form action="${pageContext.request.contextPath}/order" method="post">
				Name: <input type="text" name="name" required /> <br /> Address: <input
					type="text" name="address" required /> <br /> Cel: <input
					type="text" name="telNumber" required /> <br /> Gender: <input
					type="radio" name="gender" value="Male" checked="checked" />Male <input
					type="radio" name="gender" value="Female" />Female <br />
				Language: <input type="checkbox" name="language" value="Albanian" />Albanian<input
					type="checkbox" name="language" value="English" />English <br />
				My order:<br />
				<%
				List<Product> productList = (List) (request.getAttribute("menuList"));
				for (int i = 0; i < productList.size(); i++) {
					out.print("<input type=\"checkbox\" name=\"orderItems\" value = \"" + productList.get(i).getProductId() + "\"/>"
					+ productList.get(i).getName() +" ¦ "+productList.get(i).getPrice() +" EUR"+ "<br />");
				}
				%>
				<input type="submit" />
			</form>
		</div>
	</div>
</div>

<%@include file="include/footer.jsp"%>
