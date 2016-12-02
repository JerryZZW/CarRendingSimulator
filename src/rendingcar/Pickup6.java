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
public class Pickup6 extends Cars {
    int num = 4;
    String name = "皮卡雪6";
    int price = 450;
    int day = 0;
    double total_price = 0;
    int people = 4;
    double weight = 2;
    
    @Override
    public void info() {
        System.out.println(num+"    "+name+" "+price+"元/天    "+"载人: "+people+"人"+" "+"载货: "+weight+"吨");
    }
    
}
