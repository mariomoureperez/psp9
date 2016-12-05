
package exercicio9;

import java.util.Scanner;


/**
 *
 * @author mmoureperez
 */
public class Fios extends Thread{
    
    public static int suma3=0;
    public static int suma5=0;
    String nome;
    
    public Fios(String nome){
        super(nome);
        this.nome=nome;
    }
    
    public void multiplos3(){
        for (int i = 0; i <= 1000; i++) {
            if(i%3==0){
                suma3+=i;
             //   notify();
            }
           
        } System.out.println("Suma dos multiplos de 3 e: "+suma3);
    }
    public void multiplos5(){
        for (int i = 0; i <= 1000; i++) {
            if(i%5==0){
                suma5+=i;
              //  notify();
            }
            
        }System.out.println("Suma dos multiplos de 5 e: "+suma5);
    }
    public void factorial(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingresa un numero positivo");
        int numero=entrada.nextInt();
        int numeroIntroducido=numero;
        double factorial=1;
        while(numero!=0){
          factorial=factorial*numero;
          numero--;
    }System.out.println("O factorial de "+numeroIntroducido+" e: "+factorial);
        }
        
    
    public void sumaMultiplos() throws InterruptedException{
      /*  while(suma3!=0){
            wait();
        }*/
        int sumaMul=suma3+suma5;
        System.out.println("Suma dos multiplos de 3 e 5: "+sumaMul);
    }
    
    @Override
    public void run(){
        if("suma3".equals(nome)){
            multiplos3();
        }else if("suma5".equals(nome)){
            multiplos5();
        }else if("factor".equals(nome)){
            factorial();
        }else{
            try {
                sumaMultiplos();
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
}
    }
    
}
