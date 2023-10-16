package br.com.webank.webank.dto.contaBancaria;

import br.com.webank.webank.dto.titular.TitularRequestDTO;

public class ContaBancariaRequestDTO extends ContaBancariaBaseDTO{
    
    private TitularRequestDTO titular;

    public TitularRequestDTO getTitular() {
        return titular;
    }

    public void setTitular(TitularRequestDTO titular) {
        this.titular = titular;
    }
}
