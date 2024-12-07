package br.edu.ifpr.pgua.eic.tads.controllers;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifpr.pgua.eic.tads.models.Cadastro;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class CadastroController {
    private Cadastro cadastro;

    public Handler get = (Context ctx)->{
        ctx.render("cadastro.html");
    };

    public Handler post = (Context ctx)->{
        String nome = ctx.formParam("nome");
        String cpf = ctx.formParam("cpf");


        cadastro.add(new Pessoa(nome, cpf));


        Map<String,Object> dados = new HashMap<>();
        
        dados.put("pessoas", cadastro.getPessoas());
        ctx.render("resposta.html", dados);
    };
}