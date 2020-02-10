// Databricks notebook source
//val,var
val variable1:String ="hello world!"

// COMMAND ----------

var variable_var:String ="hello capgemini"
variable_var


// COMMAND ----------

var value1="hello"
var a="wrld"
var v=value1+a

// COMMAND ----------

val variable1="hey"
val f="world"
a=variable1 + f

// COMMAND ----------

val var_byte :Byte=12
val var_int :Int =2



// COMMAND ----------

print(f"hello, $var_int")


// COMMAND ----------

var a=2
if(a==2){
  println("correct")
}else{
  print("wrong")
    
}

// COMMAND ----------

for(i<- 1 to 5){
  print(i)
}

// COMMAND ----------

var a=4
while(a<4)
{
  print(f"hds,$a")
  a=a-1
}

// COMMAND ----------

def noDivisor(x:Int,y:Int):Float={
  x/y
}
noDivisor(4764,593)

// COMMAND ----------

def onlyPrime(x:Int):Unit={
  for(s <- 1 to 10){
    println(x*s)
  }
}

onlyPrime(5)

// COMMAND ----------

def third(a:Int,b:Int,f:Int =>Float):Float={
  f(a,b)
}
third(8,56,noDivisor)

// COMMAND ----------

def par(x:Double,y:Double):Double={
  x+y
}
par(3445,67)

// COMMAND ----------

def addNumber(var1:Double,var2:Double,func:(1Double,Double) =>Double):Double={
                                                                     
func(var1,var2)
}
addNumber(463,8549,par)

// COMMAND ----------

val tup=("hey","hi",123)
tup._1

// COMMAND ----------

var list1=List("hello","bye","hi","how")
list1.map( (x:String)=>(x,2))

// COMMAND ----------

var l1=List("hey","nidhi")
var l2=List("how","ru")
print(l1++l2)

// COMMAND ----------

var listString=List("hey","hello")
listString.map((x:String)=>x.reverse)

// COMMAND ----------

var list=List(1,2,3,4,5)
list.reduce((x:Int,y:Int)=>x+y)

// COMMAND ----------


