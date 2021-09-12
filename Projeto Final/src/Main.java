public class Main {
    public static void main(String[] args) {
    Video v[] = new Video [3];
    v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");

     Gafanhoto g[] = new Gafanhoto[2];
     g[0] = new Gafanhoto("julio", 22, "m", "juba");

        g[1] = new Gafanhoto("Jubileu", 18, "m", "jujuzinho58");
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
    }
}
