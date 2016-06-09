/*
Описание класса калькулятора
 */
package calculator;

public class CCalculator {
   private int number1;
   private int number2;
   private int result;
   private int memory;

   //Конструктор по умолчанию
   
   public CCalculator() {
    }
   
   
    //Геттеры
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getMemory() {
        return memory;
    }

    public int getResult() {
        return result;
    }
    
    //Сеттеры
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    //Ввод чисел с клавиатуры
      
    //Методы действий с двумя числами    
    public int sum (){
        result = number1 + number2 ;   
        return result;
    }
    
    public int minus(){
        result = number1 - number2 ;   
        return result;
    }
    
    public int multiply(){
        result = number1 * number2 ;   
        return result;
    }
    
    public int division(){
        result = number1 / number2 ;   
        return result;
    }
    
    public int square(){
        result = number1 * number1 ;   
        return result;
    }
    
   public double squareRoot(){
        return result = (int) Math.sqrt(number1);
    }
      
    //Вывод результата
    public void resultOutput(){
        System.out.println(result);
    }
}
