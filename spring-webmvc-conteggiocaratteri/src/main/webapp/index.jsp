<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci frase</title>
</head>
<body>
<div style="text-align: center;margin-top: 10%;">
<h1>Scegli l'Operazione :</h1>

<form action="conteggioParole">
<input type="text" id="testo" name="testo" placeholder="Inserisci testo"> 
<input type="submit" value="Conta Parole"> 
</form>
<br><br>

<form action="conteggioVocali">
<input type="text" id="testo" name="testo" placeholder="Inserisci testo"> 
<input type="submit" value="Conta Vocali"> 
</form>
<br><br>

<form action="conteggioConsonanti" style="margin-left: 2%;">
<input type="text" id="testo" name="testo" placeholder="Inserisci testo"> 
<input type="submit" value="Conta Consonanti"> 
</form>

</div>
</body>
</html>