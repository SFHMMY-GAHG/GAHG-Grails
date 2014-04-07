<%@ page import="spydi2kood.Post" %>



<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="post.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${postInstance?.username}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'post', 'error')} required">
	<label for="post">
		<g:message code="post.post.label" default="Post" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="post" required="" value="${postInstance?.post}"/>

</div>

