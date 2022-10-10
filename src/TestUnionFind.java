import java.util.Random;

public class TestUnionFind {
    public static void main(String[] args) {
        int N = 1000000;
        int count = 0;
        UnionFind uf = new WeightedQuickUnionPathCompression(N);
        Random rng = new Random(N);

        long start = System.currentTimeMillis();

        for (int i = 0; i < N; i++){
            int p = rng.nextInt(N);
            int q = rng.nextInt(N);

            uf.union(p,q);
        }

        long stop = System.currentTimeMillis();

        System.out.println("Performed " + N + " union operations in " + (stop - start)/1000.0 + " secs");

        start = System.currentTimeMillis();

        for(int i = 0; i < N; i++){
            int p = rng.nextInt(N);
            int q = rng.nextInt(N);

            if((uf.connected(p,q))){
                count++;
            }
        }
        stop = System.currentTimeMillis();

        System.out.print("Found " + count + " objects connected " + " in " + (stop - start)/1000.0 + " secs");
    }
}
