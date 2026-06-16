public class OOLana { 
       public static void main(String[] args) {
                Scanner lerNumero = new Scanner(System.in);
                System.out.println("digite o valor de x: ");
                float x = lerNumero.nextFloat();
                System.out.println("digite o valor de y: ");
                float y = lerNumero.nextFloat();
                System.out.println("o valor da soma de x + y é:  "+(x+y));
                System.out.println("o valor da subtração de x - y é: "+(x-y));
                System.out.println("o valor da multiplicação de x * y é: "+(x*y));
                System.out.println("o valor da divisão de x/y é: " + (x/y));
                System.out.println("o valor da x^y é: "+(Math.pow(x,y))); 
         }
       public static void main(String[] args){
               JOptionPane.showMessageDialog(null, "Esse programa calcula o valor da expressão a*a = (b*b)+(c*c)");
               String valor1 = JOptionPane.showInputDialog("digite o valor de a: ");
               int a = Integer.parseInt(valor1);
               String valor2 = JOptionPane.showInputDialog("digite o valor de b: ");
               int b = Integer.parseInt(valor2);
               String valor3 = JOptionPane.showInputDialog("digite o valor de c ");
               int c = Integer.parseInt(valor3);
               if ((b*b)+(c*c)==a*a) {
                  JOptionPane.showMessageDialog(null, "substituindo os valores de a, b e c na expressão \n" +
                          "a*a = (b*b)+(c*c) \n" +
                          "temos "+ a+"*"+a+" = "+ b+"*"+b +"+"+ c+"*"+c+ "\n"+
                          "o valor da expressão é: " +a*a);
               }
               else {
                  JOptionPane.showMessageDialog(null, "digite um valor válido" );
               }
        } 
}       
