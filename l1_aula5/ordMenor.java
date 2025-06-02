public class ordMenor{
    public static void main(String[] args) {
        int[] p={44,7,71,17,27,3,10,115};
        
        int minIndex=0;
        
        for(int i=0;i<p.length-1;i++){
            if(p[i]<p[minIndex]){
                minIndex=i;
            }
        }
        
        System.out.println("A posição do menor elemento no array é "+minIndex);
        
    }
}
