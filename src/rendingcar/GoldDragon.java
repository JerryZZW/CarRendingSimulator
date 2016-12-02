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
public class GoldDragon extends Cars {
    int num = 3;
    String name = "金龙";
    int price = 800;
    int day = 0;
    double total_price = 0;
    int people = 20;
    double weight = 0;
    
    @Override
    public void info() {
        System.out.println(num+"    "+name+"    "+price+"元/天   "+"载人: "+people+"人");
        
    }
}
