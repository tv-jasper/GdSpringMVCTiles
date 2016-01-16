<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core"%>

<ul style="list-style:none;line-height:28px;">

	<li><spring:url value="/index" var="homeUrl" htmlEscape="true" />
		<a href="${homeUrl}">Home</a>
	</li>

	<li><spring:url value="/viewPeson" var="personListUrl" htmlEscape="true" />
		<a href="${personListUrl}">Person List</a>
	</li>
	
	
	<c:forEach var="manu" items="${requestScope.manus}" varStatus="loopCounter">

		<li><spring:url value="${manu.id}" var="homeUrl" htmlEscape="true" />
			<a href="${homeUrl}"><c:out value="${manu.name}" /></a>
		</li>
		
	</c:forEach>

</ul>
