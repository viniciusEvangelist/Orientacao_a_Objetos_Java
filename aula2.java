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
