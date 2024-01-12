import java.lang.Math.*;
public class Calculator{
    double first = 0 , second = 0, result = 0;
    String oP;

    Calculator(){};
    public void operation(String str){
        oP= str;
    }
   
    public void add(){ operation("+");}
    public void substract(){ operation("-");}
    public void multiply(){ operation("*");}
    public void divide(){ operation("/");}
    public void factorial(){ operation("!");}
    public void pow(){ operation("POW");}
    public void rootSquare(){ operation("sqrt");}
    public void nepLog(){ operation("ln");}
    
    public void compute() {
        if (oP == "+"){
            result = first + second;}
        if (oP == "-"){
            result = first - second ;
        }
        if (oP == "*"){
            result = first * second;
        }
        if (oP == "/"){
            result  = first / second;
        }
        if (oP == "!"){
            result  = Math.sqrt(2* Math.PI * first) * (Math.pow(first/ 2.718, first)) * (1 + (1 / (12 * first)));
        }
        if (oP == "POW"){
            result  = Math.pow(first, second);
        }
        if (oP == "sqrt"){
            result  = Math.sqrt(first);
        }
        if (oP == "ln"){
            result  = Math.log(first);
        }
    }
    public void clear(){
        first = second = 0;
    }
    public double  display(){
        return result;
    }

}