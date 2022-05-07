public class App{
    public static void main(String[] args){
    
        int i = 0;
        int p = 0;
        double porcentaje_impares = 0;
        int arr[] = {3,5,3,7,35,674,47,2,64,8,2,4,8,5,2,2,3};
        for(int j = 0; j < arr.length; j++){
            if(arr[j] % 2 == 0){
                p++;
            }else{
                i++;
            }
        }
        porcentaje_impares = (i * 100) / arr.length;
        System.out.println("Porcentaje de numeros impares: " + porcentaje_impares);
        System.out.println("Cantidad de numeros pares: " + p);
        System.out.println("Cantidad de numeros impares: " + i);
    }
}