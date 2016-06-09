
package calculator;
import java.util.Scanner;

import java.util.Scanner;

public class Menu {
    
    private byte userChoice;

    public Menu() {
    }

    public byte getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(byte userChoice) {
        this.userChoice = userChoice;
    }

   
    
    public void writeHeader(){
    System.out.println("Калькулятор v1.0");
    System.out.println("*****************");
    System.out.println("*****************");
    }
    
    public void drawMenu(){        
        CCalculator calc = new CCalculator();
        Scanner s = new Scanner(System.in);
        this.writeHeader();
        while (true){
            System.out.println("Введите число 1");
            calc.setNumber1(s.nextInt());            
            System.out.println("Введите число 2");
            calc.setNumber2(s.nextInt());            
            System.out.println("Сделайте Ваш выбор!");
                              System.out.println("1.Сложение");
                              System.out.println("2.Вычитание");
                              System.out.println("3.Умножение");
                              System.out.println("4.Деление");
                              System.out.println("5.Квадратный корень первого числа");
                              System.out.println("6.Возведение в квадрат первого числа");
                              System.out.println("7.Внести результат в память");
                              System.out.println("8. Взять результат из памяти");
                              System.out.println("9. Выход");
            this.userChoice = s.nextByte();                              
          switch (userChoice) {
              case 1: {
                  calc.sum();
              }break;
              case 2: {
                  calc.minus();
              }break;
              case 3: {
                  calc.multiply();
              }break;
              case 4: {
                  calc.division();
              }break;
              case 5: {
                  calc.squareRoot();
              }break;
              case 6: {
                  calc.square();
              }break;
              case 7: {
                  calc.setMemory(calc.getResult());
              }break;
              //реализовать после!!!
              case 8: {
              }break;
              case 9: {System.exit(1);
              }break;
              default: System.out.println("Ошибка. Сделайте правильный выбор!");
               break;
          }  
        }
        
    }
    
}
