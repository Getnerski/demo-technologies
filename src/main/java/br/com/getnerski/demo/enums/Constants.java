package br.com.getnerski.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Constants {

    NOT_FOUND("Não encontrado"),
    DELETED_SUCCESS("Sucesso ao deletar"),
    DELETED_ERROR("Erro no delete"),
    DISABLED_SUCCESS("Sucesso ao desabilitar"),
    DISABLED_ERROR("Erro ao desabilitar")
    ;

    private final String message;
}
