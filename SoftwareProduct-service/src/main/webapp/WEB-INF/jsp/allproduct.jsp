<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h1>Product page</h1>

<ul>
	<c:forEach items="${products}" var="product">
		<li>${product}</li>
	</c:forEach>
</ul>


