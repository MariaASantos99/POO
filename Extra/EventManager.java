package Maria_87965;

import java.time.LocalDate;
import java.util.*;

//package 87965;
public class EventManager {
    
    private String name;
    private Set<Client> clientes;
    private Map<Client, Event> events;

    public EventManager(String name){
        this.name =  name;
        clientes = new TreeSet<>();
        events = new HashMap<>();
    }

    public Client addClient(String nomeClient, String localClient){
        Client c1 = new Client(nomeClient, localClient);
        if(!clientes.contains(c1)){
            clientes.add(c1);
            return c1;
        }else{
            return null;
        }   
    }

    public Event addEvent(Client cl, LocalDate date){
        boolean verif = true;
        if(events.size() != 0){
            Collection<Event> eventos = events.values();
            for(Event ev : eventos){
                if(ev.getDate() == date){
                    verif = false;
                    break;
                }
            }
            if(!verif){
                return null;
            }
            return new Event(cl, date);
        }else{
            events.put(cl, new Event(cl, date));
            return new Event(cl, date);
        }
    }

    public String listClients(){
        return String.format("Clients: \n %s ", clientes);
    }

    public String listEvents(){
        return String.format("Events: \n %s ", events);
    }

    public String[] clientsWithEvents(){
        Collection<Client> cl = events.keySet();
        String[] clientWithEvent = new String[1];
        int count = 0;
        for(Client c: clientes){
            for(Client c1 : cl){
                if(c.getName().equals(c1.getName()) && c.getLocal().equals(c1.getLocal())){
                    if(clientWithEvent.length == count){
                        String[] temp = new String[clientWithEvent.length +1];
                        System.arraycopy(clientWithEvent, 0,temp , 0, clientWithEvent.length);
                        clientWithEvent = temp;
                    }
                }
            }
        }
        return clientWithEvent;
    }

    public String[] nextEventsByDate(){
        Collection<Event> ev = events.values();
        return ;
    }
}
