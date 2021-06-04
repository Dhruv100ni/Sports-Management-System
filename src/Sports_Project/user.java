/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sports_Project;

/**
 *
 * @author user
 */
public class user {
    private int Quantity,Cost;
    private String Infrastructure_id,Name,Type;
    
    public user(String Infrastructure_id,String Name,int Cost,String Type,int Quantity){
        this.Quantity=Quantity;
        this.Cost=Cost;
        this.Infrastructure_id=Infrastructure_id;
        this.Name=Name;
        this.Type=Type;
    }
    public  String getInfrastructure_id(){
        return Infrastructure_id;
    }
    public  String getName(){
        return Name;
    }
        public  int getCost(){
        return Cost;
    }
    public  String getType(){
        return Type;
    }
    public  int getQuantity(){
        return Quantity;
    }    
}
