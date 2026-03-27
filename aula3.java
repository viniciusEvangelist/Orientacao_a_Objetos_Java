public static void main(String[] args){
        boolean sair = false;
       do {


           String opcao = JOptionPane.showInputDialog("escolha qual figura geométrica deseja: \n" +
                   "1-triangulo \n" +
                   "2-quadrado\n" +
                   "3-retangulo\n" +
                   "4-trapezio\n" +
                   "5-circulo\n"+
                   "6-sair");
           switch (opcao) {
               case "1":
                   String lTriangulo = JOptionPane.showInputDialog("digite o valor do lado do triangulo: ");
                   float lTri = Integer.parseInt(lTriangulo);
                   float perimetro = lTri*3;
                   JOptionPane.showMessageDialog(null, "perimetro igual a: "+perimetro+ "\n"+
                           "area igual a: "+(lTri*lTri)/2);
                   break;
               case "2":
                   String lQuadrado = JOptionPane.showInputDialog("digite o valor do lado do quadrado: ");
                   float lQua = Integer.parseInt(lQuadrado);
                   float perimetro2 = lQua*4;
                   JOptionPane.showMessageDialog(null, "perimetro igual a: "+perimetro2+ "\n"+
                           "area igual a: "+lQua*lQua);
                   break;
               case "3":
                   String baseR = JOptionPane.showInputDialog("digite o valor da base do retangulo: ");
                   int a = Integer.parseInt(baseR);
                   String hR = JOptionPane.showInputDialog("digite o valor da altura do retangulo: ");
                   int b = Integer.parseInt(hR);
                   if (a == b){
                       JOptionPane.showMessageDialog(null, "isso é um quadrado");
                       break;
                   }
                   else {
                       JOptionPane.showMessageDialog(null, "o valor do perímetro é: "+ (a*2+b*2)+"\n"+
                               "a area do retangulo é: " + a*b);
                   }

           }
       }
       while(!sair);
    }
