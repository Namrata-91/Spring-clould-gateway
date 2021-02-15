<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<body>
    <h1>Add new Product</h1>
    <div id="list">
		<form  action="/hardware/productPage" method="post" modelAttribute="product">
			<p>
				<label>Enter Product Id</label>
				<input type = "text" name="id" />
			</p>
			<p>
				<label>Enter product Name</label>
				<input type = "text" name="name" />
			</p>
			<p>
				<label>Enter product details</label>
				<input type = "text" name="details" />
			</p>
			<p>
				<label>Enter product amount</label>
				<input type = "text" name="amount" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form>
		</div>
</body>
</html>