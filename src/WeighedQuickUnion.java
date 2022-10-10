public class WeighedQuickUnion implements UnionFind{

    int [] id;
    int [] size;

    public WeighedQuickUnion(int N){
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < id.length; i++){
            id[i] = i;
            size[i] =  1;
        }
    }

    private int root(int i){
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if(size[i] < size[q]){
            id[i] = j;
            size[q] += size[p];
        }
        else{
            id[j] = i;
            size[p] += size[q];
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public int find(int p) {
        return root(p);
    }
}
