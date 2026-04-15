package array_listsecond.cinema;

import java.util.ArrayList;

public class Theater{
    private ArrayList<Client> seats;

    public Theater(int capacity){
        seats = new ArrayList<>();
        for(int i=0; i<capacity; i++){
            seats.add(null);
        }
    }

    private int search(String name){
        for(int i=0; i < seats.size(); i++){
            if( seats.get(i) != null && seats.get(i).getId().equals(name)){
                return i;
            }
        }
        return -1;

    }

    private boolean verifyIndex(int index){
        if(index >=0 && index < seats.size()){
            return true;
        }
        return false;
    }

    public boolean reserve(String id, int phone, int index){
        if(!verifyIndex(index)){
            System.out.println("fail: cadeira nao existe");
            return false;
        }

        if(search(id) != -1){
            System.out.println("fail: cliente ja esta no cinema");
            return false;
        }

        if(seats.get(index) != null){
            System.out.println("fail: cadeira ja esta ocupada");
            return false;
        }

        seats.set(index, new Client(id, phone));
        return true;
    }

    public boolean cancel(String id){
        int pos=search(id);
        if(pos==-1){
            System.out.println("fail: cliente nao esta no cinema");
            return false;
        }

        seats.set(pos, null);
        return true;
    }

    public ArrayList<Client>getSeats(){
        return seats;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < seats.size(); i++){
            if(i>0){
                sb.append(" ");
            }

            if(seats.get(i)== null){
                sb.append("-");
            }

            else{
                sb.append(seats.get(i).getId()).append(":").append(seats.get(i).getPhone());
            }
        }
        sb.append("]");
        return sb.toString();
    }



}
