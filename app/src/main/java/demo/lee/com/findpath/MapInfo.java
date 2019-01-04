package demo.lee.com.findpath;

import android.util.Log;

/**
 * @author lee  包含地图的所有信息
 */
public class MapInfo {
    public int [][] map;//二维数组的地图
    public int map_width;//地图的宽
    public int map_height;//地图的高
    public Node start;//开始点
    public Node end;//结束点

    public MapInfo(int[][] map, int map_width, int map_height, Node start, Node end) {
        this.map = map;
        this.map_width = map_width;
        this.map_height = map_height;
        this.start = start;
        this.end = end;
        Log.i("lee","初始化地图成功");
    }
}
