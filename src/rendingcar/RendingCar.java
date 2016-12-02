/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendingcar;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author zhangzhewei
 */
public class RendingCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user_input = new Scanner(System.in);
        ArrayList allCar = new ArrayList();
        
        System.out.println("欢迎使用答答租车系统:\n您是否要租车: 1是 0否");
        
        int input = user_input.nextInt();
        int allPeople = 0;
        double allWeight = 0;
        double totalPrice = 0;
        
        AudiA4 audi = new AudiA4();
        Mazada6 mazada = new Mazada6();
        GoldDragon goldDragon = new GoldDragon();
        Pickup6 pickup = new Pickup6();
        SonghuaRiver songhuaRiver = new SonghuaRiver();
        Truck truck = new Truck();
        
        if(input == 1) {
            System.out.println("您可租车的类型及其价目表:");
            System.out.println("序号  汽车名称  租金      容量");
            audi.info();
            mazada.info();
            goldDragon.info();
            pickup.info();
            songhuaRiver.info();
            truck.info();
            
            System.out.println("请输入您要租车的数量:");
            int num = user_input.nextInt();
            int CarNum = 1;
            
            while(CarNum <= num) {
                System.out.println("请输入第"+CarNum+"辆车的序号:");
                int carNum = user_input.nextInt();
                allCar.add(carNum);
                if(carNum > 6 || carNum <= 0) {
                    System.out.println("您输入的数字无效,请重新输入.");
                }
                else{
                    CarNum++;
                }
            }
            
            System.out.println("请输入租车天数:");
            int dayOfRent = user_input.nextInt();
            
            System.out.println("您的账单:");
            System.out.println("***可载人的车有:");

            for(int i=0; i<allCar.size(); i++) {
                switch((int)allCar.get(i)){
                    case 1:
                        System.out.println(audi.name);
                        allPeople += audi.people;
                        break;
                    case 2:
                        System.out.println(mazada.name);
                        allPeople += mazada.people;
                        break;
                    case 3:
                        System.out.println(goldDragon.name);
                        allPeople += goldDragon.people;
                        break;
                    case 4:
                        System.out.println(pickup.name);
                        allPeople += pickup.people;
                        break;
                    default:
                        break;
                }
             
            }
            
            System.out.println("共载人: "+allPeople+"人");
            
            System.out.println("***载货的车有:");
            
            for(int i=0; i<allCar.size(); i++) {
                switch((int)allCar.get(i)){
                    case 4:
                        System.out.println(pickup.name);
                        allWeight += pickup.weight;
                        break;
                    case 5:
                        System.out.println(songhuaRiver.name);
                        allWeight += songhuaRiver.weight;
                        break;
                    case 6:
                        System.out.println(truck.name);
                        allWeight += truck.weight;
                        break;
                    default:
                        break;
                }
            }
            
            System.out.println("共载货: "+allWeight+"吨");
            
            System.out.println("***租车总价格:");
            
            for(int i=0; i<allCar.size(); i++) {
                switch((int)allCar.get(i)) {
                    case 1:
                        totalPrice += audi.calRent(audi.price, dayOfRent);
                        break;
                    case 2:
                        totalPrice += mazada.calRent(mazada.price, dayOfRent);
                        break;
                    case 3:
                        totalPrice += goldDragon.calRent(goldDragon.price, dayOfRent);
                        break;
                    case 4:
                        totalPrice += pickup.calRent(pickup.price, dayOfRent);
                        break;
                    case 5:
                        totalPrice += songhuaRiver.calRent(songhuaRiver.price, dayOfRent);
                        break;
                    case 6:
                        totalPrice += truck.calRent(truck.price, dayOfRent);
                        break;
                    default:
                        break;
                }
            }
            
            System.out.println(totalPrice+"元");
            
        }
        else if(input == 0) {
            System.out.println("已退出系统");
        }
        else{
            System.out.println("无效的值,请输入0或1");
        }
    }
    
}
