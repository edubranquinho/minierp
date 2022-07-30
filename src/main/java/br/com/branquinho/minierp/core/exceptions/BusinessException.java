package br.com.branquinho.minierp.core.exceptions;

public class BusinessException extends RuntimeException {

    public BusinessException(String mensagem) {
        super(mensagem);
    }
}
