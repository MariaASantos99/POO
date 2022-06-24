package Aula07;

import java.util.Scanner;

public class Ex7_3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        AgenciaViagem agencia = new AgenciaViagem("Agencia Aveiro", "Aveiro");

        //Colocar informação na Agencia de Viagem 
        //Apartamentos
        agencia.addAl(new Apartamento("A01", "ApartAveiro", "Aveiro", 50, 2));
        agencia.addAl(new Apartamento("A02", "ApartPorto", "Porto", 200, 4));
        agencia.addAl(new Apartamento("A03", "ApartLisboa", "Lisboa", 220, 5));
        agencia.addAl(new Apartamento("A04", "ApartCoimbra", "Coimbra", 130, 3));
        agencia.addAl(new Apartamento("A05", "ApartViseu", "Viseu", 150, 4));
        //Quartos de Hotel
        agencia.addAl(new Quarto("Q01", "Meliá Ria", "Aveiro", 80, "single"));
        agencia.addAl(new Quarto("Q02", "Albufeira Hotel", "Albufeira", 150, "double"));
        agencia.addAl(new Quarto("Q03", "ParisHotel", "Paris", 250, "double"));
        agencia.addAl(new Quarto("Q04", "Vila Gale Porto", "Porto", 100, "twin"));
        agencia.addAl(new Quarto("Q05", "Vila Gale Alentejo", "Alentejo", 200, "triple"));
        //Carros
        agencia.addCar(new Carro('A', "gasoleo"));
        agencia.addCar(new Carro('B', "hibrido"));
        agencia.addCar(new Carro('C', "gasolina"));
        agencia.addCar(new Carro('D', "eletrico"));
        agencia.addCar(new Carro('E', "hibrido"));
        agencia.addCar(new Carro('F', "gasoleo"));
        
        Alojamento[] al = agencia.getAl();
        Carro[] car = agencia.getCar();
        String id; 
        int cod, op = -1;
        System.out.println("Bem-Vindo a Agencia de Viagens " + agencia.getNome());
        do{
            op = main();
            sc.nextLine();
            switch(op){
                case 0:
                    System.out.println("Obrigado por confiar na Agencia de Viagens" + agencia.getNome() + ". Volte Sempre!");
                    break;
                case 1:
                    agencia.printRooms();
                    System.out.println("");
                    break;
                case 2:
                    agencia.printAparts();
                    System.out.println("");
                    break;
                case 3:
                    agencia.printCars();
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Id do quarto: ");
                    id = sc.nextLine();
                    for(Alojamento a : al){
                        if(a instanceof Quarto){
                            if(a.getDisp() &&  a.getCod().equals(id)){
                                a.checkIn();
                                System.out.println("Check-in do quarto efetuada com sucesso.\n");
                                break;
                            }else{
                                System.out.println("Quarto indisponivel \n");
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.print("ID do apartamento: ");
                    id = sc.nextLine();
                    for(Alojamento a : al){
                        if(a instanceof Apartamento){
                            if(a.getDisp() && a.getCod().equals(id)){
                                a.checkIn();
                                System.out.println("Reserva de apartamento efetuada com sucesso.\n");
                                break;
                            }else{
                                System.out.println("Apartamento indisponivel\n");
                                break;
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.print("ID do carro: ");
                    cod = sc.nextInt();
                    for(Carro c : car){
                        if(c.getDisp() && c.getId() == cod){
                            c.levantar();
                            System.out.println("Reservado o carro com sucesso. \n");
                            break;
                        }else{
                            System.out.println("Carro indisponivel \n");
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.print("ID do quarto: ");
                    id = sc.nextLine();
                    for(Alojamento a : al){
                        if(a instanceof Quarto){
                            if(a.getCod().equals(id) && !a.getDisp()){
                                a.checkOut();
                                System.out.println("Check-out do quarto efetuado com sucesso.\n");
                                break;
                            }else{
                                System.out.println("Quarto não reservado \n");
                                break;
                            }
                        }
                    }
                    break;
                case 8:
                    System.out.print("ID do apartamento: ");
                    id = sc.nextLine();
                    for(Alojamento a : al){
                        if(a instanceof Apartamento){
                            if(!a.getDisp() && a.getCod().equals(id)){
                                a.checkOut();
                                System.out.println("Check-out do apartamento efetuado com sucesso. \n");
                                break;
                            }else{
                                System.out.println("Apartamento não reservado \n");
                                break;
                            }
                        }
                    }
                    break;
                case 9:
                    System.out.print("ID do carro: ");
                    cod = sc.nextInt();
                    for(Carro c : car){
                        if(!c.getDisp() && c.getId() == cod){
                            c.entregar();
                            System.out.println("Entregue o carro com sucesso. \n");
                            break;
                        }else{
                            System.out.println("Carro não reservado. \n");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Introdução inválida! \n");
                    break;
            }
        }while(op != 0);
    }
    
    static int main(){        
        System.out.println("1. Ver Quartos de hotel");
        System.out.println("2. Ver Apartamentos");
        System.out.println("3. Ver Carros");
        System.out.println("4. Check-in um quarto de hotel");
        System.out.println("5. Check-in um apartamento");
        System.out.println("6. Reservar um carro");
        System.out.println("7. Check-out o quarto de hotel");
        System.out.println("8. Check-out o apartamento");
        System.out.println("9. Entregar o carro");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
        return sc.nextInt();
    }
}
