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
public class AudiA4 extends Cars {
    int num = 1;
    String name = "奥迪A4";
    int price = 500;
    int day = 0;
    double total_price = 0;
    int people = 4;
    double weight = 0;
    
    @Override
    public void info() {
        System.out.println(num+"    "+name+"  "+price+"元/天   "+"载人: "+people+"人");
        
    }
}
