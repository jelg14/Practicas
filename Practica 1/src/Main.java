  class Main{
		/*
		NOTAS IMPORTATES:
			*Siempre se declara el tipo de variable a usar y su nombre
			*#1: sentencia IF
			*#2: Despliegue numeros impares (Usando IF)
			*#3: Despliegue numeros Fibonacci (Usando sentencia FOR)
			*#4: sentencia SWITCH
			*#5: arreglos
			*#6: matrices
			
		*/
	 public static void main(String[] args){
		int var1 = 5151;
		int var2=2;
		
		// #1
		if(var2==1){
			var1+=1500;
			System.out.println("suma = "+var1);
		}else if(var2 == 2){
			var1-=1000;
			System.out.println("resta = "+var1);
		}
		
		
		//*#2
		int x = 10;
		for (int i=0; i<=x; i++){
			if(i%2 != 0){
				System.out.println(i);
			}
		}
		System.out.println(" ");
		
		//#3
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
		
		//#4
			int v=1;
			switch(v){
				case 0:
					System.out.println("opcion 0");
				break;
			
				case 1:
					System.out.println("opcion 1");
				break;
			
				default:
					System.out.println("Opcion por defecto");
				break;
			}
		
		//#5
			int ar[] = new int[10];
			ar[0] = 1;
			ar[1] = 4;
			ar[9] = 1000;
			System.out.println("---------");
			for(int i=0;i<ar.length;i++){
				System.out.println(ar[i]);
			}
		//#6
			int arg[][] = new int [2] [2];
			arg[0][0] = 10;
			arg[0][1] = 20;
			arg[1][0] = 30;
			arg[1][1] = 40;
			
			for(int i = 0; i<arg.length; i++){
				for(int j = 0; j<arg.length; j++){
					System.out.println(arg[i][j]);
				}
				
			}
		//#7
	 }
 }
 