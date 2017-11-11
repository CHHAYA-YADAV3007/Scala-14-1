/**
 * DemoCalc.scala
 * @author Chhaya Yadav
 * Compiled on 11th Nov 2017
 */
package scala141mypack

//Scala object declaration

object DemoCalc {
  
  
//main method declaration and definition
  
  def main(args : Array[String]):Unit = {
    
//Calculator class instantiation for various mathematical operations on integers    
    
    var c1 = new Calculator
    
    var a = 15
    
    var b = 10
    
    println("^^^^^^^^^^^^^^Addition Demo of Calculator Scala Class^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    println("Addition of "+a+" & "+b+ ": "+c1.add(a ,b ))
    
    println("^^^^^^^^^^^^^Subtraction Demo of Calculator Scala Class^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    println("Subtraction of "+a+" from "+b+ ": "+c1.substract(a, b))
    
    println("^^^^^^^^^^^^^Division Demo of Calculator Scala Class^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    println("Quotient of "+a+" divided by "+b+ ": "+c1.divide(a, b))
    
    println("^^^^^^^^^^^^^Multiplication Demo of Calculator Scala Class^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    println("Multiplication of "+a+" & "+b+ ": "+c1.multiply(a, b))
    
    println("^^^^^^^^^^^^^GCD Demo of Calculator Scala Class^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
    
    println("GCD of of "+a+" & "+b+ ": "+c1.calcGCD(a,b))
    
    println("-------------------------------------------------------------------------------")
   
    println("Calculator Demo for Rational Numbers with the help of Auxiliary Constructors");
    
//Declaration of first rational number in form of first argument as numerator and second argument as denominator of rational number
    
    var x = new Calculator(2,7);
    
//Declaration of second rational number in form of first argument as numerator and second argument as denominator of rational number
     
    
    var y = new Calculator(1,4);
    
    println("-------------------------------------------------------------------------------");
       
    println("Sum of "+x+" & "+y+ " : "+x.add(y));
    
    println("-------------------------------------------------------------------------------");
   
    
    println("Substraction of "+y+" from "+x+" : "+x.substract(y));
    
    println("-------------------------------------------------------------------------------");
   
    
    println("Multiplication product of "+y+" and "+x+" : "+x.multiply(y));
            
    println("-------------------------------------------------------------------------------");
   
    
    println("Division of "+x+" by "+y+" : "+x.divide(y));
    
    println("-------------------------------------------------------------------------------");
   
    
    
  }
  
  
}