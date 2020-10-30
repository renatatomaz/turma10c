function preencherMusicas(lista){
    var tabela = 
    "<table border='1' align='center' width='80%' cellspacing='2'>" +
    "<tr>" + 
    "<th>Musica</th><th>Artista</th><th>Cadastro</th>" +
    "</th>";

    for (cont=0; cont < lista.length; cont++){
        tabela+= "<tr>"+
        "<td>" + lista[cont].titulo + "</td>" +
        "<td>" + lista[cont].artista.nome + "</td>" +
        "<td>" + lista[cont].cadastro + "</td></tr>";
    }

    tabela += "</table>";
    document.getElementById("resultado").innerHTML = tabela;
} 

function filtrar() {
    var valor = document.getElementById("cmblancamento").value;
    fetch("http://localhost:8080/lancamento/" + valor)
        .then(res => res.json()) // Indica que se der certo converte o resultado em json
        .then(res => preencherMusicas(res))
        .catch(err => {
            window.alert("Musica não encontrada!");
        });
}

function carregarusuario(){
    var usuario = localStorage.getItem("usuariologado");
    if (usuario == null) {
        window.location = "index.html";
    } else {
        var usuarioJson = JSON.parse(usuario);
        document.getElementById("dados").innerHTML = 
        "<h3>Nome: " + usuarioJson.nome + "<br>Email: " + usuarioJson.email + "</h3>";
        document.getElementById("foto").innerHTML =
        "<img width='25%' height='75%' alt='Sem foto' src=imagens/" + usuarioJson.foto + ">";
    }
}


function logar() {
    var usuario = {
        email: document.getElementById("txtemail").value,
        senha: document.getElementById("txtsenha").value
    };

    var conteudo = {
        method: "POST",
        body: JSON.stringify(usuario),
        headers: {
            "Content-type": "application/json"
        }
    };

    fetch("http://localhost:8080/login", conteudo)
        .then(res => res.json()) // Indica que se der certo converte o resultado em json
        .then(res => {
             localStorage.setItem("usuariologado", JSON.stringify(res));
             window.location = "usuario.html"; 
            }) // Indica e se der certo informa para mim o nome
        .catch(err => {
             window.alert("Deu ruim"); 
            }); // Caso os anteriores dê errado o que fazer?

    }