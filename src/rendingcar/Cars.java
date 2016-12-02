/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendingcar;

/**
 *
 * @author zhangzhewei
 */
public abstract class Cars {
    int num;
    String name;
    int price;
    int day;
    double total_price;
    int people;
    double weight;
    
    public double calRent(int price,int day){
        total_price = price * day;
        return total_price;
                
    }
    
    public void info() {
        System.out.println(num+"  "+name+"  "+price+"元/天      "+"载人: "+people+"人");
        
    }
    
}
