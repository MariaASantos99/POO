package Aula08;

public class PratoVegetariano extends Prato{
    
    PratoVegetariano(String nome){
        super(nome);
    }

    @Override
    public boolean addIngrediente(Alimento a){
        boolean result = false;
        if(a instanceof AlimentoVegetariano){
            result = super.addIngrediente(a);
        }
        return result;
    }

    @Override
    public String toString(){
        return super.toString() + " - Prato Vegetariano";
    }
}
