
package calculator;

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
    }
    
    public void drawHeadMenu(){        
        Scanner s = new Scanner(System.in);
        this.writeHeader();
        while (true){
            System.out.println("Выберите что Вы хотите сделать:");
            System.out.println("1. Операции с 2 числами");
            System.out.println("2. Операции с 1 числом");
            System.out.println("0. Выход");
            
            this.userChoice = s.nextByte();
            
            switch(userChoice){
                case 1: {this.drawCalc2NumbersMenu();
                }break;
                case 2: {this.drawCalc1NumberMenu();
                }break;
                case 0:{System.exit(0);
                }break;
                default:System.out.println("Ошибка. Сделайте правильный выбор!");
               break;
            }
        }
    }
    
    public void drawCalc1NumberMenu(){
        CCalculator calc = new CCalculator();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Введите число 1");
            calc.setNumber1(s.nextInt());  
            System.out.println("Сделайте Ваш выбор!");
            System.out.println("5.Квадратный корень первого числа");
                              System.out.println("1.Возведение в квадрат числа");
                              System.out.println("2.Квадратный корень числа");
                              System.out.println("3.Внести результат в память");
                              System.out.println("4. Взять результат из памяти");
                              System.out.println("******************************");
            this.userChoice = s.nextByte();                              
            switch (userChoice) {
              case 1: {
                  calc.square();
                  calc.resultOutput();
              }break;
              case 2: {
                  calc.squareRoot();
                  calc.resultOutput();
              }break;
              case 3: {
                  calc.setMemory(calc.getResult());
              }break;
              //реализовать после!!!
              case 4: {
              }break;
              default: System.out.println("Ошибка. Сделайте правильный выбор!");
               break;
            } 
        }    
        
    }
            
    public void drawCalc2NumbersMenu(){ 
        CCalculator calc = new CCalculator();
        Scanner s = new Scanner(System.in);
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
                              System.out.println("******************************");
            this.userChoice = s.nextByte();                              
          switch (userChoice) {
              case 1: {
                  calc.sum();
                  calc.resultOutput();
              }break;
              case 2: {
                  calc.minus();
                  calc.resultOutput();
              }break;
              case 3: {
                  calc.multiply();
                  calc.resultOutput();
              }break;
              case 4: {
                  calc.division();
                  calc.resultOutput();
              }break;
              case 5: {
                  calc.squareRoot();
                  calc.resultOutput();
              }break;
              case 6: {
                  calc.square();
                  calc.resultOutput();
              }break;
              case 7: {
                  calc.setMemory(calc.getResult());
              }break;
              //реализовать после!!!
              case 8: {
              }break;
              default: System.out.println("Ошибка. Сделайте правильный выбор!");
               break;
        }  
        
        }
            
    }
        
    }
