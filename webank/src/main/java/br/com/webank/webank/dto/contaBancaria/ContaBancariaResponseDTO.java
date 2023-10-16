package br.com.webank.webank.dto.contaBancaria;

import java.util.Date;

public class ContaBancariaResponseDTO extends ContaBancariaBaseDTO {
    private long id;
    private Date dataCadastro;
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
