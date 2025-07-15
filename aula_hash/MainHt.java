public class MainHt{
    
    static int hashTable(String txt){
        int h=0;
        int b=31;
        for(int i=0; i<txt.length(); i++){
            int peso=txt.charAt(i); 
            //valor que vai ajudar a definir o hash, conforme ASCII
            h=h*b+peso;
        } 
        return h;
       }


    public static void main(String[] args){
        String celia="Celia";
        String adri="Adriana";

        System.out.println(hashTable(adri));
        System.out.println(hashTable(celia));

        /*saídas:
         * 529618394
            64991938
         */
    }
}