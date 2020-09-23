package com.uniso.lpdm.estoque_aula6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EstoqueActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estoque);
    }

    public void onClickCadastrarEmail(View view){
        /*Aqui inserimos o código que será utilizado quando o botão para cadastrar
        * email da atividade for clicado*/
        Intent intent = new Intent(this, CriarEmailActivity.class);
        startActivity(intent);
    }

    public void onClickNovo(View view){
        /*Aqui inserimos o código que será utilizado quando o botão para cadastrar
         * novo produto da atividade for clicado*/
        Intent intent = new Intent(this, NovoProdutoActivity.class);
        startActivity(intent);
    }
}