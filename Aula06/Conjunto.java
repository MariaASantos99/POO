package Aula06;

public class Conjunto {
    private int[] numeros = new int[10];
    private int count = 0;

    void insert(int n){
        if(count == numeros.length){
            int[] tmp = numeros;
            System.arraycopy(numeros, 0, tmp, 0, count);
            numeros = new int[count*2];
            System.arraycopy(tmp, 0, numeros, 0, count);
        }
        if(!contains(n)){
            numeros[count++] = n;
        }
    }

    boolean contains(int n){
        boolean valid = false;
        for(int i: numeros){
            if(n == i){ 
                valid = true;
                break;
            }
        }
        return valid;
    }
    
    void remove(int n){
        if(contains(n)){
            int size = 0;
            for(int i: numeros){
                if(i != n){
                    numeros[size++] = i;
                }
            }
            count--;
        }
    }

    void empty(){count = 0;}

    public String toString(){
        String numbers = "";
        for(int i = 0; i < count; i++){
            numbers += numeros[i]+" ";
        }
        return numbers;
    }

    int size(){ return count;}

    int[] getNumeros(){return this.numeros;} 

    Conjunto unir(Conjunto add){
        Conjunto conj = this;
        for(int i : add.getNumeros()){
            conj.insert(i);
        }
        return conj;
    }

    Conjunto subtrair(Conjunto dif){
        Conjunto conj = new Conjunto();
        for(int i: this.numeros){
            if(!dif.contains(i)){
                conj.insert(i);
            }
        }
        return conj;
    }

    Conjunto intersect(Conjunto inter){
        Conjunto conj = new Conjunto();
        for(int i: this.numeros){
            if(inter.contains(i)){
                conj.insert(i);
            }
        }
        return conj;
    }

}
