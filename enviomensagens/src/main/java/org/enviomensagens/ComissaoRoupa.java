package org.enviomensagens;

public class ComissaoRoupa implements Comissao {

    public float comissao(float quantidadeVendas, float valorComissao) {
        return quantidadeVendas * valorComissao;
    }
}
