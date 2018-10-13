<%
    String empresa = (String) request.getAttribute("nomeDaEmpresa");
%>


<html>
<body>
<h2>Bem-vindo!</h2>

<h2>Empresa <%= empresa %> cadastrada com sucesso.</h2>


<a href="index.jsp" type="button">Voltar</a>
</body>
</html>
