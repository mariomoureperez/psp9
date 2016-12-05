package exercicio9;
/**
 *
 * @author mmoureperez
 */
public class Exercicio9 {

    public static void main(String[] args) {
        
        
        Fios mul3=new Fios("suma3");
        mul3.setPriority(10);
        mul3.start();
        Fios mul5=new Fios("suma5");
        mul5.setPriority(9);
        mul5.start();
        Fios factor=new Fios("factor");
        factor.setPriority(5);
        factor.start();
        Fios suma=new Fios("suma");
        suma.setPriority(1);
        suma.start();
        
        
    }
    
}
