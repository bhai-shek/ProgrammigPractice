// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int result=-1;
        int Solve(int n,int Behaviour[]){
            for(int i=0;i<Behaviour.length;i++){
                if(Behaviou[i]) continue;
                if((Behaviou[i-1]+Behaviou[i+1])/2){
                    result++;
                }
            }
        }
        int n=5;
        int arr[]={1,8,7,11,5};
        Solve(n,arr);
    }
}