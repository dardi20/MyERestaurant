<%@include file= "include/header.jsp"%>

<div class="row info_main_row">
	<div class="col-md-6 col-lg-3">
		<div class="info_links">
		
			<form action="${pageContext.request.contextPath}/order" method="post">
				Name: <input type="text" name="name" required /> <br /> 
				Address: <input type="text" name="address" required /> <br /> 
				
				Gender: <input
					type="radio" name="gender" value="Male" checked="checked" />Male <input
					type="radio" name="gender" value="Female" />Female <br /> 
					Language: <input
					type="checkbox" name="language" value="Albanian" />Albanian<input
					type="checkbox" name="language" value="English" />English <br /> 
					My order: <select
					name="orderItems" multiple="multiple">
					<option value="100">Pizza Margarita</option>
					<option value="101">Pizza Salami</option>
					<option value="102">Pizza Quattro Formagi</option>
					<option value="103">Pizza Diavolo</option>
					<option value="200">Ice Tea Peach</option>
					<option value="201">Ice Tea Lemmon</option>
					<option value="202">Ice Tea WaterMelon</option>
					<option value="203">Ice Tea Zero</option>
					<option value="204">Pepsi</option>
					<option value="205">Coca Cola</option>
					</select>
					<br/>
					<input type="submit" />
			</form>
		</div>
	</div>
</div>

<%@include file= "include/footer.jsp"%>
