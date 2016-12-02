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
public class SonghuaRiver extends Cars {
    int num = 5;
    String name = "松花江";
    int price = 400;
    int day = 0;
    double total_price = 0;
    int people = 0;
    double weight = 4;
    
    @Override
    public void info() {
        System.out.println(num+"    "+name+"  "+price+"元/天    "+"载货: "+weight+"吨");
    }
}
