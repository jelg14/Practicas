  class Main{
		/*
		NOTAS IMPORTATES:
			* Siempre se declara el tipo de variable a 
				utilizar y su nombre.
			*#1: sentencia IF
			*#2: instruccion for
			*#3: Despliegue numeros impares
			*#4: Despliegue numeros Fibonacci
		*/
	 public static void main(String[] args){
		int var1 = 5151;
		int var2=2;
		
	 System.out.println("Number: "+var1);
		/* 
			*#1*
		if(var2==1){
			var1+=1500;
			System.out.println("suma = "+var1);
		}else if(var2 == 2){
			var1-=1000;
			System.out.println("resta = "+var1);
		}
		*/
		
		//*#3
		int x = 10;
		for (int i=0; i<=x; i++){
			if(i%2 != 0){
				System.out.println(i);
			}
		}
		System.out.println(" ");
		//#4
		int y=1;
		int ant= 0;
		int temp; /* var. temporal, donde se guarda valor de y antes
						de sumar con el valor anterior*/
		for(int i=0; i<=x; i++){
			System.out.println(y);
			temp=y;
			y+=ant;
			ant = temp;
			
		}
		
	 }
 }
 