package demo.lee.com.findpath;

public class Node implements Comparable<Node>{
    public Coord coord;//坐标
    public Node parent;//父节点
    public int g;//实际代价
    public int h;//预估代价

    public Node(int x, int y) {
        this.coord = new Coord(x,y);
    }

    public Node(Coord coord, Node parent, int g, int h) {
        this.coord = coord;
        this.parent = parent;
        this.g = g;
        this.h = h;
    }

    @Override
    public int compareTo(Node node) {
        if(node==null){
            return -1;
        }
        if(g+h>node.g+node.h) {
            return 1;
        }else if(g+h<node.g+node.h){
            return -1;
        }
        return 0;
    }
}
