package com.example.spring_web_swagger.handler;

public class CampoObrigatorioException extends BusinessException {
    public CampoObrigatorioException(String campo) {
        super("O campo %s é obrigatório", campo);
    }
}