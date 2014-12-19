•	groovy> println 2/3 
 
0.6666666667 

Si es exacto y corresponde 

•	groovy> println 7 * 8 
 
56

•	groovy> println (( 2 + 2 ) * 2) 
 
8 
•	groovy> println ( 2 + ( 2 * 2 ) ) 
 
6
•	teda un erorr

groovy.lang.MissingMethodException: No signature of method: ConsoleScript0.printnl() is applicable for argument types: (java.lang.Integer) values: [6]
Possible solutions: println(), println(), println(java.lang.Object), println(java.io.PrintWriter), println(java.lang.Object), print(java.lang.Object)

	at ConsoleScript0.run(ConsoleScript0:1)
 
 


•	java.lang.ArithmeticException: Division by zero

	at ConsoleScript0.run(ConsoleScript0:1)


•	no es el resultado esperado , es muy preciso al poner números decimales
groovy> println 2/3*3 
 
2.0000000001
 

•	se repite tres veces el hola por la multiplicación.
groovy> println "hola" * 3 
 
holahola

No es lo mismo te da un error
groovy> printnl 3*"hola" 
 
Exception thrown

groovy.lang.MissingMethodException: si signature of method: java.lang.Integer.multiply() is applicable for argument types: (java.lang.String) values: [hola]
Possible solutions: multiply(java.lang.Number), multiply(java.lang.Character)

	at ConsoleScript1.run(ConsoleScript1:1)
•	groovy> println "GroovyesGroovy"-"o" 
 
Grovyes
