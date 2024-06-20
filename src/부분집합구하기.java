public class 부분집합구하기 {
    static int n;
    static int[] chk;
    public void DFS(int L){
        if(L == n+1){
            String tmp = "";
            for (int i=1; i<=n; i++){
                if(chk[i] == 1) tmp += (i+" ");
            }
            if(!tmp.isEmpty()) System.out.println(tmp);
        } else{
            chk[L] = 1;
            DFS(L+1);
            chk[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        부분집합구하기 T = new 부분집합구하기();
        n = 3;
        chk = new int[n+1];
        T.DFS(1);
    }
}
