<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<meta http-equiv="refresh" content="5" >
<title>Your Twitter (NOT!)</title>
</head>
<body>
	<div class="body">
		<table>
			<g:each in="${posts}" var="p" status="i">
				<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					<td><b><i>
							${p.username}
					</i></b></td>
					<td style="text-align: right;white-space: nowrap;">
						${p.dateCreated }
					</td>
				</tr>

				<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					<td colspan="2" style="padding-left:5em;">
						${p.post }
					</td>
					
				</tr>
			</g:each>
		</table>
	</div>
</body>
</html>