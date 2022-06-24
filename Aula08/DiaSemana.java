package Aula08;

public enum DiaSemana {
    SEGUNDA(1),TERÇA(2),QUARTA(3),QUINTA(4),SEXTA(5),SABADO(6),DOMINGO(7);

    private int code;

    private DiaSemana(int c){code = c;}

    public int getCode(){return code;}

}
