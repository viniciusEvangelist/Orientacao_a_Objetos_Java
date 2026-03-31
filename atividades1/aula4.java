/*public static void main(String[] args){
        int lados[];
        lados = new int[3];
        Scanner lado = new Scanner(System.in);
        System.out.println("digite os valores dos lados do triangulo: ");
        lados[0] = lado.nextInt();
        lados[1] = lado.nextInt();
        lados[2] = lado.nextInt();
        for(int i = 0; i < 2; i++){
                System.out.println(lados[i]);
        }
        if (Math.abs(lados[1]-lados[2])<lados[0] && lados[0]<(lados[1]+lados[2])&&
        Math.abs(lados[2]-lados[0])<lados[1] && lados[1]<(lados[0]+lados[2])&&Math.abs(lados[0]-lados[1])
        <lados[2]&&lados[2]<(lados[0]+lados[1])){
                System.out.println("eh triangulo");
                }
        else{
                System.out.println("nao eh triangulo");
        }
        }*/
 public static void main(String[] args) {
           String bin = "";
           Scanner lerNumero = new Scanner(System.in);
           System.out.println("digite um numero decimal, que sera convertido para binario: ");
           int dec = lerNumero.nextInt();
           if (dec < 0) {
                   System.out.println("digite um numero positivo");
                   return;
           }
           else {
                   do {
                           if (dec % 2 == 0) {
                                   bin = "0" + bin;
                           }
                           else {
                                   bin = "1" + bin;
                           }
                           dec = dec / 2;
                   }
                   while (dec != 0);

           }
           System.out.println(bin);

   }
