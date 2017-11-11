/**
 * Calculator.scala
 * @author Chhaya Yadav
 * Compiled on 11th Nov 2017
 */
//Scala package declaration

package scala141mypack

// This program illustrates SCALA program which performs addition ,substraction,multiplication and division
// of whole numbers.integers and rational numbers with the help of auxiliary constructors.

// In addition, it implements this by method overloading.

// Moreover,it calculates GCD/HCF of two whole numbers.

// Scala Class Calculator's declaration and definition

class Calculator {
  
//Class variables
  
  var a = 0
  
  var b = 0
  
  var denom = 1;
  
  var num = 0;

//auxiliary constructor declaration for rational numbers
  
  def this(n:Int , d:Int) {
    
    this()
    
    this.denom = d
    
    this.num = n
  }

//function declaration for addition of two whole numbers  
  
  def add(a:Int ,b :Int):Int = { return a+b }
  
//function declaration for substraction of two whole numbers  
  
  def substract(a:Int ,b :Int):Int = { return a-b }
  
//function declaration for division of two whole numbers  
  
  def divide(a:Int ,b :Int):Int = { return a/b }
  
//function declaration for the multiplication of two whole numbers  
  
  def multiply(a:Int ,b :Int):Int = { return a*b  }
  
//function declaration for calculating the GCD of two whole numbers  
  
  def calcGCD(a:Int ,b :Int):Int= {
    
      var i = 1;

      var gcd = 1;

//
  
  while((a>=i) && (i<=b)) {
    
//if the number divides both the user input ,then save it as GCD   
    
   if((a%i==0) && (b%i==0)) {
   
     gcd = i;
    
    }

    i  = i + 1;
   }
//return the GCD/HCF
    
    return gcd
  }
  
  
//overriding the function of addition to calculate the sum of 2 rational numbers
  
  def add(r:Calculator)={
    
    new Calculator((num * r.denom + denom * r.num),(denom * r.denom))
    
  }
    
//overriding the function of substraction to calculate the sum of 2 rational numbers
  
  def substract(r:Calculator)={
    
    new Calculator((num * r.denom - denom * r.num),(denom * r.denom))
  }
    
//overriding the function of multiplication to calculate the sum of 2 rational numbers
  
  def multiply(r:Calculator)={
    
    new Calculator(num *r.num , denom *r.denom)
    
  }  
//overriding the function of division to calculate the sum of 2 rational numbers
  
  def divide(r:Calculator)={
    
    new Calculator((num * r.denom),(denom * r.num))
    
  }
  
//overriding the toString method of object class for string representation of Calculator class object 
  
  override def toString = num + "/" + denom
}