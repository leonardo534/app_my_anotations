package com.leonardosilva.minhasanotacoes;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencias {
    private static final String NOME_ARQUIVO = "anotacao.preferencia";
    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private static final String CHAVE_NOME = "nome";


    public AnotacaoPreferencias(Context c) {
        this.context = c;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();
    }

    public void salvarAnotacao(String anotacao) {
        editor.putString(CHAVE_NOME, anotacao);
        editor.apply();
    }

    public String recuperarAnotacao() {

        return preferences.getString(CHAVE_NOME,"");
    }
}
