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
public class Mazada6 extends Cars {
    int num = 2;
    String name = "马自达6";
    int price = 400;
    int day = 0;
    double total_price = 0;
    int people = 4;
    double weight = 0;
    
    @Override
    public void info() {
        System.out.println(num+"    "+name+" "+price+"元/天    "+"载人: "+people+"人");
        
    }
    
}
