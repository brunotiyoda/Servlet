<%
//scriplet


%>

<html>
<body>
<h2>Hello World!</h2>
<a href="nova-empresa.jsp" type="button">Redirecionamento</a>

<form action="/cadastro" method="post">
    <label>Cadastro</label>
    <input type="text" name="nome">

    <button type="submit">Cadastrar</button>

</form>

<form action="/cadastro">
    <button type="submit">Lista empresas</button>
</form>

</body>
</html>
